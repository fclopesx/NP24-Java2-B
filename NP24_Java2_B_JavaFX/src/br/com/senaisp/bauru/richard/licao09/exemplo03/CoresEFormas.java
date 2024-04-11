package br.com.senaisp.bauru.richard.licao09.exemplo03;

import java.awt.Color;
import java.awt.MultipleGradientPaint.CycleMethod;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class CoresEFormas extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		//Criando componentes
		criarComponentes(root);
		//Criando a scena
		Scene scena = new Scene(root,600,400,Color.BLACK);
		//Configurando a stage
		primeiraStage.setTitle("Cores e Formas");
		primeiraStage.setScene(scena);
		primeiraStage.show();
		
		
	}

	private void criarComponentes(Group root) {
		LinearGradient lg = new LinearGradient(
				//StartX, StartY, EndX, EndY, Proporcinal?,
				//Forma de ciclo de gradiente, Stops
				0, 0, 0, 0, true, javafx.scene.paint.CycleMethod.NO_CYCLE,
				new Stop [] {
						new stop (0, Color.BLACK),
						new stop (0.5,Color.YELLOW),
						new stop (1,Color.BLUE)
				} );
		Polygon pir = new Polygon(new double[] {
				210.0, 10.0,
				10.0, 210.0
			
		});
		pir.setFill(Color.rgb(0, 0, 255, 0.5));
		pir.setFill(lg);
		//Colocando no nó root
		root.getChildren().add(pir);
	
		
		
		
	}

}

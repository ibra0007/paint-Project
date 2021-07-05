
package paint_pro_3;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Paint_pro_3 extends Application {
    
            @Override
            public void start(Stage stg) {
            Button btn = new Button("Open File");
            ImageView image_view  = new ImageView() ;
            Label lbl_size =  new Label ("file size ;0") ;
            btn.setText("افتح يا سمسم");
            btn.setOnAction((ActionEvent event) -> {
            FileChooser fc = new  FileChooser() ;
            FileChooser.ExtensionFilter ext = new FileChooser.ExtensionFilter("jpg files (*.jpg)" , "*jpg") ;
            fc.getExtensionFilters().add(ext);
            Window Stg = null;
            File file = fc.showOpenDialog(Stg) ;
            if (file !=null) {
            try {
            System.out.println("File Name:"+file.getName());
            lbl_size.setText("File Size:"+file.length()+"Bytes");
            Image img = new Image (file.toURI().toString()) ;
            image_view.setImage(img);
            }catch( Exception e ) {  
                System.out.println(e) ;
            } 
            }
   //     System.out.println("File Name:"+file.getName());
            });
        
            VBox box = new VBox() ;  // add to scene
            box.getChildren().addAll(btn , lbl_size , image_view) ;
      //  Scene scene = new Scene(box) ; // add to stg
        
        // ضربت الودع ملقتش صاحب جدع
        //StackPane root = new StackPane();
       // root.getChildren().add(btn);
            Scene scene = new Scene(box) ;
       // Scene scene = new Scene(root, 300, 250);
        
            stg.setTitle("Hello World!");
            stg.setScene(scene);
            stg.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

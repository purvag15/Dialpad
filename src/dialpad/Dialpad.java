package dialpad;
import static java.awt.SystemColor.text;
import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Dialpad extends Application 
{
    String message=""; 
    
    
    TextField t=new TextField();
    Stage window;
    Button btn1; 
    Button btn2; 
    Button btn3; 
    Button btn4; 
    Button btn5; 
    Button btn6; 
    Button btn7; 
    Button btn8; 
    Button btn9;
    Button btn10; 
    Button btn11; 
    Button btn12; 
    
    long h=System.currentTimeMillis();
    long k;
    boolean bear;
    public void start(Stage primaryStage) throws Exception
    {
        window=primaryStage;
        window.setTitle("Dialpad");
        HBox topMenu=new HBox();
        
        btn1= new Button();
        btn2= new Button();
        btn3= new Button();
        btn4= new Button();
        btn5= new Button();
        btn6= new Button();
        btn7= new Button();
        btn8= new Button();
        btn9= new Button();
        btn10= new Button();
        btn11= new Button();
        btn12= new Button();
        
        topMenu.getChildren().addAll(t);
        
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10,10,10,0));
        grid.setVgap(5);
        grid.setHgap(5);
        
        t.setMinWidth(160);
        t.setMinHeight(30);
        
        btn1.setText("1");
        btn1.setMinHeight(50);
        btn1.setMinWidth(50);
        btn2.setText(" 2\nabc");
        btn2.setMinHeight(50);
        btn2.setMinWidth(50);
        btn3.setText(" 3\ndef");
        btn3.setMinHeight(50);
        btn3.setMinWidth(50);
        btn4.setText(" 4\nghi");
        btn4.setMinHeight(50);
        btn4.setMinWidth(50);
        btn5.setText(" 5\njkl");
        btn5.setMinHeight(50);
        btn5.setMinWidth(50);
        btn6.setText(" 6\nmno");
        btn6.setMinHeight(50);
        btn6.setMinWidth(50);
        btn7.setText(" 7\npqrs");
        btn7.setMinHeight(50);
        btn7.setMinWidth(50);
        btn8.setText(" 8\ntuv");
        btn8.setMinHeight(50);
        btn8.setMinWidth(50);
        btn9.setText(" 9\nwxyz");
        btn9.setMinHeight(50);
        btn9.setMinWidth(50);
        btn10.setText(" Clear");
        btn10.setMinHeight(50);
        btn10.setMinWidth(50);
        btn11.setText(" 0");
        btn11.setMinHeight(50);
        btn11.setMinWidth(50);
        btn12.setText(" <-");
        btn12.setMinHeight(50);
        btn12.setMinWidth(50);
        
        
        
        GridPane.setConstraints(btn1,0,0);
        GridPane.setConstraints(btn2,1,0);
        GridPane.setConstraints(btn3,2,0);
        GridPane.setConstraints(btn4,0,1);
        GridPane.setConstraints(btn5,1,1);
        GridPane.setConstraints(btn6,2,1);
        GridPane.setConstraints(btn7,0,2);
        GridPane.setConstraints(btn8,1,2);
        GridPane.setConstraints(btn9,2,2);
        GridPane.setConstraints(btn10,0,3);
        GridPane.setConstraints(btn11,1,3);
        GridPane.setConstraints(btn12,2,3);
        
        grid.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12);
        
        //btn1.setOnAction(e->System.out.println(System.currentTimeMillis()));
        
        btn2.setOnAction(e->
        {
            bear=btn2.getText()==" 2\nabc";
            if (bear)
            {
                 k=(long) System.currentTimeMillis();
                 if ((k-h)<1000)
                 {
                     System.out.println("2");
                     message+="2";
                     System.out.println(message);
                 }
                 else if ((k-h)<2000)
                 {
                     System.out.println("a");
                     message+="a";
                 }
                 else if ((k-h)<3000)
                 {
                     System.out.println("b");
                     message+="b";
                 }
                 else if((k-h)<4000)
                 {
                     System.out.println("c");
                     message+="c";
                 }
                 else
                 {
                     System.out.println("2");
                     message+="2";
                 }
            }
        });
        btn2.setOnAction(e->
        {
//            bear=btn2.getText()==" 2\nabc";
//            if (bear)
//            {
//                 k=(long) System.currentTimeMillis();
//                 if ((k-h)<1000)
//                 {
//                     System.out.println("2");
//                     message+="2";
//                     System.out.println(message);
//                 }
//                 else if ((k-h)<2000)
//                 {
//                     System.out.println("a");
//                     message+="a";
//                 }
//                 else if ((k-h)<3000)
//                 {
//                     System.out.println("b");
//                     message+="b";
//                 }
//                 else if((k-h)<4000)
//                 {
//                     System.out.println("c");
//                     message+="c";
//                 }
//                 else
//                 {
//                     System.out.println("2");
//                     message+="2";
//                 }
//            }
            message+="2";
            t.setText(message);
        });
        
        btn1.setOnAction(e->
        {
            bear=btn1.getText()=="1";
            if (bear)
            {
                 k=(long) System.currentTimeMillis();
                 if ((k-h)<10000)
                 {
                     message+="1";
                     t.setText(message);
                 }
                
            }
        });
        
        btn3.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="3";
                     t.setText(message);
                 //}
                
            //}
        });
         btn4.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="4";
                     t.setText(message);
                 //}
                
            //}
        });
         btn5.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="5";
                     t.setText(message);
                 //}
                
            //}
        });
        btn6.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="6";
                     t.setText(message);
                 //}
                
            //}
        });
         btn7.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="7";
                     t.setText(message);
                 //}
                
            //}
        });
         btn8.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="8";
                     t.setText(message);
                 //}
                
            //}
        });
          btn9.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="9";
                     t.setText(message);
                 //}
                
            //}
        });
           btn11.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message+="0";
                     t.setText(message);
                 //}
                
            //}
        });
           btn10.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
                     message="";
                     t.setText(message);
                 //}
                
            //}
        });
           btn12.setOnAction(e->
        {
//            bear=btn3.getText()=="3";
//            if (bear)
//            {
                 //k=(long) System.currentTimeMillis();
                 //if ((k-h)<10000)
                 //{
           message=(message.substring(0,message.length()-1));
           t.setText(message);
                 //}
                
            //}
        });
        BorderPane b=new BorderPane();
        b.setTop(topMenu);
        b.setCenter(grid);
        b.setPadding(new Insets(10,10,10,30));
        Scene scene=new Scene(b,210,280);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    private String output()
    {
        String message="";
        return message;
    }
    public void mouseClicked(MouseEvent event)
    {
        if(event.getClickCount()==2)
        {
           // return message;
        }
    } 
    private long diff(long t1,long t2)
    {
        long d=t1-t2;
        return d;
    }
}

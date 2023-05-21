package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private TextField Srch;
	String searchStr;
	static List<Product> searchList;
	
	List<Button> addButton = new ArrayList<Button>();
	List<TextField> count = new ArrayList<TextField>();
	List<Button> subButton = new ArrayList<Button>();
	List<Text> prodName = new ArrayList<Text>();
	
	@FXML
	private Text prodNm0;
	@FXML
	private Text prodNm1;
	@FXML
	private Text prodNm2;
	@FXML
	private Text prodNm3;
	@FXML
	private Text prodNm4;
	@FXML
	private Text prodNm5;
	@FXML
	private Text prodNm6;
	@FXML
	private Text prodNm7;
	@FXML
	private Text prodNm8;
	@FXML
	private Text prodNm9;
	@FXML
	private Text prodNm10;
	@FXML
	private Text prodNm11;
	@FXML
	private Text prodNm12;
	@FXML
	private Text prodNm13;
	@FXML
	private Text prodNm14;
	@FXML
	private Text prodNm15;
	@FXML
	private Text prodNm16;
	@FXML
	private Text prodNm17;
	@FXML
	private Text prodNm18;
	@FXML
	private Text prodNm19;
	@FXML
	private Text prodNm20;
	@FXML
	private Text prodNm21;
	@FXML
	private Text prodNm22;
	@FXML
	private Text prodNm23;
	@FXML
	private Text prodNm24;
	@FXML
	private Text prodNm25;
	@FXML
	private Text prodNm26;
	@FXML
	private Text prodNm27;
	@FXML
	private Text prodNm28;
	@FXML
	private Text prodNm29;
	
	@FXML
	private Button Button0;
	@FXML
	private Button Button1;
	@FXML
	private Button Button2;
	@FXML
	private Button Button3;
	@FXML
	private Button Button4;
	@FXML
	private Button Button5;
	@FXML
	private Button Button6;
	@FXML
	private Button Button7;
	@FXML
	private Button Button8;
	@FXML
	private Button Button9;
	@FXML
	private Button Button10;
	@FXML
	private Button Button11;
	@FXML
	private Button Button12;
	@FXML
	private Button Button13;
	@FXML
	private Button Button14;
	@FXML
	private Button Button15;
	@FXML
	private Button Button16;
	@FXML
	private Button Button17;
	@FXML
	private Button Button18;
	@FXML
	private Button Button19;
	@FXML
	private Button Button20;
	@FXML
	private Button Button21;
	@FXML
	private Button Button22;
	@FXML
	private Button Button23;
	@FXML
	private Button Button24;
	@FXML
	private Button Button25;
	@FXML
	private Button Button26;
	@FXML
	private Button Button27;
	@FXML
	private Button Button28;
	@FXML
	private Button Button29;
	
	@FXML
	private Button btn0;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn10;
	@FXML
	private Button btn11;
	@FXML
	private Button btn12;
	@FXML
	private Button btn13;
	@FXML
	private Button btn14;
	@FXML
	private Button btn15;
	@FXML
	private Button btn16;
	@FXML
	private Button btn17;
	@FXML
	private Button btn18;
	@FXML
	private Button btn19;
	@FXML
	private Button btn20;
	@FXML
	private Button btn21;
	@FXML
	private Button btn22;
	@FXML
	private Button btn23;
	@FXML
	private Button btn24;
	@FXML
	private Button btn25;
	@FXML
	private Button btn26;
	@FXML
	private Button btn27;
	@FXML
	private Button btn28;
	@FXML
	private Button btn29;

	@FXML
	private TextField count0;
	@FXML
	private TextField count1;
	@FXML
	private TextField count2;
	@FXML
	private TextField count3;
	@FXML
	private TextField count4;
	@FXML
	private TextField count5;
	@FXML
	private TextField count6;
	@FXML
	private TextField count7;
	@FXML
	private TextField count8;
	@FXML
	private TextField count9;
	@FXML
	private TextField count10;
	@FXML
	private TextField count11;
	@FXML
	private TextField count12;
	@FXML
	private TextField count13;
	@FXML
	private TextField count14;
	@FXML
	private TextField count15;
	@FXML
	private TextField count16;
	@FXML
	private TextField count17;
	@FXML
	private TextField count18;
	@FXML
	private TextField count19;
	@FXML
	private TextField count20;
	@FXML
	private TextField count21;
	@FXML
	private TextField count22;
	@FXML
	private TextField count23;
	@FXML
	private TextField count24;
	@FXML
	private TextField count25;
	@FXML
	private TextField count26;
	@FXML
	private TextField count27;
	@FXML
	private TextField count28;
	@FXML
	private TextField count29;
	
	public void switchToScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToCheckout(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("checkout.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public String searchField() {
		searchStr = Srch.getText();
		return searchStr;
	}
	
	public void matchResults(ActionEvent event) throws IOException {
	    this.searchList = ReadingJson.searchStr(ReadingJson.ReadingJson(), searchField());
		switchToScene2(event);
	}
	
	public List<Product> getSearchList() {
		return this.searchList;
	}
	
	public void setup() {
		prodName.add(prodNm0);
		prodName.add(prodNm1);
		prodName.add(prodNm2);
		prodName.add(prodNm3);
		prodName.add(prodNm4);
		prodName.add(prodNm5);
		prodName.add(prodNm6);
		prodName.add(prodNm7);
		prodName.add(prodNm8);
		prodName.add(prodNm9);
		prodName.add(prodNm10);
		prodName.add(prodNm11);
		prodName.add(prodNm12);
		prodName.add(prodNm13);
		prodName.add(prodNm14);
		prodName.add(prodNm15);
		prodName.add(prodNm16);
		prodName.add(prodNm17);
		prodName.add(prodNm18);
		prodName.add(prodNm19);
		prodName.add(prodNm20);
		prodName.add(prodNm21);
		prodName.add(prodNm22);
		prodName.add(prodNm23);
		prodName.add(prodNm24);
		prodName.add(prodNm25);
		prodName.add(prodNm26);
		prodName.add(prodNm27);
		prodName.add(prodNm28);
		prodName.add(prodNm29);
		
		count.add(count0);
		count.add(count1);
		count.add(count2);
		count.add(count3);
		count.add(count4);
		count.add(count5);
		count.add(count6);
		count.add(count7);
		count.add(count8);
		count.add(count9);
		count.add(count10);
		count.add(count11);
		count.add(count12);
		count.add(count13);
		count.add(count14);
		count.add(count15);
		count.add(count16);
		count.add(count17);
		count.add(count18);
		count.add(count19);
		count.add(count20);
		count.add(count21);
		count.add(count22);
		count.add(count23);
		count.add(count24);
		count.add(count25);
		count.add(count26);
		count.add(count27);
		count.add(count28);
		count.add(count29);
		
		subButton.add(btn0);
		subButton.add(btn1);
		subButton.add(btn2);
		subButton.add(btn3);
		subButton.add(btn4);
		subButton.add(btn5);
		subButton.add(btn6);
		subButton.add(btn7);
		subButton.add(btn8);
		subButton.add(btn9);
		subButton.add(btn10);
		subButton.add(btn11);
		subButton.add(btn12);
		subButton.add(btn13);
		subButton.add(btn14);
		subButton.add(btn15);
		subButton.add(btn16);
		subButton.add(btn17);
		subButton.add(btn18);
		subButton.add(btn19);
		subButton.add(btn20);
		subButton.add(btn21);
		subButton.add(btn22);
		subButton.add(btn23);
		subButton.add(btn24);
		subButton.add(btn25);
		subButton.add(btn26);
		subButton.add(btn27);
		subButton.add(btn28);
		subButton.add(btn29);
		
		addButton.add(Button0);
		addButton.add(Button1);
		addButton.add(Button2);
		addButton.add(Button3);
		addButton.add(Button4);
		addButton.add(Button5);
		addButton.add(Button6);
		addButton.add(Button7);
		addButton.add(Button8);
		addButton.add(Button9);
		addButton.add(Button10);
		addButton.add(Button11);
		addButton.add(Button12);
		addButton.add(Button13);
		addButton.add(Button14);
		addButton.add(Button15);
		addButton.add(Button16);
		addButton.add(Button17);
		addButton.add(Button18);
		addButton.add(Button19);
		addButton.add(Button20);
		addButton.add(Button21);
		addButton.add(Button22);
		addButton.add(Button23);
		addButton.add(Button24);
		addButton.add(Button25);
		addButton.add(Button26);
		addButton.add(Button27);
		addButton.add(Button28);
		addButton.add(Button29);
	}

	public void buttonClick0(ActionEvent event) throws FileNotFoundException {
		setup();
    	Button numberButton = (Button) event.getTarget();
    	int s = Integer.valueOf(numberButton.getId().substring(6));
    	String productName = prodName.get(s).getText().toString();
    	String cnt = count.get(s).getText(); 
    	int c = 0;
    	if(cnt.isEmpty()) {
    		count.get(s).setText("1");
    		subButton.get(s).setDisable(false);
    		subButton.get(s).setText("-");
			subButton.get(s).setStyle("fx-background-color: #FF0000");
			c = 1;
    	}
    	else {
    		c = Integer.valueOf(cnt) + 1;
    		count.get(s).setText(Integer.toString(c));
    	}
    	if(c == ((fetchProduct(productName).getCount()))){
    		numberButton.setDisable(true);
    	}
    	Cart shoppingCart = Cart.getInstance();
    	try {
			shoppingCart.addProduct(productName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
    
    public void subtractButtonClick0(ActionEvent event) throws FileNotFoundException {
    	Button numberButton = (Button) event.getTarget();
    	int s = Integer.valueOf(numberButton.getId().substring(3));
    	String productName = prodName.get(s).getText().toString();
    	int cnt = Integer.valueOf(count.get(s).getText());
    	if(cnt <= 1) {
    		count.get(s).clear();
    		subButton.get(s).setDisable(true);
    	}
    	else {
    		int c = Integer.valueOf(cnt) - 1;
    		count.get(s).setText(Integer.toString(c));
    	}
    	if((Integer.valueOf(cnt) - 1) < ((fetchProduct(productName).getCount()))){
    		addButton.get(s).setDisable(false);
    	}
    	Cart shoppingCart = Cart.getInstance();
    	try {
			shoppingCart.deleteProduct(productName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
	
	public void switchToCart(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
	}
	
	public static Product fetchProduct(String productName) throws FileNotFoundException {
		Product cartProd = null;
		List<Product> availableProds = ReadingJson.ReadingJson();		
		for(int i=0;i<availableProds.size();i++) {
			if (availableProds.get(i).getName().equals(productName)) {
				cartProd = availableProds.get(i);
			}
		}
		return cartProd;
	}

}

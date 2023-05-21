package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CartController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	static int counter;
	public String total;
	
	List<TextArea> name = new ArrayList<TextArea>();
	List<TextField> totalPrice = new ArrayList<TextField>();
	List<ImageView> image = new ArrayList<ImageView>();
	List<TextField> count = new ArrayList<TextField>();
	List<Label> labels = new ArrayList<Label>();

	@FXML
	private Label aisleLabel0;
	@FXML
	private Label aisleLabel1;
	@FXML
	private Label aisleLabel2;
	@FXML
	private Label aisleLabel3;
	@FXML
	private Label aisleLabel4;
	@FXML
	private Label aisleLabel5;
	@FXML
	private Label aisleLabel6;
	@FXML
	private Label aisleLabel7;
	@FXML
	private Label aisleLabel8;
	@FXML
	private Label aisleLabel9;
	
	@FXML
	private TextArea prodNm0;
	@FXML
	private TextArea prodNm1;
	@FXML
	private TextArea prodNm2;
	@FXML
	private TextArea prodNm3;
	@FXML
	private TextArea prodNm4;
	@FXML
	private TextArea prodNm5;
	@FXML
	private TextArea prodNm6;
	@FXML
	private TextArea prodNm7;
	@FXML
	private TextArea prodNm8;
	@FXML
	private TextArea prodNm9;
	@FXML
	private TextArea prodNm10;
	@FXML
	private TextArea prodNm11;
	@FXML
	private TextArea prodNm12;
	@FXML
	private TextArea prodNm13;
	@FXML
	private TextArea prodNm14;
	@FXML
	private TextArea prodNm15;
	@FXML
	private TextArea prodNm16;
	@FXML
	private TextArea prodNm17;
	@FXML
	private TextArea prodNm18;
	@FXML
	private TextArea prodNm19;
	@FXML
	private TextArea prodNm20;
	@FXML
	private TextArea prodNm21;
	@FXML
	private TextArea prodNm22;
	@FXML
	private TextArea prodNm23;
	@FXML
	private TextArea prodNm24;
	@FXML
	private TextArea prodNm25;
	@FXML
	private TextArea prodNm26;
	@FXML
	private TextArea prodNm27;
	@FXML
	private TextArea prodNm28;
	@FXML
	private TextArea prodNm29;
	@FXML
	private TextArea prodNm30;
	@FXML
	private TextArea prodNm31;
	@FXML
	private TextArea prodNm32;
	@FXML
	private TextArea prodNm33;
	@FXML
	private TextArea prodNm34;
	@FXML
	private TextArea prodNm35;
	@FXML
	private TextArea prodNm36;
	@FXML
	private TextArea prodNm37;
	@FXML
	private TextArea prodNm38;
	@FXML
	private TextArea prodNm39;
	@FXML
	private TextArea prodNm40;
	@FXML
	private TextArea prodNm41;
	@FXML
	private TextArea prodNm42;
	@FXML
	private TextArea prodNm43;
	@FXML
	private TextArea prodNm44;
	@FXML
	private TextArea prodNm45;
	@FXML
	private TextArea prodNm46;
	@FXML
	private TextArea prodNm47;
	@FXML
	private TextArea prodNm48;
	@FXML
	private TextArea prodNm49;
	@FXML
	private TextArea prodNm50;
	@FXML
	private TextArea prodNm51;
	@FXML
	private TextArea prodNm52;
	@FXML
	private TextArea prodNm53;
	@FXML
	private TextArea prodNm54;
	@FXML
	private TextArea prodNm55;
	
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
	@FXML
	private TextField count30;
	@FXML
	private TextField count31;
	@FXML
	private TextField count32;
	@FXML
	private TextField count33;
	@FXML
	private TextField count34;
	@FXML
	private TextField count35;
	@FXML
	private TextField count36;
	@FXML
	private TextField count37;
	@FXML
	private TextField count38;
	@FXML
	private TextField count39;
	@FXML
	private TextField count40;
	@FXML
	private TextField count41;
	@FXML
	private TextField count42;
	@FXML
	private TextField count43;
	@FXML
	private TextField count44;
	@FXML
	private TextField count45;
	@FXML
	private TextField count46;
	@FXML
	private TextField count47;
	@FXML
	private TextField count48;
	@FXML
	private TextField count49;
	@FXML
	private TextField count50;
	@FXML
	private TextField count51;
	@FXML
	private TextField count52;
	@FXML
	private TextField count53;
	@FXML
	private TextField count54;
	@FXML
	private TextField count55;
	
	@FXML
	private TextField price0;
	@FXML
	private TextField price1;
	@FXML
	private TextField price2;
	@FXML
	private TextField price3;
	@FXML
	private TextField price4;
	@FXML
	private TextField price5;
	@FXML
	private TextField price6;
	@FXML
	private TextField price7;
	@FXML
	private TextField price8;
	@FXML
	private TextField price9;
	@FXML
	private TextField price10;
	@FXML
	private TextField price11;
	@FXML
	private TextField price12;
	@FXML
	private TextField price13;
	@FXML
	private TextField price14;
	@FXML
	private TextField price15;
	@FXML
	private TextField price16;
	@FXML
	private TextField price17;
	@FXML
	private TextField price18;
	@FXML
	private TextField price19;
	@FXML
	private TextField price20;
	@FXML
	private TextField price21;
	@FXML
	private TextField price22;
	@FXML
	private TextField price23;
	@FXML
	private TextField price24;
	@FXML
	private TextField price25;
	@FXML
	private TextField price26;
	@FXML
	private TextField price27;
	@FXML
	private TextField price28;
	@FXML
	private TextField price29;
	@FXML
	private TextField price30;
	@FXML
	private TextField price31;
	@FXML
	private TextField price32;
	@FXML
	private TextField price33;
	@FXML
	private TextField price34;
	@FXML
	private TextField price35;
	@FXML
	private TextField price36;
	@FXML
	private TextField price37;
	@FXML
	private TextField price38;
	@FXML
	private TextField price39;
	@FXML
	private TextField price40;
	@FXML
	private TextField price41;
	@FXML
	private TextField price42;
	@FXML
	private TextField price43;
	@FXML
	private TextField price44;
	@FXML
	private TextField price45;
	@FXML
	private TextField price46;
	@FXML
	private TextField price47;
	@FXML
	private TextField price48;
	@FXML
	private TextField price49;
	@FXML
	private TextField price50;
	@FXML
	private TextField price51;
	@FXML
	private TextField price52;
	@FXML
	private TextField price53;
	@FXML
	private TextField price54;
	@FXML
	private TextField price55;
	
	@FXML
	private ImageView img0;
	@FXML
	private ImageView img1;
	@FXML
	private ImageView img2;
	@FXML
	private ImageView img3;
	@FXML
	private ImageView img4;
	@FXML
	private ImageView img5;
	@FXML
	private ImageView img6;
	@FXML
	private ImageView img7;
	@FXML
	private ImageView img8;
	@FXML
	private ImageView img9;
	@FXML
	private ImageView img10;
	@FXML
	private ImageView img11;
	@FXML
	private ImageView img12;
	@FXML
	private ImageView img13;
	@FXML
	private ImageView img14;
	@FXML
	private ImageView img15;
	@FXML
	private ImageView img16;
	@FXML
	private ImageView img17;
	@FXML
	private ImageView img18;
	@FXML
	private ImageView img19;
	@FXML
	private ImageView img20;
	@FXML
	private ImageView img21;
	@FXML
	private ImageView img22;
	@FXML
	private ImageView img23;
	@FXML
	private ImageView img24;
	@FXML
	private ImageView img25;
	@FXML
	private ImageView img26;
	@FXML
	private ImageView img27;
	@FXML
	private ImageView img28;
	@FXML
	private ImageView img29;
	@FXML
	private ImageView img30;
	@FXML
	private ImageView img31;
	@FXML
	private ImageView img32;
	@FXML
	private ImageView img33;
	@FXML
	private ImageView img34;
	@FXML
	private ImageView img35;
	@FXML
	private ImageView img36;
	@FXML
	private ImageView img37;
	@FXML
	private ImageView img38;
	@FXML
	private ImageView img39;
	@FXML
	private ImageView img40;
	@FXML
	private ImageView img41;
	@FXML
	private ImageView img42;
	@FXML
	private ImageView img43;
	@FXML
	private ImageView img44;
	@FXML
	private ImageView img45;
	@FXML
	private ImageView img46;
	@FXML
	private ImageView img47;
	@FXML
	private ImageView img48;
	@FXML
	private ImageView img49;
	@FXML
	private ImageView img50;
	@FXML
	private ImageView img51;
	@FXML
	private ImageView img52;
	@FXML
	private ImageView img53;
	@FXML
	private ImageView img54;
	@FXML
	private ImageView img55;
	
	
	public void setup() {
		labels.add(aisleLabel0);
		labels.add(aisleLabel1);
		labels.add(aisleLabel2);
		labels.add(aisleLabel3);
		labels.add(aisleLabel4);
		labels.add(aisleLabel5);
		labels.add(aisleLabel6);
		labels.add(aisleLabel7);
		labels.add(aisleLabel8);
		labels.add(aisleLabel9);
		
		image.add(img0);
		image.add(img1);
		image.add(img2);
		image.add(img3);
		image.add(img4);
		image.add(img5);
		image.add(img6);
		image.add(img7);
		image.add(img8);
		image.add(img9);
		image.add(img10);
		image.add(img11);
		image.add(img12);
		image.add(img13);
		image.add(img14);
		image.add(img15);
		image.add(img16);
		image.add(img17);
		image.add(img18);
		image.add(img19);
		image.add(img20);
		image.add(img21);
		image.add(img22);
		image.add(img23);
		image.add(img24);
		image.add(img25);
		image.add(img26);
		image.add(img27);
		image.add(img28);
		image.add(img29);
		image.add(img30);
		image.add(img31);
		image.add(img32);
		image.add(img33);
		image.add(img34);
		image.add(img35);
		image.add(img36);
		image.add(img37);
		image.add(img38);
		image.add(img39);
		image.add(img40);
		image.add(img41);
		image.add(img42);
		image.add(img43);
		image.add(img44);
		image.add(img45);
		image.add(img46);
		image.add(img47);
		image.add(img48);
		image.add(img49);
		image.add(img50);
		image.add(img51);
		image.add(img52);
		image.add(img53);
		image.add(img54);
		image.add(img55);
		
		name.add(prodNm0);
		name.add(prodNm1);
		name.add(prodNm2);
		name.add(prodNm3);
		name.add(prodNm4);
		name.add(prodNm5);
		name.add(prodNm6);
		name.add(prodNm7);
		name.add(prodNm8);
		name.add(prodNm9);
		name.add(prodNm10);
		name.add(prodNm11);
		name.add(prodNm12);
		name.add(prodNm13);
		name.add(prodNm14);
		name.add(prodNm15);
		name.add(prodNm16);
		name.add(prodNm17);
		name.add(prodNm18);
		name.add(prodNm19);
		name.add(prodNm20);
		name.add(prodNm21);
		name.add(prodNm22);
		name.add(prodNm23);
		name.add(prodNm24);
		name.add(prodNm25);
		name.add(prodNm26);
		name.add(prodNm27);
		name.add(prodNm28);
		name.add(prodNm29);
		name.add(prodNm30);
		name.add(prodNm31);
		name.add(prodNm32);
		name.add(prodNm33);
		name.add(prodNm34);
		name.add(prodNm35);
		name.add(prodNm36);
		name.add(prodNm37);
		name.add(prodNm38);
		name.add(prodNm39);
		name.add(prodNm40);
		name.add(prodNm41);
		name.add(prodNm42);
		name.add(prodNm43);
		name.add(prodNm44);
		name.add(prodNm45);
		name.add(prodNm46);
		name.add(prodNm47);
		name.add(prodNm48);
		name.add(prodNm49);
		name.add(prodNm50);
		name.add(prodNm51);
		name.add(prodNm52);
		name.add(prodNm53);
		name.add(prodNm54);
		name.add(prodNm55);
		
		totalPrice.add(price0);
		totalPrice.add(price1);
		totalPrice.add(price2);
		totalPrice.add(price3);
		totalPrice.add(price4);
		totalPrice.add(price5);
		totalPrice.add(price6);
		totalPrice.add(price7);
		totalPrice.add(price8);
		totalPrice.add(price9);
		totalPrice.add(price10);
		totalPrice.add(price11);
		totalPrice.add(price12);
		totalPrice.add(price13);
		totalPrice.add(price14);
		totalPrice.add(price15);
		totalPrice.add(price16);
		totalPrice.add(price17);
		totalPrice.add(price18);
		totalPrice.add(price19);
		totalPrice.add(price20);
		totalPrice.add(price21);
		totalPrice.add(price22);
		totalPrice.add(price23);
		totalPrice.add(price24);
		totalPrice.add(price25);
		totalPrice.add(price26);
		totalPrice.add(price27);
		totalPrice.add(price28);
		totalPrice.add(price29);
		totalPrice.add(price30);
		totalPrice.add(price31);
		totalPrice.add(price32);
		totalPrice.add(price33);
		totalPrice.add(price34);
		totalPrice.add(price35);
		totalPrice.add(price36);
		totalPrice.add(price37);
		totalPrice.add(price38);
		totalPrice.add(price39);
		totalPrice.add(price40);
		totalPrice.add(price41);
		totalPrice.add(price42);
		totalPrice.add(price43);
		totalPrice.add(price44);
		totalPrice.add(price45);
		totalPrice.add(price46);
		totalPrice.add(price47);
		totalPrice.add(price48);
		totalPrice.add(price49);
		totalPrice.add(price50);
		totalPrice.add(price51);
		totalPrice.add(price52);
		totalPrice.add(price53);
		totalPrice.add(price54);
		totalPrice.add(price55);
		
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
		count.add(count30);
		count.add(count31);
		count.add(count32);
		count.add(count33);
		count.add(count34);
		count.add(count35);
		count.add(count36);
		count.add(count37);
		count.add(count38);
		count.add(count39);
		count.add(count40);
		count.add(count41);
		count.add(count42);
		count.add(count43);
		count.add(count44);
		count.add(count45);
		count.add(count46);
		count.add(count47);
		count.add(count48);
		count.add(count49);
		count.add(count50);
		count.add(count51);
		count.add(count52);
		count.add(count53);
		count.add(count54);
		count.add(count55);
	}
	
	public void displayCart() throws FileNotFoundException {
		displayAisleLabel();
		displayContent();
		
	}
	
	public void displayAisleLabel() {
		setup();
		Cart shoppingCart = Cart.getInstance();
		List<Integer> aisles = shoppingCart.getAisles();
		aisleLabel0.setText("Aisle " + aisles.get(0));
		for(int i=0; i<aisles.size()-1; i++) {
			if (shoppingCart.getCountMap(aisles.get(i)).size() > 4) {
				labels.get(i+2).setText("Aisle " + aisles.get(i+1));
			}
			else {
				labels.get(i+1).setText("Aisle " + aisles.get(i+1));
			}
		}
	}
	
	public void displayContent() throws FileNotFoundException {
		Cart shoppingCart = Cart.getInstance();
		List<Integer> aisles = shoppingCart.getAisles();
		int k =0;
		for(int i=0; i<aisles.size(); i++) {
			int elements = shoppingCart.getCountMap(aisles.get(i)).size();
			for(int j=0; j<elements; j++) {
				List<String> prodNames = shoppingCart.getProductNames(aisles.get(i));
				InputStream stream = new FileInputStream(("C:\\Users\\18574\\eclipse-workspace\\MyTest\\src\\application\\assets\\" + shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getImage()));
			    Image img = new Image(stream);
			    String nm = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getName();
			    Integer cnt = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getQuantity();
			    Double price = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getQuantity() * shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getPrice();
			    counter = ((i*4)+j+(4*k));
			    image.get(counter).setImage(img);
			    name.get(counter).setText(nm);
			    count.get(counter).setText(String.valueOf(cnt) + "Units");
			    totalPrice.get(counter).setText("$" + String.valueOf(price));
			    
			}
            if (elements>4) {
            	k++;		    	
		    }
		}
	}
	
	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
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
	
	public String getTotalCost() {
		Cart shoppingCart = Cart.getInstance();
		total = String.valueOf(shoppingCart.calculateTotal());
		return total;
	}

}

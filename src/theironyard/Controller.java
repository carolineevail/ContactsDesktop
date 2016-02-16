package theironyard;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sun.invoke.empty.Empty;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField nameText;

    @FXML
    TextField phoneText;

    @FXML
    TextField emailText;


    public void addContact() {
        if (!nameText.getText().equals("") && !phoneText.getText().equals("") && !emailText.getText().equals("")) {
        contacts.add(new Contact(nameText.getText(), phoneText.getText(), emailText.getText()));
        nameText.setText("");
        phoneText.setText("");
        emailText.setText("");
        }

    }

    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);

    }
}










package view;

import controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import model.Person;
import util.DateUtil;

public class OverviewController {

	@FXML
	private TableView <Person> personTable;
	@FXML 
	private TableColumn<Person, String> firstnameColumn;
	@FXML
	private TableColumn<Person,String> lastnameColumn;
	
	@FXML
    private Label firstnameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label bpLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;
    
    private Main main;
    
	
	public OverviewController() {
		
	}
	
	public void display(Person person) {
		if(person != null) {
			firstnameLabel.setText(person.getFirstName());
	        lastnameLabel.setText(person.getLastName());
	        streetLabel.setText(person.getStreet());
	        bpLabel.setText(Integer.toString(person.getBp()));
	        cityLabel.setText(person.getCity());
	        birthdayLabel.setText(DateUtil.format(person.getBirthday()));
		}
		else {
			firstnameLabel.setText("");
	        lastnameLabel.setText("");
	        streetLabel.setText("");
	        bpLabel.setText("");
	        cityLabel.setText("");
	        birthdayLabel.setText("");
		}
	}
	
	@FXML
	public void initialize() {
		firstnameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastnameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
	}
	
	public void setMain(Main main) {
		this.main = main;
		
		personTable.setItems(main.getPersonData());
	}
}

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private TableView tableView;

    @FXML
    private TextField title;

    @FXML
    public void loadClicked(ActionEvent actionEvent) {
        loadList();
    }

    @FXML
    public void saveClicked(ActionEvent actionEvent) {
        saveList();
    }

    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        addItem();
    }

    @FXML
    public void addListClicked(ActionEvent actionEvent) {
        addList();
    }

    @FXML
    public void removeItemClicked(ActionEvent actionEvent) {
        removeItem();
    }

    @FXML
    public void removeListClicked(ActionEvent actionEvent) {
        removeList();
    }

    @FXML
    public void incompletedClicked(ActionEvent actionEvent) {
        displayIncompleteItems();
    }

    @FXML
    public void completedClicked(ActionEvent actionEvent) {
        displayCompleteItems();
    }

    public void loadList(){
        //open directory of saved list(s)
        //open list(s) of choosing
    }

    public void saveList(){
        //open up file explorer to choose directory of choosing
        //store list into chosen directory
    }

    public void addItem(){
        //add a text field to the table in the form of a row
        //allow user to type in item, description, and due date of item
        //allow for 100 items
    }

    public void addList(){
        //open a new list in the next page
    }

    public void removeItem(){
        //remove row of item from table
    }

    public void removeList(){
        //delete To Do list page
        //if only one page, delete all items within that page
    }

    public void displayIncompleteItems(){
        //check all items that don't have a complete status
        //hide complete items
    }

    public void displayCompleteItems(){
        //check all that items have a complete status
        //hide incomplete items
    }

}

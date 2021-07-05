/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Corona
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListControllerTest {

    @Test
    void loadList() {
        //click load button
        //get loaded list from saved directory
        //assert that the loaded list = saved list
    }

    @Test
    void saveList() {
        //click the save button
        //assert that the list is saved into said directory
    }

    @Test
    void addItem() {
        //click the add item button
        //assert that item is listed in table
    }

    @Test
    void addList() {
        //click the add list button
        // assert that a new list has been created in a new page
    }

    @Test
    void removeItem() {
        //click the remove item button
        //get all items
        //assert that the item is no longer in the list
    }

    @Test
    void removeList() {
        //click the remove list button
        //get all lists
        //assert that the list has been removed
    }

    @Test
    void displayIncompleteItems() {
        //click the incomplete button
        //get incompleted items
        //assert that the listed items in table are incompleted items only
    }

    @Test
    void displayCompleteItems() {
        //click the complete button
        //get completed items
        //assert that the listed items in table are completed items only
    }
}
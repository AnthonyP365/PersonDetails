package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        int counter = 0;
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
        while (counter < personArray.length) {
            for (int i = 0; i < personArray.length; i++) {
                Person currentPerson = personArray[i];
                String stringRep = currentPerson.toString();
                result += stringRep;
                counter++;
            }
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            String stringRep = currentPerson.toString();
            result += stringRep;
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person person : personArray) {
            String stringRep = person.toString();
            result += stringRep;
        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

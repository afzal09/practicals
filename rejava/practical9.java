import java.applet.Applet;
import java.awt.*;

public class Form extends Applet {

    public void init() {

        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        Label label1 = new Label("Firstname");
        Label label2 = new Label("Last name");
        Label label3 = new Label("Gender");
        Label label4 = new Label("Address");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        CheckboxGroup genderGroup = new CheckboxGroup();

        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);

        TextArea ta = new TextArea(3, 10);

        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        add(label1);
        add(t1);
        add(label2);
        add(t2);
        add(label3);
        add(maleCheckbox);
        add(femaleCheckbox);
        add(label4);
        add(ta);
        add(submitButton);
        add(clearButton);
    }
}

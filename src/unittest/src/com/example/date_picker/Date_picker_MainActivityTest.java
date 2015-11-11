package unittest.src.com.example.date_picker;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import android.test.AndroidTestCase;

public class Date_picker_MainActivityTest extends AndroidTestCase {

@Override
protected void setUp() throws Exception {


}



public void testPreconditions (){
int nr = 5 ;
assertNotNull(nr);
assertEquals(5,nr);

}

public void testCheckCondition(){
assertFalse(5==3);

}

@Override
protected void tearDown() throws Exception {
    super.tearDown();
}

    
    
}

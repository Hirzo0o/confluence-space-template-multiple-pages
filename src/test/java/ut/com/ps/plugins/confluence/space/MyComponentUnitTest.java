package ut.com.ps.plugins.confluence.space;

import org.junit.Test;
import com.ps.plugins.confluence.space.api.MyPluginComponent;
import com.ps.plugins.confluence.space.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
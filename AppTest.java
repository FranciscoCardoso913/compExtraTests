package pt.up.fe.comp.compExtraTests;

import org.junit.Test;
import pt.up.fe.comp.TestUtils;
import pt.up.fe.specs.util.SpecsIo;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testHelloWorld() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/HelloWorld.jmm");
        var jasminResult = TestUtils.backend(code, Collections.emptyMap());
        System.out.println(jasminResult.getJasminCode());
        var result = TestUtils.runJasmin(jasminResult.getJasminCode(), Collections.emptyMap());
        assertEquals("Hello, World!", result.strip());
    }

    @Test
    public void testSimple() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/Simple.jmm");
        var jasminResult = TestUtils.backend(code, Collections.emptyMap());
        System.out.println(jasminResult.getJasminCode());
        var result = TestUtils.runJasmin(jasminResult.getJasminCode(), Collections.emptyMap());
        assertEquals("30", result.strip());
    }
    @Test
    public void testBinaryExpr() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/BinaryExpr.jmm");
        var jasminResult = TestUtils.backend(code, Collections.emptyMap());
        System.out.println(jasminResult.getJasminCode());
        var result = TestUtils.runJasmin(jasminResult.getJasminCode(), Collections.emptyMap());
        assertEquals("10\n20\n30\n10\n5", result.strip());
    }


}

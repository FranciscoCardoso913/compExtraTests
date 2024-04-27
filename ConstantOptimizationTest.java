package pt.up.fe.comp.compExtraTests;

import org.junit.Test;
import pt.up.fe.comp.TestUtils;
import pt.up.fe.comp.jmm.ollir.JmmOptimization;
import pt.up.fe.comp.jmm.ollir.OllirResult;
import pt.up.fe.specs.util.SpecsIo;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static pt.up.fe.comp.TestUtils.getJmmOptimization;

public class ConstantOptimizationTest {
    // Currently, you will need to check the output on the ollir code
    // Modify the tests if you want automatic testing

    @Test
    public void testConstantsSimpler() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/ConstantsSimple.jmm");
        OllirResult optimizationResult = TestUtils.optimize(code, Collections.emptyMap());
        System.out.println(optimizationResult.getOllirCode());

        // to use only the AST optimizations, you need to use this (output will be significantly more verbose)
        /*
        JmmOptimization optimization = getJmmOptimization();
        var parserResult = TestUtils.parse(code);
        var semanticsResult = TestUtils.analyse(parserResult);
        semanticsResult = optimization.optimize(semanticsResult);
        System.out.println(semanticsResult.getRootNode().toTree());
         */

    }
    @Test
    public void testConstants() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/Constants.jmm");

        // this runs optimizations in both the AST and Ollir
        OllirResult optimizationResult = TestUtils.optimize(code, Collections.emptyMap());
        System.out.println(optimizationResult.getOllirCode());

        // to use only the AST optimizations, you need to use this (output will be significantly more verbose)
        /*
        JmmOptimization optimization = getJmmOptimization();
        var parserResult = TestUtils.parse(code);
        var semanticsResult = TestUtils.analyse(parserResult);
        semanticsResult = optimization.optimize(semanticsResult);
        System.out.println(semanticsResult.getRootNode().toTree());
         */
    }

}

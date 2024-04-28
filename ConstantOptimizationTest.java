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
    // Currently, you can easily modify the tests and check either the ollir code or the AST in the terminal
    // Since some tests have while's and if's, and ollir may not handle them yet, you can use the AST to check the optimizations

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
    @Test
    public void testConstantsMultipleMethods() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/ConstantsMultipleMethods.jmm");
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
    public void testConstantsTricky() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/ConstantsTricky.jmm");

        // this runs optimizations in both the AST and Ollir
        // OllirResult optimizationResult = TestUtils.optimize(code, Collections.emptyMap());
        // System.out.println(optimizationResult.getOllirCode());

        // to use only the AST optimizations, you need to use this (output will be significantly more verbose)

        JmmOptimization optimization = getJmmOptimization();
        var parserResult = TestUtils.parse(code);
        var semanticsResult = TestUtils.analyse(parserResult);
        semanticsResult = optimization.optimize(semanticsResult);
        System.out.println(semanticsResult.getRootNode().toTree());
    }

    @Test
    public void testConstantsWithinLoop() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/ConstantsWithinLoop.jmm");

        // this runs optimizations in both the AST and Ollir
        // OllirResult optimizationResult = TestUtils.optimize(code, Collections.emptyMap());
        // System.out.println(optimizationResult.getOllirCode());

        // to use only the AST optimizations, you need to use this (output will be significantly more verbose)

        JmmOptimization optimization = getJmmOptimization();
        var parserResult = TestUtils.parse(code);
        var semanticsResult = TestUtils.analyse(parserResult);
        semanticsResult = optimization.optimize(semanticsResult);
        System.out.println(semanticsResult.getRootNode().toTree());
    }

    @Test
    public void testConstantsComplex() {
        var code = SpecsIo.getResource("pt/up/fe/comp/compExtraTests/apps/constant_optimization/ConstantsComplex.jmm");

        // this runs optimizations in both the AST and Ollir
        // OllirResult optimizationResult = TestUtils.optimize(code, Collections.emptyMap());
        // System.out.println(optimizationResult.getOllirCode());

        // to use only the AST optimizations, you need to use this (output will be significantly more verbose)

        JmmOptimization optimization = getJmmOptimization();
        var parserResult = TestUtils.parse(code);
        var semanticsResult = TestUtils.analyse(parserResult);
        semanticsResult = optimization.optimize(semanticsResult);
        System.out.println(semanticsResult.getRootNode().toTree());
    }

}

package com.jbaysolutions.ailabs.builder.testing.local.trainer.helper;

/**
 * (c) JBay Solutions 2010-2012 All rights reserved.
 * <p>
 * User: RuiP
 * Date: 21-01-2020
 * Time: 16:27
 */
public class ClassificationScoreCalculatorWrapper extends ScoreCalculatorWrapper {

    public ClassificationMetric metric = ClassificationMetric.ACCURACY;
    

    public ClassificationScoreCalculatorWrapper() {
        this.type = ScoreCalculatorType.CLASSIFICATION_SCORE;
    }

    public enum ClassificationMetric {
        ACCURACY, F1, PRECISION, RECALL, GMEASURE, MCC;
    }
}

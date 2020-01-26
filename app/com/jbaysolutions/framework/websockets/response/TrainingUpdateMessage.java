package com.jbaysolutions.framework.websockets.response;

/**
 * (c) JBay Solutions 2010-2012 All rights reserved.
 * <p>
 * User: RuiP
 * Date: 24-01-2020
 * Time: 19:30
 */
public class TrainingUpdateMessage extends WSBaseResponse {

    public String uuid;
    public String message;
    public int epoch;
    public double score;

    public TrainingUpdateMessage() {
        this.type = WSBaseResponseType.TRAINING_UPDATE;
    }

    public TrainingUpdateMessage(
            String uuid,
            String message,
            int epoch,
            double score
    ) {
        this();
        this.uuid = uuid;
        this.message = message;
        this.epoch = epoch;
        this.score = score;
    }
}

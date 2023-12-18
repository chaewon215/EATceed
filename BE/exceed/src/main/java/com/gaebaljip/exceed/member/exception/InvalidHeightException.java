package com.gaebaljip.exceed.member.exception;

import com.gaebaljip.exceed.common.MessageCode;

public class InvalidHeightException extends IllegalArgumentException {

    private final MessageCode messageCode;

    public InvalidHeightException() {
        super(MessageCode.INVALID_HEIGHT.getValue());
        this.messageCode = MessageCode.INVALID_HEIGHT;
    }
}

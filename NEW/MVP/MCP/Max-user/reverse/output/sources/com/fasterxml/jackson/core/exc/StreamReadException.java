package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import defpackage.px7;

/* loaded from: classes.dex */
public abstract class StreamReadException extends JsonProcessingException {
    public StreamReadException(px7 px7Var, String str) {
        super(str, px7Var == null ? null : px7Var.l(), null);
    }
}

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: classes4.dex */
public abstract class DatabindException extends JsonProcessingException {
    private static final long serialVersionUID = 3;

    public abstract void e(Object obj, String str);
}

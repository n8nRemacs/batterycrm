package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;

/* loaded from: classes4.dex */
public class InvalidFormatException extends MismatchedInputException {
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Object f341914f;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj) {
        super((Closeable) jsonParser, str);
        this.f341914f = obj;
    }
}

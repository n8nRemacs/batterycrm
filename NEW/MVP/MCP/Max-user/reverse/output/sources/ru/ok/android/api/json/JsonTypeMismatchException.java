package ru.ok.android.api.json;

import defpackage.qoi;

/* loaded from: classes2.dex */
public final class JsonTypeMismatchException extends JsonParseException {
    public JsonTypeMismatchException(int i, int i2) {
        super("Expected " + qoi.d(i) + " was " + qoi.d(i2));
    }
}

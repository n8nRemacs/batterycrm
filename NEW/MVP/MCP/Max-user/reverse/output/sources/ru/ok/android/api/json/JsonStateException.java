package ru.ok.android.api.json;

import defpackage.qoi;

/* loaded from: classes2.dex */
public final class JsonStateException extends IllegalStateException {
    public static JsonStateException a(int i) {
        return new JsonStateException("Expected " + qoi.d(93) + " was " + qoi.d(i));
    }

    public static JsonStateException b(int i) {
        return new JsonStateException("Expected " + qoi.d(125) + " was " + qoi.d(i));
    }

    public static JsonStateException c(int i) {
        return new JsonStateException("Expected " + qoi.d(39) + " was " + qoi.d(i));
    }

    public static JsonStateException d(int i) {
        return new JsonStateException("Expected value was ".concat(qoi.d(i)));
    }
}

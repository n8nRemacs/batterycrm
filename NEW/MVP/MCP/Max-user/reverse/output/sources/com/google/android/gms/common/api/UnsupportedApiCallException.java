package com.google.android.gms.common.api;

import defpackage.qt5;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final qt5 a;

    public UnsupportedApiCallException(qt5 qt5Var) {
        this.a = qt5Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}

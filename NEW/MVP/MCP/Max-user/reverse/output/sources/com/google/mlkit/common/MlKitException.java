package com.google.mlkit.common;

import defpackage.s5j;

/* loaded from: classes.dex */
public class MlKitException extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        s5j.d(str, "Provided message must not be empty.");
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        s5j.d(str, "Provided message must not be empty.");
        this.a = 13;
    }
}

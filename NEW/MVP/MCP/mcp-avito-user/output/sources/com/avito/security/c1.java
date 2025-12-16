package com.avito.security;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class c1<R> implements t0<R>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final int f338576a;

    public c1(int i12) {
        this.f338576a = i12;
    }

    public String toString() {
        String strA = t1.a(this);
        y0.a((Object) strA, "Reflection.renderLambdaToString(this)");
        return strA;
    }
}

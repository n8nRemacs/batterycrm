package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.h;

/* compiled from: JacksonFeatureSet.java */
/* loaded from: classes3.dex */
public final class i<F extends h> {

    /* renamed from: a, reason: collision with root package name */
    public final int f341305a;

    public i(int i12) {
        this.f341305a = i12;
    }

    public static <F extends h> i<F> a(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int iA2 = 0;
        for (F f12 : fArr) {
            if (f12.b()) {
                iA2 |= f12.a();
            }
        }
        return new i<>(iA2);
    }
}

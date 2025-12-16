package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: ViewMatcher.java */
/* loaded from: classes4.dex */
public class F implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final F f342581b = new F();
    private static final long serialVersionUID = 1;

    /* compiled from: ViewMatcher.java */
    public static final class a extends F implements Serializable {
        private static final long serialVersionUID = 1;
    }

    /* compiled from: ViewMatcher.java */
    public static final class b extends F {
        private static final long serialVersionUID = 1;
    }

    public static F a(Class<?>[] clsArr) {
        int length;
        F f12 = f342581b;
        if (clsArr == null || (length = clsArr.length) == 0) {
            return f12;
        }
        if (length != 1) {
            return new a();
        }
        Class<?> cls = clsArr[0];
        return new b();
    }
}

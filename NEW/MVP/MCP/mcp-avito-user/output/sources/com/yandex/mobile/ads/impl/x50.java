package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public enum x50 {
    f391549b("design_v1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("instream_design_v2");


    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f391551a;

    public static final class a {
        @Y61.l
        public static x50 a(@Y61.k String str) {
            for (x50 x50Var : x50.values()) {
                if (kotlin.jvm.internal.L.f(x50Var.a(), str)) {
                    return x50Var;
                }
            }
            return null;
        }
    }

    x50(String str) {
        this.f391551a = str;
    }

    @Y61.k
    public final String a() {
        return this.f391551a;
    }
}

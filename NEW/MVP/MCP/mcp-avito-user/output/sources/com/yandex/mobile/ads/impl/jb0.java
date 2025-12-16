package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class jb0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final Object f386798c = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final kb0 f386799a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ib0 f386800b = new ib0();

    public jb0(@Y61.k w90 w90Var) {
        this.f386799a = new kb0(w90Var);
    }

    @Y61.k
    public final String a() {
        String strA;
        synchronized (f386798c) {
            strA = this.f386799a.a();
            if (strA == null) {
                this.f386800b.getClass();
                strA = ib0.a();
                this.f386799a.a(strA);
            }
        }
        return strA;
    }
}

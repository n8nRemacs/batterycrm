package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class sy {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f390043b = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w90 f390044a;

    public sy(@Y61.k w90 w90Var) {
        this.f390044a = w90Var;
    }

    public final boolean a(@Y61.l s8 s8Var) {
        String strA;
        boolean z12 = false;
        if (s8Var == null || (strA = s8Var.a()) == null) {
            return false;
        }
        synchronized (f390043b) {
            String strB = this.f390044a.b("google_advertising_id_key");
            if (strB != null) {
                if (!strA.equals(strB)) {
                    z12 = true;
                }
            }
        }
        return z12;
    }

    public final void b(@Y61.l s8 s8Var) {
        String strB = this.f390044a.b("google_advertising_id_key");
        String strA = s8Var != null ? s8Var.a() : null;
        if (strB != null || strA == null) {
            return;
        }
        this.f390044a.putString("google_advertising_id_key", strA);
    }
}

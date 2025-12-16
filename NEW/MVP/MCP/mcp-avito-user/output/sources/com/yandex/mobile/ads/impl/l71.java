package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class l71 implements uz0<String> {
    @Override // com.yandex.mobile.ads.impl.uz0
    @j.P
    public final String a(@j.N jz0 jz0Var) {
        byte[] bArrA = jz0Var.a().a();
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(bArrA, fz.a(jz0Var.b()));
        } catch (Exception unused) {
            return new String(bArrA);
        }
    }
}

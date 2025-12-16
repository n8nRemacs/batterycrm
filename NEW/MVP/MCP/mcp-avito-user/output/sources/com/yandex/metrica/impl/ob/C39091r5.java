package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.r5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39091r5 extends X4 {
    public C39091r5(L3 l32) {
        super(l32);
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        String strP = a().p();
        String strM = c38715c0.m();
        a().b(strM);
        if (TextUtils.equals(strP, strM)) {
            return false;
        }
        a().a(J.s());
        return false;
    }
}

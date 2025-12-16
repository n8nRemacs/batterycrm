package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.n5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38994n5 extends X4 {
    public C38994n5(@j.N L3 l32) {
        super(l32);
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        String strM = c38715c0.m();
        if (TextUtils.isEmpty(strM)) {
            return false;
        }
        a().b(strM);
        return false;
    }
}

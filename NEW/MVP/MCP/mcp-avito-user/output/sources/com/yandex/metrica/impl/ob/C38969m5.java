package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.m5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38969m5 extends X4 {
    public C38969m5(L3 l32) {
        super(l32);
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        if (TextUtils.isEmpty(c38715c0.p()) || !TextUtils.isEmpty(a().h())) {
            return false;
        }
        a().a(c38715c0.p());
        return false;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class we0 extends af0 {
    public we0(@j.N n2 n2Var) {
        super(n2Var);
    }

    @Override // com.yandex.mobile.ads.impl.af0
    @j.N
    public final HashMap a(@j.N Context context) {
        HashMap mapA = super.a(context);
        SizeInfo sizeInfoN = this.f383541a.n();
        if (sizeInfoN != null) {
            mapA.put("width", Integer.valueOf(sizeInfoN.c(context)));
            mapA.put("height", Integer.valueOf(sizeInfoN.a(context)));
        }
        return mapA;
    }
}

package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class qd1 implements dz0<md1, ed1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final m5 f389150a;

    public qd1(@j.N m5 m5Var) {
        this.f389150a = m5Var;
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(md1 md1Var) {
        HashMap map = new HashMap();
        String strC = this.f389150a.c();
        String strD = this.f389150a.d();
        if (TextUtils.isEmpty(strD)) {
            strD = "null";
        }
        map.put("page_id", strD);
        if (TextUtils.isEmpty(strC)) {
            strC = "null";
        }
        map.put("imp_id", strC);
        return new ky0(ky0.b.f387311l.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(@j.P kz0<ed1> kz0Var, int i12, @j.N md1 md1Var) {
        HashMap map = new HashMap();
        String strC = this.f389150a.c();
        String strD = this.f389150a.d();
        if (TextUtils.isEmpty(strD)) {
            strD = "null";
        }
        map.put("page_id", strD);
        if (TextUtils.isEmpty(strC)) {
            strC = "null";
        }
        map.put("imp_id", strC);
        if (i12 != -1) {
            map.put("code", Integer.valueOf(i12));
        }
        return new ky0(ky0.b.f387312m.a(), map);
    }
}

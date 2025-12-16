package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class g00 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final x6 f385544a;

    public g00(@j.N Context context, @j.N n2 n2Var) {
        this.f385544a = new x6(context, n2Var);
    }

    public final void a(@j.N String str, @j.N AdResponse adResponse, @j.N C39307b1 c39307b1) {
        List<String> listS = adResponse.s();
        if (listS != null) {
            Iterator<String> it = listS.iterator();
            while (it.hasNext()) {
                this.f385544a.a(it.next());
            }
        }
        this.f385544a.a(str, adResponse, c39307b1);
    }
}

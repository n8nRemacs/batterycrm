package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class qx0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final x6 f389328a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final px0 f389329b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final List<String> f389330c;

    public qx0(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.P List<String> list) {
        this.f389330c = list;
        this.f389328a = new x6(context, n2Var);
        this.f389329b = new px0(context, adResponse, n2Var);
    }

    public final void a(@j.N tm0 tm0Var) {
        this.f389329b.a(tm0Var);
    }

    public final void a() {
        List<String> list = this.f389330c;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f389328a.a(it.next());
            }
        }
        this.f389329b.a();
    }
}

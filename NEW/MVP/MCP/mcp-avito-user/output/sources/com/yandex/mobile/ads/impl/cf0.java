package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class cf0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tr f384258a = new tr();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final z20 f384259b = new z20();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Point f384260c;

    public cf0(@j.N Context context) {
        this.f384260c = os0.b(context);
    }

    @j.N
    public final HashSet a(@j.N ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.monetization.ads.mediation.nativeads.c) it.next()).getClass();
            if (!TextUtils.isEmpty(null)) {
                this.f384259b.getClass();
                b30 b30Var = new b30();
                b30Var.b((String) null);
                b30Var.b(this.f384260c.x);
                b30Var.a(this.f384260c.y);
                hashSet.add(b30Var);
            }
        }
        return hashSet;
    }

    @j.N
    public final HashMap b(@j.N ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.monetization.ads.mediation.nativeads.c) it.next()).getClass();
        }
        return map;
    }
}

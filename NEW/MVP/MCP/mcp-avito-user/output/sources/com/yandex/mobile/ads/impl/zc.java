package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class zc {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yc f392218a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Object f392219b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ArrayList f392220c = new ArrayList();

    public zc(@Y61.k e31 e31Var, @Y61.k yc ycVar) {
        this.f392218a = ycVar;
    }

    public final void a(@Y61.k Context context, @Y61.k fa faVar, @Y61.k cd cdVar) {
        if (!this.f392218a.a(context)) {
            cdVar.a(null);
            return;
        }
        synchronized (this.f392219b) {
            this.f392220c.add(cdVar);
            faVar.b(cdVar);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void a(@Y61.k fa faVar) {
        HashSet hashSet;
        synchronized (this.f392219b) {
            hashSet = new HashSet(this.f392220c);
            this.f392220c.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            faVar.a((cd) it.next());
        }
    }
}

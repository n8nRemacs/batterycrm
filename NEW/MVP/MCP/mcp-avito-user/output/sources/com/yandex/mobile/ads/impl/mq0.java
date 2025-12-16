package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class mq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final pq0 f388058a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Object f388059b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ArrayList f388060c = new ArrayList();

    public mq0(@Y61.k Context context) {
        this.f388058a = pq0.f388928g.a(context);
    }

    public final void a(@Y61.k kq0 kq0Var) {
        synchronized (this.f388059b) {
            this.f388060c.add(kq0Var);
            this.f388058a.b(kq0Var);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void a() {
        List listM0;
        synchronized (this.f388059b) {
            listM0 = C42745f0.M0(this.f388060c);
            this.f388060c.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            this.f388058a.a((kq0) it.next());
        }
    }
}

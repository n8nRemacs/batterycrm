package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class hg1 implements gg1, ig1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f386132a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f386133b = new LinkedHashSet();

    public final void a(@Y61.k gg1... gg1VarArr) {
        C42745f0.i(this.f386132a, gg1VarArr);
    }

    @Override // com.yandex.mobile.ads.impl.ig1
    public final void b() {
        Iterator it = this.f386133b.iterator();
        while (it.hasNext()) {
            ((ig1) it.next()).b();
        }
    }

    public final void a(@Y61.k ig1... ig1VarArr) {
        C42745f0.i(this.f386133b, ig1VarArr);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        Iterator it = this.f386132a.iterator();
        while (it.hasNext()) {
            ((gg1) it.next()).a(j12, j13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ig1
    public final void a() {
        Iterator it = this.f386133b.iterator();
        while (it.hasNext()) {
            ((ig1) it.next()).a();
        }
    }
}

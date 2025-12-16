package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class r4 implements InterfaceC39327g1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f389376a;

    public r4(@Y61.k List<v4> list) {
        Iterator<T> it = list.iterator();
        long jA2 = 0;
        while (it.hasNext()) {
            jA2 += ((v4) it.next()).a();
        }
        this.f389376a = jA2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39327g1
    public final long a() {
        return this.f389376a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39327g1
    public final long a(long j12) {
        return this.f389376a;
    }
}

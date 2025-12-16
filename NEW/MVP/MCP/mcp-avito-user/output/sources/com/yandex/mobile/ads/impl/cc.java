package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<n50> f384235a;

    /* JADX WARN: Multi-variable type inference failed */
    public cc(@Y61.k List<? extends n50> list) {
        this.f384235a = list;
    }

    public final void a(@Y61.k se1 se1Var) {
        Iterator<n50> it = this.f384235a.iterator();
        while (it.hasNext()) {
            it.next().a(se1Var);
        }
    }
}

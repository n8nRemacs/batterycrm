package com.yandex.div.core.view2.divs;

import com.yandex.div.core.C37916k;
import com.yandex.div.core.C37919n;
import com.yandex.div.core.InterfaceC37915j;

/* compiled from: DivActionBinder_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.divs.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37986p implements dagger.internal.h<C37955g> {

    /* renamed from: a, reason: collision with root package name */
    public final C37919n f368592a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.r f368593b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368594c;

    /* renamed from: d, reason: collision with root package name */
    public final com.yandex.div.core.J f368595d;

    /* renamed from: e, reason: collision with root package name */
    public final com.yandex.div.core.H f368596e;

    /* renamed from: f, reason: collision with root package name */
    public final com.yandex.div.core.F f368597f;

    public C37986p(C37919n c37919n, com.yandex.div.core.r rVar, dagger.internal.u uVar, com.yandex.div.core.J j12, com.yandex.div.core.H h12, com.yandex.div.core.F f12) {
        this.f368592a = c37919n;
        this.f368593b = rVar;
        this.f368594c = uVar;
        this.f368595d = j12;
        this.f368596e = h12;
        this.f368597f = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C37955g((C37916k) this.f368592a.get(), (InterfaceC37915j) this.f368593b.get(), (C37935b) this.f368594c.get(), ((Boolean) this.f368595d.get()).booleanValue(), ((Boolean) this.f368596e.get()).booleanValue(), ((Boolean) this.f368597f.get()).booleanValue());
    }
}

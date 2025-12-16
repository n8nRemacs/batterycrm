package com.avito.android.vas_planning.domain;

import aM0.InterfaceC19791a;
import android.content.res.Resources;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19791a> f322351a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f322352b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322353c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<h> f322354d;

    /* renamed from: e, reason: collision with root package name */
    public final u f322355e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f322356f;

    public q(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f322351a = provider;
        this.f322352b = provider2;
        this.f322353c = provider3;
        this.f322354d = provider4;
        this.f322355e = uVar;
        this.f322356f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f322351a.get(), this.f322352b.get(), this.f322353c.get(), this.f322354d.get(), (a) this.f322355e.get(), (Resources) this.f322356f.f393949a);
    }
}

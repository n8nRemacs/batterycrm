package com.avito.android.publish.details;

import af0.InterfaceC19882a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishDetailsSlotValidatorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H1 implements dagger.internal.h<C33806y1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f232940a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f232941b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f232942c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC19882a> f232943d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f232944e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f232945f;

    public H1(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, Provider provider2) {
        this.f232940a = uVar;
        this.f232941b = uVar2;
        this.f232942c = uVar3;
        this.f232943d = provider;
        this.f232944e = uVar4;
        this.f232945f = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33806y1((com.avito.android.publish.C0) this.f232940a.get(), (InterfaceC35745a5) this.f232941b.get(), (InterfaceC33535v) this.f232942c.get(), this.f232943d.get(), (com.avito.android.Q1) this.f232944e.get(), dagger.internal.g.b(this.f232945f));
    }
}

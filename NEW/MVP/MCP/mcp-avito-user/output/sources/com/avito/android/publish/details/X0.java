package com.avito.android.publish.details;

import com.avito.android.publish.InterfaceC33513a;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.InterfaceC34150w0;
import com.avito.android.publish.PublishParametersInteractor;
import javax.inject.Provider;

/* compiled from: PublishDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class X0 implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.pretend.e> f233182a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PublishParametersInteractor> f233183b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233184c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f233185d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f233186e;

    public X0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider, Provider provider2) {
        this.f233182a = provider;
        this.f233183b = provider2;
        this.f233184c = uVar;
        this.f233185d = uVar2;
        this.f233186e = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W0(this.f233182a.get(), this.f233183b.get(), (InterfaceC33878l) this.f233184c.get(), (InterfaceC33513a) this.f233185d.get(), (InterfaceC34150w0) this.f233186e.get());
    }
}

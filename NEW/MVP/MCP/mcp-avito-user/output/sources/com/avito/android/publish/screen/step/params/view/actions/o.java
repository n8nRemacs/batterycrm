package com.avito.android.publish.screen.step.params.view.actions;

import com.avito.android.Q1;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.publish.details.InterfaceC33761j0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDetailsViewActionsConfiguratorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f241579a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33675a> f241580b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33761j0> f241581c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f241582d;

    public o(Provider<com.avito.android.details.a> provider, Provider<InterfaceC33675a> provider2, Provider<InterfaceC33761j0> provider3, Provider<Q1> provider4) {
        this.f241579a = provider;
        this.f241580b = provider2;
        this.f241581c = provider3;
        this.f241582d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f241579a.get(), this.f241580b.get(), this.f241581c.get(), this.f241582d.get());
    }
}

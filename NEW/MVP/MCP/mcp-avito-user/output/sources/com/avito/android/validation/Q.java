package com.avito.android.validation;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideMultiStateSwitcherItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class Q implements dagger.internal.h<com.avito.android.blueprints.switcher.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319285a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f319286b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f319287c;

    public Q(Provider<com.avito.android.util.text.a> provider, Provider<InterfaceC35807h4> provider2, Provider<Q1> provider3) {
        this.f319285a = provider;
        this.f319286b = provider2;
        this.f319287c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f319285a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f319286b.get();
        Q1 q12 = this.f319287c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.switcher.f(aVar, interfaceC35807h4, q12);
    }
}

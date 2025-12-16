package com.avito.android.validation;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideChipsMultiselectItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class E implements dagger.internal.h<com.avito.android.blueprints.chips_multiselect.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f319251a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f319252b;

    public E(Provider<InterfaceC35807h4> provider, Provider<Q1> provider2) {
        this.f319251a = provider;
        this.f319252b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f319251a.get();
        Q1 q12 = this.f319252b.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.chips_multiselect.f(interfaceC35807h4, q12);
    }
}

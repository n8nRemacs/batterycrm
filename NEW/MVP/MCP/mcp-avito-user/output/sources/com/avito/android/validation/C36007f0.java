package com.avito.android.validation;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideRadioGroupSelectItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36007f0 implements dagger.internal.h<com.avito.android.blueprints.radiogroup.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f319370a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f319371b;

    public C36007f0(Provider<InterfaceC35807h4> provider, Provider<Q1> provider2) {
        this.f319370a = provider;
        this.f319371b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f319370a.get();
        Q1 q12 = this.f319371b.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.radiogroup.g(interfaceC35807h4, q12);
    }
}

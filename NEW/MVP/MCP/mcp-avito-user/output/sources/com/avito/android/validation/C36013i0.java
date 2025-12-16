package com.avito.android.validation;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideSelectItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36013i0 implements dagger.internal.h<com.avito.android.blueprints.select.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319384a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f319385b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f319386c;

    public C36013i0(Provider<com.avito.android.util.text.a> provider, Provider<InterfaceC35807h4> provider2, Provider<Q1> provider3) {
        this.f319384a = provider;
        this.f319385b = provider2;
        this.f319386c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f319384a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f319385b.get();
        Q1 q12 = this.f319386c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.select.i(aVar, interfaceC35807h4, q12);
    }
}

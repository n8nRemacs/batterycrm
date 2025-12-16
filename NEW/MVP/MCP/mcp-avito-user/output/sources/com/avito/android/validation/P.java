package com.avito.android.validation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideMultiStateSwitcherItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class P implements dagger.internal.h<com.avito.android.blueprints.switcher.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.b> f319282a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f319283b;

    public P(Provider<com.avito.android.blueprints.switcher.b> provider, Provider<u3.l<SimpleTestGroupWithNone>> provider2) {
        this.f319282a = provider;
        this.f319283b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.switcher.b bVar = this.f319282a.get();
        u3.l<SimpleTestGroupWithNone> lVar = this.f319283b.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.switcher.a(bVar, lVar);
    }
}

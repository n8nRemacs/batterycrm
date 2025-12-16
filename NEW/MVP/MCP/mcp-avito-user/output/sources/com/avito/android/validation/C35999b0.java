package com.avito.android.validation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvidePublishSwitcherBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35999b0 implements dagger.internal.h<com.avito.android.blueprint.switcher.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.c> f319344a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319345b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f319346c;

    public C35999b0(Provider<com.avito.android.blueprint.switcher.c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<u3.l<SimpleTestGroupWithNone>> provider3) {
        this.f319344a = provider;
        this.f319345b = provider2;
        this.f319346c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprint.switcher.c cVar = this.f319344a.get();
        com.avito.android.util.text.a aVar = this.f319345b.get();
        u3.l<SimpleTestGroupWithNone> lVar = this.f319346c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprint.switcher.a(cVar, aVar, lVar);
    }
}

package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideSelectWithSuggestedOptionsItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36015j0 implements dagger.internal.h<com.avito.android.blueprints.withSuggestedOptions.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.withSuggestedOptions.d> f319388a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319389b;

    public C36015j0(dagger.internal.u uVar, Provider provider) {
        this.f319388a = provider;
        this.f319389b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.withSuggestedOptions.d dVar = this.f319388a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f319389b.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.withSuggestedOptions.b(dVar, aVar);
    }
}

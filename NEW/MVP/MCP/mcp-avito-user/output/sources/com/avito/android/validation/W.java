package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvidePublishCheckboxBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class W implements dagger.internal.h<com.avito.android.blueprint.checkbox.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.checkbox.c> f319310a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319311b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f319312c;

    public W(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f319310a = provider;
        this.f319311b = uVar;
        this.f319312c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprint.checkbox.c cVar = this.f319310a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f319311b.get();
        u3.l lVar = (u3.l) this.f319312c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprint.checkbox.a(cVar, aVar, lVar);
    }
}

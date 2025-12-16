package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideSelectorCardGroupBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36019l0 implements dagger.internal.h<com.avito.android.blueprints.selector_card.select.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.selector_card.select.c> f319393a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319394b;

    public C36019l0(dagger.internal.u uVar, Provider provider) {
        this.f319393a = provider;
        this.f319394b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.selector_card.select.c cVar = this.f319393a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f319394b.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.selector_card.select.a(cVar, aVar);
    }
}

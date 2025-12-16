package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideChipsSelectItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class F implements dagger.internal.h<com.avito.android.blueprints.chips.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.chips.d> f319254a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319255b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f319256c;

    public F(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f319254a = provider;
        this.f319255b = uVar;
        this.f319256c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.chips.d dVar = this.f319254a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f319255b.get();
        u3.l lVar = (u3.l) this.f319256c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.chips.b(dVar, aVar, lVar);
    }
}

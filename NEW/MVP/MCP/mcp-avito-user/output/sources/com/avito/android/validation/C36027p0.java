package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideVehicleNumberInputItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36027p0 implements dagger.internal.h<com.avito.android.blueprints.publish.reg_number.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.reg_number.c> f319410a;

    public C36027p0(Provider<com.avito.android.blueprints.publish.reg_number.c> provider) {
        this.f319410a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.reg_number.c cVar = this.f319410a.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.publish.reg_number.a(cVar);
    }
}

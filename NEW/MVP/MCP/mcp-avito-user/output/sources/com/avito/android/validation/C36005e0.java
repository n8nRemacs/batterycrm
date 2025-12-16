package com.avito.android.validation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideRadioGroupSelectItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36005e0 implements dagger.internal.h<com.avito.android.blueprints.radiogroup.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radiogroup.c> f319359a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319360b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f319361c;

    public C36005e0(Provider<com.avito.android.blueprints.radiogroup.c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<u3.l<SimpleTestGroupWithNone>> provider3) {
        this.f319359a = provider;
        this.f319360b = provider2;
        this.f319361c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.radiogroup.c cVar = this.f319359a.get();
        com.avito.android.util.text.a aVar = this.f319360b.get();
        u3.l<SimpleTestGroupWithNone> lVar = this.f319361c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.radiogroup.a(cVar, aVar, lVar);
    }
}

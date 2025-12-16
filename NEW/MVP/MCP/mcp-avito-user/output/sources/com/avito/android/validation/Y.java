package com.avito.android.validation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvidePublishRadioGroupSelectItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class Y implements dagger.internal.h<com.avito.android.blueprint.radiogroup.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.radiogroup.c> f319319a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319320b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f319321c;

    public Y(Provider<com.avito.android.blueprint.radiogroup.c> provider, Provider<com.avito.android.util.text.a> provider2, Provider<u3.l<SimpleTestGroupWithNone>> provider3) {
        this.f319319a = provider;
        this.f319320b = provider2;
        this.f319321c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprint.radiogroup.c cVar = this.f319319a.get();
        com.avito.android.util.text.a aVar = this.f319320b.get();
        u3.l<SimpleTestGroupWithNone> lVar = this.f319321c.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprint.radiogroup.a(cVar, aVar, lVar);
    }
}

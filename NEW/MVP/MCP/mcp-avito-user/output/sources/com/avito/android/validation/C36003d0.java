package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideRadioCardsGroupBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36003d0 implements dagger.internal.h<com.avito.android.blueprints.radio_card.radio_card_group.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.radio_card.radio_card_group.c> f319357a;

    public C36003d0(Provider<com.avito.android.blueprints.radio_card.radio_card_group.c> provider) {
        this.f319357a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.radio_card.radio_card_group.c cVar = this.f319357a.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.radio_card.radio_card_group.a(cVar);
    }
}

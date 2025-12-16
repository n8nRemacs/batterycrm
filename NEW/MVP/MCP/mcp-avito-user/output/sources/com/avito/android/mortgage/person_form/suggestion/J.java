package com.avito.android.mortgage.person_form.suggestion;

import kotlinx.coroutines.flow.i2;

/* compiled from: SuggestionViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.person_form.suggestion.mvi.i f201352a;

    public J(com.avito.android.mortgage.person_form.suggestion.mvi.i iVar) {
        this.f201352a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.person_form.suggestion.mvi.h hVar = (com.avito.android.mortgage.person_form.suggestion.mvi.h) this.f201352a.get();
        i2.f411430a.getClass();
        return new I(hVar, i2.a.f411433c);
    }
}

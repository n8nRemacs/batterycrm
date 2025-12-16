package com.avito.android.mortgage.person_form.suggestion.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.person_form.suggestion.mvi.domain.c f201446a;

    public d(com.avito.android.mortgage.person_form.suggestion.mvi.domain.c cVar) {
        this.f201446a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.person_form.suggestion.mvi.domain.b) this.f201446a.get());
    }
}

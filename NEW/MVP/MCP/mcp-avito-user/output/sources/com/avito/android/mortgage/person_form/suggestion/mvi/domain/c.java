package com.avito.android.mortgage.person_form.suggestion.mvi.domain;

import com.avito.android.mortgage.person_form.mvi.domain.formatters.d;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestionsInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f201459a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f201460b;

    /* renamed from: c, reason: collision with root package name */
    public final u f201461c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f201459a = provider;
        this.f201460b = provider2;
        this.f201461c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f201459a.get(), this.f201460b.get(), (d) this.f201461c.get());
    }
}

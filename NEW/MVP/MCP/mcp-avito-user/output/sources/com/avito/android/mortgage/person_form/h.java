package com.avito.android.mortgage.person_form;

import androidx.view.N0;
import com.avito.android.mortgage.person_form.mvi.K;
import com.avito.android.mortgage.person_form.mvi.L;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgagePersonFormViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final L f200561a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.e> f200562b;

    public h(L l12, Provider provider) {
        this.f200561a = l12;
        this.f200562b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        K k12 = (K) this.f200561a.get();
        com.avito.android.mortgage.person_form.mvi.domain.e eVar = this.f200562b.get();
        g gVar = new g(k12, null, 2, null);
        eVar.b(N0.a(gVar));
        return gVar;
    }
}

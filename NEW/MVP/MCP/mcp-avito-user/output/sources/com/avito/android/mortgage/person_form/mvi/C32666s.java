package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PersonFormActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.person_form.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32666s implements dagger.internal.h<C32649a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.a> f201301a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.e> f201302b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.j> f201303c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.n> f201304d;

    /* renamed from: e, reason: collision with root package name */
    public final w f201305e;

    /* renamed from: f, reason: collision with root package name */
    public final J f201306f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f201307g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f201308h;

    public C32666s(Provider provider, Provider provider2, Provider provider3, Provider provider4, w wVar, J j12, com.avito.android.mortgage.util.e eVar, Provider provider5) {
        this.f201301a = provider;
        this.f201302b = provider2;
        this.f201303c = provider3;
        this.f201304d = provider4;
        this.f201305e = wVar;
        this.f201306f = j12;
        this.f201307g = eVar;
        this.f201308h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.person_form.mvi.domain.a aVar = this.f201301a.get();
        com.avito.android.mortgage.person_form.mvi.domain.e eVar = this.f201302b.get();
        com.avito.android.mortgage.person_form.mvi.domain.j jVar = this.f201303c.get();
        com.avito.android.mortgage.person_form.mvi.domain.n nVar = this.f201304d.get();
        v vVar = (v) this.f201305e.get();
        this.f201306f.getClass();
        H h12 = new H();
        this.f201307g.getClass();
        return new C32649a(aVar, eVar, jVar, nVar, vVar, h12, new com.avito.android.mortgage.util.d(), this.f201308h.get());
    }
}

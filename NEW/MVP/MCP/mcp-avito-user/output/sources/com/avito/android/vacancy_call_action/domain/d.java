package com.avito.android.vacancy_call_action.domain;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VacancyCallActionInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OQ.a> f319227a;

    /* renamed from: b, reason: collision with root package name */
    public final f f319228b;

    public d(Provider provider, f fVar) {
        this.f319227a = provider;
        this.f319228b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OQ.a aVar = this.f319227a.get();
        this.f319228b.getClass();
        return new b(aVar, new e());
    }
}

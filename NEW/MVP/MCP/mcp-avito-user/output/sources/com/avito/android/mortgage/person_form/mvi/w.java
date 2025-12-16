package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PersonFormContentActorSubscriptions_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f201330a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.a> f201331b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.e> f201332c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f201333d;

    public w(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f201330a = lVar;
        this.f201331b = provider;
        this.f201332c = provider2;
        this.f201333d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((PersonFormArguments) this.f201330a.f393949a, this.f201331b.get(), this.f201332c.get(), this.f201333d.get());
    }
}

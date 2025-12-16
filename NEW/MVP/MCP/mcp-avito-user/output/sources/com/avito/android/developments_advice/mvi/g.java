package com.avito.android.developments_advice.mvi;

import com.avito.android.remote.model.ConsultationFormData;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentsAdviceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_advice.data.a> f136165a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136166b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f136167c;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f136165a = provider;
        this.f136166b = lVar;
        this.f136167c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f136165a.get(), (ConsultationFormData) this.f136166b.f393949a, (String) this.f136167c.f393949a);
    }
}

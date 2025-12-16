package com.avito.android.developments_advice.mvi;

import com.avito.android.remote.model.ConsultationFormData;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAdviceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136173a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136174b;

    public i(dagger.internal.l lVar, u uVar) {
        this.f136173a = uVar;
        this.f136174b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.developments_advice.data.a) this.f136173a.get(), (ConsultationFormData) this.f136174b.f393949a);
    }
}

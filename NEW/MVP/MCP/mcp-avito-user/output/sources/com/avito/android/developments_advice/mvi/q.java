package com.avito.android.developments_advice.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAdviceReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f136188a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136189b;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f136188a = lVar;
        this.f136189b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((String) this.f136188a.f393949a, (Boolean) this.f136189b.f393949a);
    }
}

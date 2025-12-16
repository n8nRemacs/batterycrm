package com.avito.android.vas_performance.screens.competitive.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitiveVasV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f320467a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f320468b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f320467a = lVar;
        this.f320468b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f320468b.get(), (String) this.f320467a.f393949a);
    }
}

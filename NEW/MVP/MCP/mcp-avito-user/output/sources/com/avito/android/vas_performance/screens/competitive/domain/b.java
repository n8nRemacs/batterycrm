package com.avito.android.vas_performance.screens.competitive.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: GetCompetitiveVasV2UseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f320432a;

    /* renamed from: b, reason: collision with root package name */
    public final l f320433b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f320434c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f320435d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f320432a = lVar;
        this.f320433b = lVar2;
        this.f320434c = provider;
        this.f320435d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f320435d.get(), (String) this.f320432a.f393949a, (String) this.f320433b.f393949a, this.f320434c.get());
    }
}

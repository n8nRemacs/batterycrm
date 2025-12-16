package com.avito.android.bbl.screens.limit_increase.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oh.InterfaceC44774a;

/* compiled from: GetLimitIncreaseUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99774a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99775b;

    /* renamed from: c, reason: collision with root package name */
    public final l f99776c;

    /* renamed from: d, reason: collision with root package name */
    public final l f99777d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f99774a = provider;
        this.f99775b = provider2;
        this.f99776c = lVar;
        this.f99777d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f99774a.get(), this.f99775b.get(), ((Long) this.f99776c.f393949a).longValue(), (String) this.f99777d.f393949a);
    }
}

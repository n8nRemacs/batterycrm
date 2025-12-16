package com.avito.android.tariff_lf_constructor.configure.level.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: GetConstructorConfigureLevelUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299823a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f299824b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f299825c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f299823a = lVar;
        this.f299824b = provider;
        this.f299825c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f299823a.f393949a, this.f299824b.get(), this.f299825c.get());
    }
}

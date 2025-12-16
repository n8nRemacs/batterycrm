package com.avito.android.tariff_select.domain;

import bE0.InterfaceC25503a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffSelectUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301220a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25503a> f301221b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f301222c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f301220a = lVar;
        this.f301221b = provider;
        this.f301222c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f301220a.f393949a, this.f301221b.get(), this.f301222c.get());
    }
}

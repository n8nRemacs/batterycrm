package com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import hB0.InterfaceC40801a;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceManualUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f295415a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40801a> f295416b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f295417c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f295415a = lVar;
        this.f295416b = provider;
        this.f295417c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f295415a.f393949a, this.f295416b.get(), this.f295417c.get());
    }
}

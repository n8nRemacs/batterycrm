package com.avito.android.tariff.cpr.configure.advance.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.mvi.domain.a> f295461a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f295462b;

    /* renamed from: c, reason: collision with root package name */
    public final u f295463c;

    public e(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f295461a = provider;
        this.f295462b = lVar;
        this.f295463c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f295461a.get(), (String) this.f295462b.f393949a, (v50.g) this.f295463c.get());
    }
}

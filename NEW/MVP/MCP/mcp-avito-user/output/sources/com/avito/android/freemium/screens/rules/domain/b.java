package com.avito.android.freemium.screens.rules.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AcceptFreemiumRulesUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f159108a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZE.a> f159109b;

    /* renamed from: c, reason: collision with root package name */
    public final l f159110c;

    /* renamed from: d, reason: collision with root package name */
    public final l f159111d;

    /* renamed from: e, reason: collision with root package name */
    public final l f159112e;

    public b(l lVar, l lVar2, l lVar3, Provider provider, Provider provider2) {
        this.f159108a = provider;
        this.f159109b = provider2;
        this.f159110c = lVar;
        this.f159111d = lVar2;
        this.f159112e = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f159108a.get(), this.f159109b.get(), ((Long) this.f159110c.f393949a).longValue(), (String) this.f159111d.f393949a, (String) this.f159112e.f393949a);
    }
}

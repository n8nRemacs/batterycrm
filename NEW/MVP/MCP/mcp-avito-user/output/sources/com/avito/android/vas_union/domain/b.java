package com.avito.android.vas_union.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sM0.InterfaceC48073a;

/* compiled from: GetVasUnionV2UseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f323201a;

    /* renamed from: b, reason: collision with root package name */
    public final l f323202b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC48073a> f323203c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f323204d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f323201a = lVar;
        this.f323202b = lVar2;
        this.f323203c = provider;
        this.f323204d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f323201a.f393949a, (String) this.f323202b.f393949a, this.f323203c.get(), this.f323204d.get());
    }
}

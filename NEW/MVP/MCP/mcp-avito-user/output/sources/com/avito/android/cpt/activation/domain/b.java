package com.avito.android.cpt.activation.domain;

import Qr.InterfaceC14925a;
import com.avito.android.cpt.activation.data.mapper.c;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetCptActivationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f126278a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14925a> f126279b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f126280c;

    /* renamed from: d, reason: collision with root package name */
    public final c f126281d;

    public b(l lVar, Provider provider, Provider provider2, c cVar) {
        this.f126278a = lVar;
        this.f126279b = provider;
        this.f126280c = provider2;
        this.f126281d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f126278a.f393949a, this.f126279b.get(), this.f126280c.get(), (com.avito.android.cpt.activation.data.mapper.a) this.f126281d.get());
    }
}

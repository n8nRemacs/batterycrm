package com.avito.android.bbl.screens.contact_history.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oh.InterfaceC44774a;

/* compiled from: GetBblContactHistoryUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99662a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99663b;

    /* renamed from: c, reason: collision with root package name */
    public final l f99664c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f99662a = provider;
        this.f99663b = provider2;
        this.f99664c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f99662a.get(), this.f99663b.get(), ((Long) this.f99664c.f393949a).longValue());
    }
}

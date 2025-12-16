package com.avito.android.vas_performance.screens.stickers.buy.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: PostStickersContextUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f320726a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f320727b;

    /* renamed from: c, reason: collision with root package name */
    public final l f320728c;

    /* renamed from: d, reason: collision with root package name */
    public final l f320729d;

    public d(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f320726a = provider;
        this.f320727b = provider2;
        this.f320728c = lVar;
        this.f320729d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f320727b.get(), (String) this.f320728c.f393949a, (String) this.f320729d.f393949a, this.f320726a.get());
    }
}

package com.avito.android.vas_performance.screens.stickers.buy.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: GetStickersBuyUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f320713a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f320714b;

    /* renamed from: c, reason: collision with root package name */
    public final l f320715c;

    /* renamed from: d, reason: collision with root package name */
    public final l f320716d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f320713a = provider;
        this.f320714b = provider2;
        this.f320715c = lVar;
        this.f320716d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f320714b.get(), (String) this.f320715c.f393949a, (String) this.f320716d.f393949a, this.f320713a.get());
    }
}

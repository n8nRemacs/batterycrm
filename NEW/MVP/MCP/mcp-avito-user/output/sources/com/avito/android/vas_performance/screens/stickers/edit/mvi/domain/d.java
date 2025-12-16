package com.avito.android.vas_performance.screens.stickers.edit.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL0.InterfaceC50482a;

/* compiled from: PostSaveStickersUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50482a> f320799a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f320800b;

    /* renamed from: c, reason: collision with root package name */
    public final l f320801c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f320799a = provider;
        this.f320800b = provider2;
        this.f320801c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f320800b.get(), (String) this.f320801c.f393949a, this.f320799a.get());
    }
}

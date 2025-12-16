package com.avito.android.historical_suggests.suggest.usecase;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pI.InterfaceC46962a;

/* compiled from: GetIdByCoordinatesUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f162162a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC46962a> f162163b;

    public g(u uVar, Provider provider) {
        this.f162162a = uVar;
        this.f162163b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((c) this.f162162a.get(), dagger.internal.g.a(w.a(this.f162163b)));
    }
}

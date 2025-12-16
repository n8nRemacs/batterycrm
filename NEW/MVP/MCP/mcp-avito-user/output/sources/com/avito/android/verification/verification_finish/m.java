package com.avito.android.verification.verification_finish;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationFinishInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325265a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325266b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f325267c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f325268d;

    public m(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f325265a = provider;
        this.f325266b = provider2;
        this.f325267c = lVar;
        this.f325268d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f325265a.get(), this.f325266b.get(), (VerificationFinishArgs) this.f325267c.f393949a, this.f325268d.get());
    }
}

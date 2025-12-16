package com.avito.android.verification.verification_passport.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.verification.verification_passport.CyberityParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f325731a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f325732b;

    /* renamed from: c, reason: collision with root package name */
    public final u f325733c;

    public g(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f325731a = provider;
        this.f325732b = lVar;
        this.f325733c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f325731a.get(), (CyberityParams) this.f325732b.f393949a, (com.avito.android.verification.verification_passport.b) this.f325733c.get());
    }
}

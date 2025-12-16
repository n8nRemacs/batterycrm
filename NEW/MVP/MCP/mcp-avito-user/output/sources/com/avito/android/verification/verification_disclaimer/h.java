package com.avito.android.verification.verification_disclaimer;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationDisclaimerInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BM0.a> f325064a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325065b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f325066c;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f325064a = provider;
        this.f325065b = provider2;
        this.f325066c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f325064a.get(), this.f325065b.get(), (VerificationDisclaimerArgs) this.f325066c.f393949a);
    }
}

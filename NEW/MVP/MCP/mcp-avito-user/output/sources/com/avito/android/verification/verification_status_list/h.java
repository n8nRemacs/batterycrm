package com.avito.android.verification.verification_status_list;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStatusListInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325772a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325773b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f325774c;

    public h(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f325772a = provider;
        this.f325773b = provider2;
        this.f325774c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f325772a.get(), this.f325773b.get(), (VerificationStatusListArgs) this.f325774c.f393949a);
    }
}

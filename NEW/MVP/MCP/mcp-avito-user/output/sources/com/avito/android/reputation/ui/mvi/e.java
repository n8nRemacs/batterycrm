package com.avito.android.reputation.ui.mvi;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReputationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255060a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f255061b;

    public e(u uVar, Provider provider) {
        this.f255060a = uVar;
        this.f255061b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.reputation.ui.e) this.f255060a.get(), this.f255061b.get());
    }
}

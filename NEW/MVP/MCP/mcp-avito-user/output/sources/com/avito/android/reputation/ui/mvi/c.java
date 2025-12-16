package com.avito.android.reputation.ui.mvi;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReputationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255053a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f255054b;

    public c(u uVar, Provider provider) {
        this.f255053a = uVar;
        this.f255054b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.reputation.ui.e) this.f255053a.get(), this.f255054b.get());
    }
}

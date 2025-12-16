package com.avito.android.fees_methods.screen.fees_methods_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2UseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f158264a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AE.a> f158265b;

    /* renamed from: c, reason: collision with root package name */
    public final u f158266c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f158267d;

    public c(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f158264a = lVar;
        this.f158265b = provider;
        this.f158266c = uVar;
        this.f158267d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f158264a.f393949a, this.f158265b.get(), (com.avito.android.fees_methods.common.domain.a) this.f158266c.get(), this.f158267d.get());
    }
}

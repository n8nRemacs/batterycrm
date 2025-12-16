package com.avito.android.sbc.dispatch_edit.mvi;

import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcDispatchEditBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260132a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34468d> f260133b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f260132a = lVar;
        this.f260133b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Long) this.f260132a.f393949a).longValue(), this.f260133b.get());
    }
}

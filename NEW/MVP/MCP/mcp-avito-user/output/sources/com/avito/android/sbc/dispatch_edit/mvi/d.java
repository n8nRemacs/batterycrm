package com.avito.android.sbc.dispatch_edit.mvi;

import Xo0.InterfaceC17032a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcDispatchEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC17032a> f260113a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f260114b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f260115c;

    public d(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f260113a = provider;
        this.f260114b = lVar;
        this.f260115c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f260113a.get(), ((Long) this.f260114b.f393949a).longValue(), this.f260115c.get());
    }
}

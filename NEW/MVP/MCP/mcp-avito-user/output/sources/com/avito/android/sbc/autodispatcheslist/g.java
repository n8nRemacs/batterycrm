package com.avito.android.sbc.autodispatcheslist;

import Xo0.InterfaceC17032a;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchesListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34468d> f259105a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC17032a> f259106b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f259107c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f259108d;

    /* renamed from: e, reason: collision with root package name */
    public final l f259109e;

    public g(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f259105a = provider;
        this.f259106b = provider2;
        this.f259107c = provider3;
        this.f259108d = provider4;
        this.f259109e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f259105a.get(), this.f259106b.get(), this.f259107c.get(), this.f259108d.get(), (AutoDispatchListInfo) this.f259109e.f393949a);
    }
}

package com.avito.android.sbc.autodispatches;

import Xo0.InterfaceC17032a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SbcAutoDispatchesInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34468d> f258968a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC17032a> f258969b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f258970c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f258971d;

    public w(Provider<InterfaceC34468d> provider, Provider<InterfaceC17032a> provider2, Provider<R0> provider3, Provider<com.avito.android.server_time.f> provider4) {
        this.f258968a = provider;
        this.f258969b = provider2;
        this.f258970c = provider3;
        this.f258971d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v(this.f258968a.get(), this.f258969b.get(), this.f258970c.get(), this.f258971d.get());
    }
}

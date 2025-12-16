package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rm0.InterfaceC47681a;

/* compiled from: FileDownloadHeaderProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f301806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f301807b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B0> f301808c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<U0> f301809d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<I> f301810e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f301811f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C> f301812g;

    public m(Provider<M> provider, Provider<P0> provider2, Provider<B0> provider3, Provider<U0> provider4, Provider<I> provider5, Provider<InterfaceC47681a> provider6, Provider<C> provider7) {
        this.f301806a = provider;
        this.f301807b = provider2;
        this.f301808c = provider3;
        this.f301809d = provider4;
        this.f301810e = provider5;
        this.f301811f = provider6;
        this.f301812g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f301806a.get(), this.f301807b.get(), this.f301808c.get(), this.f301809d.get(), this.f301810e.get(), this.f301811f.get(), this.f301812g.get());
    }
}

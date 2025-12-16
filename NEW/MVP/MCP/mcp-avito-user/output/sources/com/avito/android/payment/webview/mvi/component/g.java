package com.avito.android.payment.webview.mvi.component;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WebPaymentMviActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f214893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_events.registry.d> f214894b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f214895c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f214896d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f214897e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f214898f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Gson> f214899g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f214900h;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f214893a = provider;
        this.f214894b = provider2;
        this.f214895c = provider3;
        this.f214896d = provider4;
        this.f214897e = provider5;
        this.f214898f = lVar;
        this.f214899g = provider6;
        this.f214900h = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f214893a.get(), this.f214894b.get(), this.f214895c.get(), this.f214896d.get(), this.f214897e.get(), (com.avito.android.payment.webview.mvi.a) this.f214898f.f393949a, dagger.internal.g.a(w.a(this.f214899g)), this.f214900h.get());
    }
}

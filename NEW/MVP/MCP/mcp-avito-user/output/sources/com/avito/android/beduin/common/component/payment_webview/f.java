package com.avito.android.beduin.common.component.payment_webview;

import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: BeduinWebPaymentComponentFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101861a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f101862b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f101863c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f101864d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_events.registry.d> f101865e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.cookie_provider.e> f101866f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f101867g;

    public f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f101861a = provider;
        this.f101862b = provider2;
        this.f101863c = lVar;
        this.f101864d = provider3;
        this.f101865e = provider4;
        this.f101866f = provider5;
        this.f101867g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f101861a.get(), this.f101862b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f101863c.f393949a, this.f101864d.get(), this.f101865e.get(), this.f101866f.get(), (p) this.f101867g.get());
    }
}

package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: InputImeiBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.input_imei.di.m> f236438a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f236439b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CategoryPublishStep> f236440c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.input_imei.i f236441d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f236442e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f236443f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f236444g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f236445h;

    public n(Provider provider, dagger.internal.l lVar, Provider provider2, com.avito.android.publish.input_imei.i iVar, dagger.internal.u uVar, Provider provider3, Provider provider4, Provider provider5) {
        this.f236438a = provider;
        this.f236439b = lVar;
        this.f236440c = provider2;
        this.f236441d = iVar;
        this.f236442e = uVar;
        this.f236443f = provider3;
        this.f236444g = provider4;
        this.f236445h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f236438a.get(), ((Integer) this.f236439b.f393949a).intValue(), this.f236440c.get(), (com.avito.android.publish.input_imei.h) this.f236441d.get(), (Set) this.f236442e.get(), this.f236443f.get(), this.f236444g.get(), this.f236445h.get());
    }
}

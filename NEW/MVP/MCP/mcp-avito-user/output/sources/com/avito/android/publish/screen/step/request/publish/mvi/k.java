package com.avito.android.publish.screen.step.request.publish.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.W0;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f241929a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f241930b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33544d> f241931c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.publish.publish_advert_request.data.a> f241932d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<W0> f241933e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f241934f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f241935g;

    /* renamed from: h, reason: collision with root package name */
    public final u f241936h;

    public k(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f241929a = provider;
        this.f241930b = provider2;
        this.f241931c = provider3;
        this.f241932d = provider4;
        this.f241933e = provider5;
        this.f241934f = provider6;
        this.f241935g = provider7;
        this.f241936h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f241929a.get(), this.f241930b.get(), this.f241931c.get(), this.f241932d.get(), this.f241933e.get(), this.f241934f.get(), this.f241935g.get(), (b0) this.f241936h.get());
    }
}

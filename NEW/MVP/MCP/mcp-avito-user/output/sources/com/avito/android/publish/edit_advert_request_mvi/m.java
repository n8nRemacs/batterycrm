package com.avito.android.publish.edit_advert_request_mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import de0.InterfaceC39719d;
import javax.inject.Provider;
import nI0.InterfaceC44261b;
import yc.C50213a;

/* compiled from: EditRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f235600a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f235601b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f235602c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C50213a> f235603d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.edit_advert_request.d f235604e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f235605f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<eH0.c> f235606g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC44261b> f235607h;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3, com.avito.android.publish.edit_advert_request.d dVar, Provider provider4, Provider provider5, Provider provider6) {
        this.f235600a = uVar;
        this.f235601b = provider;
        this.f235602c = provider2;
        this.f235603d = provider3;
        this.f235604e = dVar;
        this.f235605f = provider4;
        this.f235606g = provider5;
        this.f235607h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC39719d) this.f235600a.get(), this.f235601b.get(), this.f235602c.get(), this.f235603d.get(), (com.avito.android.publish.edit_advert_request.a) this.f235604e.get(), this.f235605f.get(), this.f235606g.get(), this.f235607h.get());
    }
}

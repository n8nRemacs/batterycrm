package com.avito.android.realty_agency.checkerboard.deeplink;

import bi0.InterfaceC25655a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.realty_agency.checkerboard.j;
import com.avito.android.realty_agency.checkerboard.m;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckerboardLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f251104a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f251105b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f251106c;

    /* renamed from: d, reason: collision with root package name */
    public final m f251107d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f251108e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC25655a> f251109f;

    public f(dv.b bVar, dv.b bVar2, dv.b bVar3, m mVar, Provider provider, Provider provider2) {
        this.f251104a = bVar;
        this.f251105b = bVar2;
        this.f251106c = bVar3;
        this.f251107d = mVar;
        this.f251108e = provider;
        this.f251109f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f251104a.get(), (a.g) this.f251105b.get(), (a.i) this.f251106c.get(), (j) this.f251107d.get(), this.f251108e.get(), this.f251109f.get());
    }
}

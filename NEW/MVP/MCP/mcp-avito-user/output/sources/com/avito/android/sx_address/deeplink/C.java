package com.avito.android.sx_address.deeplink;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SxAddressListDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f292780a;

    /* renamed from: b, reason: collision with root package name */
    public final y f292781b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f292782c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f292783d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f292784e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f292785f;

    public C(C30102l3 c30102l3, y yVar, dv.b bVar, dv.b bVar2, C25721c c25721c, Provider provider) {
        this.f292780a = c30102l3;
        this.f292781b = yVar;
        this.f292782c = bVar;
        this.f292783d = bVar2;
        this.f292784e = c25721c;
        this.f292785f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f292780a.get();
        this.f292781b.getClass();
        return new B(context, new x(), (a.InterfaceC4053a) this.f292782c.get(), (a.b) this.f292783d.get(), (C25719a) this.f292784e.get(), this.f292785f.get());
    }
}

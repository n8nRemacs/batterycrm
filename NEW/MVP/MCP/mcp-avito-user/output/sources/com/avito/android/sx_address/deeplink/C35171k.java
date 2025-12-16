package com.avito.android.sx_address.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SelectAddressListDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35171k implements dagger.internal.h<C35170j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f292839a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f292840b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f292841c;

    /* renamed from: d, reason: collision with root package name */
    public final y f292842d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f292843e;

    public C35171k(C30102l3 c30102l3, y yVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f292839a = c30102l3;
        this.f292840b = bVar;
        this.f292841c = bVar2;
        this.f292842d = yVar;
        this.f292843e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f292839a.get();
        a.b bVar = (a.b) this.f292840b.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f292841c.get();
        this.f292842d.getClass();
        return new C35170j(context, interfaceC4053a, bVar, this.f292843e.get(), new x());
    }
}

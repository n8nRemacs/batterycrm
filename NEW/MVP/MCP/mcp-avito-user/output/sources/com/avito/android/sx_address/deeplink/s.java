package com.avito.android.sx_address.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SxAddressEditDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f292873a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f292874b;

    /* renamed from: c, reason: collision with root package name */
    public final y f292875c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f292876d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f292877e;

    public s(C30102l3 c30102l3, y yVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f292873a = c30102l3;
        this.f292874b = bVar;
        this.f292875c = yVar;
        this.f292876d = provider;
        this.f292877e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f292873a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f292874b.get();
        this.f292875c.getClass();
        x xVar = new x();
        return new r(context, interfaceC4053a, (a.b) this.f292877e.get(), this.f292876d.get(), xVar);
    }
}

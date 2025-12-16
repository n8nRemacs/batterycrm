package com.avito.android.sx_address.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;

/* compiled from: SxAddressEntryLinksDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f292881a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f292882b;

    /* renamed from: c, reason: collision with root package name */
    public final y f292883c;

    public v(C30102l3 c30102l3, dv.b bVar, y yVar) {
        this.f292881a = c30102l3;
        this.f292882b = bVar;
        this.f292883c = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f292881a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f292882b.get();
        this.f292883c.getClass();
        return new u(context, interfaceC4053a, new x());
    }
}

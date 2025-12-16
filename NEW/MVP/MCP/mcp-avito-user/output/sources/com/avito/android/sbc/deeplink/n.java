package com.avito.android.sbc.deeplink;

import android.content.Context;
import com.avito.android.deep_linking.links.SbcDispatchesLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcDispatchesLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n<DeeplinkT extends SbcDispatchesLink> implements dagger.internal.h<m<DeeplinkT>> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f259966a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f259967b;

    public n(C30102l3 c30102l3, dv.b bVar) {
        this.f259966a = bVar;
        this.f259967b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Context) this.f259967b.get(), (a.InterfaceC4053a) this.f259966a.get());
    }
}

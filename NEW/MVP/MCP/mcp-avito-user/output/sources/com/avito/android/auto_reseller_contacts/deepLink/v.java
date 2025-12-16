package com.avito.android.auto_reseller_contacts.deepLink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpendContactsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f95777a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f95778b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f95779c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f95780d;

    public v(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, dagger.internal.f fVar) {
        this.f95777a = c30102l3;
        this.f95778b = bVar;
        this.f95779c = bVar2;
        this.f95780d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((Context) this.f95777a.get(), (a.InterfaceC4053a) this.f95778b.get(), (a.b) this.f95779c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f95780d.get());
    }
}

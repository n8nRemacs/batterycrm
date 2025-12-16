package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.deep_linking.links.DeliveryCourierLocationSelectLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SafeDealDeeplinkHandlerModule_ProvideDeliveryCourierLocationSelectLinkDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f256594a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.deeplink.c f256595b;

    public c(b bVar, com.avito.android.safedeal.deeplink.c cVar) {
        this.f256594a = bVar;
        this.f256595b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.deeplink.c cVar = this.f256595b;
        this.f256594a.getClass();
        return new C43834a(DeliveryCourierLocationSelectLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryCourierLocationSelectLink.class), cVar));
    }
}

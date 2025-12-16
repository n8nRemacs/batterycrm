package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module;

import com.avito.android.deep_linking.links.DeliverySavedAddressCheckLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliverySavedAddressCheckDeepLinkHandlerModule_ProvideSavedAddressCheckedDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f257026a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.common.h f257027b;

    public d(c cVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.common.h hVar) {
        this.f257026a = cVar;
        this.f257027b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal_checkout.delivery_universal_checkout.common.h hVar = this.f257027b;
        this.f257026a.getClass();
        return new C43834a(DeliverySavedAddressCheckLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliverySavedAddressCheckLink.class), hVar));
    }
}

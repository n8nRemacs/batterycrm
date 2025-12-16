package com.avito.android.advert.deeplinks.delivery;

import com.avito.android.deep_linking.links.RequestDeliveryLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RequestDeliveryDeeplinkMappingModule_ProvideDeliveryOrderCancelDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f68954a;

    /* renamed from: b, reason: collision with root package name */
    public final l f68955b;

    public n(m mVar, l lVar) {
        this.f68954a = mVar;
        this.f68955b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f68955b;
        this.f68954a.getClass();
        return new C43834a(RequestDeliveryLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RequestDeliveryLink.class), lVar));
    }
}

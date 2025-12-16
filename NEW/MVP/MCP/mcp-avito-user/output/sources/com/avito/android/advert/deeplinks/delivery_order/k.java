package com.avito.android.advert.deeplinks.delivery_order;

import com.avito.android.deep_linking.links.DeliveryOrderCreateLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryOrderCreateDeeplinkMappingModule_ProvideDeliveryOrderCreateDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f69003a;

    /* renamed from: b, reason: collision with root package name */
    public final f f69004b;

    /* renamed from: c, reason: collision with root package name */
    public final i f69005c;

    public k(j jVar, f fVar, i iVar) {
        this.f69003a = jVar;
        this.f69004b = fVar;
        this.f69005c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f69005c.getClass();
        h hVar = new h();
        f fVar = this.f69004b;
        this.f69003a.getClass();
        return new C43834a(DeliveryOrderCreateLink.class, hVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryOrderCreateLink.class), fVar));
    }
}

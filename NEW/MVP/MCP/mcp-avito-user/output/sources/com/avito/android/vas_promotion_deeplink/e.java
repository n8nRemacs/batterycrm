package com.avito.android.vas_promotion_deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasPromotionDeepLinkHandlerModule_ProvideVasPromotionDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f323076a;

    /* renamed from: b, reason: collision with root package name */
    public final f f323077b;

    public e(h hVar, f fVar) {
        this.f323076a = hVar;
        this.f323077b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f323076a.getClass();
        g gVar = new g();
        d.f323075a.getClass();
        return new C43834a(VasPromotionDeepLink.class, gVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasPromotionDeepLink.class), this.f323077b));
    }
}

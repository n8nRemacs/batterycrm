package com.avito.android.free_delivery.deeplink;

import com.avito.android.free_delivery.FreeDeliveryLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FreeDeliveryLinkHandlerModule_ProvideWalletHistoryLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f158662a;

    public d(e eVar) {
        this.f158662a = eVar;
    }

    public static C43834a a(e eVar) {
        c.f158661a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FreeDeliveryLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FreeDeliveryLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f158662a);
    }
}

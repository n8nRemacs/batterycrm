package com.avito.android.gig_slot_show_qr.deeplink;

import com.avito.android.gig_slot_show_qr.GigSlotShowQrDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSlotShowQrDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f160865a;

    public c(d dVar) {
        this.f160865a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f160864a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSlotShowQrDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSlotShowQrDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160865a);
    }
}

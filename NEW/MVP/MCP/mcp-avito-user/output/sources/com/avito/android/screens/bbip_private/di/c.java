package com.avito.android.screens.bbip_private.di;

import com.avito.android.screens.bbip_private.deeplink.BbipPrivateDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BbipPrivateDeeplinkMappingsModule_ProvideBbipPrivateDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.deeplink.c f260486a;

    public c(com.avito.android.screens.bbip_private.deeplink.c cVar) {
        this.f260486a = cVar;
    }

    public static C43834a a(com.avito.android.screens.bbip_private.deeplink.c cVar) {
        b.f260485a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BbipPrivateDeepLink.class, new com.avito.android.screens.bbip_private.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BbipPrivateDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f260486a);
    }
}

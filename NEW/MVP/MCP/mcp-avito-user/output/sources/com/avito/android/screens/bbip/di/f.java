package com.avito.android.screens.bbip.di;

import com.avito.android.screens.bbip.deep_linking.BbipV2DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BbipDeeplinkMappingsModule_ProvideBbipV2DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_v2.deeplink.c f260219a;

    public f(com.avito.android.screens.bbip_v2.deeplink.c cVar) {
        this.f260219a = cVar;
    }

    public static C43834a a(com.avito.android.screens.bbip_v2.deeplink.c cVar) {
        d.f260217a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BbipV2DeepLink.class, new com.avito.android.screens.bbip_v2.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BbipV2DeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f260219a);
    }
}

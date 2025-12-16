package com.avito.android.advert_item_actions.deeplink;

import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AdvertItemActionsDeeplinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f85852a;

    public h(i iVar) {
        this.f85852a = iVar;
    }

    public static C43834a a(i iVar) {
        g.f85851a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertItemActionsDeeplink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AdvertItemActionsDeeplink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f85852a);
    }
}

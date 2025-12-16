package com.avito.android.bbl.screens.configure.di;

import com.avito.android.bbl.screens.configure.deeplink.BblConfigureLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BblConfigureDeeplinkMappingsModule_ProvideBblConfigureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.deeplink.c f99147a;

    public c(com.avito.android.bbl.screens.configure.deeplink.c cVar) {
        this.f99147a = cVar;
    }

    public static C43834a a(com.avito.android.bbl.screens.configure.deeplink.c cVar) {
        b.f99146a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BblConfigureLink.class, new com.avito.android.bbl.screens.configure.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BblConfigureLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f99147a);
    }
}

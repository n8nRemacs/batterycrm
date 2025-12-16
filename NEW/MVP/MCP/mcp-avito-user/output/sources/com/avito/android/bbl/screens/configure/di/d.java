package com.avito.android.bbl.screens.configure.di;

import com.avito.android.bbl.screens.configure.deeplink.BblConfigureSaveLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BblConfigureDeeplinkMappingsModule_ProvideBblConfigureSaveMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.deeplink.h f99148a;

    public d(com.avito.android.bbl.screens.configure.deeplink.h hVar) {
        this.f99148a = hVar;
    }

    public static C43834a a(com.avito.android.bbl.screens.configure.deeplink.h hVar) {
        b.f99146a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BblConfigureSaveLink.class, new com.avito.android.bbl.screens.configure.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BblConfigureSaveLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f99148a);
    }
}

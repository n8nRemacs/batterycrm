package com.avito.android.tariff.cpx.levels.di;

import com.avito.android.tariff.cpx.CpxLevelsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxLevelsMappingsModule_ProvideCpxLevelsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.levels.deeplink.d f297058a;

    public h(com.avito.android.tariff.cpx.levels.deeplink.d dVar) {
        this.f297058a = dVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.levels.deeplink.d dVar) {
        g.f297057a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxLevelsLink.class, new com.avito.android.tariff.cpx.levels.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxLevelsLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f297058a);
    }
}

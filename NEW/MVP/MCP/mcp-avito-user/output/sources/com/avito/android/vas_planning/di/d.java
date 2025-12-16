package com.avito.android.vas_planning.di;

import com.avito.android.vas_planning.deeplink.VasPlannerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasPlanningDeeplinkMappingsModule_ProvideVasPlanningDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_planning.deeplink.b f322292a;

    public d(com.avito.android.vas_planning.deeplink.b bVar) {
        this.f322292a = bVar;
    }

    public static C43834a a(com.avito.android.vas_planning.deeplink.b bVar) {
        c.f322291a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasPlannerLink.class, new com.avito.android.vas_planning.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasPlannerLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f322292a);
    }
}

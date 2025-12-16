package com.avito.android.vas_performance.screens.visual.di;

import com.avito.android.vas_performance.deeplink.VisualVasLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48575f;

/* compiled from: VisualVasDeeplinkMappingsModule_ProvideVisualVasDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.l f321023a;

    public d(com.avito.android.vas_performance.deeplink.handler.l lVar) {
        this.f321023a = lVar;
    }

    public static C43834a a(com.avito.android.vas_performance.deeplink.handler.l lVar) {
        c.f321022a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VisualVasLink.class, new C48575f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VisualVasLink.class), lVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f321023a);
    }
}

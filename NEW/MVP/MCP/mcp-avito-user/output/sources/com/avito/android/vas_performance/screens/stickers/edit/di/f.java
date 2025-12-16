package com.avito.android.vas_performance.screens.stickers.edit.di;

import com.avito.android.vas_performance.deeplink.StickersEditVasLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48574e;

/* compiled from: StickersEditDeeplinkMappingsModule_ProvideStickersEditVasDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.j f320768a;

    public f(com.avito.android.vas_performance.deeplink.handler.j jVar) {
        this.f320768a = jVar;
    }

    public static C43834a a(com.avito.android.vas_performance.deeplink.handler.j jVar) {
        e.f320767a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(StickersEditVasLink.class, new C48574e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StickersEditVasLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f320768a);
    }
}

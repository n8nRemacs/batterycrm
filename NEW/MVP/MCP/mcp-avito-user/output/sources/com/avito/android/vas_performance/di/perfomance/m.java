package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import tL0.C48572c;

/* compiled from: PerformanceVasDeeplinkMappingsModule_ProvidePerformanceVasDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.deeplink.handler.f f320044a;

    public m(com.avito.android.vas_performance.deeplink.handler.f fVar) {
        this.f320044a = fVar;
    }

    public static C43834a a(com.avito.android.vas_performance.deeplink.handler.f fVar) {
        l.f320043a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PerformanceVasLink.class, new C48572c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PerformanceVasLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f320044a);
    }
}

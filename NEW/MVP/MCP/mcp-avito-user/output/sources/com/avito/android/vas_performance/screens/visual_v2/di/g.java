package com.avito.android.vas_performance.screens.visual_v2.di;

import com.avito.android.vas_performance.deeplink.VisualVasV2Link;
import com.avito.android.vas_performance.deeplink.handler.n;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VisualVasV2DeeplinkMappingsModule_ProvideVisualVasV2DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f321205a;

    public g(n nVar) {
        this.f321205a = nVar;
    }

    public static C43834a a(n nVar) {
        f.f321204a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VisualVasV2Link.class, new tL0.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VisualVasV2Link.class), nVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f321205a);
    }
}

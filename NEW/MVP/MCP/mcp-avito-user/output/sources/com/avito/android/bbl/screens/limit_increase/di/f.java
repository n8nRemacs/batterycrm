package com.avito.android.bbl.screens.limit_increase.di;

import com.avito.android.bbl.screens.limit_increase.deeplink.LimitIncreaseLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LimitIncreaseDeeplinkMappingsModule_ProvideLimitIncreaseDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.limit_increase.deeplink.b f99756a;

    public f(com.avito.android.bbl.screens.limit_increase.deeplink.b bVar) {
        this.f99756a = bVar;
    }

    public static C43834a a(com.avito.android.bbl.screens.limit_increase.deeplink.b bVar) {
        e.f99755a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(LimitIncreaseLink.class, new com.avito.android.bbl.screens.limit_increase.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LimitIncreaseLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f99756a);
    }
}

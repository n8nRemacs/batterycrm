package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import com.avito.android.fees_methods.deeplink.FeesMethodsV3DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FeesMethodsV2DeeplinkMappingsModule_ProvideFeesMethodsV3DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_methods_v2.deeplink.c f158241a;

    public d(com.avito.android.fees_methods.screen.fees_methods_v2.deeplink.c cVar) {
        this.f158241a = cVar;
    }

    public static C43834a a(com.avito.android.fees_methods.screen.fees_methods_v2.deeplink.c cVar) {
        c.f158240a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FeesMethodsV3DeepLink.class, new com.avito.android.fees_methods.screen.fees_methods_v2.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FeesMethodsV3DeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f158241a);
    }
}

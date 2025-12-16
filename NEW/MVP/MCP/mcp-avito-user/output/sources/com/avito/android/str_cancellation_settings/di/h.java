package com.avito.android.str_cancellation_settings.di;

import com.avito.android.str_cancellation_settings.deeplink.StrCancellationSettingsDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrCancellationSettingsLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f288328a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_cancellation_settings.deeplink.c f288329b;

    public h(g gVar, com.avito.android.str_cancellation_settings.deeplink.c cVar) {
        this.f288328a = gVar;
        this.f288329b = cVar;
    }

    public static C43834a a(g gVar, com.avito.android.str_cancellation_settings.deeplink.c cVar) {
        gVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(StrCancellationSettingsDeeplink.class, new com.avito.android.str_cancellation_settings.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrCancellationSettingsDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f288328a, this.f288329b);
    }
}

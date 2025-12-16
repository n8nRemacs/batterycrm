package com.avito.android.vas_autoprolong.screens.autoprolong.di;

import com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.AutoprolongDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoprolongDeeplinkMappingsModule_ProvideAutoprolongDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.c f319481a;

    public d(com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.c cVar) {
        this.f319481a = cVar;
    }

    public static C43834a a(com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.c cVar) {
        c.f319480a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoprolongDeepLink.class, new com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoprolongDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f319481a);
    }
}

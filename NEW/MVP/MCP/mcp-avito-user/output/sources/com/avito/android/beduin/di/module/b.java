package com.avito.android.beduin.di.module;

import com.avito.android.beduin.ui.screen.deeplink.BeduinScreenLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BeduinDeeplinkHandlerModule_ProvideBeduinScreenLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.ui.screen.deeplink.b f103943a;

    public b(com.avito.android.beduin.ui.screen.deeplink.b bVar) {
        this.f103943a = bVar;
    }

    public static C43834a a(com.avito.android.beduin.ui.screen.deeplink.b bVar) {
        a.f103942a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BeduinScreenLink.class, new com.avito.android.beduin.ui.screen.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BeduinScreenLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f103943a);
    }
}

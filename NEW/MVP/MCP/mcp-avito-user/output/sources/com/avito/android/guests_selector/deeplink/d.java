package com.avito.android.guests_selector.deeplink;

import com.avito.android.guests_selector.GuestsSelectorDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GuestsSelectorDeeplinkModule_ProvideGuestsSelectorDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f161411a;

    public d(b bVar) {
        this.f161411a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f161410a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GuestsSelectorDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GuestsSelectorDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f161411a);
    }
}

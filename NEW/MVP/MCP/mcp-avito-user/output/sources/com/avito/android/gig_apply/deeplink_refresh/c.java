package com.avito.android.gig_apply.deeplink_refresh;

import com.avito.android.gig_apply.GigSlotRefreshDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSlotRefreshDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f159604a;

    public c(d dVar) {
        this.f159604a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f159603a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSlotRefreshDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSlotRefreshDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159604a);
    }
}

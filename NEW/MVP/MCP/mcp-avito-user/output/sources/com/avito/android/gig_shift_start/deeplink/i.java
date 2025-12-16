package com.avito.android.gig_shift_start.deeplink;

import com.avito.android.gig_shift_start.GigShiftStartDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigShiftStartDeeplinkHandlerModule_ProvideGigShiftStartLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f160761a;

    public i(j jVar) {
        this.f160761a = jVar;
    }

    public static C43834a a(j jVar) {
        g.f160759a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigShiftStartDeeplink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigShiftStartDeeplink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160761a);
    }
}

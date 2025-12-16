package com.avito.android.gig_shift_start.deeplink;

import com.avito.android.gig_shift_start.GigShiftFinishDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigShiftStartDeeplinkHandlerModule_ProvideGigShiftFinishLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f160760a;

    public h(b bVar) {
        this.f160760a = bVar;
    }

    public static C43834a a(b bVar) {
        g.f160759a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigShiftFinishDeeplink.class, new c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigShiftFinishDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160760a);
    }
}

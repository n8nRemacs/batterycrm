package com.avito.android.gig_shift_action.deeplink;

import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigShiftActionDeeplinkHandlerModule_ProvideCvValidationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f160413a;

    public h(i iVar) {
        this.f160413a = iVar;
    }

    public static C43834a a(i iVar) {
        g.f160412a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigShiftActionDeeplink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigShiftActionDeeplink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f160413a);
    }
}

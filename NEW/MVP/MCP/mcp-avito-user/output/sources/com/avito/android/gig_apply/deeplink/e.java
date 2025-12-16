package com.avito.android.gig_apply.deeplink;

import com.avito.android.gig_apply.GigApplyDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigApplyDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f159564a;

    public e(f fVar) {
        this.f159564a = fVar;
    }

    public static C43834a a(f fVar) {
        d.f159563a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigApplyDeeplink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigApplyDeeplink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159564a);
    }
}

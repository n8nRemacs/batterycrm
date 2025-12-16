package com.avito.android.gig_apply.deeplink;

import com.avito.android.gig_apply.GigSlotDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSlotDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f159579a;

    public j(k kVar) {
        this.f159579a = kVar;
    }

    public static C43834a a(k kVar) {
        i.f159578a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSlotDeeplink.class, new l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSlotDeeplink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159579a);
    }
}

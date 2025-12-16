package com.avito.android.status_doc.deeplink;

import com.avito.android.deep_linking.links.GigStatusDocDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigStatusDocDeeplinkModule_ProvideGigStatusDocDeeplinkMapping$_avito_gig_status_doc_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f284848a;

    public e(c cVar) {
        this.f284848a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f284847a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigStatusDocDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigStatusDocDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f284848a);
    }
}

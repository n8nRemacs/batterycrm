package com.avito.android.upload_doc.deeplink;

import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigUploadDocDeeplinkModule_ProvideGigUploadDocDeeplinkMapping$_avito_gig_upload_doc_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f306731a;

    public e(c cVar) {
        this.f306731a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f306730a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigUploadDocDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigUploadDocDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f306731a);
    }
}

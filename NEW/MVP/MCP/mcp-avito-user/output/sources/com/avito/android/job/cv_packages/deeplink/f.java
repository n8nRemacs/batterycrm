package com.avito.android.job.cv_packages.deeplink;

import com.avito.android.job.cv_packages.links.CvPackagesLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CvPackagesLinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f174352a;

    public f(g gVar) {
        this.f174352a = gVar;
    }

    public static C43834a a(g gVar) {
        e.f174351a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CvPackagesLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CvPackagesLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f174352a);
    }
}

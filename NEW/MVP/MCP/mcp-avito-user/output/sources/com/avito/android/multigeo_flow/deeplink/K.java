package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import lv.C43834a;

/* compiled from: JobMultiGeoModule_ProvideJobMultiGeoFullListDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final y f206819a;

    public K(y yVar) {
        this.f206819a = yVar;
    }

    public static C43834a a(y yVar) {
        H.f206816a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobMultiGeoLink.FullList.class, new D(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobMultiGeoLink.FullList.class), yVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f206819a);
    }
}

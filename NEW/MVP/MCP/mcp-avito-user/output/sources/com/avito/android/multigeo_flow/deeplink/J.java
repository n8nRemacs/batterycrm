package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import lv.C43834a;

/* compiled from: JobMultiGeoModule_ProvideJobMultiGeoEditDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f206818a;

    public J(p pVar) {
        this.f206818a = pVar;
    }

    public static C43834a a(p pVar) {
        H.f206816a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobMultiGeoLink.EditAddress.class, new u(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobMultiGeoLink.EditAddress.class), pVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f206818a);
    }
}

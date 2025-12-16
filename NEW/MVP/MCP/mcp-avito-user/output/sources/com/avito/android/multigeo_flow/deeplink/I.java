package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import lv.C43834a;

/* compiled from: JobMultiGeoModule_ProvideJobMultiGeoAddDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32882d f206817a;

    public I(C32882d c32882d) {
        this.f206817a = c32882d;
    }

    public static C43834a a(C32882d c32882d) {
        H.f206816a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobMultiGeoLink.AddAddress.class, new C32885g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobMultiGeoLink.AddAddress.class), c32882d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f206817a);
    }
}

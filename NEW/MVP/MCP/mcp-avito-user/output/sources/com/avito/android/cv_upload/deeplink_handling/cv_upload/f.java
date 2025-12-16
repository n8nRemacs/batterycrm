package com.avito.android.cv_upload.deeplink_handling.cv_upload;

import com.avito.android.deeplink.JobCvUploadLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CvUploadDeeplinkModule_ProvideCvUploadDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f131631a;

    public f(d dVar) {
        this.f131631a = dVar;
    }

    public static C43834a a(d dVar) {
        e.f131630a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobCvUploadLink.class, new a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobCvUploadLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f131631a);
    }
}

package com.avito.android.cv_validation_bottom_sheet.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CvValidationDeeplinkHandlerModule_ProvideCvValidationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f131812a;

    public c(d dVar) {
        this.f131812a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f131811a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CvValidationLink.class, new m(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CvValidationLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f131812a);
    }
}

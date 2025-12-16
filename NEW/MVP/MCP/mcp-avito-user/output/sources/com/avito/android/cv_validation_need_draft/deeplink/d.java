package com.avito.android.cv_validation_need_draft.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CvValidationDraftDeeplinkHandlerModule_ProvideCvValidationDraftLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f131970a;

    public d(e eVar) {
        this.f131970a = eVar;
    }

    public static C43834a a(e eVar) {
        c.f131969a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CvNeedDraftLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CvNeedDraftLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f131970a);
    }
}

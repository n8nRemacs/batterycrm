package com.avito.android.crm_paid_cvs.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CrmPaidCvsDeeplinkModule_ProvideJobCrmCandidatesDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f130290a;

    public e(c cVar) {
        this.f130290a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f130289a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CrmPaidCvsDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CrmPaidCvsDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f130290a);
    }
}

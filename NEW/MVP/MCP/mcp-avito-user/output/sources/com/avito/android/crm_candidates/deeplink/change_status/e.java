package com.avito.android.crm_candidates.deeplink.change_status;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JobCrmChangeStatusDeeplinkModule_ProvideJobCrmNotesDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f129168a;

    public e(c cVar) {
        this.f129168a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f129167a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobCrmChangeStatusDeeplink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobCrmChangeStatusDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f129168a);
    }
}

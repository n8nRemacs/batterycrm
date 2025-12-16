package com.avito.android.crm_candidates.deeplink.notes;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JobCrmNotesDeeplinkModule_ProvideJobCrmNotesDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f129197a;

    public e(b bVar) {
        this.f129197a = bVar;
    }

    public static C43834a a(b bVar) {
        d.f129196a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobCrmNotesDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobCrmNotesDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f129197a);
    }
}

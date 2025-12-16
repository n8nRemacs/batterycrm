package com.avito.android.work_profile.deeplink_handling;

import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JobSeekerCvsHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f330630a;

    public e(c cVar) {
        this.f330630a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static C43834a b(c cVar) {
        d.f330629a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobSeekerCvsLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobSeekerCvsLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return b(this.f330630a);
    }
}

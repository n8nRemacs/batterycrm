package com.avito.android.auto_evidence_request.deepLink;

import com.avito.android.auto_evidence_request_public.AutoEvidenceRequestDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoEvidenceRequestDeeplinkModule_ProvideAppliedVacanciesDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f95052a;

    public d(b bVar) {
        this.f95052a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f95051a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoEvidenceRequestDeepLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AutoEvidenceRequestDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f95052a);
    }
}

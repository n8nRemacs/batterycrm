package com.avito.android.developments_advice.di;

import com.avito.android.developments_advice.remote.model.ConsultationFormLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ConsultationDeepLinkHandlerModule_ProvideConsultationFormDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_advice.deeplink.b f136061a;

    public b(com.avito.android.developments_advice.deeplink.b bVar) {
        this.f136061a = bVar;
    }

    public static C43834a a(com.avito.android.developments_advice.deeplink.b bVar) {
        a.f136060a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ConsultationFormLink.class, new com.avito.android.developments_advice.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ConsultationFormLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136061a);
    }
}

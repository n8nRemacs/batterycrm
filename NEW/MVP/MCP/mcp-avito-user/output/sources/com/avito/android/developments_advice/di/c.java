package com.avito.android.developments_advice.di;

import com.avito.android.deep_linking.links.ConsultationStartLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ConsultationDeepLinkHandlerModule_ProvideConsultationStartLinkModuleFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_advice.deeplink.e f136062a;

    public c(com.avito.android.developments_advice.deeplink.e eVar) {
        this.f136062a = eVar;
    }

    public static C43834a a(com.avito.android.developments_advice.deeplink.e eVar) {
        a.f136060a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ConsultationStartLink.class, new com.avito.android.developments_advice.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ConsultationStartLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f136062a);
    }
}

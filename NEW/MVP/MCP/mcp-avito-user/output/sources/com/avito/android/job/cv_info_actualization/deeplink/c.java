package com.avito.android.job.cv_info_actualization.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JsxCvInfoActualizationDeeplinkHandlerModule_ProvideExternalAppLinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f174042a;

    public c(d dVar) {
        this.f174042a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f174042a;
        b.f174041a.getClass();
        return new C43834a(JsxCvInfoActualizationDeeplink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JsxCvInfoActualizationDeeplink.class), dVar));
    }
}

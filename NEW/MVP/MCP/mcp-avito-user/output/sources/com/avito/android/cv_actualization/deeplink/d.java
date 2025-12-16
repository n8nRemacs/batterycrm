package com.avito.android.cv_actualization.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JsxCvActualizationDeeplinkModule_ProvideJsxCvActualizationDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f131101a;

    public d(b bVar) {
        this.f131101a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f131100a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JsxCvActualizationDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JsxCvActualizationDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f131101a);
    }
}

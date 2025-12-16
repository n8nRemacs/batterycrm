package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacCallSilentRequestDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f168244a;

    public f(d dVar) {
        this.f168244a = dVar;
    }

    public static C43834a a(d dVar) {
        e.f168243a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacCallSilentRequestDeeplink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacCallSilentRequestDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168244a);
    }
}

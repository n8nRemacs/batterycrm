package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_voip_call_request;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_voip_call_request.IacVoipCallRequestDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacVoipCallRequestDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f168287a;

    public f(d dVar) {
        this.f168287a = dVar;
    }

    public static C43834a a(d dVar) {
        e.f168286a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacVoipCallRequestDeeplink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacVoipCallRequestDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168287a);
    }
}

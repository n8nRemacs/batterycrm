package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacPermissionMicAskLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f168275a;

    public h(f fVar) {
        this.f168275a = fVar;
    }

    public static C43834a a(f fVar) {
        g.f168274a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacPermissionMicAskLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacPermissionMicAskLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168275a);
    }
}

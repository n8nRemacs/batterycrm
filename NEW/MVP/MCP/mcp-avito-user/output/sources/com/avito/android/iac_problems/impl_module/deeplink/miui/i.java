package com.avito.android.iac_problems.impl_module.deeplink.miui;

import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacMiuiDisplayOnLockedScreenPermissionLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f168750a;

    public i(g gVar) {
        this.f168750a = gVar;
    }

    public static C43834a a(g gVar) {
        h.f168749a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacMiuiDisplayOnLockedScreenPermissionLink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMiuiDisplayOnLockedScreenPermissionLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168750a);
    }
}

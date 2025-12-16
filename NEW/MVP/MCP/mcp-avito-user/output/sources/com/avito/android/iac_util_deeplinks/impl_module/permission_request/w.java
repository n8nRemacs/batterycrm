package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PermissionRequestSystemPopupLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f169204a;

    public w(u uVar) {
        this.f169204a = uVar;
    }

    public static C43834a a(u uVar) {
        v.f169203a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PermissionRequestSystemPopupLink.class, new x(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionRequestSystemPopupLink.class), uVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f169204a);
    }
}

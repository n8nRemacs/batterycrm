package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestCheckLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PermissionRequestCheckLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f169187a;

    public m(k kVar) {
        this.f169187a = kVar;
    }

    public static C43834a a(k kVar) {
        l.f169186a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PermissionRequestCheckLink.class, new n(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionRequestCheckLink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f169187a);
    }
}

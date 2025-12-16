package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionCheckLink;
import lv.C43834a;

/* compiled from: PermissionCheckLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30969u f169234a;

    public w(C30969u c30969u) {
        this.f169234a = c30969u;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30969u c30969u = this.f169234a;
        v.f169233a.getClass();
        return new C43834a(PermissionCheckLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionCheckLink.class), c30969u));
    }
}

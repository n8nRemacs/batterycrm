package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import lv.C43834a;

/* compiled from: PermissionSystemRequestLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class D implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final B f169105a;

    public D(B b12) {
        this.f169105a = b12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = this.f169105a;
        C.f169104a.getClass();
        return new C43834a(PermissionSystemRequestLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionSystemRequestLink.class), b12));
    }
}

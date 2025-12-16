package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import lv.C43834a;

/* compiled from: IgnoreInDialogRouterLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30961l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30959j f169149a;

    public C30961l(C30959j c30959j) {
        this.f169149a = c30959j;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30959j c30959j = this.f169149a;
        C30960k.f169148a.getClass();
        return new C43834a(IgnoreInDialogRouterLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IgnoreInDialogRouterLink.class), c30959j));
    }
}

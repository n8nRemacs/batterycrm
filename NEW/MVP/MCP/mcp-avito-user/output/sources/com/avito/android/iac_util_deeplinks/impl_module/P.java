package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import lv.C43834a;

/* compiled from: RunMultipleLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class P implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final N f169130a;

    public P(N n12) {
        this.f169130a = n12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = this.f169130a;
        O.f169129a.getClass();
        return new C43834a(RunMultipleLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RunMultipleLink.class), n12));
    }
}

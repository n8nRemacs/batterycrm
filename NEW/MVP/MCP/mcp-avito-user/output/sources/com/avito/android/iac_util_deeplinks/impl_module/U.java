package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import lv.C43834a;

/* compiled from: SetFlowResultLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class U implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final S f169133a;

    public U(S s5) {
        this.f169133a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T.f169132a.getClass();
        return new C43834a(SetFlowResultLink.class, null, new C43834a.b.C11809b(this.f169133a));
    }
}

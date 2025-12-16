package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import lv.C43834a;

/* compiled from: ChainEventLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30953d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30951b f169139a;

    public C30953d(C30951b c30951b) {
        this.f169139a = c30951b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30952c.f169135a.getClass();
        return new C43834a(ChainEventLink.class, null, new C43834a.b.C11809b(this.f169139a));
    }
}

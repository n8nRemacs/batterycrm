package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeCallInChannelMenuLink;
import lv.C43834a;

/* compiled from: IacMakeCallInChannelMenuLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f168635a;

    public p(n nVar) {
        this.f168635a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f168635a;
        o.f168634a.getClass();
        return new C43834a(IacMakeCallInChannelMenuLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMakeCallInChannelMenuLink.class), nVar));
    }
}

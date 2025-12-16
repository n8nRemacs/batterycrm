package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import lv.C43834a;

/* compiled from: IacLaunchCallAfterCanCallLinkModule_ProvideMappingIacLaunchCallAfterCanCallLinkFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f168594a;

    public l(j jVar) {
        this.f168594a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = this.f168594a;
        k.f168593a.getClass();
        return new C43834a(IacLaunchCallAfterCanCallLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacLaunchCallAfterCanCallLink.class), jVar));
    }
}

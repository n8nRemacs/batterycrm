package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartRecallFromSystemApiLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacStartRecallFromSystemApiLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f168627a;

    public l(j jVar) {
        this.f168627a = jVar;
    }

    public static C43834a a(j jVar) {
        k.f168626a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacStartRecallFromSystemApiLink.class, new m(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacStartRecallFromSystemApiLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168627a);
    }
}

package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacStartNewCallLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f168610a;

    public e(c cVar) {
        this.f168610a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f168609a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacStartNewCallLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacStartNewCallLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168610a);
    }
}

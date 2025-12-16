package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeSupportCallLink;
import lv.C43834a;

/* compiled from: IacMakeSupportCallLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final t f168655a;

    public v(t tVar) {
        this.f168655a = tVar;
    }

    public static C43834a a(t tVar) {
        u.f168654a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacMakeSupportCallLink.class, new y(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMakeSupportCallLink.class), tVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168655a);
    }
}

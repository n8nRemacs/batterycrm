package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacCanRecallLink;
import lv.C43834a;

/* compiled from: IacCanRecallLinkModule_ProvideIacCanRecallLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f168589a;

    public g(e eVar) {
        this.f168589a = eVar;
    }

    public static C43834a a(e eVar) {
        f.f168588a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacCanRecallLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacCanRecallLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168589a);
    }
}

package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink;
import lv.C43834a;

/* compiled from: IacShowCallMethodsDialogSheetLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class C implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f168567a;

    public C(A a12) {
        this.f168567a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        A a12 = this.f168567a;
        B.f168566a.getClass();
        return new C43834a(IacShowCallMethodsDialogSheetLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacShowCallMethodsDialogSheetLink.class), a12));
    }
}

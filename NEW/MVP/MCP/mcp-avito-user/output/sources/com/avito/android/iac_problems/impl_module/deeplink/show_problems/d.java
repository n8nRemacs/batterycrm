package com.avito.android.iac_problems.impl_module.deeplink.show_problems;

import com.avito.android.iac_problems.public_module.deeplink.IacShowProblemBottomSheetLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacShowProblemBottomSheetLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f168775a;

    public d(b bVar) {
        this.f168775a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f168774a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacShowProblemBottomSheetLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacShowProblemBottomSheetLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f168775a);
    }
}

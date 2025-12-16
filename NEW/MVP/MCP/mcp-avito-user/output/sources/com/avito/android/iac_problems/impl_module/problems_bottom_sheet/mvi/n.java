package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: IacProblemsBottomSheetReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f168937a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f168938b;

    public n(dagger.internal.l lVar, Provider provider) {
        this.f168937a = provider;
        this.f168938b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f168937a.get(), (String) this.f168938b.f393949a);
    }
}

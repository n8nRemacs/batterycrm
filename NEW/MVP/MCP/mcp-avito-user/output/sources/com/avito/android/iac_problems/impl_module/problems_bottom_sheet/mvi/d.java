package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemsBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<NL.e> f168913a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f168914b;

    public d(Provider<NL.e> provider, Provider<InterfaceC28373a> provider2) {
        this.f168913a = provider;
        this.f168914b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f168913a.get(), this.f168914b.get());
    }
}

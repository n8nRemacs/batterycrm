package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import com.avito.android.ab_tests.groups.StandardizeButtonWidthTestGroup;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: CombinedButtonsItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28173a> f79090a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l<StandardizeButtonWidthTestGroup>> f79091b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G6.a> f79092c;

    public f(Provider<InterfaceC28173a> provider, Provider<l<StandardizeButtonWidthTestGroup>> provider2, Provider<G6.a> provider3) {
        this.f79090a = provider;
        this.f79091b = provider2;
        this.f79092c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f79090a.get(), this.f79091b.get(), this.f79092c.get());
    }
}

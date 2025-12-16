package com.avito.android.related_products.bottom_sheet;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: RelatedProductsBottomSheetViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.related_products.bottom_sheet.mvi.g f252988a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f252989b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B> f252990c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f252991d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f252992e;

    /* renamed from: f, reason: collision with root package name */
    public final C31151u0 f252993f;

    /* renamed from: g, reason: collision with root package name */
    public final C31144q0 f252994g;

    public q(com.avito.android.related_products.bottom_sheet.mvi.g gVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, C31151u0 c31151u0, C31144q0 c31144q0) {
        this.f252988a = gVar;
        this.f252989b = provider;
        this.f252990c = provider2;
        this.f252991d = provider3;
        this.f252992e = provider4;
        this.f252993f = c31151u0;
        this.f252994g = c31144q0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.related_products.bottom_sheet.mvi.f) this.f252988a.get(), this.f252989b.get(), this.f252990c.get(), this.f252991d.get(), this.f252992e.get(), (ZS.b) this.f252993f.get(), (aU0.b) this.f252994g.get());
    }
}

package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.h1;

/* compiled from: AdvertFragmentModule_ProvideSpanProvider$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class k0 implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f69411a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f69412b;

    public k0(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f69411a = uVar;
        this.f69412b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h1 h1Var = (h1) this.f69411a.get();
        Resources resources = (Resources) this.f69412b.f393949a;
        C27710t.f69463a.getClass();
        return new Z0(resources.getInteger(R.integer.similar_adverts_columns), h1Var);
    }
}

package com.avito.android.map.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.Z0;
import com.avito.android.serp.adapter.h1;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertsInPinModule_ProvideSpanProvider$_avito_search_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f184870a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f184871b;

    public n(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f184870a = uVar;
        this.f184871b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h1 h1Var = (h1) this.f184870a.get();
        Resources resources = (Resources) this.f184871b.f393949a;
        d dVar = d.f184841a;
        return new Z0(resources.getInteger(R.integer.serp_columns), h1Var);
    }
}

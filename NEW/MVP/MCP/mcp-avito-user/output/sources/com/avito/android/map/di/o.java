package com.avito.android.map.di;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.e1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertsInPinModule_ProvideSpanSizeLookup$_avito_search_map_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y0> f184872a;

    public o(Provider<Y0> provider) {
        this.f184872a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y0 y02 = this.f184872a.get();
        d dVar = d.f184841a;
        return new e1(y02);
    }
}

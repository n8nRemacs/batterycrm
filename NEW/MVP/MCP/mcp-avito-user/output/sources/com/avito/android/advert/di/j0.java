package com.avito.android.advert.di;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.e1;

/* compiled from: AdvertFragmentModule_ProvideSpanLookup$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class j0 implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f69410a;

    public j0(dagger.internal.u uVar) {
        this.f69410a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y0 y02 = (Y0) this.f69410a.get();
        C27710t.f69463a.getClass();
        return new e1(y02);
    }
}

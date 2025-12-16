package com.avito.android.extended_profile_adverts.di;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.e1;

/* compiled from: ProfileAdvertsAdapterModule_ProvideSpanLookup$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150816a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f150817b;

    public j(C30493b c30493b, dagger.internal.u uVar) {
        this.f150816a = c30493b;
        this.f150817b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y0 y02 = (Y0) this.f150817b.get();
        this.f150816a.getClass();
        return new e1(y02);
    }
}

package com.avito.android.extended_profile_serp.di;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.e1;

/* compiled from: ExtendedProfileSerpModule_ProvideSpanLookup$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f152666a;

    public D(dagger.internal.u uVar) {
        this.f152666a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y0 y02 = (Y0) this.f152666a.get();
        C30538h.f152853a.getClass();
        return new e1(y02);
    }
}

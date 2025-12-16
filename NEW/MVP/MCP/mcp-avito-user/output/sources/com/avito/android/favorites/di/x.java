package com.avito.android.favorites.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: FavoriteAdvertsModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class x implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157357a;

    public x(dagger.internal.l lVar) {
        this.f157357a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f157357a.f393949a;
        C30647e.f157320a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

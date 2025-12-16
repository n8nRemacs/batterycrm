package com.avito.android.travel_search.di;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchItemsModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f303075a;

    public o(dagger.internal.l lVar) {
        this.f303075a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f303075a.f393949a;
        i.f303068a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

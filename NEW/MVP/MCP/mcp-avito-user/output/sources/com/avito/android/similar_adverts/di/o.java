package com.avito.android.similar_adverts.di;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarAdvertsModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f283924a;

    public o(dagger.internal.l lVar) {
        this.f283924a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f283924a.f393949a;
        l.f283921a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

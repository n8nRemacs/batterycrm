package com.avito.android.extended_profile.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: ExtendedProfileModule_ProvideAdvertsColumnCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149518a;

    public A(dagger.internal.l lVar) {
        this.f149518a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f149518a.f393949a;
        r.f149945a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

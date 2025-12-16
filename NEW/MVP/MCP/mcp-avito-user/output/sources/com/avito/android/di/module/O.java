package com.avito.android.di.module;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class O implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f144084a;

    public O(Provider<Resources> provider) {
        this.f144084a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f144084a.get();
        D.f143878a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

package com.avito.android.advert.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import com.avito.android.advert.di.t0;
import javax.inject.Provider;
import s3.C47983s;

/* compiled from: AdvertFragmentModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i0 implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69406a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<GridLayoutWithTwoColumnsAbTestGroup>> f69407b;

    public i0(dagger.internal.l lVar, Provider provider) {
        this.f69406a = lVar;
        this.f69407b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f69406a.f393949a;
        u3.l lVar = (u3.l) ((t0.b.A0) this.f69407b).get();
        C27710t.f69463a.getClass();
        return Integer.valueOf(C47983s.a(lVar, resources.getInteger(R.integer.serp_columns)));
    }
}

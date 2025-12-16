package com.avito.android.bxcontent.di.module;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import javax.inject.Provider;
import s3.C47983s;

/* compiled from: BxContentModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class K implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f110893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.l<GridLayoutWithTwoColumnsAbTestGroup>> f110894b;

    public K(dagger.internal.l lVar, Provider provider) {
        this.f110893a = lVar;
        this.f110894b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f110893a.f393949a;
        u3.l<GridLayoutWithTwoColumnsAbTestGroup> lVar = this.f110894b.get();
        C29070s.f111022a.getClass();
        return Integer.valueOf(C47983s.a(lVar, resources.getInteger(R.integer.serp_columns)));
    }
}

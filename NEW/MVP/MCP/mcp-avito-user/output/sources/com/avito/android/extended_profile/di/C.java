package com.avito.android.extended_profile.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: ExtendedProfileModule_ProvideDisclaimerHorizontalMarginsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149520a;

    public C(dagger.internal.l lVar) {
        this.f149520a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f149520a.f393949a;
        r.f149945a.getClass();
        return Integer.valueOf((int) resources.getDimension(R.dimen.extended_profile_horizontal_margin));
    }
}

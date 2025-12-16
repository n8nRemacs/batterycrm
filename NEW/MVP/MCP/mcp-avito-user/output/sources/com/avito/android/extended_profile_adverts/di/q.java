package com.avito.android.extended_profile_adverts.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: ProfileAdvertsModule_ProvideColumnsCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final n f150825a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150826b;

    public q(n nVar, dagger.internal.l lVar) {
        this.f150825a = nVar;
        this.f150826b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f150826b.f393949a;
        this.f150825a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.profile_adverts_columns));
    }
}

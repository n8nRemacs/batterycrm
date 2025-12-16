package com.avito.android.extended_profile_serp.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: ExtendedProfileSerpModule_ProvideColumnsCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152860a;

    public o(dagger.internal.l lVar) {
        this.f152860a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f152860a.f393949a;
        C30538h.f152853a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.profile_adverts_columns));
    }
}

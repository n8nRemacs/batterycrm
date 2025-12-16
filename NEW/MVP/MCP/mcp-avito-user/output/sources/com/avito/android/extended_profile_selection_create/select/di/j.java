package com.avito.android.extended_profile_selection_create.select.di;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateModule_ProvideAdvertsColumnCountFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152266a;

    public j(dagger.internal.l lVar) {
        this.f152266a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f152266a.f393949a;
        f.f152261a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}

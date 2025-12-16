package com.avito.android.profile.user_profile.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: UserProfileModule_ProvideIsTablet$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226105a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226106b;

    public l(f fVar, dagger.internal.l lVar) {
        this.f226105a = fVar;
        this.f226106b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f226106b.f393949a;
        this.f226105a.getClass();
        return Boolean.valueOf(resources.getBoolean(R.bool.is_tablet));
    }
}

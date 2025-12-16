package com.avito.android.profile.user_profile.di;

import com.avito.android.R;
import com.avito.android.util.y6;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvidesPromoBlockSettingsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<com.avito.android.promoblock.m> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226141a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f226142b;

    public x(f fVar, Provider<Boolean> provider) {
        this.f226141a = fVar;
        this.f226142b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = this.f226142b.get().booleanValue();
        this.f226141a.getClass();
        return new com.avito.android.promoblock.m(0, y6.b(12), zBooleanValue ? null : Integer.valueOf(R.color.common_floating_card_background));
    }
}

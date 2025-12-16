package com.avito.android.profile.user_profile.di;

import android.content.res.Resources;

/* compiled from: UserProfileModule_ProvideUserProfileResourceProvider$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<com.avito.android.profile.user_profile.cards.o> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226136a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226137b;

    public v(f fVar, dagger.internal.l lVar) {
        this.f226136a = fVar;
        this.f226137b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f226137b.f393949a;
        this.f226136a.getClass();
        return new com.avito.android.profile.user_profile.cards.p(resources);
    }
}

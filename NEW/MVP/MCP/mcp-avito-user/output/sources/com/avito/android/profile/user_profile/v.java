package com.avito.android.profile.user_profile;

/* compiled from: UserProfileMenuProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f226598a;

    public v(dagger.internal.u uVar) {
        this.f226598a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.profile.user_profile.cards.o) this.f226598a.get());
    }
}

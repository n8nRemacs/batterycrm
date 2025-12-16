package com.avito.android.profile.user_profile;

import com.avito.android.profile.user_profile.mvi.f0;
import com.avito.android.profile.user_profile.mvi.g0;
import kotlinx.coroutines.flow.i2;

/* compiled from: UserProfileMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f226599a;

    public x(g0 g0Var) {
        this.f226599a = g0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f0 f0Var = (f0) this.f226599a.get();
        i2.f411430a.getClass();
        return new w(f0Var, i2.a.f411433c);
    }
}

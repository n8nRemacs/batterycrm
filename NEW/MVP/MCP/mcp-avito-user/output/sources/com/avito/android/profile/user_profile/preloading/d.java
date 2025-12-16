package com.avito.android.profile.user_profile.preloading;

import com.avito.android.account.G;
import com.avito.android.profile.user_profile.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserProfileDataPreloadable_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f226576a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f226577b;

    public d(u uVar, Provider provider) {
        this.f226576a = uVar;
        this.f226577b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f226576a.get(), this.f226577b.get());
    }
}

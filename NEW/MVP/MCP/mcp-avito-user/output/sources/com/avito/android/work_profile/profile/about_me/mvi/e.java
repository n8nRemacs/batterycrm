package com.avito.android.work_profile.profile.about_me.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AboutMeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.work_profile.domain.j> f330796a;

    /* renamed from: b, reason: collision with root package name */
    public final u f330797b;

    public e(u uVar, Provider provider) {
        this.f330796a = provider;
        this.f330797b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f330796a.get(), (Set) this.f330797b.get());
    }
}

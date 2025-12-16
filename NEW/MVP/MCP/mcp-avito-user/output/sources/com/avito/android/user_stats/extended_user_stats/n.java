package com.avito.android.user_stats.extended_user_stats;

import javax.inject.Provider;

/* compiled from: ExtendedUserStatsTabStorage_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.l> f317300a;

    public n(Provider<AK0.l> provider) {
        this.f317300a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f317300a.get());
    }
}

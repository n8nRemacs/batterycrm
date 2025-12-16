package com.avito.android.user_stats.extended_user_stats.di;

import android.content.Context;
import com.avito.android.user_stats.extended_user_stats.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedUserStatsModule_ProvideExtendedUserStatsPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<AK0.l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f317211a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AK0.i> f317212b;

    public h(Provider<Context> provider, Provider<AK0.i> provider2) {
        this.f317211a = provider;
        this.f317212b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context contextG = ((a.b.C9845b) this.f317211a).f317196a.g();
        AK0.i iVar = (AK0.i) ((a.b.d) this.f317212b).get();
        d.f317204a.getClass();
        return iVar.a(contextG, "extended_user_stats");
    }
}

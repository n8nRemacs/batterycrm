package com.avito.android.user_stats.extended_user_stats.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.user_stats.extended_user_stats.F;
import com.avito.android.user_stats.extended_user_stats.G;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedUserStatsModule_ProvideUserStatsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<ExtendedUserStatsViewModel> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<T0> f317218a;

    /* renamed from: b, reason: collision with root package name */
    public final G f317219b;

    public n(Provider provider, G g12) {
        this.f317218a = provider;
        this.f317219b = g12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = this.f317218a.get();
        F f12 = (F) this.f317219b.get();
        d.f317204a.getClass();
        return (ExtendedUserStatsViewModel) new P0(t02, f12).a(ExtendedUserStatsViewModel.class);
    }
}

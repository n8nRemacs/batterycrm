package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: UserAdvertsListFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class Q implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f315258a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f315259b;

    /* renamed from: c, reason: collision with root package name */
    public final N f315260c;

    /* renamed from: d, reason: collision with root package name */
    public final V f315261d;

    /* renamed from: e, reason: collision with root package name */
    public final T f315262e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f315263f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings.u> f315264g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.l> f315265h;

    public Q(dagger.internal.l lVar, dagger.internal.l lVar2, N n12, V v12, T t12, Provider provider, Provider provider2, Provider provider3) {
        this.f315258a = lVar;
        this.f315259b = lVar2;
        this.f315260c = n12;
        this.f315261d = v12;
        this.f315262e = t12;
        this.f315263f = provider;
        this.f315264g = provider2;
        this.f315265h = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        UserAdvertsListData userAdvertsListData = (UserAdvertsListData) this.f315258a.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f315259b.f393949a;
        C35670a c35670a = (C35670a) this.f315260c.get();
        U u12 = (U) this.f315261d.get();
        this.f315262e.getClass();
        S s5 = new S();
        R0 r02 = this.f315263f.get();
        com.avito.android.profile_settings.u uVar = this.f315264g.get();
        com.avito.android.passport.profile_add.l lVar = this.f315265h.get();
        return new P(C22026a.c(new StringBuilder("UserAdvertsListFeature["), userAdvertsListData.f314689b, ']'), new UserAdvertsListState(userAdvertsListData.f314689b, userAdvertsListData.f314692e, userAdvertsListData.f314693f, userAdvertsListData.f314690c, userAdvertsListData.f314691d, uVar.b().getValue().f228512a, lVar.b().getValue().f212377a, null, null, false, null, null, null, null, null, null, 65408, null), new O(c35670a, screenPerformanceTracker, u12, s5, r02));
    }
}

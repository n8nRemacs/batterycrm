package com.avito.android.notification_center.list.di;

import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.notification_center.list.di.a;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.preloading.coroutines.o;
import com.avito.android.remote.model.notification.NotificationsResponse;
import com.avito.android.util.C;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.G0;

/* compiled from: NotificationCenterListModule_ProvidePreloadingPromise$_avito_notification_center_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<AbstractC33302a<G0, NotificationsResponse>> {

    /* renamed from: a, reason: collision with root package name */
    public final E30.c f207589a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f207590b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<PreloadingPromiseTestGroup> f207591c;

    /* renamed from: d, reason: collision with root package name */
    public final l f207592d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f207593e;

    /* renamed from: f, reason: collision with root package name */
    public final l f207594f;

    public h(E30.c cVar, Provider provider, Provider provider2, l lVar, Provider provider3, l lVar2) {
        this.f207589a = cVar;
        this.f207590b = provider;
        this.f207591c = provider2;
        this.f207592d = lVar;
        this.f207593e = provider3;
        this.f207594f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) ((a.c.C6193c) this.f207590b).get();
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = (PreloadingPromiseTestGroup) ((a.c.l) this.f207591c).get();
        S0 s02 = (S0) this.f207592d.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C6192a) this.f207593e).get();
        C28478k c28478k = (C28478k) this.f207594f.f393949a;
        d.f207580a.getClass();
        return o.a("SingleBootstrap", s02, new e(this.f207589a, c12, preloadingPromiseTestGroup, interfaceC28373a, c28478k));
    }
}

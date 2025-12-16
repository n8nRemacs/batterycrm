package com.avito.android.user_adverts_filters.main.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.action.custom.submitForm.BeduinSubmitFormAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.user_adverts_filters.main.action.BeduinUserAdvertsFiltersOpenInnerScreenAction;
import com.avito.android.user_adverts_filters.main.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import kotlin.collections.C42756l;
import pj.C47101d;

/* compiled from: UserAdvertsFiltersMainModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f316034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f316035b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f316036c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts_filters.main.action.a> f316037d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts_filters.main.action.c> f316038e;

    /* renamed from: f, reason: collision with root package name */
    public final u f316039f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C28478k> f316040g;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f316034a = provider;
        this.f316035b = provider2;
        this.f316036c = provider3;
        this.f316037d = provider4;
        this.f316038e = provider5;
        this.f316039f = uVar;
        this.f316040g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.C9801c) this.f316034a).f316026a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.e) this.f316035b).get();
        a.b bVar = (a.b) ((a.c.f) this.f316036c).get();
        com.avito.android.user_adverts_filters.main.action.a aVar2 = this.f316037d.get();
        com.avito.android.user_adverts_filters.main.action.c cVar = this.f316038e.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f316039f.get();
        C28478k c28478k = this.f316040g.get();
        d.f316033a.getClass();
        return d.a.a(dVarEl, aVar, bVar, new C47101d(screenPerformanceTracker), C42756l.l0(new gj.f[]{new gj.f(BeduinUserAdvertsFiltersOpenInnerScreenAction.class, aVar2), new gj.f(BeduinSubmitFormAction.class, cVar)}), null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210450U2), "UserAdvertsFiltersMain", false, 8, null), 48);
    }
}

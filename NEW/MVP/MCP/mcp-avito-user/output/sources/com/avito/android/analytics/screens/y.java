package com.avito.android.analytics.screens;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreensDistributionTracker.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/y;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f91013a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f91015c = new a();

    /* compiled from: ScreensDistributionTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/y$a", "Lid/i;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C2684a f91016b;

        /* compiled from: ScreensDistributionTracker.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/y$a$a", "Landroidx/fragment/app/FragmentManager$n;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.analytics.screens.y$a$a, reason: collision with other inner class name */
        public static final class C2684a extends FragmentManager.n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f91018a;

            public C2684a(y yVar) {
                this.f91018a = yVar;
            }

            @Override // androidx.fragment.app.FragmentManager.n
            public final void onFragmentCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @Y61.l Bundle bundle) {
                y yVar = this.f91018a;
                yVar.getClass();
                yVar.a(new r(fragment, (Long) null, (String) null, 6, (C42822w) null));
            }
        }

        public a() {
            this.f91016b = new C2684a(y.this);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.e0(this.f91016b, true);
            }
            y yVar = y.this;
            yVar.getClass();
            yVar.a(new r(activity, (Long) null, (String) null, 6, (C42822w) null));
        }
    }

    @Inject
    public y(@Y61.k Application application, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f91013a = application;
        this.f91014b = interfaceC28373a;
    }

    public final void a(r rVar) {
        this.f91014b.c(new y.a("performance.screens-distribution." + rVar.f90694a, 0L, 2, null));
    }
}

package com.avito.android.analytics.coverage;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.coverage.ScreenCoverageEvent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.util.V2;
import id.i;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerformanceScreenCoverage.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/coverage/e;", "Lcom/avito/android/analytics/coverage/d;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f89871e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Application f89872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.coverage.a f89873c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f89874d = new b();

    /* compiled from: PerformanceScreenCoverage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/coverage/e$a;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PerformanceScreenCoverage.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/coverage/e$b", "Lid/i;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends i {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f89875b;

        /* compiled from: PerformanceScreenCoverage.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/coverage/e$b$a", "Landroidx/fragment/app/FragmentManager$n;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends FragmentManager.n {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f89878b;

            public a(e eVar) {
                this.f89878b = eVar;
            }

            @Override // androidx.fragment.app.FragmentManager.n
            public final void onFragmentCreated(@k FragmentManager fragmentManager, @k Fragment fragment, @l Bundle bundle) {
                a aVar = e.f89871e;
                StringBuilder sb2 = new StringBuilder("onFragmentCreated for ");
                sb2.append(fragment.getClass().getName());
                sb2.append('(');
                b.this.getClass();
                sb2.append(fragment instanceof InterfaceC28477j.b ? "Trackable" : fragment instanceof InterfaceC28477j.a ? "NonTrackable" : "<not marked>");
                sb2.append(')');
                String string = sb2.toString();
                aVar.getClass();
                V2.f318762a.c("PerfCoverage", string, null);
                com.avito.android.analytics.coverage.a aVar2 = this.f89878b.f89873c;
                aVar2.getClass();
                aVar2.a(fragment, new r(fragment, (Long) null, (String) null, 6, (C42822w) null));
            }
        }

        public b() {
            this.f89875b = new a(e.this);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            a aVar = e.f89871e;
            StringBuilder sb2 = new StringBuilder("onActivityCreated for ");
            sb2.append(activity.getClass().getName());
            sb2.append('(');
            sb2.append(activity instanceof InterfaceC28477j.b ? "Trackable" : activity instanceof InterfaceC28477j.a ? "NonTrackable" : "<not marked>");
            sb2.append(')');
            String string = sb2.toString();
            aVar.getClass();
            V2.f318762a.c("PerfCoverage", string, null);
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.e0(this.f89875b, true);
            }
            com.avito.android.analytics.coverage.a aVar2 = e.this.f89873c;
            aVar2.getClass();
            aVar2.a(activity, new r(activity, (Long) null, (String) null, 6, (C42822w) null));
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@k Activity activity) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.v0(this.f89875b);
            }
        }
    }

    @Inject
    public e(@k Application application, @k com.avito.android.analytics.coverage.a aVar) {
        this.f89872b = application;
        this.f89873c = aVar;
    }

    @Override // com.avito.android.analytics.coverage.d
    public final void a() {
        f89871e.getClass();
        V2.f318762a.c("PerfCoverage", "performance screens coverage started", null);
        this.f89872b.registerActivityLifecycleCallbacks(this.f89874d);
    }

    @Override // com.avito.android.analytics.coverage.d
    public final void b(@k r rVar, @k String str) {
        com.avito.android.analytics.coverage.a aVar = this.f89873c;
        aVar.getClass();
        StringBuilder sb2 = new StringBuilder("screen init event received - ");
        String str2 = rVar.f90695b;
        sb2.append(str2);
        sb2.append('(');
        sb2.append(str);
        sb2.append(')');
        String string = sb2.toString();
        com.avito.android.analytics.coverage.a.f89855d.getClass();
        V2 v22 = V2.f318762a;
        v22.c("PerfCoverage", string, null);
        g gVar = new g(str2, str);
        LinkedHashSet linkedHashSet = aVar.f89858c;
        if (linkedHashSet.contains(gVar)) {
            return;
        }
        linkedHashSet.add(gVar);
        aVar.f89856a.get().c(new ScreenCoverageEvent(rVar.f90694a, str, ScreenCoverageEvent.ScreenType.f89849c));
        aVar.f89857b.removeCallbacksAndMessages(str2);
        v22.c("PerfCoverage", "tracked " + str2 + " as covered for " + str, null);
    }
}

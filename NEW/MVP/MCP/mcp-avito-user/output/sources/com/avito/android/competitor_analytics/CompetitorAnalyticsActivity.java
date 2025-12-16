package com.avito.android.competitor_analytics;

import Cd.C13243a;
import Y41.p;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.competitor_analytics.di.a;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: CompetitorAnalyticsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/CompetitorAnalyticsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Lcom/avito/android/competitor_analytics/mvi/entity/b;", VoiceInfo.STATE, "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompetitorAnalyticsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public n f124233m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f124234n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f124235o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final O0 f124236p = new O0(m0.f406844a.b(m.class), new d(), new c(new f()), new e());

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f124237q = C42727D.c(new a());

    /* compiled from: CompetitorAnalyticsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = CompetitorAnalyticsActivity.this.f124234n;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: CompetitorAnalyticsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-2092466739, new com.avito.android.competitor_analytics.e(CompetitorAnalyticsActivity.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f124240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f124240l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f124240l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CompetitorAnalyticsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CompetitorAnalyticsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CompetitorAnalyticsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/competitor_analytics/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<m> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = CompetitorAnalyticsActivity.this.f124233m;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Bundle extras;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3708a interfaceC3708aA = com.avito.android.competitor_analytics.di.g.a();
        com.avito.android.competitor_analytics.di.d dVar = (com.avito.android.competitor_analytics.di.d) C29972i.a(C29972i.b(this), com.avito.android.competitor_analytics.di.d.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        com.avito.android.analytics.screens.r rVarA = s.a(this);
        Intent intent = getIntent();
        Long lValueOf = (!intent.hasExtra("ca_item_id") || (extras = intent.getExtras()) == null) ? null : Long.valueOf(extras.getLong("ca_item_id"));
        if (lValueOf == null) {
            throw new IllegalArgumentException("ca_item_id".concat(" - param must be not null"));
        }
        interfaceC3708aA.a(dVar, interfaceC39417aA, rVarA, lValueOf.longValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f124234n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f124234n;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f124234n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        androidx.view.compose.j.a(this, new C22096n(1380628274, new b(), true));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f124234n;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}

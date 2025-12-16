package com.avito.android.notifications_permission.presentation;

import Cd.C13243a;
import L91.o;
import O30.a;
import Q30.a;
import Q30.b;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.h;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.notifications_permission.presentation.perf_cost.NotificationPermissionInfoScreen;
import com.avito.android.permissions.H;
import com.avito.android.util.N0;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: NotificationPermissionInfoDialogActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/NotificationPermissionInfoDialogActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationPermissionInfoDialogActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f207841s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public g f207842m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f207843n = new O0(m0.f406844a.b(com.avito.android.notifications_permission.presentation.f.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f207844o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public H f207845p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public h<String> f207846q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f207847r;

    /* compiled from: NotificationPermissionInfoDialogActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<Q30.b, G0> {
        public final void f(@k Q30.b bVar) {
            h<String> hVar;
            NotificationPermissionInfoDialogActivity notificationPermissionInfoDialogActivity = (NotificationPermissionInfoDialogActivity) this.receiver;
            int i12 = NotificationPermissionInfoDialogActivity.f207841s;
            notificationPermissionInfoDialogActivity.getClass();
            if (bVar instanceof b.C0884b) {
                com.avito.android.lib.design.modal.a aVar = notificationPermissionInfoDialogActivity.f207847r;
                if (aVar != null) {
                    N0.a(aVar);
                }
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, notificationPermissionInfoDialogActivity, new com.avito.android.notifications_permission.presentation.c(notificationPermissionInfoDialogActivity));
                notificationPermissionInfoDialogActivity.f207847r = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
                return;
            }
            if (bVar instanceof b.a) {
                notificationPermissionInfoDialogActivity.finish();
            } else {
                if (!(bVar instanceof b.c) || (hVar = notificationPermissionInfoDialogActivity.f207846q) == null) {
                    return;
                }
                hVar.b(((b.c) bVar).f13447a);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Q30.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: NotificationPermissionInfoDialogActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ30/c;", "it", "Lkotlin/G0;", "invoke", "(LQ30/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Q30.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f207848l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Q30.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f207849l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f207849l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f207849l);
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
            return NotificationPermissionInfoDialogActivity.this.getF42820b();
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
            return NotificationPermissionInfoDialogActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: NotificationPermissionInfoDialogActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/notifications_permission/presentation/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.notifications_permission.presentation.f> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.notifications_permission.presentation.f invoke() {
            g gVar = NotificationPermissionInfoDialogActivity.this.f207842m;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.notifications_permission.presentation.f) gVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Zb().a(new C28478k(NotificationPermissionInfoScreen.f207892d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f207844o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.notifications_permission.presentation.f a2() {
        return (com.avito.android.notifications_permission.presentation.f) this.f207843n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2().accept(a.d.f13444a);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f207844o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        this.f207846q = registerForActivityResult(new b.l(), new o(this, 21));
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46682e, new a(1, this, NotificationPermissionInfoDialogActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoOneTimeEvent;)V", 0), b.f207848l);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f207844o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.modal.a aVar = this.f207847r;
        if (aVar != null) {
            N0.a(aVar);
        }
    }
}

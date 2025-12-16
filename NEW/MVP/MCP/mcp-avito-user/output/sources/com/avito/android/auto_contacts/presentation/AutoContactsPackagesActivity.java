package com.avito.android.auto_contacts.presentation;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.compose.j;
import com.avito.android.analytics.screens.AutoContactsPackagesScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ye.InterfaceC50233d;
import z1.AbstractC50339a;
import ze.InterfaceC50552b;

/* compiled from: AutoContactsPackagesActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/AutoContactsPackagesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoContactsPackagesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f94907r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.auto_contacts.presentation.g f94908m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f94910o;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f94912q;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f94909n = new O0(m0.f406844a.b(com.avito.android.auto_contacts.presentation.f.class), new f(), new e(new h()), new g());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC42726C f94911p = C42727D.c(new b());

    /* compiled from: AutoContactsPackagesActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/AutoContactsPackagesActivity$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoContactsPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = AutoContactsPackagesActivity.this.f94910o;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: AutoContactsPackagesActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC50552b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50552b interfaceC50552b) {
            InterfaceC50552b interfaceC50552b2 = interfaceC50552b;
            AutoContactsPackagesActivity autoContactsPackagesActivity = (AutoContactsPackagesActivity) this.receiver;
            a aVar = AutoContactsPackagesActivity.f94907r;
            autoContactsPackagesActivity.getClass();
            if (interfaceC50552b2 instanceof InterfaceC50552b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = autoContactsPackagesActivity.f94912q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC50552b.a) interfaceC50552b2).f444107a, null, null, 6);
            } else if (interfaceC50552b2 instanceof InterfaceC50552b.C12960b) {
                autoContactsPackagesActivity.onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoContactsPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<AutoContactsPackagesUiState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AutoContactsPackagesUiState autoContactsPackagesUiState) {
            a aVar = AutoContactsPackagesActivity.f94907r;
            AutoContactsPackagesActivity autoContactsPackagesActivity = AutoContactsPackagesActivity.this;
            j.a(autoContactsPackagesActivity, new C22096n(-648370882, new com.avito.android.auto_contacts.presentation.d(autoContactsPackagesActivity, autoContactsPackagesUiState, new com.avito.android.auto_contacts.presentation.a(1, (com.avito.android.auto_contacts.presentation.f) autoContactsPackagesActivity.f94909n.getValue(), com.avito.android.auto_contacts.presentation.f.class, "accept", "accept(Ljava/lang/Object;)V", 0)), true));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f94915l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f94915l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f94915l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutoContactsPackagesActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutoContactsPackagesActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutoContactsPackagesActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auto_contacts/presentation/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.auto_contacts.presentation.f> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.auto_contacts.presentation.f invoke() {
            com.avito.android.auto_contacts.presentation.g gVar = AutoContactsPackagesActivity.this.f94908m;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.auto_contacts.presentation.f) gVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((InterfaceC50233d.b) C29972i.a(C29972i.b(this), InterfaceC50233d.b.class)).Nb().a(new C28478k(AutoContactsPackagesScreen.f90286d, s.a(this), null, 4, null), cv.c.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94910o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94910o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f94910o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (com.avito.android.auto_contacts.presentation.f) this.f94909n.getValue(), new c(1, this, AutoContactsPackagesActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f94910o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}

package com.avito.android.autoteka.presentation.choosingPurchase;

import Cd.C13243a;
import Hf.InterfaceC13983a;
import L91.o;
import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.analytics.screens.AutotekaChoosingPurchaseScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.l;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.q;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.r;
import com.avito.android.di.C29972i;
import i.b;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import yf.m;
import z1.AbstractC50339a;

/* compiled from: AutotekaChoosingPurchaseActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/AutotekaChoosingPurchaseActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaChoosingPurchaseActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f97072x = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f97073m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97075o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f97076p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97077q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public m f97078r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97079s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public l f97080t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.autoteka.presentation.choosingPurchase.f f97081u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97082v;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97074n = new O0(m0.f406844a.b(q.class), new g(), new f(new i()), new h());

    /* renamed from: w, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f97083w = registerForActivityResult(new b.m(), new o(this, 7));

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/AutotekaChoosingPurchaseActivity$a;", "", "<init>", "()V", "", "KEY_CHOOSING_PURCHASE_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            AutotekaChoosingPurchaseActivity.this.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Hf.b, G0> {
        public final void f(@k Hf.b bVar) {
            AutotekaChoosingPurchaseActivity autotekaChoosingPurchaseActivity = (AutotekaChoosingPurchaseActivity) this.receiver;
            l lVar = autotekaChoosingPurchaseActivity.f97080t;
            if (lVar == null) {
                lVar = null;
            }
            lVar.a(bVar, autotekaChoosingPurchaseActivity, autotekaChoosingPurchaseActivity.f97083w, new com.avito.android.autoteka.presentation.choosingPurchase.a(autotekaChoosingPurchaseActivity));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Hf.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/c;", "it", "Lkotlin/G0;", "invoke", "(LHf/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Hf.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Hf.c cVar) {
            Hf.c cVar2 = cVar;
            com.avito.android.autoteka.presentation.choosingPurchase.f fVar = AutotekaChoosingPurchaseActivity.this.f97081u;
            if (fVar != null) {
                com.avito.android.lib.design.bottom_sheet.j.c(fVar.f97116e, cVar2.f7588c.k0(fVar.f97112a), true, 0, 0, 0, 120);
                fVar.f97114c.c(new UV0.c(Collections.singletonList(cVar2.f7587b)));
                fVar.f97113b.notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/a;", "it", "Lkotlin/G0;", "invoke", "(LHf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC13983a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13983a interfaceC13983a) {
            int i12 = AutotekaChoosingPurchaseActivity.f97072x;
            ((q) AutotekaChoosingPurchaseActivity.this.f97074n.getValue()).accept(interfaceC13983a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f97087l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97087l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaChoosingPurchaseActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaChoosingPurchaseActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<q> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AutotekaChoosingPurchaseActivity.this.f97073m;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("ChoosingPurchaseDetails", ChoosingPurchaseDetails.class) : intent.getParcelableExtra("ChoosingPurchaseDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("choosingPurchaseDetails cannot be null");
        }
        com.avito.android.autoteka.di.choosingPurchase.k.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), new e(), (ChoosingPurchaseDetails) parcelableExtra, new C28478k(AutotekaChoosingPurchaseScreen.f90288d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97082v;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97082v;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97082v;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.konveyor.adapter.j jVar = this.f97075o;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f97077q;
        if (aVar == null) {
            aVar = null;
        }
        this.f97081u = new com.avito.android.autoteka.presentation.choosingPurchase.f(this, jVar, aVar, new b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97082v;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, (q) this.f97074n.getValue(), new c(1, this, AutotekaChoosingPurchaseActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f97082v;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f97081u = null;
    }
}

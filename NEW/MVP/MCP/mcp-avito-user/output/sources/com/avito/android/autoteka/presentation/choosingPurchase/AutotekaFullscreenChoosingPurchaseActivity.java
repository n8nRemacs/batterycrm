package com.avito.android.autoteka.presentation.choosingPurchase;

import Cd.C13243a;
import Hf.InterfaceC13983a;
import Hf.c;
import L91.o;
import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
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
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.P5;
import i.b;
import java.util.Collections;
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
import z1.AbstractC50339a;

/* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/AutotekaFullscreenChoosingPurchaseActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaFullscreenChoosingPurchaseActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f97091y = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f97092m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97094o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97095p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f97096q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97097r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97098s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public l f97099t;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f97102w;

    /* renamed from: x, reason: collision with root package name */
    public Button f97103x;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97093n = new O0(m0.f406844a.b(q.class), new g(), new f(new i()), new h());

    /* renamed from: u, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f97100u = registerForActivityResult(new b.m(), new o(this, 8));

    /* renamed from: v, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97101v = C42727D.c(new d());

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/AutotekaFullscreenChoosingPurchaseActivity$a;", "", "<init>", "()V", "", "KEY_CHOOSING_PURCHASE_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Hf.b, G0> {
        public final void f(@k Hf.b bVar) {
            AutotekaFullscreenChoosingPurchaseActivity autotekaFullscreenChoosingPurchaseActivity = (AutotekaFullscreenChoosingPurchaseActivity) this.receiver;
            l lVar = autotekaFullscreenChoosingPurchaseActivity.f97099t;
            if (lVar == null) {
                lVar = null;
            }
            lVar.a(bVar, autotekaFullscreenChoosingPurchaseActivity, autotekaFullscreenChoosingPurchaseActivity.f97100u, new com.avito.android.autoteka.presentation.choosingPurchase.g(autotekaFullscreenChoosingPurchaseActivity));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Hf.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/c;", "it", "Lkotlin/G0;", "invoke", "(LHf/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Hf.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Hf.c cVar) {
            Hf.c cVar2 = cVar;
            AutotekaFullscreenChoosingPurchaseActivity autotekaFullscreenChoosingPurchaseActivity = AutotekaFullscreenChoosingPurchaseActivity.this;
            com.avito.konveyor.adapter.a aVar = autotekaFullscreenChoosingPurchaseActivity.f97095p;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(Collections.singletonList(cVar2.f7587b)));
            com.avito.konveyor.adapter.j jVar = autotekaFullscreenChoosingPurchaseActivity.f97094o;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
            if (cVar2 instanceof c.b) {
                boolean z12 = ((c.b) cVar2).f7591f.f96694g != null;
                com.avito.android.autoteka.presentation.choosingPurchase.h hVar = new com.avito.android.autoteka.presentation.choosingPurchase.h(autotekaFullscreenChoosingPurchaseActivity);
                LinearLayout linearLayout = autotekaFullscreenChoosingPurchaseActivity.f97102w;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                linearLayout.setVisibility(z12 ? 0 : 8);
                Button button = autotekaFullscreenChoosingPurchaseActivity.f97103x;
                if (button == null) {
                    button = null;
                }
                button.setVisibility(z12 ? 0 : 8);
                if (z12) {
                    Button button2 = autotekaFullscreenChoosingPurchaseActivity.f97103x;
                    (button2 != null ? button2 : null).setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(15, hVar));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            return (RecyclerView) AutotekaFullscreenChoosingPurchaseActivity.this.findViewById(R.id.autoteka_recycler);
        }
    }

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHf/a;", "action", "Lkotlin/G0;", "invoke", "(LHf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC13983a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13983a interfaceC13983a) {
            int i12 = AutotekaFullscreenChoosingPurchaseActivity.f97091y;
            ((q) AutotekaFullscreenChoosingPurchaseActivity.this.f97093n.getValue()).accept(interfaceC13983a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97107l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f97107l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97107l);
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
            return AutotekaFullscreenChoosingPurchaseActivity.this.getF42820b();
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
            return AutotekaFullscreenChoosingPurchaseActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaFullscreenChoosingPurchaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<q> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AutotekaFullscreenChoosingPurchaseActivity.this.f97092m;
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
    public final int M1() {
        return R.layout.autoteka_fullscreen_choosing_product_activity;
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
        com.avito.android.autoteka.di.choosingPurchase.l.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), new e(), (ChoosingPurchaseDetails) parcelableExtra, new C28478k(AutotekaChoosingPurchaseScreen.f90288d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97098s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97098s;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97098s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.konveyor.adapter.j jVar = this.f97094o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) this.f97101v.getValue();
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f97102w = (LinearLayout) findViewById(R.id.buttonContainer);
        this.f97103x = (Button) findViewById(R.id.confirm_button);
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.b(toolbar);
            toolbar.setNavigationOnClickListener(new B(this, 25));
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97098s;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, (q) this.f97093n.getValue(), new b(1, this, AutotekaFullscreenChoosingPurchaseActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f97098s;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}

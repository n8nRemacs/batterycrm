package com.avito.android.autoteka.presentation.report;

import Bf.C13142a;
import Cd.C13243a;
import L91.o;
import Pf.InterfaceC14780a;
import Pf.b;
import Pf.c;
import Y41.l;
import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35766c3;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import z1.AbstractC50339a;

/* compiled from: AutotekaReportActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/AutotekaReportActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaReportActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f97671y = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.presentation.report.f f97672m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97674o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97675p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97676q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f97677r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97678s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public CookieManager f97679t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f97680u;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97673n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.report.e.class), new g(), new f(new i()), new h());

    /* renamed from: v, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97681v = C42727D.c(new j());

    /* renamed from: w, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97682w = C42727D.c(new d());

    /* renamed from: x, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f97683x = registerForActivityResult(new b.m(), new o(this, 10));

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/AutotekaReportActivity$a;", "", "<init>", "()V", "", "KEY_REPORT_DETAILS", "Ljava/lang/String;", "", "REQ_SHARE_REPORT", "I", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<Pf.b, G0> {
        public final void f(@k Pf.b bVar) {
            AutotekaReportActivity autotekaReportActivity = (AutotekaReportActivity) this.receiver;
            int i12 = AutotekaReportActivity.f97671y;
            autotekaReportActivity.getClass();
            if (bVar instanceof b.c) {
                InterfaceC35845m2 interfaceC35845m2 = autotekaReportActivity.f97677r;
                InterfaceC35845m2 interfaceC35845m22 = interfaceC35845m2 != null ? interfaceC35845m2 : null;
                C13142a.C0064a c0064a = ((b.c) bVar).f13217a;
                Intent intentCreateChooser = Intent.createChooser(interfaceC35845m22.f(c0064a.f1583a, c0064a.f1584b.toString()), autotekaReportActivity.getString(R.string.autoteka_share));
                try {
                    C35974x2.d(intentCreateChooser);
                    autotekaReportActivity.startActivityForResult(intentCreateChooser, 3);
                    return;
                } catch (Exception unused) {
                    L5.a(autotekaReportActivity, R.string.autoteka_no_application_installed_to_perform_this_action, 0);
                    return;
                }
            }
            if (bVar instanceof b.C0857b) {
                InterfaceC19542a interfaceC19542a = autotekaReportActivity.f97676q;
                Intent intentA = (interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92691Z);
                intentA.setFlags(603979776);
                autotekaReportActivity.f97683x.b(intentA);
                return;
            }
            if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                C43259k.d(C22981N.a(autotekaReportActivity.getLifecycle()), C43262l0.f411947c, null, new com.avito.android.autoteka.presentation.report.a(autotekaReportActivity, aVar.f13214a, aVar.f13215b, autotekaReportActivity, null), 2);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Pf.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPf/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LPf/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Pf.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Pf.c cVar) {
            Menu menu;
            Pf.c cVar2 = cVar;
            int i12 = AutotekaReportActivity.f97671y;
            AutotekaReportActivity autotekaReportActivity = AutotekaReportActivity.this;
            boolean z12 = cVar2 instanceof c.b ? true : cVar2 instanceof c.C0858c;
            InterfaceC42726C interfaceC42726C = autotekaReportActivity.f97682w;
            InterfaceC42726C interfaceC42726C2 = autotekaReportActivity.f97681v;
            if (z12) {
                Toolbar toolbar = (Toolbar) autotekaReportActivity.findViewById(R.id.toolbar);
                if (toolbar != null && (menu = toolbar.getMenu()) != null) {
                    menu.clear();
                }
                ((RecyclerView) interfaceC42726C.getValue()).setVisibility(0);
                ((WebView) interfaceC42726C2.getValue()).setVisibility(8);
                com.avito.konveyor.adapter.a aVar = autotekaReportActivity.f97675p;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c(new UV0.c(Collections.singletonList(cVar2.f13220b)));
                com.avito.konveyor.adapter.j jVar = autotekaReportActivity.f97674o;
                (jVar != null ? jVar : null).notifyDataSetChanged();
            } else if (cVar2 instanceof c.d) {
                ((RecyclerView) interfaceC42726C.getValue()).setVisibility(8);
                ((WebView) interfaceC42726C2.getValue()).setVisibility(0);
                C13142a c13142a = ((c.d) cVar2).f13224e;
                String str = c13142a.f1580c;
                ((WebView) interfaceC42726C2.getValue()).getSettings().setJavaScriptEnabled(true);
                ((WebView) interfaceC42726C2.getValue()).getSettings().setDomStorageEnabled(true);
                ((WebView) interfaceC42726C2.getValue()).loadUrl(str);
                Toolbar toolbar2 = (Toolbar) autotekaReportActivity.findViewById(R.id.toolbar);
                if (toolbar2 != null) {
                    toolbar2.getMenu().clear();
                    toolbar2.m(R.menu.autoteka_report_menu);
                    if (c13142a.f1581d != null) {
                        MenuItem menuItemFindItem = toolbar2.getMenu().findItem(R.id.menu_share);
                        C35766c3.b(menuItemFindItem, autotekaReportActivity, R.attr.black);
                        menuItemFindItem.setVisible(true);
                    }
                    if (c13142a.f1582e != null) {
                        MenuItem menuItemFindItem2 = toolbar2.getMenu().findItem(R.id.menu_download_pdf);
                        C35766c3.b(menuItemFindItem2, autotekaReportActivity, R.attr.black);
                        menuItemFindItem2.setVisible(true);
                    }
                    com.avito.android.ui.d.b(toolbar2, new Ae0.c(autotekaReportActivity, 26));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            return (RecyclerView) AutotekaReportActivity.this.findViewById(R.id.autoteka_report_recycler);
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPf/a;", "it", "Lkotlin/G0;", "invoke", "(LPf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<InterfaceC14780a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14780a interfaceC14780a) {
            int i12 = AutotekaReportActivity.f97671y;
            ((com.avito.android.autoteka.presentation.report.e) AutotekaReportActivity.this.f97673n.getValue()).accept(interfaceC14780a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97687l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f97687l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97687l);
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
            return AutotekaReportActivity.this.getF42820b();
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
            return AutotekaReportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/report/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.autoteka.presentation.report.e> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.autoteka.presentation.report.e invoke() {
            com.avito.android.autoteka.presentation.report.f fVar = AutotekaReportActivity.this.f97672m;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.autoteka.presentation.report.e) fVar.get();
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/webkit/WebView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<WebView> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final WebView invoke() {
            return (WebView) AutotekaReportActivity.this.findViewById(R.id.autoteka_report_webview);
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_report_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("ReportDetails", ReportDetails.class) : intent.getParcelableExtra("ReportDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("reportDetails cannot be null");
        }
        com.avito.android.autoteka.di.report.h.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), new e(), (ReportDetails) parcelableExtra, new C28478k(AutotekaReportScreen.f97692d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97678s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97678s;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97678s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            P5.d(toolbar);
            toolbar.setNavigationOnClickListener(new B(this, 29));
        }
        com.avito.konveyor.adapter.j jVar = this.f97674o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) this.f97682w.getValue();
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97678s;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, (com.avito.android.autoteka.presentation.report.e) this.f97673n.getValue(), new b(1, this, AutotekaReportActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportOneTimeEvent;)V", 0), new c());
        CookieManager cookieManager = this.f97679t;
        if (cookieManager == null) {
            cookieManager = null;
        }
        cookieManager.setAcceptCookie(true);
        com.avito.android.cookie_provider.e eVar = this.f97680u;
        if (eVar == null) {
            eVar = null;
        }
        for (com.avito.android.cookie_provider.a aVar : eVar.a()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f97678s;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CookieManager cookieManager = this.f97679t;
        if (cookieManager == null) {
            cookieManager = null;
        }
        cookieManager.removeAllCookies(null);
    }
}

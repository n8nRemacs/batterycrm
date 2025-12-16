package com.avito.android.job.cv_info_actualization.ui;

import Cd.C13243a;
import TP.a;
import TP.c;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.job.cv_info_actualization.di.c;
import com.avito.android.job.cv_info_actualization.mvi.mapper.items.c;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35961v3;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: JsxCvInfoActualizationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/JsxCvInfoActualizationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JsxCvInfoActualizationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final a f174193w = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public VP.b f174194m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f174195n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f174196o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public UP.c f174197p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f174198q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Object f174199r = C35961v3.a(this);

    /* renamed from: s, reason: collision with root package name */
    @k
    public final O0 f174200s = new O0(m0.f406844a.b(VP.a.class), new f(), new e(new h()), new g());

    /* renamed from: t, reason: collision with root package name */
    public RecyclerView f174201t;

    /* renamed from: u, reason: collision with root package name */
    public Button f174202u;

    /* renamed from: v, reason: collision with root package name */
    public NavBar f174203v;

    /* compiled from: JsxCvInfoActualizationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/JsxCvInfoActualizationActivity$a;", "", "<init>", "()V", "", "ACTUALIZATION_RESULT_KEY", "Ljava/lang/String;", "", "ITEM_DECORATION_MARGIN_IN_DP", "I", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JsxCvInfoActualizationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<TP.c, G0> {
        @Override // Y41.l
        public final G0 invoke(TP.c cVar) {
            TP.c cVar2 = cVar;
            JsxCvInfoActualizationActivity jsxCvInfoActualizationActivity = (JsxCvInfoActualizationActivity) this.receiver;
            a aVar = JsxCvInfoActualizationActivity.f174193w;
            jsxCvInfoActualizationActivity.getClass();
            if (L.f(cVar2, c.a.f15656a)) {
                jsxCvInfoActualizationActivity.finish();
            } else if (cVar2 instanceof c.b) {
                Intent intent = new Intent();
                intent.putExtra("actualization_result_key", ((c.b) cVar2).f15657a);
                G0 g02 = G0.f406611a;
                jsxCvInfoActualizationActivity.setResult(-1, intent);
                jsxCvInfoActualizationActivity.finish();
            } else if (cVar2 instanceof c.C1072c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = jsxCvInfoActualizationActivity.f174198q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new ToastMessageLink(jsxCvInfoActualizationActivity.getString(R.string.jsx_cv_info_actualization_error_confirm_toast, ((c.C1072c) cVar2).f15658a), ToastMessageLink.ToastType.f133736e, ToastMessageLink.ToastBarPosition.f133725c, null, null, false, null, 120, null), null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsxCvInfoActualizationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<TP.d, G0> {
        @Override // Y41.l
        public final G0 invoke(TP.d dVar) {
            List<TV0.a> listH0;
            com.avito.conveyor_item.a cVar;
            com.avito.conveyor_item.a cVar2;
            SelectStrategy selectStrategy;
            TP.d dVar2 = dVar;
            JsxCvInfoActualizationActivity jsxCvInfoActualizationActivity = (JsxCvInfoActualizationActivity) this.receiver;
            UP.c cVar3 = jsxCvInfoActualizationActivity.f174197p;
            if (cVar3 == null) {
                cVar3 = null;
            }
            cVar3.getClass();
            com.avito.android.job.cv_info_actualization.mvi.domain.a aVar = dVar2.f15659b;
            String str = aVar != null ? aVar.f174128d : null;
            UP.a aVar2 = cVar3.f16372a;
            if (dVar2.f15661d) {
                listH0 = aVar2.f16370a;
            } else if (dVar2.f15660c) {
                listH0 = aVar2.f16371b;
            } else if (aVar != null) {
                List listSingletonList = Collections.singletonList(new com.avito.android.job.cv_info_actualization.ui.items.header.c(aVar.f174125a, aVar.f174126b, null, 4, null));
                ArrayList<com.avito.android.job.cv_info_actualization.mvi.domain.b> arrayList = aVar.f174127c;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (com.avito.android.job.cv_info_actualization.mvi.domain.b bVar : arrayList) {
                    int iOrdinal = bVar.f174129a.ordinal();
                    ArrayList<com.avito.android.job.cv_info_actualization.mvi.domain.d> arrayList3 = bVar.f174134f;
                    com.avito.android.job.cv_info_actualization.mvi.domain.e eVar = bVar.f174130b;
                    List<String> list = bVar.f174135g;
                    String str2 = eVar.f174141a;
                    if (iOrdinal == 0) {
                        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                        for (com.avito.android.job.cv_info_actualization.mvi.domain.d dVar3 : arrayList3) {
                            String str3 = dVar3.f174139a;
                            arrayList4.add(new com.avito.android.job.cv_info_actualization.ui.items.radio.d(str3, dVar3.f174140b, list.contains(str3)));
                        }
                        com.avito.android.job.cv_info_actualization.mvi.domain.c cVar4 = bVar.f174136h;
                        cVar = new com.avito.android.job.cv_info_actualization.ui.items.radio.c(str2, bVar.f174131c, bVar.f174132d, cVar4 != null ? cVar4.f174138b : null, cVar4 != null ? cVar4.f174137a : null, arrayList4, null, 64, null);
                    } else if (iOrdinal == 1) {
                        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList3, 10));
                        for (Iterator it = arrayList3.iterator(); it.hasNext(); it = it) {
                            com.avito.android.job.cv_info_actualization.mvi.domain.d dVar4 = (com.avito.android.job.cv_info_actualization.mvi.domain.d) it.next();
                            String str4 = dVar4.f174139a;
                            arrayList5.add(new com.avito.android.job.cv_info_actualization.ui.items.chips.a(str4, dVar4.f174140b, list.contains(str4)));
                        }
                        int i12 = c.a.f174190a[eVar.f174143c.ordinal()];
                        if (i12 == -1 || i12 == 1) {
                            selectStrategy = SelectStrategy.f178716b;
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            selectStrategy = SelectStrategy.f178717c;
                        }
                        cVar = new com.avito.android.job.cv_info_actualization.ui.items.chips.d(str2, bVar.f174131c, bVar.f174132d, arrayList5, bVar.f174133e, selectStrategy, null, 64, null);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList3, 10));
                        for (com.avito.android.job.cv_info_actualization.mvi.domain.d dVar5 : arrayList3) {
                            String str5 = dVar5.f174139a;
                            arrayList6.add(new com.avito.android.job.cv_info_actualization.ui.items.checkbox.d(str5, dVar5.f174140b, list.contains(str5)));
                        }
                        cVar2 = new com.avito.android.job.cv_info_actualization.ui.items.checkbox.c(str2, bVar.f174131c, bVar.f174132d, arrayList6, null, 16, null);
                        arrayList2.add(cVar2);
                    }
                    cVar2 = cVar;
                    arrayList2.add(cVar2);
                }
                listH0 = C42745f0.h0(arrayList2, listSingletonList);
            } else {
                listH0 = C42784z0.f406748b;
            }
            com.avito.android.job.cv_info_actualization.ui.d dVar6 = new com.avito.android.job.cv_info_actualization.ui.d(dVar2, str, listH0);
            com.avito.konveyor.adapter.d dVar7 = jsxCvInfoActualizationActivity.f174195n;
            if (dVar7 == null) {
                dVar7 = null;
            }
            dVar7.l(listH0, null);
            Button button = jsxCvInfoActualizationActivity.f174202u;
            if (button == null) {
                button = null;
            }
            com.avito.android.lib.design.button.b.a(button, str, false);
            Button button2 = jsxCvInfoActualizationActivity.f174202u;
            if (button2 == null) {
                button2 = null;
            }
            button2.setLoading(dVar2.f15662e);
            Button button3 = jsxCvInfoActualizationActivity.f174202u;
            (button3 != null ? button3 : null).setClickable(dVar6.f174217e);
            return G0.f406611a;
        }
    }

    /* compiled from: JsxCvInfoActualizationActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTP/a$a;", "LX41/o;", "it", "Lkotlin/G0;", "invoke", "(LTP/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<a.AbstractC1070a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(a.AbstractC1070a abstractC1070a) {
            a aVar = JsxCvInfoActualizationActivity.f174193w;
            ((VP.a) JsxCvInfoActualizationActivity.this.f174200s.getValue()).accept(abstractC1070a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f174205l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f174205l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f174205l);
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
            return JsxCvInfoActualizationActivity.this.getF42820b();
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
            return JsxCvInfoActualizationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: JsxCvInfoActualizationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LVP/a;", "kotlin.jvm.PlatformType", "invoke", "()LVP/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<VP.a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final VP.a invoke() {
            VP.b bVar = JsxCvInfoActualizationActivity.this.f174194m;
            if (bVar == null) {
                bVar = null;
            }
            return (VP.a) bVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.jsx_cv_info_actualization;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        c.a aVarA = com.avito.android.job.cv_info_actualization.di.b.a();
        com.avito.android.job.cv_info_actualization.di.d dVar = (com.avito.android.job.cv_info_actualization.di.d) C29972i.a(C29972i.b(this), com.avito.android.job.cv_info_actualization.di.d.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        ?? r32 = this.f174199r;
        aVarA.a(dVar, interfaceC39417aA, ((JsxCvInfoActualizationOpenParams) r32.getValue()).f174210c, s.a(this), new d(), ((JsxCvInfoActualizationOpenParams) r32.getValue()).f174209b).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f174196o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        this.f174201t = (RecyclerView) findViewById(R.id.recycler);
        this.f174203v = (NavBar) findViewById(R.id.cv_info_nav_bar);
        this.f174202u = (Button) findViewById(R.id.action_button);
        RecyclerView recyclerView = this.f174201t;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f174201t;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f174195n;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView2.setAdapter(dVar);
        RecyclerView recyclerView3 = this.f174201t;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.l(new com.avito.android.job.cv_info_actualization.ui.c(), -1);
        NavBar navBar = this.f174203v;
        if (navBar == null) {
            navBar = null;
        }
        navBar.c(R.attr.ic_arrowBack24, new com.avito.android.job.cv_info_actualization.ui.a(this));
        Button button = this.f174202u;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 10));
        ScreenPerformanceTracker screenPerformanceTracker = this.f174196o;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (VP.a) this.f174200s.getValue(), new b(1, this, JsxCvInfoActualizationActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationOneTimeEvent;)V", 0), new c(1, this, JsxCvInfoActualizationActivity.class, "render", "render(Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationState;)V", 0));
    }
}

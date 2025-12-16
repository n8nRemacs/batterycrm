package com.avito.android.loyalty.ui.quality_service;

import Cd.C13243a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.LoyaltyQualityServiceScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.loyalty.di.quality_service.g;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import com.avito.android.loyalty.ui.quality_service.mvi.p;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import mX.InterfaceC44026a;
import pX.AbstractC47027c;
import pX.InterfaceC47025a;
import pX.InterfaceC47026b;
import z1.AbstractC50339a;

/* compiled from: QualityServiceActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/QualityServiceActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityServiceActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f183777s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public q f183778m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f183779n = new O0(m0.f406844a.b(p.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public L f183780o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f183781p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f183782q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183783r;

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/QualityServiceActivity$a;", "", "<init>", "()V", "", "QUALITY_SERVICE_ARGS", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC47026b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47026b interfaceC47026b) {
            InterfaceC47026b interfaceC47026b2 = interfaceC47026b;
            QualityServiceActivity qualityServiceActivity = (QualityServiceActivity) this.receiver;
            int i12 = QualityServiceActivity.f183777s;
            qualityServiceActivity.getClass();
            if (kotlin.jvm.internal.L.f(interfaceC47026b2, InterfaceC47026b.c.f428580a)) {
                L l12 = qualityServiceActivity.f183780o;
                if (l12 == null) {
                    l12 = null;
                }
                qualityServiceActivity.startActivity(L.a.a(l12, null, 3));
                qualityServiceActivity.finish();
            } else if (interfaceC47026b2 instanceof InterfaceC47026b.C12277b) {
                Content content = ((InterfaceC47026b.C12277b) interfaceC47026b2).f428579a.f183815h;
                if (content != null) {
                    EffectDetailsActivity.f183766s.getClass();
                    Intent intent = new Intent(qualityServiceActivity, (Class<?>) EffectDetailsActivity.class);
                    intent.putExtra("content_key", content);
                    qualityServiceActivity.startActivity(intent);
                }
            } else if (interfaceC47026b2 instanceof InterfaceC47026b.d) {
                com.avito.android.lib.util.g.a(new com.avito.android.loyalty.ui.quality_service.d(qualityServiceActivity, ((InterfaceC47026b.d) interfaceC47026b2).f428581a));
            } else if (interfaceC47026b2 instanceof InterfaceC47026b.a) {
                qualityServiceActivity.a2().accept(new InterfaceC47025a.d(((InterfaceC47026b.a) interfaceC47026b2).f428578a));
            } else if (interfaceC47026b2 instanceof InterfaceC47026b.e) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = qualityServiceActivity.f183783r;
                com.avito.android.lib.util.g.a(new com.avito.android.loyalty.ui.quality_service.a(qualityServiceActivity, aVar != null ? aVar : null, ((InterfaceC47026b.e) interfaceC47026b2).f428582a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<AbstractC47027c, G0> {
        public final void f(@Y61.k AbstractC47027c abstractC47027c) {
            m mVar = (m) this.receiver;
            mVar.getClass();
            boolean z12 = abstractC47027c instanceof AbstractC47027c.C12278c;
            C42670a c42670a = mVar.f183973e;
            Button button = mVar.f183974f;
            if (z12) {
                com.avito.android.loyalty.ui.quality_service.mvi.p pVar = ((AbstractC47027c.C12278c) abstractC47027c).f428585b;
                mVar.f183970b.l(pVar.f184024b, null);
                p.a aVar = pVar.f184023a;
                button.setText(aVar.f184027a.k0(mVar.f183969a.getContext()));
                button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(10, mVar, aVar));
                D6.H(button);
                c42670a.b();
                return;
            }
            if (abstractC47027c.equals(AbstractC47027c.d.f428586b)) {
                D6.w(button);
                C42670a.d(c42670a);
            } else if (abstractC47027c.equals(AbstractC47027c.a.f428583b)) {
                D6.w(button);
                c42670a.c(null, o.f184030l);
            } else if (abstractC47027c.equals(AbstractC47027c.b.f428584b)) {
                D6.w(button);
                c42670a.c(null, n.f184029l);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AbstractC47027c abstractC47027c) {
            f(abstractC47027c);
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC47025a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47025a interfaceC47025a) {
            ((p) this.receiver).accept(interfaceC47025a);
            return G0.f406611a;
        }
    }

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((QualityServiceActivity) this.receiver).onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f183784l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f183784l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f183784l);
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
            return QualityServiceActivity.this.getF42820b();
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
            return QualityServiceActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: QualityServiceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/loyalty/ui/quality_service/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<p> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = QualityServiceActivity.this.f183778m;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_quality_service;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.avito.android.loyalty.ui.quality_service.f] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.avito.android.loyalty.ui.quality_service.g] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        g.a aVarA = com.avito.android.loyalty.di.quality_service.c.a();
        C28478k c28478k = new C28478k(LoyaltyQualityServiceScreen.f90403d, s.a(this), "loyalty-qualityService");
        com.avito.android.loyalty.di.quality_service.h hVar = (com.avito.android.loyalty.di.quality_service.h) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.quality_service.h.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Intent intent = getIntent();
        aVarA.a(c28478k, (QualityServiceArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("QUALITY_SERVICE_ARGS", QualityServiceArgs.class) : intent.getParcelableExtra("QUALITY_SERVICE_ARGS")), new com.avito.android.cpt.pre_activation.ui.c(this, 21), new InterfaceC44026a() { // from class: com.avito.android.loyalty.ui.quality_service.f
            @Override // mX.InterfaceC44026a
            public final void a(com.avito.conveyor_item.a aVar) {
                int i12 = QualityServiceActivity.f183777s;
                this.f183804a.a2().accept(new InterfaceC47025a.c(aVar));
            }
        }, new com.avito.android.loyalty.ui.quality_service.items.grade_info.a() { // from class: com.avito.android.loyalty.ui.quality_service.g
            @Override // com.avito.android.loyalty.ui.quality_service.items.grade_info.a
            public final void a(com.avito.android.loyalty.ui.quality_service.items.grade_info.b bVar) {
                int i12 = QualityServiceActivity.f183777s;
                Content content = bVar.f183897n;
                if (content != null) {
                    this.f183805a.a2().accept(new InterfaceC47025a.e(content));
                }
            }
        }, hVar, interfaceC39417aA).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183781p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final p a2() {
        return (p) this.f183779n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183781p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewFindViewById = findViewById(android.R.id.content);
        com.avito.konveyor.adapter.d dVar = this.f183782q;
        m mVar = new m(viewFindViewById, dVar != null ? dVar : null, new d(1, a2(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0), new e(0, this, QualityServiceActivity.class, "onBackPressed", "onBackPressed()V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f183781p;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, a2(), new b(1, this, QualityServiceActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceOneTimeEvent;)V", 0), new c(1, mVar, m.class, "render", "render(Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f183781p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}

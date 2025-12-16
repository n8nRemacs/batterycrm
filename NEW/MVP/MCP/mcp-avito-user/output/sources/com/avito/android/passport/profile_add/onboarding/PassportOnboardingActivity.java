package com.avito.android.passport.profile_add.onboarding;

import Cd.C13243a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.passport.profile_add.onboarding.PassportOnboardingActivity;
import com.avito.android.passport.profile_add.onboarding.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import dagger.internal.t;
import dagger.internal.u;
import h60.InterfaceC40776a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: PassportOnboardingActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/PassportOnboardingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportOnboardingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final a f213545v = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f213546m;

    /* renamed from: n, reason: collision with root package name */
    public p f213547n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f213548o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f213549p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public u f213550q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final O0 f213551r = new O0(m0.f406844a.b(q.class), new c(), new b(new e()), new d());

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213552s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public r60.d f213553t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Boolean f213554u;

    /* compiled from: PassportOnboardingActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/PassportOnboardingActivity$a;", "", "<init>", "()V", "", "EXTRA_PRO_ONBOARDING", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f213555l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f213555l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f213555l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return PassportOnboardingActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return PassportOnboardingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PassportOnboardingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/onboarding/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<q> {
        public e() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final q invoke() {
            u uVar = PassportOnboardingActivity.this.f213550q;
            if (uVar == null) {
                uVar = null;
            }
            return (q) uVar.get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c(cv.c.a(this), (l) C29972i.a(C29972i.b(this), l.class), s.a(this), null);
        com.avito.android.deeplink_handler.handler.composite.a aVarU4 = cVar.f213559a.u4();
        t.c(aVarU4);
        this.f213548o = aVarU4;
        l lVar = cVar.f213560b;
        InterfaceC28373a interfaceC28373aA = lVar.a();
        t.c(interfaceC28373aA);
        this.f213549p = interfaceC28373aA;
        this.f213550q = cVar.f213565g;
        this.f213552s = cVar.f213564f.get();
        this.f213553t = lVar.X1();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213552s;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final String a2() {
        return L.f(this.f213554u, Boolean.TRUE) ? "avitoid.pro_profile_on_merge" : "avitoid.plus_onboarding";
    }

    public final q b2() {
        return (q) this.f213551r.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        int i12 = 0;
        this.f213554u = Boolean.valueOf(getIntent().getBooleanExtra("passport.onboarding.is_pro", false));
        Object[] objArr = 0;
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f213549p;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            String strA2 = a2();
            r60.d dVar = this.f213553t;
            if (dVar == null) {
                dVar = null;
            }
            interfaceC28373a.c(new H50.d(strA2, dVar.getHash()));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f213552s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        this.f213547n = new p(getLayoutInflater().inflate(R.layout.passport_onboarding_dialog, (ViewGroup) null));
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(this, i12, 2, objArr == true ? 1 : 0);
        p pVar = this.f213547n;
        if (pVar == null) {
            pVar = null;
        }
        dVar2.G(pVar.f213603a, true);
        dVar2.setCancelable(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 7);
        dVar2.setCanceledOnTouchOutside(true);
        dVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.avito.android.passport.profile_add.onboarding.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PassportOnboardingActivity passportOnboardingActivity = this.f213568a;
                ScreenPerformanceTracker screenPerformanceTracker2 = passportOnboardingActivity.f213552s;
                if (screenPerformanceTracker2 == null) {
                    screenPerformanceTracker2 = null;
                }
                screenPerformanceTracker2.d();
                ScreenPerformanceTracker screenPerformanceTracker3 = passportOnboardingActivity.f213552s;
                com.avito.android.analytics.screens.mvi.a.c(passportOnboardingActivity, screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null, passportOnboardingActivity.b2(), new g(1, passportOnboardingActivity, PassportOnboardingActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingOneTimeEvent;)V", 0), h.f213573l);
            }
        });
        dVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.passport.profile_add.onboarding.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PassportOnboardingActivity.a aVar = PassportOnboardingActivity.f213545v;
                this.f213569b.b2().accept(InterfaceC40776a.C11242a.f396997a);
            }
        });
        p pVar2 = this.f213547n;
        if (pVar2 == null) {
            pVar2 = null;
        }
        boolean zF2 = L.f(this.f213554u, Boolean.TRUE);
        pVar2.getClass();
        p.a(pVar2.f213604b, Integer.valueOf(zF2 ? R.string.passport_merge_pro_convert_title : R.string.passport_merge_onboarding_title));
        p.a(pVar2.f213606d, zF2 ? null : Integer.valueOf(R.string.passport_merge_onboarding_subtitle));
        p.a(pVar2.f213607e, zF2 ? null : Integer.valueOf(R.string.passport_merge_onboarding_list_1_title));
        p.a(pVar2.f213608f, zF2 ? null : Integer.valueOf(R.string.passport_merge_onboarding_list_2_title));
        p.a(pVar2.f213609g, zF2 ? null : Integer.valueOf(R.string.passport_merge_onboarding_list_3_title));
        pVar2.f213610h.setText(zF2 ? R.string.passport_merge_pro_convert_list_1_subtitle : R.string.passport_merge_onboarding_list_1_subtitle);
        pVar2.f213611i.setText(zF2 ? R.string.passport_merge_pro_convert_list_2_subtitle : R.string.passport_merge_onboarding_list_2_subtitle);
        pVar2.f213612j.setText(zF2 ? R.string.passport_merge_pro_convert_list_3_subtitle : R.string.passport_merge_onboarding_list_3_subtitle);
        FV.a aVar = FV.a.f4720a;
        int i13 = R.attr.textIconDone;
        int i14 = zF2 ? R.attr.textIconPersons : R.attr.textIconDone;
        aVar.getClass();
        FV.a.c(pVar2.f213613k, i14);
        FV.a.c(pVar2.f213614l, zF2 ? R.attr.textIconBrush : R.attr.textIconDone);
        if (zF2) {
            i13 = R.attr.textIconChart;
        }
        FV.a.c(pVar2.f213615m, i13);
        D6.G(pVar2.f213616n, zF2);
        boolean z12 = !zF2;
        D6.G(pVar2.f213617o, z12);
        D6.G(pVar2.f213618p, z12);
        p pVar3 = this.f213547n;
        if (pVar3 == null) {
            pVar3 = null;
        }
        final com.avito.android.passport.profile_add.onboarding.d dVar3 = new com.avito.android.passport.profile_add.onboarding.d(this);
        pVar3.getClass();
        final int i15 = 2;
        pVar3.f213605c.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.passport.profile_add.onboarding.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        dVar3.invoke();
                        break;
                    case 1:
                        dVar3.invoke();
                        break;
                    default:
                        dVar3.invoke();
                        break;
                }
            }
        });
        p pVar4 = this.f213547n;
        if (pVar4 == null) {
            pVar4 = null;
        }
        final com.avito.android.passport.profile_add.onboarding.e eVar = new com.avito.android.passport.profile_add.onboarding.e(this);
        pVar4.getClass();
        final int i16 = 0;
        pVar4.f213617o.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.passport.profile_add.onboarding.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        eVar.invoke();
                        break;
                    case 1:
                        eVar.invoke();
                        break;
                    default:
                        eVar.invoke();
                        break;
                }
            }
        });
        p pVar5 = this.f213547n;
        p pVar6 = pVar5 != null ? pVar5 : null;
        final f fVar = new f(this);
        pVar6.getClass();
        final int i17 = 1;
        pVar6.f213618p.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.passport.profile_add.onboarding.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        fVar.invoke();
                        break;
                    case 1:
                        fVar.invoke();
                        break;
                    default:
                        fVar.invoke();
                        break;
                }
            }
        });
        dVar2.S(C35835l0.g(dVar2.getContext()).y);
        com.avito.android.lib.util.g.a(dVar2);
        this.f213546m = dVar2;
    }
}

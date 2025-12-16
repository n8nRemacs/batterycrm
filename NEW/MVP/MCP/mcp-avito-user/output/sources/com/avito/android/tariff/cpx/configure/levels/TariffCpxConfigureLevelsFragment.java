package com.avito.android.tariff.cpx.configure.levels;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.cpx.configure.levels.TariffCpxConfigureLevelsFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import rB0.C47521a;
import sB0.C48023a;
import sB0.c;
import sB0.d;
import v50.C49166b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: TariffCpxConfigureLevelsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/TariffCpxConfigureLevelsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxConfigureLevelsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f296048E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f296049F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296050A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296051B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47312b f296052C0;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public C49899a f296053D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.configure.levels.j f296054n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f296055o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f296056p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f296057q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f296058r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f296059s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f296060t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f296061u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296062v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296063w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296064x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296065y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f296066z0;

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/TariffCpxConfigureLevelsFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<sB0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(sB0.d dVar) {
            d.c cVar;
            DeepLink deepLink;
            sB0.d dVar2 = dVar;
            TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment = (TariffCpxConfigureLevelsFragment) this.receiver;
            a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
            tariffCpxConfigureLevelsFragment.getClass();
            if (dVar2 instanceof d.a) {
                ActivityC22955m activityC22955mL1 = tariffCpxConfigureLevelsFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else {
                if (dVar2 instanceof d.b) {
                    DeepLink deepLink2 = ((d.b) dVar2).f437519a;
                    if (deepLink2 != null) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = tariffCpxConfigureLevelsFragment.f296059s0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, deepLink2, null, null, 6);
                    }
                } else if ((dVar2 instanceof d.c) && (deepLink = (cVar = (d.c) dVar2).f437520a) != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = tariffCpxConfigureLevelsFragment.f296059s0;
                    (aVar3 != null ? aVar3 : null).r6(cVar.f437521b, deepLink, "cpx_configure_levels_request_key");
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsB0/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LsB0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<sB0.e, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(sB0.e eVar) throws Resources.NotFoundException {
            DeepLink deeplink;
            String style;
            sB0.b bVar;
            CharSequence charSequenceC;
            Float f12;
            int i12 = 0;
            sB0.e eVar2 = eVar;
            a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
            TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment = TariffCpxConfigureLevelsFragment.this;
            com.avito.android.tariff.cpx.configure.levels.e eVar3 = new com.avito.android.tariff.cpx.configure.levels.e(1, tariffCpxConfigureLevelsFragment.t5(), com.avito.android.tariff.cpx.configure.levels.i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            C47313c c47313c = tariffCpxConfigureLevelsFragment.f296064x0;
            n<Object>[] nVarArr = TariffCpxConfigureLevelsFragment.f296049F0;
            n<Object> nVar = nVarArr[2];
            ProgressBar progressBar = (ProgressBar) c47313c.a();
            C48023a c48023a = eVar2.f437530h;
            progressBar.setVisibility((c48023a != null ? c48023a.f437507a : null) != null ? 0 : 8);
            if (c48023a != null && (f12 = c48023a.f437507a) != null) {
                float fFloatValue = f12.floatValue();
                n<Object> nVar2 = nVarArr[2];
                ((ProgressBar) c47313c.a()).setProgress(fFloatValue);
            }
            if (c48023a != null && (bVar = c48023a.f437508b) != null) {
                Context context = tariffCpxConfigureLevelsFragment.getContext();
                if (context != null) {
                    com.avito.android.util.text.a aVar2 = tariffCpxConfigureLevelsFragment.f296061u0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    charSequenceC = aVar2.c(context, bVar.f437509a);
                } else {
                    charSequenceC = null;
                }
                C47313c c47313c2 = tariffCpxConfigureLevelsFragment.f296063w0;
                n<Object> nVar3 = nVarArr[1];
                com.avito.android.lib.design.button.b.a((Button) c47313c2.a(), charSequenceC, false);
                n<Object> nVar4 = nVarArr[1];
                ((Button) c47313c2.a()).setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(i12, eVar3, bVar));
            }
            Button buttonQ5 = tariffCpxConfigureLevelsFragment.q5();
            ButtonAction buttonAction = eVar2.f437525c;
            com.avito.android.lib.design.button.b.a(buttonQ5, buttonAction != null ? buttonAction.getTitle() : null, false);
            tariffCpxConfigureLevelsFragment.q5().setLoading(eVar2.f437526d);
            if (buttonAction != null && (style = buttonAction.getStyle()) != null) {
                int iD2 = com.avito.android.lib.util.f.d(style);
                Context context2 = tariffCpxConfigureLevelsFragment.getContext();
                if (context2 != null) {
                    tariffCpxConfigureLevelsFragment.q5().setAppearance(C35835l0.j(iD2, context2));
                }
            }
            if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null) {
                tariffCpxConfigureLevelsFragment.q5().setOnClickListener(new XA0.c(eVar3, deeplink, 9));
            }
            com.avito.konveyor.adapter.d dVar = tariffCpxConfigureLevelsFragment.f296057q0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(eVar2.f437524b, null);
            C47313c c47313c3 = tariffCpxConfigureLevelsFragment.f296050A0;
            C47313c c47313c4 = tariffCpxConfigureLevelsFragment.f296051B0;
            ApiError apiError = eVar2.f437528f;
            if (apiError != null) {
                D6.w(tariffCpxConfigureLevelsFragment.s5());
                D6.w(tariffCpxConfigureLevelsFragment.r5());
                n<Object> nVar5 = nVarArr[6];
                D6.w((View) c47313c4.a());
                n<Object> nVar6 = nVarArr[5];
                ((xZ.e) c47313c3.a()).d(z.k(apiError));
            } else if (eVar2.f437529g) {
                D6.w(tariffCpxConfigureLevelsFragment.s5());
                D6.w(tariffCpxConfigureLevelsFragment.r5());
                n<Object> nVar7 = nVarArr[6];
                D6.H((View) c47313c4.a());
                n<Object> nVar8 = nVarArr[5];
                ((xZ.e) c47313c3.a()).c();
            } else {
                D6.H(tariffCpxConfigureLevelsFragment.s5());
                D6.H(tariffCpxConfigureLevelsFragment.r5());
                n<Object> nVar9 = nVarArr[6];
                D6.w((View) c47313c4.a());
                n<Object> nVar10 = nVarArr[5];
                ((xZ.e) c47313c3.a()).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
            TariffCpxConfigureLevelsFragment.this.t5().accept(new c.b(deepLink, null, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "levelCardId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<DeepLink, Long, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, Long l12) {
            long jLongValue = l12.longValue();
            a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
            TariffCpxConfigureLevelsFragment.this.t5().accept(new c.b(deepLink, C22777e.b(new Q("cpx_configure_levels_level_card_id", Long.valueOf(jLongValue)))));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f296070l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f296070l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f296070l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TariffCpxConfigureLevelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f296072l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f296072l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f296072l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296073l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296073l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f296073l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f296074l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f296074l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f296074l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/configure/levels/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff.cpx.configure.levels.i> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.configure.levels.i invoke() {
            com.avito.android.tariff.cpx.configure.levels.j jVar = TariffCpxConfigureLevelsFragment.this.f296054n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.tariff.cpx.configure.levels.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(TariffCpxConfigureLevelsFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f296049F0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "toolbarButton", "getToolbarButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "toolbarProgressBar", "getToolbarProgressBar()Lcom/avito/android/lib/design/progress_bar/ProgressBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/mnz_common/ui/MnzProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "shimmer", "getShimmer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TariffCpxConfigureLevelsFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f296048E0 = new a(null);
    }

    public TariffCpxConfigureLevelsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f296055o0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.configure.levels.i.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f296062v0 = new C47313c(null, 1, null);
        this.f296063w0 = new C47313c(null, 1, null);
        this.f296064x0 = new C47313c(null, 1, null);
        this.f296065y0 = new C47313c(null, 1, null);
        this.f296066z0 = new C47313c(null, 1, null);
        this.f296050A0 = new C47313c(null, 1, null);
        this.f296051B0 = new C47313c(null, 1, null);
        this.f296052C0 = new C47312b(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 14);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f296056p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.tariff_cpx_configure_levels_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tariff_cpx_configure_levels_recycler_view);
        n<Object>[] nVarArr = f296049F0;
        n<Object> nVar = nVarArr[7];
        this.f296052C0.b(this, recyclerView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.tariff_cpx_configure_levels_toolbar);
        C47313c c47313c = this.f296062v0;
        n<Object> nVar2 = nVarArr[0];
        c47313c.b(this, toolbar);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.tariff_cpx_configure_levels_progress_bar);
        C47313c c47313c2 = this.f296064x0;
        n<Object> nVar3 = nVarArr[2];
        c47313c2.b(this, progressBar);
        Button button = (Button) view.findViewById(R.id.tariff_cpx_configure_levels_help_button);
        C47313c c47313c3 = this.f296063w0;
        n<Object> nVar4 = nVarArr[1];
        c47313c3.b(this, button);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tariff_cpx_configure_levels_button_container);
        C47313c c47313c4 = this.f296065y0;
        n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, viewGroup);
        Button button2 = (Button) view.findViewById(R.id.tariff_cpx_configure_levels_button);
        C47313c c47313c5 = this.f296066z0;
        n<Object> nVar6 = nVarArr[4];
        c47313c5.b(this, button2);
        View viewFindViewById = view.findViewById(R.id.tariff_cpx_configure_levels_shimmer_layout);
        C47313c c47313c6 = this.f296051B0;
        n<Object> nVar7 = nVarArr[6];
        c47313c6.b(this, viewFindViewById);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.tariff_cpx_configure_levels_content_container);
        final int i12 = 0;
        xZ.e eVar = new xZ.e(viewGroup2, new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.levels.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCpxConfigureLevelsFragment f296077c;

            {
                this.f296077c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment = this.f296077c;
                switch (i12) {
                    case 0:
                        TariffCpxConfigureLevelsFragment.a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
                        tariffCpxConfigureLevelsFragment.t5().accept(c.e.f437517a);
                        break;
                    default:
                        TariffCpxConfigureLevelsFragment.a aVar2 = TariffCpxConfigureLevelsFragment.f296048E0;
                        tariffCpxConfigureLevelsFragment.t5().accept(c.a.f437511a);
                        break;
                }
            }
        }, null, 4, null);
        C47313c c47313c7 = this.f296050A0;
        n<Object> nVar8 = nVarArr[5];
        c47313c7.b(this, eVar);
        n<Object> nVar9 = nVarArr[0];
        Toolbar toolbar2 = (Toolbar) c47313c.a();
        final int i13 = 1;
        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.levels.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TariffCpxConfigureLevelsFragment f296077c;

            {
                this.f296077c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment = this.f296077c;
                switch (i13) {
                    case 0:
                        TariffCpxConfigureLevelsFragment.a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
                        tariffCpxConfigureLevelsFragment.t5().accept(c.e.f437517a);
                        break;
                    default:
                        TariffCpxConfigureLevelsFragment.a aVar2 = TariffCpxConfigureLevelsFragment.f296048E0;
                        tariffCpxConfigureLevelsFragment.t5().accept(c.a.f437511a);
                        break;
                }
            }
        });
        RecyclerView recyclerViewS5 = s5();
        com.avito.konveyor.adapter.d dVar = this.f296057q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewS5.setAdapter(dVar);
        s5().l(new C47521a(), -1);
        r5().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 18));
        ScreenPerformanceTracker screenPerformanceTracker = this.f296056p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, t5(), new b(1, this, TariffCpxConfigureLevelsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f296056p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("remote_context");
        if (string == null) {
            throw new IllegalArgumentException("remote_context param must not be null");
        }
        com.avito.android.tariff.cpx.configure.levels.di.a.a().a(s.c(this), (WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), string, new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f296056p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f296059s0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final Button q5() {
        C47313c c47313c = this.f296066z0;
        n<Object> nVar = f296049F0[4];
        return (Button) c47313c.a();
    }

    public final ViewGroup r5() {
        C47313c c47313c = this.f296065y0;
        n<Object> nVar = f296049F0[3];
        return (ViewGroup) c47313c.a();
    }

    public final RecyclerView s5() {
        n<Object> nVar = f296049F0[7];
        return (RecyclerView) this.f296052C0.a();
    }

    public final com.avito.android.tariff.cpx.configure.levels.i t5() {
        return (com.avito.android.tariff.cpx.configure.levels.i) this.f296055o0.getValue();
    }
}

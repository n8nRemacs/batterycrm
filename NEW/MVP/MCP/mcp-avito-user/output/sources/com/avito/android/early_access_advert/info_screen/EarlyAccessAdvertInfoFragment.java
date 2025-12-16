package com.avito.android.early_access_advert.info_screen;

import Cd.C13243a;
import Vx.InterfaceC15724a;
import Vx.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EarlyAccessAdvertInfoScreen;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.early_access_advert.info_screen.EarlyAccessAdvertInfoFragment;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeature;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: EarlyAccessAdvertInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/EarlyAccessAdvertInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessAdvertInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.early_access_advert.info_screen.e f145705n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f145706o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f145707p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f145708q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final C47313c f145709r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f145704t0 = {m0.f406844a.e(new Y(EarlyAccessAdvertInfoFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/early_access_advert/info_screen/EarlyAccessAdvertInfoViewHolder;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f145703s0 = new a(null);

    /* compiled from: EarlyAccessAdvertInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/EarlyAccessAdvertInfoFragment$a;", "", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EarlyAccessAdvertInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements l<Vx.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Vx.b bVar) {
            Vx.b bVar2 = bVar;
            EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment = (EarlyAccessAdvertInfoFragment) this.receiver;
            a aVar = EarlyAccessAdvertInfoFragment.f145703s0;
            earlyAccessAdvertInfoFragment.getClass();
            if (!(bVar2 instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            com.avito.android.early_access_advert.h hVar = (com.avito.android.early_access_advert.h) earlyAccessAdvertInfoFragment.f145708q0.getValue();
            if (hVar != null) {
                b.a aVar2 = (b.a) bVar2;
                hVar.p8(aVar2.f17518a, aVar2.f17519b);
                G0 g02 = G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessAdvertInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVx/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVx/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Vx.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Vx.c cVar) {
            a aVar = EarlyAccessAdvertInfoFragment.f145703s0;
            EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment = EarlyAccessAdvertInfoFragment.this;
            com.avito.android.early_access_advert.info_screen.c cVarQ5 = earlyAccessAdvertInfoFragment.q5();
            Vx.d dVar = cVar.f17523c;
            I5.a(cVarQ5.f145720a, dVar.f17524a, false);
            com.avito.android.lib.design.button.b.a(cVarQ5.f145722c, dVar.f17526c, false);
            com.avito.android.lib.design.button.b.a(cVarQ5.f145723d, dVar.f17527d, false);
            I5.a(cVarQ5.f145724e, dVar.f17528e, false);
            LinearLayout linearLayout = cVarQ5.f145721b;
            linearLayout.removeAllViews();
            List<EarlyAccessFeature> list = dVar.f17525b;
            if (list != null) {
                for (EarlyAccessFeature earlyAccessFeature : list) {
                    View viewInflate = LayoutInflater.from(earlyAccessAdvertInfoFragment.getContext()).inflate(R.layout.early_access_advert_feature_item, (ViewGroup) null);
                    View viewFindViewById = viewInflate.findViewById(R.id.title);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView = (TextView) viewFindViewById;
                    View viewFindViewById2 = viewInflate.findViewById(R.id.subtitle);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView2 = (TextView) viewFindViewById2;
                    View viewFindViewById3 = viewInflate.findViewById(R.id.text_icon);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView3 = (TextView) viewFindViewById3;
                    FV.a aVar2 = FV.a.f4720a;
                    String icon = earlyAccessFeature.getIcon();
                    Integer numM = icon != null ? com.avito.android.lib.util.f.m(icon) : null;
                    aVar2.getClass();
                    if (numM == null) {
                        D6.g(textView3);
                    } else {
                        D6.H(textView3);
                        FV.a.c(textView3, numM.intValue());
                    }
                    I5.a(textView, earlyAccessFeature.getTitle(), false);
                    I5.a(textView2, earlyAccessFeature.getSubtitle(), false);
                    linearLayout.addView(viewInflate);
                }
                G0 g02 = G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessAdvertInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/h;", "invoke", "()Lcom/avito/android/early_access_advert/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.early_access_advert.h> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.early_access_advert.h invoke() {
            InterfaceC23487e parentFragment = EarlyAccessAdvertInfoFragment.this.getParentFragment();
            if (parentFragment instanceof com.avito.android.early_access_advert.h) {
                return (com.avito.android.early_access_advert.h) parentFragment;
            }
            return null;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f145712l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f145712l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f145712l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EarlyAccessAdvertInfoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f145714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f145714l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f145714l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145715l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145715l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f145715l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145716l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145716l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f145716l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EarlyAccessAdvertInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/early_access_advert/info_screen/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.early_access_advert.info_screen.d> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.early_access_advert.info_screen.d invoke() {
            com.avito.android.early_access_advert.info_screen.e eVar = EarlyAccessAdvertInfoFragment.this.f145705n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.early_access_advert.info_screen.d) eVar.get();
        }
    }

    public EarlyAccessAdvertInfoFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f145706o0 = new O0(m0.f406844a.b(com.avito.android.early_access_advert.info_screen.d.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f145708q0 = C42727D.c(new d());
        this.f145709r0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final Context m5(@k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f145707p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.early_access_advert_info_fragment, viewGroup, false);
        com.avito.android.early_access_advert.info_screen.c cVar = new com.avito.android.early_access_advert.info_screen.c(viewInflate);
        C47313c c47313c = this.f145709r0;
        n<Object> nVar = f145704t0[0];
        c47313c.b(this, cVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f145707p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.early_access_advert.info_screen.d) this.f145706o0.getValue(), new b(1, this, EarlyAccessAdvertInfoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoOneTimeEvent;)Lkotlin/Unit;", 8), new c());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145707p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.early_access_advert.info_screen.c cVarQ5 = q5();
        final int i12 = 0;
        cVarQ5.f145722c.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.early_access_advert.info_screen.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EarlyAccessAdvertInfoFragment f145719c;

            {
                this.f145719c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment = this.f145719c;
                switch (i12) {
                    case 0:
                        EarlyAccessAdvertInfoFragment.a aVar = EarlyAccessAdvertInfoFragment.f145703s0;
                        ((d) earlyAccessAdvertInfoFragment.f145706o0.getValue()).accept(InterfaceC15724a.C1217a.f17516a);
                        break;
                    default:
                        EarlyAccessAdvertInfoFragment.a aVar2 = EarlyAccessAdvertInfoFragment.f145703s0;
                        ((d) earlyAccessAdvertInfoFragment.f145706o0.getValue()).accept(InterfaceC15724a.b.f17517a);
                        break;
                }
            }
        });
        com.avito.android.early_access_advert.info_screen.c cVarQ52 = q5();
        final int i13 = 1;
        cVarQ52.f145723d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.early_access_advert.info_screen.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EarlyAccessAdvertInfoFragment f145719c;

            {
                this.f145719c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment = this.f145719c;
                switch (i13) {
                    case 0:
                        EarlyAccessAdvertInfoFragment.a aVar = EarlyAccessAdvertInfoFragment.f145703s0;
                        ((d) earlyAccessAdvertInfoFragment.f145706o0.getValue()).accept(InterfaceC15724a.C1217a.f17516a);
                        break;
                    default:
                        EarlyAccessAdvertInfoFragment.a aVar2 = EarlyAccessAdvertInfoFragment.f145703s0;
                        ((d) earlyAccessAdvertInfoFragment.f145706o0.getValue()).accept(InterfaceC15724a.b.f17517a);
                        break;
                }
            }
        });
        com.avito.android.early_access_advert.info_screen.c cVarQ53 = q5();
        cVarQ53.f145725f.setBackground(new com.avito.android.lib.design.gradient.a(requireContext(), new a.C5276a.C5277a(requireContext(), R.attr.gradientRadialBottomLeftRedBlue, 0, 4, null).a()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.early_access_advert.di.c.a().a((com.avito.android.early_access_advert.di.e) C29972i.a(C29972i.b(this), com.avito.android.early_access_advert.di.e.class), new C28478k(EarlyAccessAdvertInfoScreen.f90346d, s.c(this), null, 4, null), (EarlyAccessAdvert) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("early_access_advert_key", EarlyAccessAdvert.class) : bundleRequireArguments.getParcelable("early_access_advert_key"))).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145707p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.early_access_advert.info_screen.c q5() {
        C47313c c47313c = this.f145709r0;
        n<Object> nVar = f145704t0[0];
        return (com.avito.android.early_access_advert.info_screen.c) c47313c.a();
    }
}

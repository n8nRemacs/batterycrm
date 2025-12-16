package com.avito.android.bbl.screens.configure.v2;

import Ah.InterfaceC13032a;
import Ah.InterfaceC13033b;
import Cd.C13243a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import nh.InterfaceC44423b;
import qK0.C47313c;
import v50.C49166b;
import wZ.C49577a;
import z1.AbstractC50339a;

/* compiled from: BblConfigureV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/BblConfigureV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BblConfigureV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f99264C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f99265D0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99266A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99267B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f99268n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f99269o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f99270p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f99271q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f99272r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f99273s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f99274t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99275u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99276v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99277w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99278x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99279y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99280z0;

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/BblConfigureV2Fragment$a;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BblConfigureV2Fragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment$a$a, reason: collision with other inner class name */
        public static final class C2990a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f99281l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2990a(String str) {
                super(1);
                this.f99281l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("checkoutContext", this.f99281l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BblConfigureV2Fragment a(@Y61.k String str) {
            BblConfigureV2Fragment bblConfigureV2Fragment = new BblConfigureV2Fragment();
            C35966w1.a(bblConfigureV2Fragment, -1, new C2990a(str));
            return bblConfigureV2Fragment;
        }

        public a() {
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = BblConfigureV2Fragment.this.f99270p0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bbl/screens/configure/v2/BblConfigureV2Fragment$c", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.deeplink_handler.view.impl.k {
        public c(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = BblConfigureV2Fragment.this.getView();
            ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(R.id.bbl_configure_fragment) : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC13033b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13033b interfaceC13033b) {
            InterfaceC13033b interfaceC13033b2 = interfaceC13033b;
            BblConfigureV2Fragment bblConfigureV2Fragment = (BblConfigureV2Fragment) this.receiver;
            a aVar = BblConfigureV2Fragment.f99264C0;
            bblConfigureV2Fragment.getClass();
            if (interfaceC13033b2 instanceof InterfaceC13033b.a) {
                ActivityC22955m activityC22955mL1 = bblConfigureV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC13033b2 instanceof InterfaceC13033b.C0022b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = bblConfigureV2Fragment.f99274t0;
                Bundle bundle = null;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC13033b.C0022b c0022b = (InterfaceC13033b.C0022b) interfaceC13033b2;
                Long l12 = c0022b.f568b;
                String str = l12 != null ? "key_bbl_configure_config_id" : null;
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("key_bbl_configure_config_id", jLongValue);
                    Integer num = c0022b.f569c;
                    if (num != null) {
                        bundle2.putInt("kty_bbl_configure_save_button_id", num.intValue());
                    }
                    bundle = bundle2;
                }
                aVar2.r6(bundle, c0022b.f567a, str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Ah.c, G0> {
        public final void f(@Y61.k Ah.c cVar) {
            C49577a c49577a;
            Context context;
            Float f12;
            Button button;
            BblConfigureV2Fragment bblConfigureV2Fragment = (BblConfigureV2Fragment) this.receiver;
            a aVar = BblConfigureV2Fragment.f99264C0;
            bblConfigureV2Fragment.getClass();
            Throwable th2 = cVar.f580j;
            C47313c c47313c = bblConfigureV2Fragment.f99279y0;
            if (th2 != null) {
                D6.w(bblConfigureV2Fragment.u5());
                D6.w(bblConfigureV2Fragment.s5());
                D6.w(bblConfigureV2Fragment.v5());
                bblConfigureV2Fragment.v5().d();
                D6.H(bblConfigureV2Fragment.q5());
                D6.w(bblConfigureV2Fragment.r5());
                D6.w(bblConfigureV2Fragment.t5());
                n<Object> nVar = BblConfigureV2Fragment.f99265D0[4];
                ((xZ.e) c47313c.a()).d(z.l(th2));
                return;
            }
            if (cVar.f581k) {
                D6.w(bblConfigureV2Fragment.u5());
                D6.w(bblConfigureV2Fragment.s5());
                D6.H(bblConfigureV2Fragment.v5());
                bblConfigureV2Fragment.v5().c();
                D6.w(bblConfigureV2Fragment.q5());
                D6.w(bblConfigureV2Fragment.r5());
                D6.w(bblConfigureV2Fragment.t5());
                n<Object> nVar2 = BblConfigureV2Fragment.f99265D0[4];
                ((xZ.e) c47313c.a()).c();
                return;
            }
            if (cVar.f582l) {
                Integer num = cVar.f583m;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view = bblConfigureV2Fragment.getView();
                    if (view == null || (button = (Button) view.findViewById(iIntValue)) == null) {
                        return;
                    }
                    button.setLoading(true);
                    return;
                }
                return;
            }
            MnzFloatingFooter mnzFloatingFooterR5 = bblConfigureV2Fragment.r5();
            com.avito.android.util.text.a aVar2 = bblConfigureV2Fragment.f99272r0;
            G0 g02 = null;
            g02 = null;
            g02 = null;
            mnzFloatingFooterR5.b(cVar.f573c, cVar.f575e, aVar2 != null ? aVar2 : null, new com.avito.android.bbl.screens.configure.v2.b(bblConfigureV2Fragment), new com.avito.android.bbl.screens.configure.v2.c(bblConfigureV2Fragment));
            wZ.i iVar = cVar.f572b;
            if (iVar != null && (f12 = iVar.f441567a) != null) {
                bblConfigureV2Fragment.u5().setProgress(f12.floatValue());
            }
            D6.G(bblConfigureV2Fragment.u5(), (iVar != null ? iVar.f441567a : null) != null);
            if (iVar != null && (c49577a = iVar.f441568b) != null && (context = bblConfigureV2Fragment.getContext()) != null) {
                Button buttonS5 = bblConfigureV2Fragment.s5();
                com.avito.android.util.text.a aVar3 = bblConfigureV2Fragment.f99272r0;
                com.avito.android.lib.design.button.b.a(buttonS5, (aVar3 != null ? aVar3 : null).c(context, c49577a.f441544a), false);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                D6.w(bblConfigureV2Fragment.s5());
            }
            bblConfigureV2Fragment.t5().setContent(new C22096n(44042692, new com.avito.android.bbl.screens.configure.v2.h(bblConfigureV2Fragment, cVar), true));
            D6.H(bblConfigureV2Fragment.t5());
            D6.w(bblConfigureV2Fragment.v5());
            bblConfigureV2Fragment.v5().d();
            D6.H(bblConfigureV2Fragment.q5());
            D6.H(bblConfigureV2Fragment.r5());
            n<Object> nVar3 = BblConfigureV2Fragment.f99265D0[4];
            ((xZ.e) c47313c.a()).b();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Ah.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = BblConfigureV2Fragment.f99264C0;
            BblConfigureV2Fragment.this.w5().accept(new InterfaceC13032a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f99285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f99285l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f99285l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BblConfigureV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f99287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f99287l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f99287l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f99288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f99288l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f99288l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f99289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f99289l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f99289l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BblConfigureV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/bbl/screens/configure/v2/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.bbl.screens.configure.v2.l> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.bbl.screens.configure.v2.l invoke() {
            m mVar = BblConfigureV2Fragment.this.f99268n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.bbl.screens.configure.v2.l) mVar.get();
        }
    }

    static {
        Y y12 = new Y(BblConfigureV2Fragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f99265D0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "navigationProgressBar", "getNavigationProgressBar()Lcom/avito/android/lib/design/progress_bar_re23/ProgressBarRe23;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "helpButton", "getHelpButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "shimmer", "getShimmer()Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/mnz_common/ui/MnzProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "contentView", "getContentView()Landroid/widget/FrameLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "listComposeView", "getListComposeView()Landroidx/compose/ui/platform/ComposeView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureV2Fragment.class, "floatingFooter", "getFloatingFooter()Lcom/avito/android/mnz_common/ui/MnzFloatingFooter;", 0, n0Var)};
        f99264C0 = new a(null);
    }

    public BblConfigureV2Fragment() {
        super(R.layout.bbl_configure_v2_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f99269o0 = new O0(m0.f406844a.b(com.avito.android.bbl.screens.configure.v2.l.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f99271q0 = C42727D.c(new b());
        this.f99275u0 = new C47313c(null, 1, null);
        this.f99276v0 = new C47313c(null, 1, null);
        this.f99277w0 = new C47313c(null, 1, null);
        this.f99278x0 = new C47313c(null, 1, null);
        this.f99279y0 = new C47313c(null, 1, null);
        this.f99280z0 = new C47313c(null, 1, null);
        this.f99266A0 = new C47313c(null, 1, null);
        this.f99267B0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 4);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new c(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f99270p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f99270p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, w5(), new d(1, this, BblConfigureV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2OneTimeEvent;)V", 0), new e(1, this, BblConfigureV2Fragment.class, "render", "render(Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2State;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        C47313c c47313c = this.f99275u0;
        n<Object>[] nVarArr = f99265D0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, toolbar);
        ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        C47313c c47313c2 = this.f99276v0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, progressBarRe23);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        C47313c c47313c3 = this.f99277w0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, button);
        n<Object> nVar4 = nVarArr[0];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureV2Fragment f99294c;

            {
                this.f99294c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureV2Fragment bblConfigureV2Fragment = this.f99294c;
                switch (i12) {
                    case 0:
                        BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.b.f558a);
                        break;
                    case 1:
                        BblConfigureV2Fragment.a aVar2 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.C0021a.f557a);
                        break;
                    default:
                        BblConfigureV2Fragment.a aVar3 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.g.f565a);
                        break;
                }
            }
        });
        final int i13 = 1;
        s5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureV2Fragment f99294c;

            {
                this.f99294c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureV2Fragment bblConfigureV2Fragment = this.f99294c;
                switch (i13) {
                    case 0:
                        BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.b.f558a);
                        break;
                    case 1:
                        BblConfigureV2Fragment.a aVar2 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.C0021a.f557a);
                        break;
                    default:
                        BblConfigureV2Fragment.a aVar3 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.g.f565a);
                        break;
                }
            }
        });
        ShimmerLayout shimmerLayout = (ShimmerLayout) view.findViewById(R.id.bbl_configure_shimmer);
        C47313c c47313c4 = this.f99278x0;
        n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, shimmerLayout);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bbl_configure_content_container);
        C47313c c47313c5 = this.f99280z0;
        n<Object> nVar6 = nVarArr[5];
        c47313c5.b(this, frameLayout);
        final int i14 = 2;
        xZ.e eVar = new xZ.e(q5(), new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureV2Fragment f99294c;

            {
                this.f99294c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureV2Fragment bblConfigureV2Fragment = this.f99294c;
                switch (i14) {
                    case 0:
                        BblConfigureV2Fragment.a aVar = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.b.f558a);
                        break;
                    case 1:
                        BblConfigureV2Fragment.a aVar2 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.C0021a.f557a);
                        break;
                    default:
                        BblConfigureV2Fragment.a aVar3 = BblConfigureV2Fragment.f99264C0;
                        bblConfigureV2Fragment.w5().accept(InterfaceC13032a.g.f565a);
                        break;
                }
            }
        }, null, 4, null);
        C47313c c47313c6 = this.f99279y0;
        n<Object> nVar7 = nVarArr[4];
        c47313c6.b(this, eVar);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.bbl_configure_compose_view);
        C47313c c47313c7 = this.f99266A0;
        n<Object> nVar8 = nVarArr[6];
        c47313c7.b(this, composeView);
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.bbl_configure_floating_footer);
        C47313c c47313c8 = this.f99267B0;
        n<Object> nVar9 = nVarArr[7];
        c47313c8.b(this, mnzFloatingFooter);
        ScreenPerformanceTracker screenPerformanceTracker = this.f99270p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.bbl.screens.configure.v2.di.d.a().a((InterfaceC44423b) C29972i.a(C29972i.b(this), InterfaceC44423b.class), this, cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "checkoutContext"), new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f99270p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f99270p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f99274t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final FrameLayout q5() {
        C47313c c47313c = this.f99280z0;
        n<Object> nVar = f99265D0[5];
        return (FrameLayout) c47313c.a();
    }

    public final MnzFloatingFooter r5() {
        C47313c c47313c = this.f99267B0;
        n<Object> nVar = f99265D0[7];
        return (MnzFloatingFooter) c47313c.a();
    }

    public final Button s5() {
        C47313c c47313c = this.f99277w0;
        n<Object> nVar = f99265D0[2];
        return (Button) c47313c.a();
    }

    public final ComposeView t5() {
        C47313c c47313c = this.f99266A0;
        n<Object> nVar = f99265D0[6];
        return (ComposeView) c47313c.a();
    }

    public final ProgressBarRe23 u5() {
        C47313c c47313c = this.f99276v0;
        n<Object> nVar = f99265D0[1];
        return (ProgressBarRe23) c47313c.a();
    }

    public final ShimmerLayout v5() {
        C47313c c47313c = this.f99278x0;
        n<Object> nVar = f99265D0[3];
        return (ShimmerLayout) c47313c.a();
    }

    public final com.avito.android.bbl.screens.configure.v2.l w5() {
        return (com.avito.android.bbl.screens.configure.v2.l) this.f99269o0.getValue();
    }
}

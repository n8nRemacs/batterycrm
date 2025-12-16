package com.avito.android.bbl.screens.configure;

import Cd.C13243a;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.bbl.screens.configure.BblConfigureFragment;
import com.avito.android.bbl.screens.configure.di.m;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
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
import qK0.C47312b;
import qK0.C47313c;
import uZ.C49004a;
import v50.C49166b;
import xZ.C49899a;
import yh.C50251c;
import yh.InterfaceC50249a;
import yh.InterfaceC50250b;
import z1.AbstractC50339a;
import zh.C50566a;

/* compiled from: BblConfigureFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/configure/BblConfigureFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BblConfigureFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f99091E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f99092F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99093A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47312b f99094B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99095C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public C49899a f99096D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.bbl.screens.configure.j f99097n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f99098o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f99099p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f99100q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f99101r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f99102s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f99103t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99104u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99105v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99106w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99107x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99108y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f99109z0;

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/BblConfigureFragment$a;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bbl/screens/configure/BblConfigureFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            View view = BblConfigureFragment.this.getView();
            ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(R.id.bbl_configure_fragment) : null;
            return viewGroup == null ? super.a() : viewGroup;
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC50250b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50250b interfaceC50250b) {
            InterfaceC50250b interfaceC50250b2 = interfaceC50250b;
            BblConfigureFragment bblConfigureFragment = (BblConfigureFragment) this.receiver;
            a aVar = BblConfigureFragment.f99091E0;
            bblConfigureFragment.getClass();
            if (interfaceC50250b2 instanceof InterfaceC50250b.a) {
                ActivityC22955m activityC22955mL1 = bblConfigureFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC50250b2 instanceof InterfaceC50250b.C12915b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = bblConfigureFragment.f99103t0;
                Bundle bundle = null;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC50250b.C12915b c12915b = (InterfaceC50250b.C12915b) interfaceC50250b2;
                Long l12 = c12915b.f443454b;
                String str = l12 != null ? "key_bbl_configure_config_id" : null;
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("key_bbl_configure_config_id", jLongValue);
                    Integer num = c12915b.f443455c;
                    if (num != null) {
                        bundle2.putInt("kty_bbl_configure_save_button_id", num.intValue());
                    }
                    bundle = bundle2;
                }
                aVar2.r6(bundle, c12915b.f443453a, str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C50251c, G0> {
        public final void f(@Y61.k C50251c c50251c) {
            G0 g02;
            G0 g03;
            C49004a button;
            CharSequence charSequenceC;
            Float progress;
            Button button2;
            BblConfigureFragment bblConfigureFragment = (BblConfigureFragment) this.receiver;
            a aVar = BblConfigureFragment.f99091E0;
            bblConfigureFragment.getClass();
            ApiError apiError = c50251c.f443465i;
            C47313c c47313c = bblConfigureFragment.f99108y0;
            if (apiError != null) {
                D6.w(bblConfigureFragment.t5());
                D6.w(bblConfigureFragment.s5());
                D6.w(bblConfigureFragment.v5());
                bblConfigureFragment.v5().d();
                D6.H(bblConfigureFragment.q5());
                D6.w(bblConfigureFragment.u5());
                D6.w(bblConfigureFragment.r5());
                n<Object> nVar = BblConfigureFragment.f99092F0[4];
                ((xZ.e) c47313c.a()).d(z.k(apiError));
                return;
            }
            if (c50251c.f443466j) {
                D6.w(bblConfigureFragment.t5());
                D6.w(bblConfigureFragment.s5());
                D6.H(bblConfigureFragment.v5());
                bblConfigureFragment.v5().c();
                D6.w(bblConfigureFragment.q5());
                D6.w(bblConfigureFragment.u5());
                D6.w(bblConfigureFragment.r5());
                n<Object> nVar2 = BblConfigureFragment.f99092F0[4];
                ((xZ.e) c47313c.a()).c();
                return;
            }
            if (c50251c.f443467k) {
                Integer num = c50251c.f443468l;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view = bblConfigureFragment.getView();
                    if (view == null || (button2 = (Button) view.findViewById(iIntValue)) == null) {
                        return;
                    }
                    button2.setLoading(true);
                    return;
                }
                return;
            }
            MnzFloatingFooter mnzFloatingFooterR5 = bblConfigureFragment.r5();
            com.avito.android.util.text.a aVar2 = bblConfigureFragment.f99101r0;
            mnzFloatingFooterR5.c(c50251c.f443459c, c50251c.f443461e, aVar2 != null ? aVar2 : null, new com.avito.android.bbl.screens.configure.c(bblConfigureFragment), new com.avito.android.bbl.screens.configure.d(bblConfigureFragment));
            D6.H(bblConfigureFragment.r5());
            uZ.d dVar = c50251c.f443458b;
            if (dVar != null && (progress = dVar.getProgress()) != null) {
                bblConfigureFragment.t5().setProgress(progress.floatValue());
            }
            D6.G(bblConfigureFragment.t5(), (dVar != null ? dVar.getProgress() : null) != null);
            if (dVar == null || (button = dVar.getButton()) == null) {
                g02 = null;
            } else {
                Context context = bblConfigureFragment.getContext();
                if (context != null) {
                    com.avito.android.util.text.a aVar3 = bblConfigureFragment.f99101r0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    charSequenceC = aVar3.c(context, button.getTitle());
                } else {
                    charSequenceC = null;
                }
                com.avito.android.lib.design.button.b.a(bblConfigureFragment.s5(), charSequenceC, false);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                D6.w(bblConfigureFragment.s5());
            }
            C47313c c47313c2 = bblConfigureFragment.f99093A0;
            UniversalImage universalImage = c50251c.f443463g;
            if (universalImage != null) {
                Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.c(bblConfigureFragment.getResources()));
                n<Object>[] nVarArr = BblConfigureFragment.f99092F0;
                n<Object> nVar3 = nVarArr[6];
                C35949t5.c((SimpleDraweeView) c47313c2.a(), imageDependsOnThemeOrDefault != null ? com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault) : null, null, null, null, 14);
                n<Object> nVar4 = nVarArr[6];
                D6.H((SimpleDraweeView) c47313c2.a());
                g03 = G0.f406611a;
            } else {
                g03 = null;
            }
            if (g03 == null) {
                n<Object> nVar5 = BblConfigureFragment.f99092F0[6];
                D6.w((SimpleDraweeView) c47313c2.a());
            }
            com.avito.konveyor.adapter.d dVar2 = bblConfigureFragment.f99100q0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.l(c50251c.f443464h, null);
            D6.w(bblConfigureFragment.v5());
            bblConfigureFragment.v5().d();
            D6.H(bblConfigureFragment.q5());
            D6.H(bblConfigureFragment.u5());
            n<Object> nVar6 = BblConfigureFragment.f99092F0[4];
            ((xZ.e) c47313c.a()).b();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C50251c c50251c) {
            f(c50251c);
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = BblConfigureFragment.f99091E0;
            BblConfigureFragment.this.w5().accept(new InterfaceC50249a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/BblConfigureConfigsItem$Config;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bbl/screens/configure/ui/items/configs/BblConfigureConfigsItem$Config;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<BblConfigureConfigsItem.Config, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(BblConfigureConfigsItem.Config config) {
            a aVar = BblConfigureFragment.f99091E0;
            BblConfigureFragment.this.w5().accept(new InterfaceC50249a.d(config));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f99113l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f99113l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f99113l);
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
            return BblConfigureFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f99115l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f99115l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f99115l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f99116l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f99116l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f99116l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f99117l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f99117l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f99117l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BblConfigureFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/bbl/screens/configure/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.bbl.screens.configure.i> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.bbl.screens.configure.i invoke() {
            com.avito.android.bbl.screens.configure.j jVar = BblConfigureFragment.this.f99097n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.bbl.screens.configure.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(BblConfigureFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0);
        n0 n0Var = m0.f406844a;
        f99092F0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "navigationProgressBar", "getNavigationProgressBar()Lcom/avito/android/lib/design/progress_bar_re23/ProgressBarRe23;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "helpButton", "getHelpButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "shimmer", "getShimmer()Lcom/avito/android/lib/design/skeleton/shimmer/ShimmerLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/mnz_common/ui/MnzProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "contentView", "getContentView()Landroid/widget/FrameLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "backgroundImage", "getBackgroundImage()Lcom/avito/android/fresco/SimpleDraweeView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BblConfigureFragment.class, "floatingFooter", "getFloatingFooter()Lcom/avito/android/mnz_common/ui/MnzFloatingFooter;", 0, n0Var)};
        f99091E0 = new a(null);
    }

    public BblConfigureFragment() {
        super(R.layout.bbl_configure_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f99098o0 = new O0(m0.f406844a.b(com.avito.android.bbl.screens.configure.i.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f99104u0 = new C47313c(null, 1, null);
        this.f99105v0 = new C47313c(null, 1, null);
        this.f99106w0 = new C47313c(null, 1, null);
        this.f99107x0 = new C47313c(null, 1, null);
        this.f99108y0 = new C47313c(null, 1, null);
        this.f99109z0 = new C47313c(null, 1, null);
        this.f99093A0 = new C47313c(null, 1, null);
        this.f99094B0 = new C47312b(null, 1, null);
        this.f99095C0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f99099p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f99099p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, w5(), new c(1, this, BblConfigureFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureOneTimeEvent;)V", 0), new d(1, this, BblConfigureFragment.class, "render", "render(Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        C47313c c47313c = this.f99104u0;
        n<Object>[] nVarArr = f99092F0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, toolbar);
        ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        C47313c c47313c2 = this.f99105v0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, progressBarRe23);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        C47313c c47313c3 = this.f99106w0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, button);
        n<Object> nVar4 = nVarArr[0];
        final int i12 = 0;
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureFragment f99122c;

            {
                this.f99122c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureFragment bblConfigureFragment = this.f99122c;
                switch (i12) {
                    case 0:
                        BblConfigureFragment.a aVar = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.b.f443444a);
                        break;
                    case 1:
                        BblConfigureFragment.a aVar2 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.C12914a.f443443a);
                        break;
                    default:
                        BblConfigureFragment.a aVar3 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.g.f443451a);
                        break;
                }
            }
        });
        final int i13 = 1;
        s5().setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureFragment f99122c;

            {
                this.f99122c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureFragment bblConfigureFragment = this.f99122c;
                switch (i13) {
                    case 0:
                        BblConfigureFragment.a aVar = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.b.f443444a);
                        break;
                    case 1:
                        BblConfigureFragment.a aVar2 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.C12914a.f443443a);
                        break;
                    default:
                        BblConfigureFragment.a aVar3 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.g.f443451a);
                        break;
                }
            }
        });
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.bbl_configure_image);
        C47313c c47313c4 = this.f99093A0;
        n<Object> nVar5 = nVarArr[6];
        c47313c4.b(this, simpleDraweeView);
        ShimmerLayout shimmerLayout = (ShimmerLayout) view.findViewById(R.id.bbl_configure_shimmer);
        C47313c c47313c5 = this.f99107x0;
        n<Object> nVar6 = nVarArr[3];
        c47313c5.b(this, shimmerLayout);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bbl_configure_content_container);
        C47313c c47313c6 = this.f99109z0;
        n<Object> nVar7 = nVarArr[5];
        c47313c6.b(this, frameLayout);
        final int i14 = 2;
        xZ.e eVar = new xZ.e(q5(), new View.OnClickListener(this) { // from class: com.avito.android.bbl.screens.configure.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BblConfigureFragment f99122c;

            {
                this.f99122c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BblConfigureFragment bblConfigureFragment = this.f99122c;
                switch (i14) {
                    case 0:
                        BblConfigureFragment.a aVar = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.b.f443444a);
                        break;
                    case 1:
                        BblConfigureFragment.a aVar2 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.C12914a.f443443a);
                        break;
                    default:
                        BblConfigureFragment.a aVar3 = BblConfigureFragment.f99091E0;
                        bblConfigureFragment.w5().accept(InterfaceC50249a.g.f443451a);
                        break;
                }
            }
        }, null, 4, null);
        C47313c c47313c7 = this.f99108y0;
        n<Object> nVar8 = nVarArr[4];
        c47313c7.b(this, eVar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bbl_configure_recycler_view);
        com.avito.konveyor.adapter.d dVar = this.f99100q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C50566a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f99099p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        recyclerView.setItemAnimator(null);
        n<Object> nVar9 = nVarArr[7];
        this.f99094B0.b(this, recyclerView);
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.bbl_configure_floating_footer);
        C47313c c47313c8 = this.f99095C0;
        n<Object> nVar10 = nVarArr[8];
        c47313c8.b(this, mnzFloatingFooter);
        r5().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 2));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f99099p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        m.a().a((InterfaceC44423b) C29972i.a(C29972i.b(this), InterfaceC44423b.class), this, cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "checkoutContext"), new e(), new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f99099p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f99099p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f99103t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final FrameLayout q5() {
        C47313c c47313c = this.f99109z0;
        n<Object> nVar = f99092F0[5];
        return (FrameLayout) c47313c.a();
    }

    public final MnzFloatingFooter r5() {
        C47313c c47313c = this.f99095C0;
        n<Object> nVar = f99092F0[8];
        return (MnzFloatingFooter) c47313c.a();
    }

    public final Button s5() {
        C47313c c47313c = this.f99106w0;
        n<Object> nVar = f99092F0[2];
        return (Button) c47313c.a();
    }

    public final ProgressBarRe23 t5() {
        C47313c c47313c = this.f99105v0;
        n<Object> nVar = f99092F0[1];
        return (ProgressBarRe23) c47313c.a();
    }

    public final RecyclerView u5() {
        n<Object> nVar = f99092F0[7];
        return (RecyclerView) this.f99094B0.a();
    }

    public final ShimmerLayout v5() {
        C47313c c47313c = this.f99107x0;
        n<Object> nVar = f99092F0[3];
        return (ShimmerLayout) c47313c.a();
    }

    public final com.avito.android.bbl.screens.configure.i w5() {
        return (com.avito.android.bbl.screens.configure.i) this.f99098o0.getValue();
    }
}

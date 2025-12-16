package com.avito.android.screens.bbip_v2;

import Cd.C13243a;
import Y41.p;
import Y61.l;
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
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.screens.bbip_v2.BbipV2Fragment;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import hh.InterfaceC40934b;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import vp0.C49366c;
import vp0.InterfaceC49364a;
import vp0.InterfaceC49365b;
import z1.AbstractC50339a;

/* compiled from: BbipV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_v2/BbipV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BbipV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f261405B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @l
    public RecyclerView f261406A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.screens.bbip_v2.g f261407n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f261408o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f261409p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f261410q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f261411r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f261412s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public ProgressBarRe23 f261413t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Button f261414u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public ShimmerLayout f261415v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public xZ.e f261416w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public FrameLayout f261417x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public Button f261418y0;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public Button f261419z0;

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/BbipV2Fragment$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC49365b, G0> {
        public final void f(@Y61.k InterfaceC49365b interfaceC49365b) {
            List listSingletonList;
            BbipV2Fragment bbipV2Fragment = (BbipV2Fragment) this.receiver;
            a aVar = BbipV2Fragment.f261405B0;
            bbipV2Fragment.getClass();
            if (interfaceC49365b instanceof InterfaceC49365b.a) {
                ActivityC22955m activityC22955mL1 = bbipV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    return;
                }
                return;
            }
            if (interfaceC49365b instanceof InterfaceC49365b.C12793b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = bbipV2Fragment.f261411r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC49365b.C12793b) interfaceC49365b).f440981a, null, null, 6);
                return;
            }
            if (!(interfaceC49365b instanceof InterfaceC49365b.c)) {
                if (interfaceC49365b instanceof InterfaceC49365b.d) {
                    com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, bbipV2Fragment, ((InterfaceC49365b.d) interfaceC49365b).f440984a, null, null, null, 0, ToastBarPosition.f181046d, 958);
                    return;
                }
                return;
            }
            InterfaceC49365b.c cVar = (InterfaceC49365b.c) interfaceC49365b;
            InterfaceC49364a interfaceC49364a = cVar.f440983b;
            if (interfaceC49364a != null) {
                listSingletonList = Collections.singletonList(new c.a.C3719a(bbipV2Fragment.getString(R.string.bbip_error_screen_button), true, null, new com.avito.android.screens.bbip_v2.c(bbipV2Fragment, interfaceC49364a), 4, null));
            } else {
                listSingletonList = null;
            }
            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
            Throwable th2 = cVar.f440982a;
            com.avito.android.component.toast.c.c(cVar2, bbipV2Fragment, com.avito.android.printable_text.b.f(z.l(th2)), null, listSingletonList, new f.c(th2), 0, ToastBarPosition.f181046d, 938);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC49365b interfaceC49365b) {
            f(interfaceC49365b);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C49366c, G0> {
        @Override // Y41.l
        public final G0 invoke(C49366c c49366c) {
            Float progress;
            C49366c c49366c2 = c49366c;
            BbipV2Fragment bbipV2Fragment = (BbipV2Fragment) this.receiver;
            a aVar = BbipV2Fragment.f261405B0;
            bbipV2Fragment.getClass();
            Throwable th2 = c49366c2.f440994i;
            if (th2 != null) {
                D6.w(bbipV2Fragment.f261413t0);
                Button button = bbipV2Fragment.f261414u0;
                if (button != null) {
                    D6.w(button);
                }
                ShimmerLayout shimmerLayout = bbipV2Fragment.f261415v0;
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                }
                ShimmerLayout shimmerLayout2 = bbipV2Fragment.f261415v0;
                if (shimmerLayout2 != null) {
                    shimmerLayout2.d();
                }
                FrameLayout frameLayout = bbipV2Fragment.f261417x0;
                if (frameLayout != null) {
                    D6.H(frameLayout);
                }
                RecyclerView recyclerView = bbipV2Fragment.f261406A0;
                if (recyclerView != null) {
                    D6.w(recyclerView);
                }
                xZ.e eVar = bbipV2Fragment.f261416w0;
                if (eVar != null) {
                    eVar.d(z.l(th2));
                }
            } else if (c49366c2.f440995j) {
                D6.w(bbipV2Fragment.f261413t0);
                Button button2 = bbipV2Fragment.f261414u0;
                if (button2 != null) {
                    D6.w(button2);
                }
                ShimmerLayout shimmerLayout3 = bbipV2Fragment.f261415v0;
                if (shimmerLayout3 != null) {
                    D6.H(shimmerLayout3);
                }
                ShimmerLayout shimmerLayout4 = bbipV2Fragment.f261415v0;
                if (shimmerLayout4 != null) {
                    shimmerLayout4.c();
                }
                FrameLayout frameLayout2 = bbipV2Fragment.f261417x0;
                if (frameLayout2 != null) {
                    D6.w(frameLayout2);
                }
                RecyclerView recyclerView2 = bbipV2Fragment.f261406A0;
                if (recyclerView2 != null) {
                    D6.w(recyclerView2);
                }
                xZ.e eVar2 = bbipV2Fragment.f261416w0;
                if (eVar2 != null) {
                    eVar2.c();
                }
            } else {
                uZ.e eVar3 = c49366c2.f440987b;
                if (eVar3 != null && (progress = eVar3.getProgress()) != null) {
                    float fFloatValue = progress.floatValue();
                    ProgressBarRe23 progressBarRe23 = bbipV2Fragment.f261413t0;
                    if (progressBarRe23 != null) {
                        progressBarRe23.setProgress(fFloatValue);
                    }
                }
                D6.G(bbipV2Fragment.f261413t0, (eVar3 != null ? eVar3.getProgress() : null) != null);
                Button button3 = bbipV2Fragment.f261414u0;
                if (button3 != null) {
                    com.avito.android.mnz_common.extensions.i.a(button3, eVar3 != null ? eVar3.getButton() : null);
                }
                Button button4 = bbipV2Fragment.f261418y0;
                if (button4 != null) {
                    com.avito.android.mnz_common.extensions.i.a(button4, c49366c2.f440989d);
                }
                Button button5 = bbipV2Fragment.f261419z0;
                if (button5 != null) {
                    com.avito.android.mnz_common.extensions.i.a(button5, c49366c2.f440990e);
                }
                Button button6 = bbipV2Fragment.f261419z0;
                if (button6 != null) {
                    button6.setLoading(c49366c2.f440996k || c49366c2.f440997l);
                }
                com.avito.konveyor.adapter.d dVar = bbipV2Fragment.f261409p0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(c49366c2.f440988c, null);
                RecyclerView recyclerView3 = bbipV2Fragment.f261406A0;
                if (recyclerView3 != null) {
                    D6.H(recyclerView3);
                }
                ShimmerLayout shimmerLayout5 = bbipV2Fragment.f261415v0;
                if (shimmerLayout5 != null) {
                    D6.w(shimmerLayout5);
                }
                ShimmerLayout shimmerLayout6 = bbipV2Fragment.f261415v0;
                if (shimmerLayout6 != null) {
                    shimmerLayout6.d();
                }
                FrameLayout frameLayout3 = bbipV2Fragment.f261417x0;
                if (frameLayout3 != null) {
                    D6.H(frameLayout3);
                }
                xZ.e eVar4 = bbipV2Fragment.f261416w0;
                if (eVar4 != null) {
                    eVar4.b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/b$a;", "budget", "", "condition", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_v2/ui/items/budget/b$a;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<b.a, Boolean, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(b.a aVar, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar2 = BbipV2Fragment.f261405B0;
            BbipV2Fragment.this.q5().accept(new InterfaceC49364a.b(aVar, zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/b$a;", "duration", "", "condition", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_v2/ui/items/duration/b$a;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<b.a, Boolean, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(b.a aVar, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar2 = BbipV2Fragment.f261405B0;
            BbipV2Fragment.this.q5().accept(new InterfaceC49364a.c(aVar, zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f261422l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f261422l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f261422l);
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
            return BbipV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f261424l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f261424l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f261424l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f261425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f261425l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f261425l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f261426l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f261426l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f261426l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BbipV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/screens/bbip_v2/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.screens.bbip_v2.f> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.screens.bbip_v2.f invoke() {
            com.avito.android.screens.bbip_v2.g gVar = BbipV2Fragment.this.f261407n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.screens.bbip_v2.f) gVar.get();
        }
    }

    public BbipV2Fragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f261412s0 = new O0(m0.f406844a.b(com.avito.android.screens.bbip_v2.f.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f261408o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f261408o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, BbipV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2OneTimeEvent;)V", 0), new c(1, this, BbipV2Fragment.class, "render", "render(Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2State;)V", 0));
        return layoutInflater.inflate(R.layout.bbip_v2_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView = this.f261406A0;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_close24, R.attr.black));
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipV2Fragment f261429c;

            {
                this.f261429c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipV2Fragment bbipV2Fragment = this.f261429c;
                switch (i12) {
                    case 0:
                        BbipV2Fragment.a aVar = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.C12792a.f440970a);
                        break;
                    case 1:
                        BbipV2Fragment.a aVar2 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.d.f440975a);
                        break;
                    case 2:
                        BbipV2Fragment.a aVar3 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.f.f440977a);
                        break;
                    case 3:
                        BbipV2Fragment.a aVar4 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.h.f440979a);
                        break;
                    default:
                        BbipV2Fragment.a aVar5 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.e.f440976a);
                        break;
                }
            }
        });
        this.f261413t0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipV2Fragment f261429c;

            {
                this.f261429c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipV2Fragment bbipV2Fragment = this.f261429c;
                switch (i13) {
                    case 0:
                        BbipV2Fragment.a aVar = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.C12792a.f440970a);
                        break;
                    case 1:
                        BbipV2Fragment.a aVar2 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.d.f440975a);
                        break;
                    case 2:
                        BbipV2Fragment.a aVar3 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.f.f440977a);
                        break;
                    case 3:
                        BbipV2Fragment.a aVar4 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.h.f440979a);
                        break;
                    default:
                        BbipV2Fragment.a aVar5 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.e.f440976a);
                        break;
                }
            }
        });
        this.f261414u0 = button;
        this.f261415v0 = (ShimmerLayout) view.findViewById(R.id.bbip_v2_shimmer);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bbip_v2_content);
        this.f261417x0 = frameLayout;
        final int i14 = 2;
        this.f261416w0 = new xZ.e(frameLayout, new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipV2Fragment f261429c;

            {
                this.f261429c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipV2Fragment bbipV2Fragment = this.f261429c;
                switch (i14) {
                    case 0:
                        BbipV2Fragment.a aVar = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.C12792a.f440970a);
                        break;
                    case 1:
                        BbipV2Fragment.a aVar2 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.d.f440975a);
                        break;
                    case 2:
                        BbipV2Fragment.a aVar3 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.f.f440977a);
                        break;
                    case 3:
                        BbipV2Fragment.a aVar4 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.h.f440979a);
                        break;
                    default:
                        BbipV2Fragment.a aVar5 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.e.f440976a);
                        break;
                }
            }
        }, null, 4, null);
        Button button2 = (Button) view.findViewById(R.id.bbip_v2_skip);
        final int i15 = 3;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipV2Fragment f261429c;

            {
                this.f261429c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipV2Fragment bbipV2Fragment = this.f261429c;
                switch (i15) {
                    case 0:
                        BbipV2Fragment.a aVar = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.C12792a.f440970a);
                        break;
                    case 1:
                        BbipV2Fragment.a aVar2 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.d.f440975a);
                        break;
                    case 2:
                        BbipV2Fragment.a aVar3 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.f.f440977a);
                        break;
                    case 3:
                        BbipV2Fragment.a aVar4 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.h.f440979a);
                        break;
                    default:
                        BbipV2Fragment.a aVar5 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.e.f440976a);
                        break;
                }
            }
        });
        this.f261418y0 = button2;
        Button button3 = (Button) view.findViewById(R.id.bbip_v2_next);
        final int i16 = 4;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_v2.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipV2Fragment f261429c;

            {
                this.f261429c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipV2Fragment bbipV2Fragment = this.f261429c;
                switch (i16) {
                    case 0:
                        BbipV2Fragment.a aVar = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.C12792a.f440970a);
                        break;
                    case 1:
                        BbipV2Fragment.a aVar2 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.d.f440975a);
                        break;
                    case 2:
                        BbipV2Fragment.a aVar3 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.f.f440977a);
                        break;
                    case 3:
                        BbipV2Fragment.a aVar4 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.h.f440979a);
                        break;
                    default:
                        BbipV2Fragment.a aVar5 = BbipV2Fragment.f261405B0;
                        bbipV2Fragment.q5().accept(InterfaceC49364a.e.f440976a);
                        break;
                }
            }
        });
        this.f261419z0 = button3;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bbip_v2_list);
        com.avito.konveyor.adapter.d dVar = this.f261409p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new wp0.c(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f261408o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f261406A0 = recyclerView;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f261408o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.screens.bbip_v2.di.j.a().a((InterfaceC40934b) C29972i.a(C29972i.b(this), InterfaceC40934b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "item_id"), com.avito.android.mnz_common.extensions.d.c(this, "checkout_context"), new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f261408o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f261408o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f261411r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.screens.bbip_v2.f q5() {
        return (com.avito.android.screens.bbip_v2.f) this.f261412s0.getValue();
    }
}

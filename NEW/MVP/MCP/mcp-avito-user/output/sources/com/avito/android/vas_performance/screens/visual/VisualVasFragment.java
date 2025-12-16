package com.avito.android.vas_performance.screens.visual;

import Cd.C13243a;
import PL0.a;
import PL0.b;
import PL0.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.screens.visual.VisualVasFragment;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
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
import w50.InterfaceC49447a;
import z1.AbstractC50339a;

/* compiled from: VisualVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/VisualVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VisualVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final a f320947J0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f320948A0;

    /* renamed from: B0, reason: collision with root package name */
    public MnzFloatingFooter f320949B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public QL0.b f320950C0;

    /* renamed from: D0, reason: collision with root package name */
    public InterfaceC49447a f320951D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f320952E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f320953F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f320954G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f320955H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final f f320956I0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.arch.mvi.b<VisualVasInternalAction> f320957n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f320958o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f320959p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.screens.visual.i f320960q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f320961r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f320962s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f320963t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f320964u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f320965v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f320966w0;

    /* renamed from: x0, reason: collision with root package name */
    public Button f320967x0;

    /* renamed from: y0, reason: collision with root package name */
    public FrameLayout f320968y0;

    /* renamed from: z0, reason: collision with root package name */
    public Button f320969z0;

    /* compiled from: VisualVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/VisualVasFragment$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("advert_id")) == null) {
                throw new IllegalStateException("advertId must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
                throw new IllegalStateException("checkoutContext must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = VisualVasFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("closable") : true);
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("current_flow")) == null) {
                throw new IllegalStateException("currentFlow must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_performance/screens/visual/VisualVasFragment$f", "Landroidx/activity/x;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends x {
        public f() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = VisualVasFragment.f320947J0;
            VisualVasFragment.this.q5().accept(a.b.f13020a);
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<PL0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(PL0.b bVar) {
            Intent intent;
            PL0.b bVar2 = bVar;
            VisualVasFragment visualVasFragment = (VisualVasFragment) this.receiver;
            a aVar = VisualVasFragment.f320947J0;
            visualVasFragment.getClass();
            if (bVar2 instanceof b.a) {
                if (((Boolean) visualVasFragment.f320955H0.getValue()).booleanValue() || ((b.a) bVar2).f13024a) {
                    InterfaceC49447a interfaceC49447a = visualVasFragment.f320951D0;
                    (interfaceC49447a != null ? interfaceC49447a : null).r1();
                } else {
                    f fVar = visualVasFragment.f320956I0;
                    fVar.d(false);
                    ActivityC22955m activityC22955mL1 = visualVasFragment.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.onBackPressed();
                    }
                    fVar.d(true);
                }
            } else if (bVar2 instanceof b.C0842b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = visualVasFragment.f320964u0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.C0842b) bVar2).f13025a, null, null, 6);
            } else if (bVar2 instanceof b.d) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                ApiError apiError = ((b.d) bVar2).f13027a;
                com.avito.android.component.toast.c.c(cVar, visualVasFragment, com.avito.android.printable_text.b.f(z.k(apiError)), null, null, new f.c(apiError), 0, ToastBarPosition.f181046d, 942);
            } else if (bVar2 instanceof b.c) {
                ActivityC22955m activityC22955mL12 = visualVasFragment.l1();
                com.avito.android.ui.activity.a aVar3 = activityC22955mL12 instanceof com.avito.android.ui.activity.a ? (com.avito.android.ui.activity.a) activityC22955mL12 : null;
                if (aVar3 != null && (intent = aVar3.f304538c) != null) {
                    intent.putExtra("show_publish_without_video_vas_ux_feedback", ((b.c) bVar2).f13026a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<PL0.c, G0> {
        public final void f(@Y61.k PL0.c cVar) {
            c.b.a aVar;
            c.b.C0843b c0843b;
            c.b.a aVar2;
            C23424o.e eVar;
            c.C0844c c0844c;
            PrintableText printableText;
            VisualVasFragment visualVasFragment = (VisualVasFragment) this.receiver;
            a aVar3 = VisualVasFragment.f320947J0;
            visualVasFragment.getClass();
            ApiError apiError = cVar.f13031c;
            if (apiError != null) {
                Button button = visualVasFragment.f320967x0;
                if (button == null) {
                    button = null;
                }
                D6.w(button);
                com.avito.android.progress_overlay.l lVar = visualVasFragment.f320948A0;
                (lVar != null ? lVar : null).a(z.k(apiError));
                return;
            }
            if (cVar.f13030b) {
                com.avito.android.progress_overlay.l lVar2 = visualVasFragment.f320948A0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.k(null);
                return;
            }
            com.avito.android.progress_overlay.l lVar3 = visualVasFragment.f320948A0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.j();
            Context context = visualVasFragment.getContext();
            String strK0 = (context == null || (c0844c = cVar.f13034f) == null || (printableText = c0844c.f13050b) == null) ? null : printableText.k0(context);
            Button button2 = visualVasFragment.f320967x0;
            if (button2 == null) {
                button2 = null;
            }
            com.avito.android.lib.design.button.b.a(button2, strK0, false);
            com.avito.konveyor.adapter.a aVar4 = visualVasFragment.f320958o0;
            if (aVar4 == null) {
                aVar4 = null;
            }
            aVar4.c(new UV0.c(cVar.f13032d));
            RecyclerView recyclerView = visualVasFragment.f320966w0;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null && (eVar = cVar.f13033e) != null) {
                eVar.b(adapter);
            }
            c.b bVar = cVar.f13035g;
            boolean z12 = ((bVar == null || (aVar2 = bVar.f13038a) == null) ? null : aVar2.f13042b) != null;
            FrameLayout frameLayout = visualVasFragment.f320968y0;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setVisibility(!z12 ? 0 : 8);
            MnzFloatingFooter mnzFloatingFooter = visualVasFragment.f320949B0;
            if (mnzFloatingFooter == null) {
                mnzFloatingFooter = null;
            }
            mnzFloatingFooter.setVisibility(z12 ? 0 : 8);
            if (bVar != null && (c0843b = bVar.f13039b) != null) {
                Button button3 = visualVasFragment.f320969z0;
                if (button3 == null) {
                    button3 = null;
                }
                button3.setLoading(bVar.f13040c);
                Button button4 = visualVasFragment.f320969z0;
                if (button4 == null) {
                    button4 = null;
                }
                com.avito.android.lib.design.button.b.a(button4, c0843b.f13046c, false);
                Button button5 = visualVasFragment.f320969z0;
                if (button5 == null) {
                    button5 = null;
                }
                button5.setAppearanceFromAttr(c0843b.f13044a);
            }
            if (bVar == null || (aVar = bVar.f13038a) == null) {
                return;
            }
            Integer num = aVar.f13043c;
            if (num != null) {
                int iIntValue = num.intValue();
                MnzFloatingFooter mnzFloatingFooter2 = visualVasFragment.f320949B0;
                if (mnzFloatingFooter2 == null) {
                    mnzFloatingFooter2 = null;
                }
                Button button6 = (Button) mnzFloatingFooter2.findViewById(iIntValue);
                if (button6 != null) {
                    button6.setLoading(bVar.f13040c);
                }
            }
            MnzFloatingFooter mnzFloatingFooter3 = visualVasFragment.f320949B0;
            if (mnzFloatingFooter3 == null) {
                mnzFloatingFooter3 = null;
            }
            com.avito.android.util.text.a aVar5 = visualVasFragment.f320965v0;
            mnzFloatingFooter3.d(aVar.f13042b, aVar5 != null ? aVar5 : null, new com.avito.android.vas_performance.screens.visual.c(visualVasFragment), new com.avito.android.vas_performance.screens.visual.d(visualVasFragment));
            G0 g02 = G0.f406611a;
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(PL0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = VisualVasFragment.f320947J0;
            VisualVasFragment.this.q5().accept(a.e.f13023a);
            return G0.f406611a;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/a;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/screens/visual/item/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<com.avito.android.vas_performance.screens.visual.item.item.a, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.vas_performance.screens.visual.item.item.a aVar) {
            a aVar2 = VisualVasFragment.f320947J0;
            VisualVasFragment.this.q5().accept(new a.C0841a(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f320977l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f320977l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f320977l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VisualVasFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f320979l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f320979l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f320979l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f320980l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f320980l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f320980l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f320981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f320981l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f320981l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/vas_performance/screens/visual/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<com.avito.android.vas_performance.screens.visual.h> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.vas_performance.screens.visual.h invoke() {
            com.avito.android.vas_performance.screens.visual.i iVar = VisualVasFragment.this.f320960q0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.vas_performance.screens.visual.h) iVar.get();
        }
    }

    public VisualVasFragment() {
        super(0, 1, null);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        this.f320961r0 = new O0(m0.f406844a.b(com.avito.android.vas_performance.screens.visual.h.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f320952E0 = C42727D.c(new c());
        this.f320953F0 = C42727D.c(new b());
        this.f320954G0 = C42727D.c(new e());
        this.f320955H0 = C42727D.c(new d());
        this.f320956I0 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f320951D0 = interfaceC49447a;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f320963t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f320963t0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new g(1, this, VisualVasFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasOneTimeEvent;)V", 0), new h(1, this, VisualVasFragment.class, "render", "render(Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasState;)V", 0));
        return layoutInflater.inflate(R.layout.visual_vas_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f320962s0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new sL0.c((String) this.f320953F0.getValue(), (String) this.f320954G0.getValue()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.visual_vas_placeholder);
        InterfaceC28373a interfaceC28373a2 = this.f320962s0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.visual_vas_recycler_view, interfaceC28373a2 != null ? interfaceC28373a2 : null, 0, 0, 24, null);
        this.f320948A0 = lVar;
        lVar.f231600j = new i();
        this.f320966w0 = (RecyclerView) view.findViewById(R.id.visual_vas_recycler_view);
        Button button = (Button) view.findViewById(R.id.visual_vas_help_button);
        this.f320967x0 = button;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.screens.visual.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f320986c;

            {
                this.f320986c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VisualVasFragment visualVasFragment = this.f320986c;
                switch (i12) {
                    case 0:
                        VisualVasFragment.a aVar = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.d.f13022a);
                        break;
                    case 1:
                        VisualVasFragment.a aVar2 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(new a.c(null, 1, null));
                        break;
                    default:
                        VisualVasFragment.a aVar3 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.b.f13020a);
                        break;
                }
            }
        });
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.visual_vas_toolbar);
        toolbar.setNavigationIcon(((Boolean) this.f320955H0.getValue()).booleanValue() ? R.drawable.ic_close_24_black : R.drawable.ic_back_24);
        final int i13 = 2;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.screens.visual.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f320986c;

            {
                this.f320986c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VisualVasFragment visualVasFragment = this.f320986c;
                switch (i13) {
                    case 0:
                        VisualVasFragment.a aVar = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.d.f13022a);
                        break;
                    case 1:
                        VisualVasFragment.a aVar2 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(new a.c(null, 1, null));
                        break;
                    default:
                        VisualVasFragment.a aVar3 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.b.f13020a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = this.f320966w0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        com.avito.konveyor.adapter.j jVar = this.f320959p0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f320966w0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        this.f320968y0 = (FrameLayout) view.findViewById(R.id.visual_vas_button_container);
        Button button2 = (Button) view.findViewById(R.id.visual_vas_skip_button);
        this.f320969z0 = button2;
        final int i14 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.screens.visual.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f320986c;

            {
                this.f320986c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VisualVasFragment visualVasFragment = this.f320986c;
                switch (i14) {
                    case 0:
                        VisualVasFragment.a aVar = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.d.f13022a);
                        break;
                    case 1:
                        VisualVasFragment.a aVar2 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(new a.c(null, 1, null));
                        break;
                    default:
                        VisualVasFragment.a aVar3 = VisualVasFragment.f320947J0;
                        visualVasFragment.q5().accept(a.b.f13020a);
                        break;
                }
            }
        });
        FrameLayout frameLayout = this.f320968y0;
        if (frameLayout == null) {
            frameLayout = null;
        }
        final int i15 = 0;
        frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.screens.visual.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f320988c;

            {
                this.f320988c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25) {
                VisualVasFragment visualVasFragment = this.f320988c;
                switch (i15) {
                    case 0:
                        VisualVasFragment.a aVar = VisualVasFragment.f320947J0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar = visualVasFragment.f320950C0;
                            if (bVar != null) {
                                RecyclerView recyclerView3 = visualVasFragment.f320966w0;
                                if (recyclerView3 == null) {
                                    recyclerView3 = null;
                                }
                                recyclerView3.r0(bVar);
                            }
                            QL0.b bVar2 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView4 = visualVasFragment.f320966w0;
                            (recyclerView4 != null ? recyclerView4 : null).l(bVar2, -1);
                            visualVasFragment.f320950C0 = bVar2;
                            break;
                        }
                        break;
                    default:
                        VisualVasFragment.a aVar2 = VisualVasFragment.f320947J0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar3 = visualVasFragment.f320950C0;
                            if (bVar3 != null) {
                                RecyclerView recyclerView5 = visualVasFragment.f320966w0;
                                if (recyclerView5 == null) {
                                    recyclerView5 = null;
                                }
                                recyclerView5.r0(bVar3);
                            }
                            QL0.b bVar4 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView6 = visualVasFragment.f320966w0;
                            (recyclerView6 != null ? recyclerView6 : null).l(bVar4, -1);
                            visualVasFragment.f320950C0 = bVar4;
                            break;
                        }
                        break;
                }
            }
        });
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.visual_vas_floating_footer);
        this.f320949B0 = mnzFloatingFooter;
        final int i16 = 1;
        mnzFloatingFooter.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.screens.visual.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f320988c;

            {
                this.f320988c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i162, int i17, int i18, int i19, int i22, int i23, int i24, int i25) {
                VisualVasFragment visualVasFragment = this.f320988c;
                switch (i16) {
                    case 0:
                        VisualVasFragment.a aVar = VisualVasFragment.f320947J0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar = visualVasFragment.f320950C0;
                            if (bVar != null) {
                                RecyclerView recyclerView3 = visualVasFragment.f320966w0;
                                if (recyclerView3 == null) {
                                    recyclerView3 = null;
                                }
                                recyclerView3.r0(bVar);
                            }
                            QL0.b bVar2 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView4 = visualVasFragment.f320966w0;
                            (recyclerView4 != null ? recyclerView4 : null).l(bVar2, -1);
                            visualVasFragment.f320950C0 = bVar2;
                            break;
                        }
                        break;
                    default:
                        VisualVasFragment.a aVar2 = VisualVasFragment.f320947J0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar3 = visualVasFragment.f320950C0;
                            if (bVar3 != null) {
                                RecyclerView recyclerView5 = visualVasFragment.f320966w0;
                                if (recyclerView5 == null) {
                                    recyclerView5 = null;
                                }
                                recyclerView5.r0(bVar3);
                            }
                            QL0.b bVar4 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView6 = visualVasFragment.f320966w0;
                            (recyclerView6 != null ? recyclerView6 : null).l(bVar4, -1);
                            visualVasFragment.f320950C0 = bVar4;
                            break;
                        }
                        break;
                }
            }
        });
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f320956I0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f320963t0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_performance.screens.visual.di.a.a().a((com.avito.android.vas_performance.screens.visual.di.e) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), getF42820b(), this, s.c(this), (String) this.f320953F0.getValue(), (String) this.f320952E0.getValue(), new j()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f320963t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f320964u0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.vas_performance.screens.visual.h q5() {
        return (com.avito.android.vas_performance.screens.visual.h) this.f320961r0.getValue();
    }
}

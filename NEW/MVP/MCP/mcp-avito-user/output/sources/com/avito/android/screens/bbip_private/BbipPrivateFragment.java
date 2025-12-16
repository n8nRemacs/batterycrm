package com.avito.android.screens.bbip_private;

import Cd.C13243a;
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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.screens.bbip_private.BbipPrivateFragment;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
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
import rp0.C47707c;
import rp0.InterfaceC47705a;
import rp0.InterfaceC47706b;
import sp0.C48395c;
import v50.C49166b;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: BbipPrivateFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_private/BbipPrivateFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BbipPrivateFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f260443G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public Button f260444A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public Button f260445B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public RecyclerView f260446C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public ViewGroup f260447D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public MnzFloatingFooter f260448E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public C49899a f260449F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.screens.bbip_private.i f260450n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f260451o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f260452p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f260453q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f260454r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f260455s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ZK0.b f260456t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f260457u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public ProgressBarRe23 f260458v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public Button f260459w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f260460x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public xZ.e f260461y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public FrameLayout f260462z0;

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/BbipPrivateFragment$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC47706b, G0> {
        public final void f(@Y61.k InterfaceC47706b interfaceC47706b) {
            BbipPrivateFragment bbipPrivateFragment = (BbipPrivateFragment) this.receiver;
            a aVar = BbipPrivateFragment.f260443G0;
            bbipPrivateFragment.getClass();
            if (interfaceC47706b instanceof InterfaceC47706b.a) {
                ActivityC22955m activityC22955mL1 = bbipPrivateFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    return;
                }
                return;
            }
            if (interfaceC47706b instanceof InterfaceC47706b.d) {
                InterfaceC47706b.d dVar = (InterfaceC47706b.d) interfaceC47706b;
                InterfaceC47705a interfaceC47705a = dVar.f430243b;
                List listSingletonList = interfaceC47705a != null ? Collections.singletonList(new c.a.C3719a(bbipPrivateFragment.getString(R.string.bbip_error_screen_button), true, null, new com.avito.android.screens.bbip_private.c(bbipPrivateFragment, interfaceC47705a), 4, null)) : null;
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                Throwable th2 = dVar.f430242a;
                com.avito.android.component.toast.c.c(cVar, bbipPrivateFragment, com.avito.android.printable_text.b.f(z.l(th2)), null, listSingletonList, new f.c(th2), 0, ToastBarPosition.f181046d, 938);
                return;
            }
            if (interfaceC47706b instanceof InterfaceC47706b.C12396b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = bbipPrivateFragment.f260455s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC47706b.C12396b) interfaceC47706b).f430240a, null, null, 6);
                return;
            }
            if (interfaceC47706b instanceof InterfaceC47706b.c) {
                RecyclerView recyclerView = bbipPrivateFragment.f260446C0;
                if (recyclerView != null) {
                    recyclerView.A0(0);
                    return;
                }
                return;
            }
            if (interfaceC47706b instanceof InterfaceC47706b.e) {
                ZK0.b bVar = bbipPrivateFragment.f260456t0;
                (bVar != null ? bVar : null).a(((InterfaceC47706b.e) interfaceC47706b).f430244a);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC47706b interfaceC47706b) {
            f(interfaceC47706b);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C47707c, G0> {
        public final void f(@Y61.k C47707c c47707c) {
            Button button;
            Float progress;
            BbipPrivateFragment bbipPrivateFragment = (BbipPrivateFragment) this.receiver;
            a aVar = BbipPrivateFragment.f260443G0;
            bbipPrivateFragment.getClass();
            Throwable th2 = c47707c.f430252g;
            if (th2 != null) {
                D6.w(bbipPrivateFragment.f260458v0);
                Button button2 = bbipPrivateFragment.f260459w0;
                if (button2 != null) {
                    D6.w(button2);
                }
                FrameLayout frameLayout = bbipPrivateFragment.f260462z0;
                if (frameLayout != null) {
                    D6.H(frameLayout);
                }
                RecyclerView recyclerView = bbipPrivateFragment.f260446C0;
                if (recyclerView != null) {
                    D6.w(recyclerView);
                }
                xZ.e eVar = bbipPrivateFragment.f260461y0;
                if (eVar != null) {
                    eVar.d(z.l(th2));
                    return;
                }
                return;
            }
            if (c47707c.f430254i) {
                D6.w(bbipPrivateFragment.f260458v0);
                Button button3 = bbipPrivateFragment.f260459w0;
                if (button3 != null) {
                    D6.w(button3);
                }
                FrameLayout frameLayout2 = bbipPrivateFragment.f260462z0;
                if (frameLayout2 != null) {
                    D6.w(frameLayout2);
                }
                RecyclerView recyclerView2 = bbipPrivateFragment.f260446C0;
                if (recyclerView2 != null) {
                    D6.w(recyclerView2);
                }
                xZ.e eVar2 = bbipPrivateFragment.f260461y0;
                if (eVar2 != null) {
                    eVar2.c();
                    return;
                }
                return;
            }
            uZ.e eVar3 = c47707c.f430247b;
            if (eVar3 != null && (progress = eVar3.getProgress()) != null) {
                float fFloatValue = progress.floatValue();
                ProgressBarRe23 progressBarRe23 = bbipPrivateFragment.f260458v0;
                if (progressBarRe23 != null) {
                    progressBarRe23.setProgress(fFloatValue);
                }
            }
            D6.G(bbipPrivateFragment.f260458v0, (eVar3 != null ? eVar3.getProgress() : null) != null);
            Button button4 = bbipPrivateFragment.f260459w0;
            if (button4 != null) {
                com.avito.android.mnz_common.extensions.i.a(button4, eVar3 != null ? eVar3.getButton() : null);
            }
            Button button5 = bbipPrivateFragment.f260444A0;
            if (button5 != null) {
                com.avito.android.mnz_common.extensions.i.a(button5, c47707c.f430249d);
            }
            Button button6 = bbipPrivateFragment.f260445B0;
            if (button6 != null) {
                com.avito.android.mnz_common.extensions.i.a(button6, c47707c.f430250e);
            }
            Button button7 = bbipPrivateFragment.f260445B0;
            if (button7 != null) {
                button7.setLoading(c47707c.f430255j);
            }
            com.avito.konveyor.adapter.d dVar = bbipPrivateFragment.f260452p0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(c47707c.f430248c, null);
            FrameLayout frameLayout3 = bbipPrivateFragment.f260462z0;
            if (frameLayout3 != null) {
                D6.H(frameLayout3);
            }
            RecyclerView recyclerView3 = bbipPrivateFragment.f260446C0;
            if (recyclerView3 != null) {
                D6.H(recyclerView3);
            }
            xZ.e eVar4 = bbipPrivateFragment.f260461y0;
            if (eVar4 != null) {
                eVar4.b();
            }
            ViewGroup viewGroup = bbipPrivateFragment.f260447D0;
            com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter = c47707c.f430256k;
            if (viewGroup != null) {
                viewGroup.setVisibility(mnzFloatingFooter == null ? 0 : 8);
            }
            MnzFloatingFooter mnzFloatingFooter2 = bbipPrivateFragment.f260448E0;
            if (mnzFloatingFooter2 != null) {
                mnzFloatingFooter2.setVisibility(mnzFloatingFooter == null ? 8 : 0);
            }
            MnzFloatingFooter mnzFloatingFooter3 = bbipPrivateFragment.f260448E0;
            if (mnzFloatingFooter3 != null) {
                com.avito.android.util.text.a aVar2 = bbipPrivateFragment.f260454r0;
                mnzFloatingFooter3.d(mnzFloatingFooter, aVar2 != null ? aVar2 : null, new com.avito.android.screens.bbip_private.d(bbipPrivateFragment), new com.avito.android.screens.bbip_private.e(bbipPrivateFragment));
            }
            Integer num = c47707c.f430257l;
            if (num != null) {
                int iIntValue = num.intValue();
                MnzFloatingFooter mnzFloatingFooter4 = bbipPrivateFragment.f260448E0;
                if (mnzFloatingFooter4 != null && (button = (Button) mnzFloatingFooter4.findViewById(iIntValue)) != null) {
                    button.setLoading(true);
                }
            }
            if (c47707c.f430253h) {
                bbipPrivateFragment.q5().accept(InterfaceC47705a.i.f430237a);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C47707c c47707c) {
            f(c47707c);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = BbipPrivateFragment.f260443G0;
            BbipPrivateFragment.this.q5().accept(new InterfaceC47705a.d(deepLink, false, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Integer, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = BbipPrivateFragment.f260443G0;
            BbipPrivateFragment.this.q5().accept(new InterfaceC47705a.e(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<BbipPrivateBudgetItem.Budget, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetItem.Budget budget) {
            a aVar = BbipPrivateFragment.f260443G0;
            BbipPrivateFragment.this.q5().accept(new InterfaceC47705a.b(budget));
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<BbipPrivateBudgetWidgetItem.Budget, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetWidgetItem.Budget budget) {
            a aVar = BbipPrivateFragment.f260443G0;
            BbipPrivateFragment.this.q5().accept(new InterfaceC47705a.c(budget));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f260467l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f260467l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f260467l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BbipPrivateFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f260469l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f260469l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f260469l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260470l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260470l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f260470l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f260471l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f260471l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f260471l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BbipPrivateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/screens/bbip_private/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.screens.bbip_private.h> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.screens.bbip_private.h invoke() {
            com.avito.android.screens.bbip_private.i iVar = BbipPrivateFragment.this.f260450n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.screens.bbip_private.h) iVar.get();
        }
    }

    public BbipPrivateFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f260457u0 = new O0(m0.f406844a.b(com.avito.android.screens.bbip_private.h.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f260451o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f260451o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, BbipPrivateFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateOneTimeEvent;)V", 0), new c(1, this, BbipPrivateFragment.class, "render", "render(Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateState;)V", 0));
        return layoutInflater.inflate(R.layout.bbip_private_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView = this.f260446C0;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_close24, R.attr.black));
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_private.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipPrivateFragment f260474c;

            {
                this.f260474c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipPrivateFragment bbipPrivateFragment = this.f260474c;
                switch (i12) {
                    case 0:
                        BbipPrivateFragment.a aVar = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.C12395a.f430228a);
                        break;
                    case 1:
                        BbipPrivateFragment.a aVar2 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.f.f430234a);
                        break;
                    case 2:
                        BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.h.f430236a);
                        break;
                    case 3:
                        BbipPrivateFragment.a aVar4 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.j.f430238a);
                        break;
                    default:
                        BbipPrivateFragment.a aVar5 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(new InterfaceC47705a.g(null, 1, null));
                        break;
                }
            }
        });
        this.f260458v0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_private.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipPrivateFragment f260474c;

            {
                this.f260474c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipPrivateFragment bbipPrivateFragment = this.f260474c;
                switch (i13) {
                    case 0:
                        BbipPrivateFragment.a aVar = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.C12395a.f430228a);
                        break;
                    case 1:
                        BbipPrivateFragment.a aVar2 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.f.f430234a);
                        break;
                    case 2:
                        BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.h.f430236a);
                        break;
                    case 3:
                        BbipPrivateFragment.a aVar4 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.j.f430238a);
                        break;
                    default:
                        BbipPrivateFragment.a aVar5 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(new InterfaceC47705a.g(null, 1, null));
                        break;
                }
            }
        });
        this.f260459w0 = button;
        this.f260460x0 = (ShimmerLayout) view.findViewById(R.id.bbip_private_shimmer);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bbip_private_content);
        this.f260462z0 = frameLayout;
        final int i14 = 2;
        this.f260461y0 = new xZ.e(frameLayout, new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_private.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipPrivateFragment f260474c;

            {
                this.f260474c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipPrivateFragment bbipPrivateFragment = this.f260474c;
                switch (i14) {
                    case 0:
                        BbipPrivateFragment.a aVar = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.C12395a.f430228a);
                        break;
                    case 1:
                        BbipPrivateFragment.a aVar2 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.f.f430234a);
                        break;
                    case 2:
                        BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.h.f430236a);
                        break;
                    case 3:
                        BbipPrivateFragment.a aVar4 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.j.f430238a);
                        break;
                    default:
                        BbipPrivateFragment.a aVar5 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(new InterfaceC47705a.g(null, 1, null));
                        break;
                }
            }
        }, this.f260460x0);
        Button button2 = (Button) view.findViewById(R.id.bbip_private_skip);
        final int i15 = 3;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_private.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipPrivateFragment f260474c;

            {
                this.f260474c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipPrivateFragment bbipPrivateFragment = this.f260474c;
                switch (i15) {
                    case 0:
                        BbipPrivateFragment.a aVar = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.C12395a.f430228a);
                        break;
                    case 1:
                        BbipPrivateFragment.a aVar2 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.f.f430234a);
                        break;
                    case 2:
                        BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.h.f430236a);
                        break;
                    case 3:
                        BbipPrivateFragment.a aVar4 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.j.f430238a);
                        break;
                    default:
                        BbipPrivateFragment.a aVar5 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(new InterfaceC47705a.g(null, 1, null));
                        break;
                }
            }
        });
        this.f260444A0 = button2;
        Button button3 = (Button) view.findViewById(R.id.bbip_private_next);
        final int i16 = 4;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.screens.bbip_private.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BbipPrivateFragment f260474c;

            {
                this.f260474c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BbipPrivateFragment bbipPrivateFragment = this.f260474c;
                switch (i16) {
                    case 0:
                        BbipPrivateFragment.a aVar = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.C12395a.f430228a);
                        break;
                    case 1:
                        BbipPrivateFragment.a aVar2 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.f.f430234a);
                        break;
                    case 2:
                        BbipPrivateFragment.a aVar3 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.h.f430236a);
                        break;
                    case 3:
                        BbipPrivateFragment.a aVar4 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(InterfaceC47705a.j.f430238a);
                        break;
                    default:
                        BbipPrivateFragment.a aVar5 = BbipPrivateFragment.f260443G0;
                        bbipPrivateFragment.q5().accept(new InterfaceC47705a.g(null, 1, null));
                        break;
                }
            }
        });
        this.f260445B0 = button3;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bbip_private_list);
        com.avito.konveyor.adapter.d dVar = this.f260452p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C48395c(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f260451o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f260446C0 = recyclerView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bbip_private_buttons);
        viewGroup.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(2, this, viewGroup));
        this.f260447D0 = viewGroup;
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.bbip_floating_footer);
        mnzFloatingFooter.addOnLayoutChangeListener(new com.avito.android.bbl.screens.configure.v2.d(2, this, mnzFloatingFooter));
        this.f260448E0 = mnzFloatingFooter;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f260451o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.screens.bbip_private.di.m.a().a((InterfaceC40934b) C29972i.a(C29972i.b(this), InterfaceC40934b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "item_id"), com.avito.android.mnz_common.extensions.d.c(this, "checkout_context"), new d(), new e(), new f(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f260451o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f260451o0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f260455s0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.screens.bbip_private.h q5() {
        return (com.avito.android.screens.bbip_private.h) this.f260457u0.getValue();
    }
}

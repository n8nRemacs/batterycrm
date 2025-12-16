package com.avito.android.vas_discount.v2.ui;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.user_adverts_views_pub.a;
import com.avito.konveyor.adapter.j;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import nL0.C44290a;
import rL0.C47561a;
import rL0.C47562b;
import z1.AbstractC50339a;

/* compiled from: VasDiscountV2DialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_discount/v2/ui/VasDiscountV2DialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasDiscountV2DialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f319825s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f319826h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_discount.v2.di.b f319827i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f319828j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f319829k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public C47562b f319830l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final O0 f319831m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f319832n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f319833o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f319834p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public RecyclerView f319835q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f319836r0;

    /* compiled from: VasDiscountV2DialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_discount/v2/ui/VasDiscountV2DialogFragment$a;", "", "<init>", "()V", "", "KEY_CONTEXT", "Ljava/lang/String;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasDiscountV2DialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        public final void f(@k View view) {
            VasDiscountV2DialogFragment vasDiscountV2DialogFragment = (VasDiscountV2DialogFragment) this.receiver;
            a aVar = VasDiscountV2DialogFragment.f319825s0;
            vasDiscountV2DialogFragment.getClass();
            vasDiscountV2DialogFragment.f319835q0 = (RecyclerView) view.findViewById(R.id.recycler_view);
            com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.placeholder), R.id.recycler_view, null, 0, 0, 28, null);
            vasDiscountV2DialogFragment.f319836r0 = lVar;
            lVar.f231600j = new com.avito.android.vas_discount.v2.ui.b(vasDiscountV2DialogFragment);
            RecyclerView recyclerView = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView != null) {
                vasDiscountV2DialogFragment.requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
            }
            RecyclerView recyclerView2 = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView2 != null) {
                j jVar = vasDiscountV2DialogFragment.f319833o0;
                if (jVar == null) {
                    jVar = null;
                }
                recyclerView2.setAdapter(jVar);
            }
            RecyclerView recyclerView3 = vasDiscountV2DialogFragment.f319835q0;
            if (recyclerView3 != null) {
                recyclerView3.l(new C44290a(vasDiscountV2DialogFragment.getResources()), -1);
            }
            Set<TV0.d<?, ?>> set = vasDiscountV2DialogFragment.f319834p0;
            if (set == null) {
                set = null;
            }
            List listD = C43033p.D(new o0(C43033p.i(new C42770s0(set), com.avito.android.vas_discount.v2.ui.a.f319843l), com.avito.android.vas_discount.v2.ui.f.f319846l));
            boolean zIsEmpty = listD.isEmpty();
            io.reactivex.rxjava3.disposables.c cVar = vasDiscountV2DialogFragment.f319826h0;
            if (!zIsEmpty) {
                cVar.b(z.h0(listD).t0(new com.avito.android.vas_discount.v2.ui.g(vasDiscountV2DialogFragment)));
            }
            com.avito.android.vas_discount.v2.di.b bVar = vasDiscountV2DialogFragment.f319827i0;
            if (bVar == null) {
                bVar = null;
            }
            io.reactivex.rxjava3.subjects.e<a.InterfaceC9834a> eVar = bVar.f319778b;
            eVar.getClass();
            cVar.b(new C41981q0(eVar).t0(new com.avito.android.vas_discount.v2.ui.e(vasDiscountV2DialogFragment)));
            ScreenPerformanceTracker screenPerformanceTracker = vasDiscountV2DialogFragment.f319829k0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.b(vasDiscountV2DialogFragment, screenPerformanceTracker, (C47561a) vasDiscountV2DialogFragment.f319831m0.getValue(), new com.avito.android.vas_discount.v2.ui.c(1, vasDiscountV2DialogFragment, VasDiscountV2DialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2OneTimeEvent;)V", 0), new com.avito.android.vas_discount.v2.ui.d(1, vasDiscountV2DialogFragment, VasDiscountV2DialogFragment.class, "render", "render(Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2State;)V", 0));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f319837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f319837l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f319837l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VasDiscountV2DialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f319839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f319839l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f319839l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f319840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f319840l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f319840l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f319841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f319841l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f319841l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VasDiscountV2DialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrL0/a;", "kotlin.jvm.PlatformType", "invoke", "()LrL0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<C47561a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final C47561a invoke() {
            C47562b c47562b = VasDiscountV2DialogFragment.this.f319830l0;
            if (c47562b == null) {
                c47562b = null;
            }
            return (C47561a) c47562b.get();
        }
    }

    public VasDiscountV2DialogFragment() {
        super(0, 1, null);
        this.f319826h0 = new io.reactivex.rxjava3.disposables.c();
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f319831m0 = new O0(m0.f406844a.b(C47561a.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_discount.v2.di.a.a().a(cv.c.b(this), (com.avito.android.vas_discount.di.d) C29972i.a(C29972i.b(this), com.avito.android.vas_discount.di.d.class), s.b(this), com.avito.android.mnz_common.extensions.d.c(this, "context")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f319829k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f319829k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.vas_discount_v2_dialog_fragment, true, new b(1, this, VasDiscountV2DialogFragment.class, "initViews", "initViews(Landroid/view/View;)V", 0));
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(getResources().getDimensionPixelOffset(R.dimen.dialog_peek_height));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, true, false, 10);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f319826h0.e();
    }
}

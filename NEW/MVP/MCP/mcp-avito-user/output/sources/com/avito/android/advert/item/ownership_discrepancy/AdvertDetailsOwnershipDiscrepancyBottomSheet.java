package com.avito.android.advert.item.ownership_discrepancy;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.OwnershipDiscrepancyBottomSheetScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: AdvertDetailsOwnershipDiscrepancyBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/AdvertDetailsOwnershipDiscrepancyBottomSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsOwnershipDiscrepancyBottomSheet extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.ownership_discrepancy.e f78074h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f78075i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f78076j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.data.a f78077k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f78078l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final C35968w3 f78079m0;

    /* renamed from: n0, reason: collision with root package name */
    public Z0 f78080n0;

    /* renamed from: o0, reason: collision with root package name */
    public LinearLayout f78081o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f78082p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public TextView f78083q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public Button f78084r0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f78073t0 = {m0.f406844a.e(new Y(AdvertDetailsOwnershipDiscrepancyBottomSheet.class, "openParams", "getOpenParams()Lcom/avito/android/advert/item/ownership_discrepancy/OwnershipDiscrepancyOpenParams;", 0))};

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f78072s0 = new a(null);

    /* compiled from: AdvertDetailsOwnershipDiscrepancyBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/AdvertDetailsOwnershipDiscrepancyBottomSheet$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsOwnershipDiscrepancyBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = AdvertDetailsOwnershipDiscrepancyBottomSheet.f78072s0;
            AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet = AdvertDetailsOwnershipDiscrepancyBottomSheet.this;
            advertDetailsOwnershipDiscrepancyBottomSheet.f78082p0 = (TextView) view2.findViewById(R.id.description);
            advertDetailsOwnershipDiscrepancyBottomSheet.f78083q0 = (TextView) view2.findViewById(R.id.title);
            advertDetailsOwnershipDiscrepancyBottomSheet.f78084r0 = (Button) view2.findViewById(R.id.button);
            advertDetailsOwnershipDiscrepancyBottomSheet.f78081o0 = (LinearLayout) view2.findViewById(R.id.values_container);
            ScreenPerformanceTracker screenPerformanceTracker = advertDetailsOwnershipDiscrepancyBottomSheet.f78076j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            screenPerformanceTracker.d();
            com.avito.android.arch.mvi.android.f.a((com.avito.android.advert.item.ownership_discrepancy.d) advertDetailsOwnershipDiscrepancyBottomSheet.f78075i0.getValue(), advertDetailsOwnershipDiscrepancyBottomSheet, Lifecycle.State.f46682e, new com.avito.android.advert.item.ownership_discrepancy.a(1, advertDetailsOwnershipDiscrepancyBottomSheet, AdvertDetailsOwnershipDiscrepancyBottomSheet.class, "handleEvent", "handleEvent(Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyOneTimeEvent;)V", 0), new com.avito.android.advert.item.ownership_discrepancy.b(advertDetailsOwnershipDiscrepancyBottomSheet));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f78086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f78086l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f78086l);
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
            return AdvertDetailsOwnershipDiscrepancyBottomSheet.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f78088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f78088l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f78088l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f78089l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f78089l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f78089l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f78090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f78090l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f78090l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertDetailsOwnershipDiscrepancyBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/advert/item/ownership_discrepancy/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.advert.item.ownership_discrepancy.d> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.advert.item.ownership_discrepancy.d invoke() {
            com.avito.android.advert.item.ownership_discrepancy.e eVar = AdvertDetailsOwnershipDiscrepancyBottomSheet.this.f78074h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.advert.item.ownership_discrepancy.d) eVar.get();
        }
    }

    public AdvertDetailsOwnershipDiscrepancyBottomSheet() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f78075i0 = new O0(m0.f406844a.b(com.avito.android.advert.item.ownership_discrepancy.d.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f78079m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.advert.item.ownership_discrepancy.di.a.a().a((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), (com.avito.android.advert.item.ownership_discrepancy.di.c) C29972i.a(C29972i.b(this), com.avito.android.advert.item.ownership_discrepancy.di.c.class), new C28478k(OwnershipDiscrepancyBottomSheetScreen.f90443d, s.b(this), null, 4, null), (OwnershipDiscrepancyOpenParams) this.f78079m0.getValue(this, f78073t0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f78076j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f78076j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Dialog_Re23), 0, 2, null);
        j.b(dVar, true, 4);
        dVar.setCancelable(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.C(R.layout.advert_details_ownership_discrepancy_bottom_sheet, new b());
        return dVar;
    }
}

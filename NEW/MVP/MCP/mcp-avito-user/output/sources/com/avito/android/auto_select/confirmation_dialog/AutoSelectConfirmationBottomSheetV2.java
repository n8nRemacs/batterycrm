package com.avito.android.auto_select.confirmation_dialog;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Cd.C13243a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cf.InterfaceC27184a;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auto_select.booking.domain.models.AutoSelectConfirmationDialogData;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import df.C39720a;
import df.C39721b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/AutoSelectConfirmationBottomSheetV2;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectConfirmationBottomSheetV2 extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f95871h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public C39721b f95872i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f95873j0;

    /* renamed from: k0, reason: collision with root package name */
    public TextView f95874k0;

    /* renamed from: l0, reason: collision with root package name */
    public LinearLayout f95875l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f95870n0 = {m0.f406844a.e(new Y(AutoSelectConfirmationBottomSheetV2.class, "confirmationDataOpenParams", "getConfirmationDataOpenParams$_avito_auto_select_impl()Lcom/avito/android/auto_select/booking/domain/models/AutoSelectConfirmationDialogData;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f95869m0 = new a(null);

    /* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/AutoSelectConfirmationBottomSheetV2$a;", "", "<init>", "()V", "", "DEEPLINK_KEY", "Ljava/lang/String;", "REFRESH_ON_CLOSE_KEY", "TAG", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2 = AutoSelectConfirmationBottomSheetV2.this;
            com.avito.android.arch.mvi.android.f.a((C39720a) autoSelectConfirmationBottomSheetV2.f95873j0.getValue(), autoSelectConfirmationBottomSheetV2, Lifecycle.State.f46682e, new com.avito.android.auto_select.confirmation_dialog.f(1, autoSelectConfirmationBottomSheetV2, AutoSelectConfirmationBottomSheetV2.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_select/booking/mvi/entity/AutoSelectBookingOneTimeEvent;)V", 0), new com.avito.android.auto_select.confirmation_dialog.h(autoSelectConfirmationBottomSheetV2));
            return G0.f406611a;
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2 = AutoSelectConfirmationBottomSheetV2.this;
            ((C39720a) autoSelectConfirmationBottomSheetV2.f95873j0.getValue()).accept(new InterfaceC27184a.b(null, null, autoSelectConfirmationBottomSheetV2.g5().f95832c.f95923e, 3, null));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f95878l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f95878l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f95878l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AutoSelectConfirmationBottomSheetV2.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f95880l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f95880l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f95880l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95881l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95881l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f95881l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95882l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95882l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f95882l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldf/a;", "kotlin.jvm.PlatformType", "invoke", "()Ldf/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<C39720a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final C39720a invoke() {
            C39721b c39721b = AutoSelectConfirmationBottomSheetV2.this.f95872i0;
            if (c39721b == null) {
                c39721b = null;
            }
            return (C39720a) c39721b.get();
        }
    }

    public AutoSelectConfirmationBottomSheetV2() {
        super(0, 1, null);
        this.f95871h0 = new C35968w3(this);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f95873j0 = new O0(m0.f406844a.b(C39720a.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.auto_select.booking.di.d.a().a(cv.c.b(this), (com.avito.android.auto_select.booking.di.a) C29972i.a(C29972i.b(this), com.avito.android.auto_select.booking.di.a.class), g5()).a(this);
    }

    public final void f5(boolean z12) {
        if (!z12) {
            dismiss();
            return;
        }
        AutoSelectConfirmationDialogData autoSelectConfirmationDialogDataG5 = g5();
        getParentFragmentManager().o0(C22777e.b(new Q("refresh_on_close", Boolean.TRUE)), autoSelectConfirmationDialogDataG5.f95833d);
        dismissAllowingStateLoss();
    }

    @Y61.k
    public final AutoSelectConfirmationDialogData g5() {
        return (AutoSelectConfirmationDialogData) this.f95871h0.getValue(this, f95870n0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.C(R.layout.auto_select_confirmation_dialog_content, new b());
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, g5().f95832c.f95920b, true, dVar.getContext().getResources().getDimensionPixelOffset(R.dimen.auto_select_core_confirmation_dialog_horizontal_padding), dVar.getContext().getResources().getDimensionPixelOffset(R.dimen.auto_select_core_confirmation_dialog_title_end_padding), 0, 96);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.R(new c());
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 11));
        this.f95874k0 = (TextView) dVar.findViewById(R.id.auto_select_confirmation_dialog_desc);
        this.f95875l0 = (LinearLayout) dVar.findViewById(R.id.auto_select_confirmation_dialog_block);
        return dVar;
    }
}

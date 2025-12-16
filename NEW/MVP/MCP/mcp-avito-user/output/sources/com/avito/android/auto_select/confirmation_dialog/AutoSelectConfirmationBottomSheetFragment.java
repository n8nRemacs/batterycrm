package com.avito.android.auto_select.confirmation_dialog;

import Cd.r;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auto_select.confirmation_dialog.j;
import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
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
import p002if.InterfaceC41393a;
import z1.AbstractC50339a;

/* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/AutoSelectConfirmationBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectConfirmationBottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public j.a f95855h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f95856i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f95857j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f95858k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f95859l0;

    /* renamed from: m0, reason: collision with root package name */
    public Button f95860m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f95854o0 = {m0.f406844a.e(new Y(AutoSelectConfirmationBottomSheetFragment.class, "openParams", "getOpenParams()Lcom/avito/android/deep_linking/links/AutoSelectContactConfirmation;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f95853n0 = new a(null);

    /* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/AutoSelectConfirmationBottomSheetFragment$a;", "", "<init>", "()V", "", "DEEPLINK_KEY", "Ljava/lang/String;", "RESULT_TAG", "TAG", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment = AutoSelectConfirmationBottomSheetFragment.this;
            com.avito.android.arch.mvi.android.f.a((j) autoSelectConfirmationBottomSheetFragment.f95856i0.getValue(), autoSelectConfirmationBottomSheetFragment, Lifecycle.State.f46682e, new com.avito.android.auto_select.confirmation_dialog.a(1, autoSelectConfirmationBottomSheetFragment, AutoSelectConfirmationBottomSheetFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetOneTimeEvent;)V", 0), new com.avito.android.auto_select.confirmation_dialog.c(autoSelectConfirmationBottomSheetFragment));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f95863m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f95863m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(AutoSelectConfirmationBottomSheetFragment.this, this.f95863m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AutoSelectConfirmationBottomSheetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f95865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f95865l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f95865l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95866l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95866l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f95866l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95867l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95867l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f95867l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/auto_select/confirmation_dialog/j;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/auto_select/confirmation_dialog/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, j> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final j invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            j.a aVar = AutoSelectConfirmationBottomSheetFragment.this.f95855h0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public AutoSelectConfirmationBottomSheetFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f95856i0 = new O0(m0.f406844a.b(j.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f95858k0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.auto_select.confirmation_dialog.di.b.a().a(cv.c.b(this), (InterfaceC41393a) C29972i.a(C29972i.b(this), InterfaceC41393a.class), (AutoSelectContactConfirmation) this.f95858k0.getValue(this, f95854o0[0])).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.AutoSelectConfirmationBottomSheet);
        dVar.C(R.layout.confirmation_dialog_content, new b());
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, ((AutoSelectContactConfirmation) this.f95858k0.getValue(this, f95854o0[0])).getTitle(), false, 0, 0, 0, 120);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        this.f95859l0 = (TextView) dVar.findViewById(R.id.text_content);
        this.f95860m0 = (Button) dVar.findViewById(R.id.action_button);
        return dVar;
    }
}

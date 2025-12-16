package com.avito.android.important_addresses_selection.presentation;

import Cd.C13243a;
import QM.a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.ImportantAddressesSelectionScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.mvi.m;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: ImportantAddressesSelectionDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/ImportantAddressesSelectionDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImportantAddressesSelectionDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final a f169783p0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public m f169784h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f169785i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f169786j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f169787k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f169788l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public ImportantAddressesSelectionData f169789m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f169790n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public Button f169791o0;

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/ImportantAddressesSelectionDialogFragment$a;", "", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C5017a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ImportantAddressesSelectionData f169792l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5017a(ImportantAddressesSelectionData importantAddressesSelectionData) {
                super(1);
                this.f169792l = importantAddressesSelectionData;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key.important_addresses_selection_dialog_fragment_data", this.f169792l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ImportantAddressesSelectionDialogFragment a(@Y61.k ImportantAddressesSelectionData importantAddressesSelectionData) {
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = new ImportantAddressesSelectionDialogFragment();
            C35966w1.a(importantAddressesSelectionDialogFragment, 1, new C5017a(importantAddressesSelectionData));
            return importantAddressesSelectionDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/important_addresses_selection/presentation/ImportantAddressesSelectionDialogFragment$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, R.style.Re23_BottomSheet_Default);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            super.onBackPressed();
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = ImportantAddressesSelectionDialogFragment.this;
            String tag = importantAddressesSelectionDialogFragment.getTag();
            if (tag == null) {
                tag = "";
            }
            C22960s.a(C22777e.a(), importantAddressesSelectionDialogFragment, tag);
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = (ImportantAddressesSelectionDialogFragment) this.receiver;
            a aVar = ImportantAddressesSelectionDialogFragment.f169783p0;
            importantAddressesSelectionDialogFragment.getClass();
            Button button = (Button) view.findViewById(R.id.main_button);
            ImportantAddressesSelectionData importantAddressesSelectionData = importantAddressesSelectionDialogFragment.f169789m0;
            if (importantAddressesSelectionData == null) {
                importantAddressesSelectionData = null;
            }
            com.avito.android.lib.design.button.b.a(button, importantAddressesSelectionData.f169765g.f169781b, false);
            ImportantAddressesSelectionData importantAddressesSelectionData2 = importantAddressesSelectionDialogFragment.f169789m0;
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d((importantAddressesSelectionData2 != null ? importantAddressesSelectionData2 : null).f169765g.f169782c));
            button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(23, button, importantAddressesSelectionDialogFragment));
            importantAddressesSelectionDialogFragment.f169791o0 = button;
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = (ImportantAddressesSelectionDialogFragment) this.receiver;
            com.avito.konveyor.adapter.a aVar = importantAddressesSelectionDialogFragment.f169787k0;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.konveyor.adapter.j jVar = importantAddressesSelectionDialogFragment.f169788l0;
            if (jVar == null) {
                jVar = null;
            }
            C43259k.d(C22981N.a(importantAddressesSelectionDialogFragment.getLifecycle()), null, null, new com.avito.android.important_addresses_selection.presentation.a(importantAddressesSelectionDialogFragment, new com.avito.android.important_addresses_selection.presentation.d(view, aVar, jVar), null), 3);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f169795m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar) {
            super(0);
            this.f169795m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment = ImportantAddressesSelectionDialogFragment.this;
            String tag = importantAddressesSelectionDialogFragment.getTag();
            if (tag == null) {
                tag = "";
            }
            C22960s.a(C22777e.a(), importantAddressesSelectionDialogFragment, tag);
            this.f169795m.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSM/a;", "it", "Lkotlin/G0;", "invoke", "(LSM/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<SM.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SM.a aVar) {
            a aVar2 = ImportantAddressesSelectionDialogFragment.f169783p0;
            ((com.avito.android.important_addresses_selection.presentation.mvi.l) ImportantAddressesSelectionDialogFragment.this.f169785i0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f169797l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f169797l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f169797l);
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
            return ImportantAddressesSelectionDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f169799l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f169799l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f169799l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f169800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f169800l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f169800l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f169801l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f169801l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f169801l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImportantAddressesSelectionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/important_addresses_selection/presentation/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.important_addresses_selection.presentation.mvi.l> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.important_addresses_selection.presentation.mvi.l invoke() {
            m mVar = ImportantAddressesSelectionDialogFragment.this.f169784h0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.important_addresses_selection.presentation.mvi.l) mVar.get();
        }
    }

    public ImportantAddressesSelectionDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f169785i0 = new O0(m0.f406844a.b(com.avito.android.important_addresses_selection.presentation.mvi.l.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(ImportantAddressesSelectionScreen.f90378d, s.b(this), null, 4, null);
        a.InterfaceC0899a interfaceC0899aNi = ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Ni();
        cv.d dVarD = cv.c.d(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ImportantAddressesSelectionData importantAddressesSelectionData = (ImportantAddressesSelectionData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key.important_addresses_selection_dialog_fragment_data", ImportantAddressesSelectionData.class) : arguments.getParcelable("key.important_addresses_selection_dialog_fragment_data"));
            if (importantAddressesSelectionData != null) {
                interfaceC0899aNi.a(dVarD, importantAddressesSelectionData, new f(), c28478k, getResources(), c28478k.f90637b).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f169786j0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f169786j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        b bVar = new b(com.avito.android.lib.deprecated_design.f.a(requireContext(), "avitoRe23"));
        com.avito.android.lib.design.bottom_sheet.d.I(bVar, true);
        bVar.B(R.layout.important_addresses_selection_fragment, R.layout.important_addresses_selection_footer, new d(1, this, ImportantAddressesSelectionDialogFragment.class, "onInflated", "onInflated(Landroid/view/View;)V", 0), new c(1, this, ImportantAddressesSelectionDialogFragment.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), true);
        ImportantAddressesSelectionData importantAddressesSelectionData = this.f169789m0;
        if (importantAddressesSelectionData == null) {
            importantAddressesSelectionData = null;
        }
        com.avito.android.lib.design.bottom_sheet.d.M(bVar, importantAddressesSelectionData.f169760b, true, true, 2);
        bVar.R(new e(bVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f169786j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }
}

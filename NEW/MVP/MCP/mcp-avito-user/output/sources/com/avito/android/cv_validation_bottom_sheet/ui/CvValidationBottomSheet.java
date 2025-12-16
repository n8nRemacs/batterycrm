package com.avito.android.cv_validation_bottom_sheet.ui;

import Cd.C13243a;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.cv_validation_bottom_sheet.list.CvItem;
import com.avito.android.cv_validation_bottom_sheet.mvi.a;
import com.avito.android.cv_validation_bottom_sheet.mvi.t;
import com.avito.android.cv_validation_bottom_sheet.mvi.u;
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
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: CvValidationBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvValidationBottomSheet extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f131927h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.provider.a f131928i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f131929j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f131930k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public u f131931l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final O0 f131932m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f131933n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public Button f131934o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f131935p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public TextView f131936q0;

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f131926s0 = {m0.f406844a.e(new Y(CvValidationBottomSheet.class, "openParams", "getOpenParams()Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetOpenParams;", 0))};

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f131925r0 = new a(null);

    /* compiled from: CvValidationBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheet$a;", "", "<init>", "()V", "", "CV_VALIDATION_BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "CV_VALIDATION_BOTTOM_SHEET_RESULT_KEY", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvValidationBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CvValidationBottomSheet cvValidationBottomSheet = (CvValidationBottomSheet) this.receiver;
            a aVar = CvValidationBottomSheet.f131925r0;
            com.avito.android.arch.mvi.android.f.a((t) cvValidationBottomSheet.f131932m0.getValue(), cvValidationBottomSheet, Lifecycle.State.f46682e, new com.avito.android.cv_validation_bottom_sheet.ui.a(1, cvValidationBottomSheet, CvValidationBottomSheet.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_validation_bottom_sheet/mvi/CvValidationBottomSheetOneTimeEvent;)V", 0), new com.avito.android.cv_validation_bottom_sheet.ui.b(1, cvValidationBottomSheet, CvValidationBottomSheet.class, "renderState", "renderState(Lcom/avito/android/cv_validation_bottom_sheet/mvi/CvValidationBottomSheetState;)V", 0));
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
            com.avito.konveyor.adapter.j jVar = cvValidationBottomSheet.f131930k0;
            if (jVar == null) {
                jVar = null;
            }
            recyclerView.setAdapter(jVar);
            cvValidationBottomSheet.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            cvValidationBottomSheet.f131935p0 = (TextView) view2.findViewById(R.id.cv_validation_title);
            View viewFindViewById = view2.findViewById(R.id.description);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            cvValidationBottomSheet.f131936q0 = (TextView) viewFindViewById;
            return G0.f406611a;
        }
    }

    /* compiled from: CvValidationBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            CvValidationBottomSheet cvValidationBottomSheet = (CvValidationBottomSheet) this.receiver;
            a aVar = CvValidationBottomSheet.f131925r0;
            cvValidationBottomSheet.getClass();
            Button button = (Button) view.findViewById(R.id.main_button);
            cvValidationBottomSheet.f131934o0 = button;
            if (button != null) {
                button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(cvValidationBottomSheet, 19));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CvValidationBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CvValidationBottomSheet.f131925r0;
            ((t) CvValidationBottomSheet.this.f131932m0.getValue()).accept(a.c.f131872a);
            return G0.f406611a;
        }
    }

    /* compiled from: CvValidationBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/list/CvItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/cv_validation_bottom_sheet/list/CvItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<CvItem, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CvItem cvItem) {
            a aVar = CvValidationBottomSheet.f131925r0;
            ((t) CvValidationBottomSheet.this.f131932m0.getValue()).accept(new a.b(cvItem));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f131939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f131939l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f131939l);
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
            return CvValidationBottomSheet.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f131941l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f131941l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f131941l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131942l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131942l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f131942l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131943l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131943l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f131943l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CvValidationBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cv_validation_bottom_sheet/mvi/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<t> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = CvValidationBottomSheet.this.f131931l0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public CvValidationBottomSheet() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f131932m0 = new O0(m0.f406844a.b(t.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f131933n0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.cv_validation_bottom_sheet.di.i.a().a((CvValidationBottomSheetOpenParams) this.f131933n0.getValue(this, f131926s0[0]), getResources(), new e(), (com.avito.android.cv_validation_bottom_sheet.di.b) C29972i.a(C29972i.b(this), com.avito.android.cv_validation_bottom_sheet.di.b.class), cv.c.b(this)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.B(R.layout.cv_validation_bottom_sheet, R.layout.cv_validation_footer, new b(1, this, CvValidationBottomSheet.class, "onInflated", "onInflated(Landroid/view/View;)V", 0), new c(1, this, CvValidationBottomSheet.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.R(new d());
        InterfaceC28373a interfaceC28373a = this.f131927h0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        String strValueOf = String.valueOf(((CvValidationBottomSheetOpenParams) this.f131933n0.getValue(this, f131926s0[0])).f131951h);
        com.avito.android.analytics.provider.a aVar = this.f131928i0;
        interfaceC28373a.c(new St.b(strValueOf, (aVar != null ? aVar : null).a()));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f131934o0 = null;
        this.f131935p0 = null;
        this.f131936q0 = null;
    }
}

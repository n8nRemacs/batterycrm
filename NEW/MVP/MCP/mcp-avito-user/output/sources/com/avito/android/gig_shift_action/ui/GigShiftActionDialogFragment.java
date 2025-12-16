package com.avito.android.gig_shift_action.ui;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.gig_shift_action.mvi.a;
import com.avito.android.gig_shift_action.mvi.x;
import com.avito.android.gig_shift_action.mvi.y;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
import com.avito.android.gig_shift_action.ui.GigShiftActionResult;
import com.avito.android.gig_snippet.GigSingleSnippetWidget;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
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

/* compiled from: GigShiftActionDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftActionDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public y f160552h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f160553i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final C35968w3 f160554j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public TextView f160555k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public TextView f160556l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public Button f160557m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public Button f160558n0;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public View f160559o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public TextView f160560p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public TextView f160561q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public View f160562r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public View f160563s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public RadioGroup f160564t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public GigSingleSnippetWidget f160565u0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f160551w0 = {m0.f406844a.e(new Y(GigShiftActionDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/gig_shift_action/ui/GigShiftActionOpenParams;", 0))};

    /* renamed from: v0, reason: collision with root package name */
    @k
    public static final a f160550v0 = new a(null);

    /* compiled from: GigShiftActionDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionDialogFragment$a;", "", "<init>", "()V", "", "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GigShiftActionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f160567m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f160567m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = GigShiftActionDialogFragment.f160550v0;
            final GigShiftActionDialogFragment gigShiftActionDialogFragment = GigShiftActionDialogFragment.this;
            View viewFindViewById = view2.findViewById(R.id.gig_shift_action_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigShiftActionDialogFragment.f160555k0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigShiftActionDialogFragment.f160556l0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            gigShiftActionDialogFragment.f160557m0 = (Button) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.secondary_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            gigShiftActionDialogFragment.f160558n0 = (Button) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.snippet_widget);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.gig_snippet.GigSingleSnippetWidget");
            }
            gigShiftActionDialogFragment.f160565u0 = (GigSingleSnippetWidget) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.error_layout);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            gigShiftActionDialogFragment.f160559o0 = viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.error_title);
            if (viewFindViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigShiftActionDialogFragment.f160560p0 = (TextView) viewFindViewById7;
            View viewFindViewById8 = view2.findViewById(R.id.error_description);
            if (viewFindViewById8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            gigShiftActionDialogFragment.f160561q0 = (TextView) viewFindViewById8;
            View viewFindViewById9 = view2.findViewById(R.id.not_found_layout);
            if (viewFindViewById9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            gigShiftActionDialogFragment.f160562r0 = viewFindViewById9;
            View viewFindViewById10 = view2.findViewById(R.id.reasons_layout);
            if (viewFindViewById10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            gigShiftActionDialogFragment.f160563s0 = viewFindViewById10;
            View viewFindViewById11 = view2.findViewById(R.id.radio_group);
            if (viewFindViewById11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.radio.RadioGroup");
            }
            gigShiftActionDialogFragment.f160564t0 = (RadioGroup) viewFindViewById11;
            com.avito.android.arch.mvi.android.f.a(gigShiftActionDialogFragment.f5(), this.f160567m, Lifecycle.State.f46682e, new com.avito.android.gig_shift_action.ui.d(1, gigShiftActionDialogFragment, GigShiftActionDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/gig_shift_action/mvi/GigShiftActionOneTimeEvent;)V", 0), new com.avito.android.gig_shift_action.ui.e(1, gigShiftActionDialogFragment, GigShiftActionDialogFragment.class, "renderState", "renderState(Lcom/avito/android/gig_shift_action/mvi/GigShiftActionState;)V", 0));
            Button button = gigShiftActionDialogFragment.f160557m0;
            if (button != null) {
                final int i12 = 0;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.gig_shift_action.ui.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        GigShiftActionDialogFragment gigShiftActionDialogFragment2 = gigShiftActionDialogFragment;
                        switch (i12) {
                            case 0:
                                GigShiftActionDialogFragment.a aVar2 = GigShiftActionDialogFragment.f160550v0;
                                gigShiftActionDialogFragment2.f5().accept(a.C4692a.f160462a);
                                break;
                            default:
                                GigShiftActionDialogFragment.a aVar3 = GigShiftActionDialogFragment.f160550v0;
                                gigShiftActionDialogFragment2.f5().accept(a.b.f160463a);
                                break;
                        }
                    }
                });
            }
            Button button2 = gigShiftActionDialogFragment.f160558n0;
            if (button2 != null) {
                final int i13 = 1;
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.gig_shift_action.ui.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        GigShiftActionDialogFragment gigShiftActionDialogFragment2 = gigShiftActionDialogFragment;
                        switch (i13) {
                            case 0:
                                GigShiftActionDialogFragment.a aVar2 = GigShiftActionDialogFragment.f160550v0;
                                gigShiftActionDialogFragment2.f5().accept(a.C4692a.f160462a);
                                break;
                            default:
                                GigShiftActionDialogFragment.a aVar3 = GigShiftActionDialogFragment.f160550v0;
                                gigShiftActionDialogFragment2.f5().accept(a.b.f160463a);
                                break;
                        }
                    }
                });
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigShiftActionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C22960s.a(C22777e.b(new Q("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", GigShiftActionResult.Closed.f160577b)), GigShiftActionDialogFragment.this, "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY");
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f160569l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f160569l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f160569l);
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
            return GigShiftActionDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f160571l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f160571l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f160571l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f160572l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f160572l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f160572l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f160573l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f160573l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f160573l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: GigShiftActionDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/x;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/gig_shift_action/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<x> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final x invoke() {
            y yVar = GigShiftActionDialogFragment.this.f160552h0;
            if (yVar == null) {
                yVar = null;
            }
            return (x) yVar.get();
        }
    }

    public GigShiftActionDialogFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f160553i0 = new O0(m0.f406844a.b(x.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f160554j0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.gig_shift_action.di.a.a().a((GigShiftActionOpenParams) this.f160554j0.getValue(this, f160551w0[0]), (com.avito.android.gig_shift_action.di.c) C29972i.a(C29972i.b(this), com.avito.android.gig_shift_action.di.c.class), cv.c.b(this)).a(this);
    }

    public final x f5() {
        return (x) this.f160553i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.gig_shift_action_dialog_fragment, new b(dVar));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.Q(new c());
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f160555k0 = null;
        this.f160556l0 = null;
        this.f160565u0 = null;
        this.f160557m0 = null;
        this.f160558n0 = null;
        this.f160559o0 = null;
        this.f160562r0 = null;
        this.f160563s0 = null;
        this.f160564t0 = null;
    }
}

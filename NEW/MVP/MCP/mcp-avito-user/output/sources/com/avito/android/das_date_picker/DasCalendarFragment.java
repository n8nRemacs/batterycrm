package com.avito.android.das_date_picker;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.GridLayoutManager;
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
import com.avito.android.das_date_picker.DasCalendarFragment;
import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import com.avito.android.das_date_picker.mvi.entity.a;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import cu.InterfaceC39413a;
import cu.InterfaceC39414b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: DasCalendarFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/das_date_picker/DasCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DasCalendarFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.das_date_picker.j f132227h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f132228i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f132229j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public L0 f132230k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f132231l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f132232m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f132233n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.avito.android.das_date_picker.g f132234o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final C35968w3 f132235p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f132226r0 = {m0.f406844a.e(new Y(DasCalendarFragment.class, "initParameters", "getInitParameters()Lcom/avito/android/das_date_picker/model/DasCalendarInitParameters;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f132225q0 = new a(null);

    /* compiled from: DasCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/DasCalendarFragment$a;", "", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DasCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC39414b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39414b interfaceC39414b) {
            InterfaceC39414b interfaceC39414b2 = interfaceC39414b;
            DasCalendarFragment dasCalendarFragment = (DasCalendarFragment) this.receiver;
            a aVar = DasCalendarFragment.f132225q0;
            dasCalendarFragment.getClass();
            if (interfaceC39414b2 instanceof InterfaceC39414b.c) {
                InterfaceC39414b.c cVar = (InterfaceC39414b.c) interfaceC39414b2;
                com.avito.android.das_date_picker.g gVar = dasCalendarFragment.f132234o0;
                if (gVar == null) {
                    gVar = null;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) gVar.f132308d.getLayoutManager();
                L0 l02 = dasCalendarFragment.f132230k0;
                gridLayoutManager.b2(cVar.f392988a, (l02 != null ? l02 : null).d() / 4);
            } else if (interfaceC39414b2 instanceof InterfaceC39414b.C10994b) {
                dasCalendarFragment.getParentFragmentManager().o0(C22777e.b(new Q("selected_date", ((InterfaceC39414b.C10994b) interfaceC39414b2).f392987a)), ((DasCalendarInitParameters) dasCalendarFragment.f132235p0.getValue(dasCalendarFragment, DasCalendarFragment.f132226r0[0])).f132353e);
            } else if (interfaceC39414b2 instanceof InterfaceC39414b.a) {
                dasCalendarFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DasCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<DasCalendarState, G0> {
        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(DasCalendarState dasCalendarState) {
            DasCalendarState dasCalendarState2 = dasCalendarState;
            DasCalendarFragment dasCalendarFragment = DasCalendarFragment.this;
            com.avito.android.das_date_picker.g gVar = dasCalendarFragment.f132234o0;
            if (gVar == null) {
                gVar = null;
            }
            com.avito.android.das_date_picker.mvi.entity.a aVar = dasCalendarState2.f132391i;
            if (aVar instanceof a.c) {
                gVar.f132307c.k(null);
                D6.h(gVar.f132306b);
                D6.h(gVar.f132309e);
            } else if (aVar instanceof a.b) {
                gVar.f132307c.j();
                D6.k(gVar.f132309e);
                D6.k(gVar.f132306b);
                com.avito.konveyor.adapter.d dVar = dasCalendarFragment.f132233n0;
                B b12 = dVar;
                if (dVar == null) {
                    b12 = 0;
                }
                b12.l(((a.b) aVar).f132398d, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DasCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcu/a;", "it", "Lkotlin/G0;", "invoke", "(Lcu/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<InterfaceC39413a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39413a interfaceC39413a) {
            a aVar = DasCalendarFragment.f132225q0;
            ((com.avito.android.das_date_picker.i) DasCalendarFragment.this.f132228i0.getValue()).accept(interfaceC39413a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f132238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f132238l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f132238l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DasCalendarFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f132240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f132240l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f132240l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f132241l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f132241l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f132241l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f132242l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f132242l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f132242l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DasCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/das_date_picker/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.das_date_picker.i> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.das_date_picker.i invoke() {
            com.avito.android.das_date_picker.j jVar = DasCalendarFragment.this.f132227h0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.das_date_picker.i) jVar.get();
        }
    }

    public DasCalendarFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f132228i0 = new O0(m0.f406844a.b(com.avito.android.das_date_picker.i.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f132235p0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.das_date_picker.di.a.a().a((com.avito.android.das_date_picker.di.c) C29972i.a(C29972i.b(this), com.avito.android.das_date_picker.di.c.class), s.b(this), (DasCalendarInitParameters) this.f132235p0.getValue(this, f132226r0[0]), requireActivity(), new d()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f132229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f132229j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, (com.avito.android.das_date_picker.i) this.f132228i0.getValue(), new b(1, this, DasCalendarFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarOneTimeEvent;)V", 0), new c());
        View viewInflate = layoutInflater.inflate(R.layout.das_calendar_fragment, viewGroup, false);
        com.avito.konveyor.a aVar = this.f132231l0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.adapter.a aVar2 = this.f132232m0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f132233n0;
        com.avito.android.das_date_picker.g gVar = new com.avito.android.das_date_picker.g(viewInflate, aVar, aVar2, dVar != null ? dVar : null);
        this.f132234o0 = gVar;
        final int i12 = 0;
        gVar.f132305a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.das_date_picker.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DasCalendarFragment f132246c;

            {
                this.f132246c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DasCalendarFragment dasCalendarFragment = this.f132246c;
                switch (i12) {
                    case 0:
                        DasCalendarFragment.a aVar3 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.b.f392983a);
                        break;
                    case 1:
                        DasCalendarFragment.a aVar4 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.C10993a.f392982a);
                        break;
                    default:
                        DasCalendarFragment.a aVar5 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.d.f392985a);
                        break;
                }
            }
        });
        final int i13 = 1;
        gVar.f132306b.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.das_date_picker.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DasCalendarFragment f132246c;

            {
                this.f132246c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DasCalendarFragment dasCalendarFragment = this.f132246c;
                switch (i13) {
                    case 0:
                        DasCalendarFragment.a aVar3 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.b.f392983a);
                        break;
                    case 1:
                        DasCalendarFragment.a aVar4 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.C10993a.f392982a);
                        break;
                    default:
                        DasCalendarFragment.a aVar5 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.d.f392985a);
                        break;
                }
            }
        });
        final int i14 = 2;
        gVar.f132309e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.das_date_picker.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DasCalendarFragment f132246c;

            {
                this.f132246c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DasCalendarFragment dasCalendarFragment = this.f132246c;
                switch (i14) {
                    case 0:
                        DasCalendarFragment.a aVar3 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.b.f392983a);
                        break;
                    case 1:
                        DasCalendarFragment.a aVar4 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.C10993a.f392982a);
                        break;
                    default:
                        DasCalendarFragment.a aVar5 = DasCalendarFragment.f132225q0;
                        ((i) dasCalendarFragment.f132228i0.getValue()).accept(InterfaceC39413a.d.f392985a);
                        break;
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) getDialog();
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(true);
        dVar.J(true);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132229j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}

package com.avito.android.crm_candidates.view.base;

import Cd.C13243a;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.JobCrmAddNoteScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.notes.c;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: JobCrmAddNoteFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmAddNoteFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmAddNoteFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f129775v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public NavBar f129776n0;

    /* renamed from: o0, reason: collision with root package name */
    public Input f129777o0;

    /* renamed from: p0, reason: collision with root package name */
    public Input f129778p0;

    /* renamed from: q0, reason: collision with root package name */
    public Button f129779q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f129780r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.crm_candidates.features.add_note.logics.o f129781s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f129782t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f129783u0;

    /* compiled from: JobCrmAddNoteFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmAddNoteFragment$a;", "", "<init>", "()V", "", "ARG_APPLICANT_ID", "Ljava/lang/String;", "ARG_APPLICATION_ID", "ARG_BUTTON_NAME", "ARG_CANDIDATE_NAME", "ARG_CV_ID", "ARG_NOTE_TEXT", "ARG_VACANCY_ID", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f129784l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f129784l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f129784l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JobCrmAddNoteFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f129786l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f129786l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f129786l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129787l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129787l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f129787l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f129788l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f129788l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f129788l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: JobCrmAddNoteFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/logics/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/crm_candidates/features/add_note/logics/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.crm_candidates.features.add_note.logics.n> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.crm_candidates.features.add_note.logics.n invoke() {
            com.avito.android.crm_candidates.features.add_note.logics.o oVar = JobCrmAddNoteFragment.this.f129781s0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.crm_candidates.features.add_note.logics.n) oVar.get();
        }
    }

    public JobCrmAddNoteFragment() {
        super(R.layout.job_crm_add_note_fragment);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f129782t0 = new O0(m0.f406844a.b(com.avito.android.crm_candidates.features.add_note.logics.n.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f129783u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        this.f129776n0 = (NavBar) viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.candidate_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f129777o0 = (Input) viewFindViewById2;
        View viewFindViewById3 = requireView().findViewById(R.id.note_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f129778p0 = (Input) viewFindViewById3;
        View viewFindViewById4 = requireView().findViewById(R.id.add_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f129779q0 = (Button) viewFindViewById4;
        View viewFindViewById5 = requireView().findViewById(R.id.progress);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f129780r0 = viewFindViewById5;
        ScreenPerformanceTracker screenPerformanceTracker = this.f129783u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.d(this, screenPerformanceTracker, (com.avito.android.crm_candidates.features.add_note.logics.n) this.f129782t0.getValue(), new C29627e(this), new C29630h(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129783u0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        C28478k c28478k = new C28478k(JobCrmAddNoteScreen.f90387d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        c.a aVarA = com.avito.android.crm_candidates.di.notes.a.a();
        com.avito.android.crm_candidates.di.notes.e eVar = (com.avito.android.crm_candidates.di.notes.e) C29972i.a(C29972i.b(this), com.avito.android.crm_candidates.di.notes.e.class);
        Resources resources = getResources();
        String string = requireArguments().getString("ARG_CANDIDATE_NAME");
        if (string == null) {
            string = "";
        }
        String string2 = requireArguments().getString("ARG_BUTTON_NAME");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = requireArguments().getString("ARG_NOTE_TEXT");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = requireArguments().getString("ARG_APPLICANT_ID");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = requireArguments().getString("ARG_APPLICATION_ID");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = requireArguments().getString("ARG_VACANCY_ID");
        if (string6 == null) {
            string6 = "";
        }
        String string7 = requireArguments().getString("ARG_CV_ID");
        if (string7 == null) {
            string7 = "";
        }
        aVarA.a(eVar, string, string2, string3, string4, string5, string6, string7, c28478k, resources).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f129783u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f129783u0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}

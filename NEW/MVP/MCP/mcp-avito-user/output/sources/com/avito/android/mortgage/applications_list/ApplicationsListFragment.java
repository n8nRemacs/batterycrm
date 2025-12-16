package com.avito.android.mortgage.applications_list;

import Cd.C13243a;
import SZ.a;
import SZ.b;
import SZ.d;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageApplicationsListScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mortgage.acceptance_dialog.AcceptanceDialog;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.acceptance_dialog.model.Accepted;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.applications_list.ApplicationsListFragment;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.root.model.ApplicationDeleteAction;
import com.avito.android.mortgage.root.model.MortgageRootApplicationChanged;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
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
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ApplicationsListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/applications_list/ApplicationsListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationsListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.applications_list.h f198338n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f198339o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f198340p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f198341q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f198342r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f198343s0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f198337u0 = {m0.f406844a.e(new Y(ApplicationsListFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/mortgage/applications_list/ApplicationsListViewHolder;", 0))};

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f198336t0 = new a(null);

    /* compiled from: ApplicationsListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/applications_list/ApplicationsListFragment$a;", "", "<init>", "()V", "", "APPLICATIONS_LIST_ARGUMENTS", "Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, Bundle, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (((MortgageRootApplicationChanged) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("MORTGAGE_ROOT_RESULT", MortgageRootApplicationChanged.class) : bundle2.getParcelable("MORTGAGE_ROOT_RESULT"))) != null) {
                a aVar = ApplicationsListFragment.f198336t0;
                ApplicationsListFragment.this.r5().accept(a.e.f15051a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            Accepted accepted = (Accepted) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("ACCEPTANCE_RESULT", Accepted.class) : bundle2.getParcelable("ACCEPTANCE_RESULT"));
            if (accepted != null) {
                Parcelable parcelable = accepted.f198194b;
                if (parcelable instanceof ApplicationDeleteAction) {
                    a aVar = ApplicationsListFragment.f198336t0;
                    ApplicationsListFragment.this.r5().accept(new a.b(((ApplicationDeleteAction) parcelable).f202930b));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<SZ.b, G0> {
        @Override // Y41.l
        public final G0 invoke(SZ.b bVar) {
            y f21241d;
            SZ.b bVar2 = bVar;
            ApplicationsListFragment applicationsListFragment = (ApplicationsListFragment) this.receiver;
            a aVar = ApplicationsListFragment.f198336t0;
            applicationsListFragment.getClass();
            if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = applicationsListFragment.l1();
                if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
                    f21241d.c();
                }
            } else if (bVar2 instanceof b.C1026b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = applicationsListFragment.f198342r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.C1026b) bVar2).f15053a, null, null, 6);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, applicationsListFragment, ((b.c) bVar2).f15054a, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, 942);
            } else if (bVar2 instanceof b.d) {
                b.d dVar = (b.d) bVar2;
                dVar.getClass();
                AcceptanceDialogArguments acceptanceDialogArguments = new AcceptanceDialogArguments("DELETE_MORTGAGE_APPLICATION_REQUEST_KEY", dVar.f15055a, dVar.f15056b, dVar.f15057c, dVar.f15058d, ButtonStyle.f198196c, dVar.f15059e);
                AcceptanceDialog.f198162j0.getClass();
                AcceptanceDialog.a.a(acceptanceDialogArguments).show(applicationsListFragment.getParentFragmentManager(), "acceptance_dialog");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSZ/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LSZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<SZ.c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SZ.c cVar) {
            a aVar = ApplicationsListFragment.f198336t0;
            ApplicationsListFragment applicationsListFragment = ApplicationsListFragment.this;
            SZ.d dVar = cVar.f15063c;
            if (dVar instanceof d.c) {
                D6.H(applicationsListFragment.q5().f198397c);
                D6.w(applicationsListFragment.q5().f198398d);
                D6.w(applicationsListFragment.q5().f198396b);
            } else if (dVar instanceof d.b) {
                D6.w(applicationsListFragment.q5().f198397c);
                D6.H(applicationsListFragment.q5().f198398d);
                D6.w(applicationsListFragment.q5().f198396b);
                d.b bVar = (d.b) dVar;
                I5.a(applicationsListFragment.q5().f198400f, bVar.f15065a.k0(applicationsListFragment.requireContext()), false);
                I5.a(applicationsListFragment.q5().f198401g, bVar.f15066b.k0(applicationsListFragment.requireContext()), false);
                applicationsListFragment.q5().f198399e.setImageDrawable(C35835l0.h(bVar.f15067c, applicationsListFragment.requireContext()));
            } else if (dVar instanceof d.a) {
                D6.w(applicationsListFragment.q5().f198397c);
                D6.w(applicationsListFragment.q5().f198398d);
                D6.H(applicationsListFragment.q5().f198396b);
                com.avito.konveyor.adapter.d dVar2 = applicationsListFragment.f198341q0;
                if (dVar2 == null) {
                    dVar2 = null;
                }
                dVar2.l(((d.a) dVar).f15064a, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSZ/a;", "it", "Lkotlin/G0;", "invoke", "(LSZ/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<SZ.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SZ.a aVar) {
            a aVar2 = ApplicationsListFragment.f198336t0;
            ApplicationsListFragment.this.r5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f198348l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f198348l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f198348l);
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
            return ApplicationsListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f198350l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f198350l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f198350l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198351l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198351l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f198351l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198352l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198352l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f198352l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ApplicationsListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/applications_list/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/applications_list/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.mortgage.applications_list.g> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.applications_list.g invoke() {
            com.avito.android.mortgage.applications_list.h hVar = ApplicationsListFragment.this.f198338n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.mortgage.applications_list.g) hVar.get();
        }
    }

    public ApplicationsListFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f198339o0 = new O0(m0.f406844a.b(com.avito.android.mortgage.applications_list.g.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f198343s0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "MORTGAGE_ROOT_REQUEST_KEY", new b());
        C22960s.b(this, "DELETE_MORTGAGE_APPLICATION_REQUEST_KEY", new c());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f198340p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.applications_list_fragment, viewGroup, false);
        com.avito.android.mortgage.applications_list.f fVar = new com.avito.android.mortgage.applications_list.f(viewInflate);
        C47313c c47313c = this.f198343s0;
        n<Object> nVar = f198337u0[0];
        c47313c.b(this, fVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198340p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new d(1, this, ApplicationsListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListOneTimeEvent;)V", 0), new e());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198340p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        final int i12 = 0;
        q5().f198402h.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.applications_list.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ApplicationsListFragment f198355c;

            {
                this.f198355c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplicationsListFragment applicationsListFragment = this.f198355c;
                switch (i12) {
                    case 0:
                        ApplicationsListFragment.a aVar = ApplicationsListFragment.f198336t0;
                        applicationsListFragment.r5().accept(a.e.f15051a);
                        break;
                    default:
                        ApplicationsListFragment.a aVar2 = ApplicationsListFragment.f198336t0;
                        applicationsListFragment.r5().accept(a.d.f15050a);
                        break;
                }
            }
        });
        final int i13 = 1;
        q5().f198395a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.mortgage.applications_list.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ApplicationsListFragment f198355c;

            {
                this.f198355c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplicationsListFragment applicationsListFragment = this.f198355c;
                switch (i13) {
                    case 0:
                        ApplicationsListFragment.a aVar = ApplicationsListFragment.f198336t0;
                        applicationsListFragment.r5().accept(a.e.f15051a);
                        break;
                    default:
                        ApplicationsListFragment.a aVar2 = ApplicationsListFragment.f198336t0;
                        applicationsListFragment.r5().accept(a.d.f15050a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = q5().f198396b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.d dVar = this.f198341q0;
        recyclerView.setAdapter(dVar != null ? dVar : null);
        recyclerView.l(RZ.a.f14518b, -1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageApplicationsListScreen.f90415d, s.c(this), null, 4, null);
        Bundle bundleRequireArguments = requireArguments();
        ApplicationsListArguments applicationsListArguments = (ApplicationsListArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("applicationsListArguments", ApplicationsListArguments.class) : bundleRequireArguments.getParcelable("applicationsListArguments"));
        if (applicationsListArguments == null) {
            throw new IllegalArgumentException();
        }
        com.avito.android.mortgage.applications_list.di.f.a().a((o) C29972i.a(C29972i.b(this), o.class), cv.c.b(this), c28478k, applicationsListArguments, new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198340p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.mortgage.applications_list.f q5() {
        C47313c c47313c = this.f198343s0;
        n<Object> nVar = f198337u0[0];
        return (com.avito.android.mortgage.applications_list.f) c47313c.a();
    }

    public final com.avito.android.mortgage.applications_list.g r5() {
        return (com.avito.android.mortgage.applications_list.g) this.f198339o0.getValue();
    }
}

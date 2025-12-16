package com.avito.android.user_stats.extended_user_stats.tabs.expenses;

import Cd.r;
import RJ0.a;
import RJ0.b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.h;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.DataStatus;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.PaginationState;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ExpensesTabFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/ExpensesTabFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExpensesTabFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f317520y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h.a f317521n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f317522o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f317523p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f317524q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f317525r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f317526s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f317527t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f317528u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f317529v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public SK0.b f317530w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.user_stats.extended_user_stats.tabs.expenses.e f317531x0;

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/ExpensesTabFragment$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DataStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataStatus dataStatus = DataStatus.f317808b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataStatus dataStatus2 = DataStatus.f317808b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<RJ0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(RJ0.b bVar) {
            RJ0.b bVar2 = bVar;
            ExpensesTabFragment expensesTabFragment = (ExpensesTabFragment) this.receiver;
            a aVar = ExpensesTabFragment.f317520y0;
            expensesTabFragment.getClass();
            if (bVar2 instanceof b.C0953b) {
                Bundle bundle = new Bundle();
                bundle.putString("requestKeyExpensesData", ((b.C0953b) bVar2).f14339a);
                expensesTabFragment.getParentFragmentManager().o0(bundle, "requestKeySelectExpenses");
            } else {
                if (bVar2 instanceof b.a) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = expensesTabFragment.f317528u0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((b.a) bVar2).f14338a, null, null, 6);
                } else if (bVar2 instanceof b.c) {
                    SK0.b bVar3 = expensesTabFragment.f317530w0;
                    dK0.h.a(bVar3 != null ? bVar3 : null, "gen-stat_expenses-tab");
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ExpensesTabState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ExpensesTabState expensesTabState) {
            com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar;
            ExpensesTabState expensesTabState2 = expensesTabState;
            a aVar = ExpensesTabFragment.f317520y0;
            ExpensesTabFragment expensesTabFragment = ExpensesTabFragment.this;
            int iOrdinal = expensesTabState2.f317827c.ordinal();
            if (iOrdinal == 0) {
                com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar2 = expensesTabFragment.f317531x0;
                if (eVar2 != null) {
                    eVar2.a();
                }
                com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar3 = expensesTabFragment.f317531x0;
                if (eVar3 != null) {
                    com.avito.android.user_stats.extended_user_stats.tabs.expenses.e.d(eVar3, expensesTabState2.f317826b, false, expensesTabState2.f317837m, expensesTabState2.f317838n, 2);
                }
            } else if (iOrdinal == 1) {
                com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar4 = expensesTabFragment.f317531x0;
                if (eVar4 != null) {
                    eVar4.f317668h.j();
                    eVar4.f317665e.setVisibility(0);
                    eVar4.f317664d.setVisibility(8);
                    eVar4.f317666f.setVisibility(8);
                }
            } else if (iOrdinal == 2 && (eVar = expensesTabFragment.f317531x0) != null) {
                eVar.f317668h.a(expensesTabFragment.getString(R.string.user_stats_expenses_not_loaded));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<RJ0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(RJ0.a aVar) {
            ((com.avito.android.user_stats.extended_user_stats.tabs.expenses.h) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<PaginationState> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f317533l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ PaginationState invoke() {
            return null;
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = ExpensesTabFragment.f317520y0;
            ExpensesTabFragment.this.q5().accept(a.s.f14333a);
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRJ0/a;", "it", "Lkotlin/G0;", "invoke", "(LRJ0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<RJ0.a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RJ0.a aVar) {
            a aVar2 = ExpensesTabFragment.f317520y0;
            ExpensesTabFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f317537m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.l lVar) {
            super(0);
            this.f317537m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(ExpensesTabFragment.this, this.f317537m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExpensesTabFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f317539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f317539l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f317539l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f317540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f317540l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f317540l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f317541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f317541l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f317541l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExpensesTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<C23060r0, com.avito.android.user_stats.extended_user_stats.tabs.expenses.h> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.h invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            h.a aVar = ExpensesTabFragment.this.f317521n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public ExpensesTabFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f317522o0 = new O0(m0.f406844a.b(com.avito.android.user_stats.extended_user_stats.tabs.expenses.h.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f317523p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f317523p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, ExpensesTabFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabOneTimeEvent;)V", 0), new d());
        return layoutInflater.inflate(R.layout.user_stats_fragment_tab, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q5().accept(a.t.f14334a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f317523p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.konveyor.adapter.j jVar = this.f317524q0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f317526s0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        InterfaceC28373a interfaceC28373a = this.f317527t0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        e eVar = new e(1, q5(), com.avito.android.user_stats.extended_user_stats.tabs.expenses.h.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        f fVar = f.f317533l;
        com.avito.android.util.text.a aVar3 = this.f317529v0;
        com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar2 = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.e(view, jVar2, aVar2, interfaceC28373a2, eVar, fVar, true, aVar3 != null ? aVar3 : null);
        eVar2.f317669i.t0(new g());
        this.f317531x0 = eVar2;
        C22960s.b(this, "requestKeyCosts", new com.avito.android.user_stats.extended_user_stats.tabs.expenses.a(this));
        C22960s.b(this, "requestKeyCleanExpenses", new com.avito.android.user_stats.extended_user_stats.tabs.expenses.b(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.a.a().a(getResources(), new C28478k(ExpensesTabStatisticsScreen.f317543d, s.c(this), null, 4, null), (com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c.class), new h(), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f317523p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.h q5() {
        return (com.avito.android.user_stats.extended_user_stats.tabs.expenses.h) this.f317522o0.getValue();
    }
}

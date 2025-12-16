package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import Ca1.ViewOnClickListenerC13236c;
import Cd.r;
import RJ0.a;
import SK0.b;
import TJ0.a;
import UJ0.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.DataStatus;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.PaginationState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.android.util.C35966w1;
import com.avito.user_stats.model.extended_user_stats.Hint;
import dK0.AbstractC39591a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ConstructorTabFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/ConstructorTabFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConstructorTabFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f317866y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h.a f317867n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f317868o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f317869p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f317870q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f317871r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f317872s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f317873t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f317874u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f317875v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public SK0.b f317876w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.user_stats.extended_user_stats.tabs.expenses.e f317877x0;

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/ConstructorTabFragment$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<TJ0.a, G0> {
        public final void f(@Y61.k TJ0.a aVar) {
            com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar;
            ConstructorTabFragment constructorTabFragment = (ConstructorTabFragment) this.receiver;
            a aVar2 = ConstructorTabFragment.f317866y0;
            constructorTabFragment.getClass();
            if (aVar instanceof a.C1061a) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("up_intent", null);
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = constructorTabFragment.f317875v0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((a.C1061a) aVar).f15576a, null, bundle, 2);
                return;
            }
            if (aVar instanceof a.g) {
                SK0.b bVar = constructorTabFragment.f317876w0;
                b.a.a(bVar != null ? bVar : null, AbstractC39591a.b.f393828b, null, null, null, 14);
                return;
            }
            if (aVar instanceof a.l) {
                SK0.b bVar2 = constructorTabFragment.f317876w0;
                SK0.b bVar3 = bVar2 != null ? bVar2 : null;
                String str = ((a.l) aVar).f15589a;
                if (str != null) {
                    SK0.a aVar4 = new SK0.a();
                    aVar4.a("split_type", str);
                    b.a.a(bVar3, new dK0.d(), aVar4, null, null, 12);
                    return;
                }
                return;
            }
            if (aVar instanceof a.k) {
                SK0.b bVar4 = constructorTabFragment.f317876w0;
                b.a.a(bVar4 != null ? bVar4 : null, new dK0.e(), null, null, null, 14);
                return;
            }
            if (aVar instanceof a.n) {
                SK0.b bVar5 = constructorTabFragment.f317876w0;
                dK0.h.a(bVar5 != null ? bVar5 : null, "gen-stat_detalisation-tab");
                return;
            }
            if (aVar instanceof a.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("requestKeyExpensesData", ((a.e) aVar).f15580a);
                constructorTabFragment.getParentFragmentManager().o0(bundle2, "requestKeySelectConstructor");
                return;
            }
            if (aVar instanceof a.f) {
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("requestConfig", ((a.f) aVar).f15581a);
                constructorTabFragment.getParentFragmentManager().o0(bundle3, "requestKeyDynamicsConfig");
                return;
            }
            if (L.f(aVar, a.d.f15579a)) {
                constructorTabFragment.q5().accept(a.C0952a.f14311a);
                return;
            }
            if (!(aVar instanceof a.c)) {
                if (L.f(aVar, a.h.f15583a)) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, constructorTabFragment.requireView(), com.avito.android.printable_text.b.f(constructorTabFragment.getString(R.string.user_stats_toast_today_empty)), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                    return;
                }
                if (L.f(aVar, a.m.f15590a)) {
                    SK0.b bVar6 = constructorTabFragment.f317876w0;
                    b.a.a(bVar6 != null ? bVar6 : null, SJ0.a.f14896a, null, null, null, 14);
                    return;
                }
                if (aVar instanceof a.j) {
                    constructorTabFragment.r5(new Hint(null, ((a.j) aVar).f15587a, null, 5, null));
                    return;
                }
                if (aVar instanceof a.b) {
                    constructorTabFragment.r5(((a.b) aVar).f15577a);
                    return;
                } else {
                    if (!(aVar instanceof a.i) || (eVar = constructorTabFragment.f317877x0) == null) {
                        return;
                    }
                    a.i iVar = (a.i) aVar;
                    com.avito.android.deeplink_handler.handler.composite.a aVar5 = constructorTabFragment.f317875v0;
                    eVar.b(iVar.f15584a, iVar.f15585b, iVar.f15586c, aVar5 != null ? aVar5 : null);
                    return;
                }
            }
            List<SplitListDialogItem> list = ((a.c) aVar).f15578a;
            if (list == null) {
                return;
            }
            a.C1117a c1117a = UJ0.a.f16337c;
            com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.c cVar = new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.c(list, constructorTabFragment);
            c1117a.getClass();
            UJ0.a aVar6 = new UJ0.a(null);
            cVar.invoke(aVar6);
            Context contextRequireContext = constructorTabFragment.requireContext();
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextRequireContext, 0);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(contextRequireContext);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.items_spending_container, (ViewGroup) null);
            dVar.G(viewInflate, true);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, contextRequireContext.getString(R.string.user_stats_split_grouping), true, true, 2);
            View viewFindViewById = viewInflate.findViewById(R.id.items_container_spending);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            linearLayout.removeAllViews();
            List<SplitListDialogItem> list2 = aVar6.f16338a;
            if (list2 != null) {
                for (SplitListDialogItem splitListDialogItem : list2) {
                    View viewInflate2 = layoutInflaterFrom.inflate(R.layout.user_stats_item_spending_dialog, (ViewGroup) null);
                    View viewFindViewById2 = viewInflate2.findViewById(R.id.tv_item_spending);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView = (TextView) viewFindViewById2;
                    View viewFindViewById3 = viewInflate2.findViewById(R.id.tv_item_spending_description);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView2 = (TextView) viewFindViewById3;
                    View viewFindViewById4 = viewInflate2.findViewById(R.id.iv_item_spending);
                    if (viewFindViewById4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                    }
                    ImageView imageView = (ImageView) viewFindViewById4;
                    textView.setText(splitListDialogItem.f318254c);
                    int i12 = 8;
                    imageView.setVisibility(splitListDialogItem.f318256e ? 0 : 8);
                    String str2 = splitListDialogItem.f318255d;
                    if (str2 != null) {
                        i12 = 0;
                    }
                    textView2.setVisibility(i12);
                    textView2.setText(str2);
                    viewInflate2.setOnClickListener(new ViewOnClickListenerC13236c(aVar6, splitListDialogItem, dVar, 1));
                    linearLayout.addView(viewInflate2);
                }
            }
            dVar.R(new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.a(constructorTabFragment));
            com.avito.android.lib.util.g.a(dVar);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(TJ0.a aVar) {
            f(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ConstructorTabState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ConstructorTabState constructorTabState) {
            com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar;
            com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar2;
            ConstructorTabState constructorTabState2 = constructorTabState;
            a aVar = ConstructorTabFragment.f317866y0;
            ConstructorTabFragment constructorTabFragment = ConstructorTabFragment.this;
            DataStatus dataStatus = DataStatus.f317808b;
            DataStatus dataStatus2 = constructorTabState2.f318211c;
            DataStatus dataStatus3 = constructorTabState2.f318212d;
            if (dataStatus2 == dataStatus || dataStatus3 == dataStatus) {
                com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar3 = constructorTabFragment.f317877x0;
                if (eVar3 != null) {
                    com.avito.android.user_stats.extended_user_stats.tabs.expenses.e.d(eVar3, constructorTabState2.f318210b, constructorTabState2.f318219k, constructorTabState2.f318225q, null, 8);
                }
                com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar4 = constructorTabFragment.f317877x0;
                if (eVar4 != null) {
                    eVar4.a();
                }
                DataStatus dataStatus4 = DataStatus.f317810d;
                if (dataStatus2 == dataStatus4) {
                    com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar5 = constructorTabFragment.f317877x0;
                    if (eVar5 != null) {
                        eVar5.c(a.s.f14333a);
                    }
                } else if (dataStatus3 == dataStatus4 && (eVar = constructorTabFragment.f317877x0) != null) {
                    eVar.c(a.r.f14332a);
                }
            } else {
                DataStatus dataStatus5 = DataStatus.f317809c;
                if (dataStatus2 == dataStatus5 && dataStatus3 == dataStatus5) {
                    com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar6 = constructorTabFragment.f317877x0;
                    if (eVar6 != null) {
                        com.avito.android.user_stats.extended_user_stats.tabs.expenses.e.d(eVar6, constructorTabState2.f318210b, constructorTabState2.f318219k, constructorTabState2.f318225q, null, 8);
                    }
                    com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar7 = constructorTabFragment.f317877x0;
                    if (eVar7 != null) {
                        eVar7.a();
                    }
                } else {
                    DataStatus dataStatus6 = DataStatus.f317810d;
                    if (dataStatus2 == dataStatus6 && dataStatus3 == dataStatus6 && (eVar2 = constructorTabFragment.f317877x0) != null) {
                        eVar2.f317668h.a(constructorTabFragment.getString(R.string.user_stats_detailing_not_loaded));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<RJ0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(RJ0.a aVar) {
            ((com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/PaginationState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<PaginationState> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final PaginationState invoke() {
            a aVar = ConstructorTabFragment.f317866y0;
            return ConstructorTabFragment.this.q5().getState().getValue().f318217i;
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = ConstructorTabFragment.f317866y0;
            ConstructorTabFragment.this.q5().accept(a.q.f14331a);
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRJ0/a;", "it", "Lkotlin/G0;", "invoke", "(LRJ0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<RJ0.a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RJ0.a aVar) {
            a aVar2 = ConstructorTabFragment.f317866y0;
            ConstructorTabFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f317883m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.l lVar) {
            super(0);
            this.f317883m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(ConstructorTabFragment.this, this.f317883m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ConstructorTabFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f317885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f317885l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f317885l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f317886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f317886l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f317886l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f317887l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f317887l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f317887l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ConstructorTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<C23060r0, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            h.a aVar = ConstructorTabFragment.this.f317867n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public ConstructorTabFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f317868o0 = new O0(m0.f406844a.b(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f317869p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f317869p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, ConstructorTabFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabOneTimeEvent;)V", 0), new c());
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
        ScreenPerformanceTracker screenPerformanceTracker = this.f317869p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.konveyor.adapter.j jVar = this.f317871r0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f317873t0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        InterfaceC28373a interfaceC28373a = this.f317874u0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        d dVar = new d(1, q5(), com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        e eVar = new e();
        com.avito.android.util.text.a aVar3 = this.f317870q0;
        com.avito.android.user_stats.extended_user_stats.tabs.expenses.e eVar2 = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.e(view, jVar2, aVar2, interfaceC28373a2, dVar, eVar, false, aVar3 != null ? aVar3 : null);
        eVar2.f317669i.t0(new f());
        this.f317877x0 = eVar2;
        C22960s.b(this, "requestKeyDynamics", new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.d(this));
        C22960s.b(this, "requestKeyCleanConstructor", new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.e(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.di.b.a().a(getResources(), new C28478k(ConstructorTabStatisticsScreen.f317889d, s.c(this), null, 4, null), (com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c.class), new g(), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f317869p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h q5() {
        return (com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.h) this.f317868o0.getValue();
    }

    public final void r5(Hint hint) {
        HintMetricChartDialogFragment.f317890j0.getClass();
        HintMetricChartDialogFragment hintMetricChartDialogFragment = new HintMetricChartDialogFragment();
        C35966w1.a(hintMetricChartDialogFragment, -1, new com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.k(hint));
        com.avito.android.util.text.a aVar = this.f317870q0;
        if (aVar == null) {
            aVar = null;
        }
        hintMetricChartDialogFragment.f317891h0 = aVar;
        com.avito.android.lib.util.g.b(hintMetricChartDialogFragment, requireContext(), getChildFragmentManager(), "HintMetricChartDialogFragment");
    }
}

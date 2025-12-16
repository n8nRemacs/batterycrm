package com.avito.android.calendar_select.presentation.mvicalendarselect;

import Cd.C13243a;
import Ql.InterfaceC14906a;
import Rl.InterfaceC15055a;
import Rl.InterfaceC15056b;
import Rl.c;
import Sl.C15199a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CalendarSelectScreen;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.di.b;
import com.avito.android.calendar_select.di.m;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import java.time.LocalDate;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: CalendarSelectFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/CalendarSelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalendarSelectFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f113383x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f113384y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f113385n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f113386o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f113387p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.calendar_select.presentation.mvicalendarselect.i f113388q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final O0 f113389r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f113390s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47313c f113391t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f113392u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47312b f113393v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f113394w0;

    /* compiled from: CalendarSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/CalendarSelectFragment$a;", "", "<init>", "()V", "", "COLUMNS_COUNT", "I", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CalendarSelectFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.calendar_select.presentation.mvicalendarselect.CalendarSelectFragment$a$a, reason: collision with other inner class name */
        public static final class C3327a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CalendarSettings f113395l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3327a(CalendarSettings calendarSettings) {
                super(1);
                this.f113395l = calendarSettings;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("calendarSettings", this.f113395l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static CalendarSelectFragment a(@k CalendarSettings calendarSettings) {
            CalendarSelectFragment calendarSelectFragment = new CalendarSelectFragment();
            C35966w1.a(calendarSelectFragment, 1, new C3327a(calendarSettings));
            return calendarSelectFragment;
        }

        public a() {
        }
    }

    /* compiled from: CalendarSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC15056b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15056b interfaceC15056b) {
            InterfaceC15056b interfaceC15056b2 = interfaceC15056b;
            CalendarSelectFragment calendarSelectFragment = (CalendarSelectFragment) this.receiver;
            a aVar = CalendarSelectFragment.f113383x0;
            androidx.core.content.j jVarRequireActivity = calendarSelectFragment.requireActivity();
            Ql.c cVar = jVarRequireActivity instanceof Ql.c ? (Ql.c) jVarRequireActivity : null;
            if (cVar != null) {
                if (L.f(interfaceC15056b2, InterfaceC15056b.a.f14590a)) {
                    cVar.onCancel();
                } else if (interfaceC15056b2 instanceof InterfaceC15056b.C0973b) {
                    cVar.w(((InterfaceC15056b.C0973b) interfaceC15056b2).f14591a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRl/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LRl/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Rl.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Rl.c cVar) {
            Rl.c cVar2 = cVar;
            a aVar = CalendarSelectFragment.f113383x0;
            CalendarSelectFragment calendarSelectFragment = CalendarSelectFragment.this;
            com.avito.android.calendar_select.presentation.mvicalendarselect.e eVar = new com.avito.android.calendar_select.presentation.mvicalendarselect.e(1, calendarSelectFragment.t5(), com.avito.android.calendar_select.presentation.mvicalendarselect.h.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            if (L.f(cVar2, c.C0974c.f14595d)) {
                calendarSelectFragment.r5().k(null);
            } else if (cVar2 instanceof c.d) {
                calendarSelectFragment.r5().j();
                c.d dVar = (c.d) cVar2;
                calendarSelectFragment.q5().D(dVar.f14596d);
                calendarSelectFragment.q5().E(dVar.f14599g);
                com.avito.konveyor.adapter.a aVar2 = calendarSelectFragment.f113386o0;
                (aVar2 != null ? aVar2 : null).c(new UV0.c(dVar.f14600h));
                C47313c c47313c = calendarSelectFragment.f113394w0;
                n<Object>[] nVarArr = CalendarSelectFragment.f113384y0;
                n<Object> nVar = nVarArr[4];
                ((com.avito.konveyor.adapter.j) c47313c.a()).notifyDataSetChanged();
                C47313c c47313c2 = calendarSelectFragment.f113392u0;
                n<Object> nVar2 = nVarArr[2];
                D6.G((Button) c47313c2.a(), dVar.f14598f);
                n<Object> nVar3 = nVarArr[2];
                ((Button) c47313c2.a()).setText(dVar.f14597e.k0(calendarSelectFragment.requireContext()));
                Integer num = dVar.f14601i;
                if (num != null) {
                    calendarSelectFragment.s5().A0(num.intValue());
                }
            } else if (cVar2 instanceof c.b) {
                calendarSelectFragment.r5().a(((c.b) cVar2).f14594d.k0(calendarSelectFragment.requireContext()));
                calendarSelectFragment.r5().f231600j = new com.avito.android.calendar_select.presentation.mvicalendarselect.f(eVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/time/LocalDate;", "clickedDate", "Lkotlin/G0;", "invoke", "(Ljava/time/LocalDate;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<LocalDate, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LocalDate localDate) {
            a aVar = CalendarSelectFragment.f113383x0;
            CalendarSelectFragment.this.t5().accept(new InterfaceC15055a.c(localDate));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f113398l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f113398l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f113398l);
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
            return CalendarSelectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f113400l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f113400l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f113400l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f113401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f113401l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f113401l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f113402l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f113402l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f113402l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CalendarSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/calendar_select/presentation/mvicalendarselect/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.calendar_select.presentation.mvicalendarselect.h> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.calendar_select.presentation.mvicalendarselect.h invoke() {
            com.avito.android.calendar_select.presentation.mvicalendarselect.i iVar = CalendarSelectFragment.this.f113388q0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.calendar_select.presentation.mvicalendarselect.h) iVar.get();
        }
    }

    static {
        Y y12 = new Y(CalendarSelectFragment.class, "calendarHeaderView", "getCalendarHeaderView()Lcom/avito/android/calendar_select/presentation/CalendarHeaderView;", 0);
        n0 n0Var = m0.f406844a;
        f113384y0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CalendarSelectFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CalendarSelectFragment.class, "selectButton", "getSelectButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CalendarSelectFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CalendarSelectFragment.class, "recyclerAdapter", "getRecyclerAdapter()Lcom/avito/konveyor/adapter/SimpleRecyclerAdapter;", 0, n0Var)};
        f113383x0 = new a(null);
    }

    public CalendarSelectFragment() {
        super(R.layout.fragment_calendar_select);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f113389r0 = new O0(m0.f406844a.b(com.avito.android.calendar_select.presentation.mvicalendarselect.h.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f113390s0 = new C47313c(null, 1, null);
        this.f113391t0 = new C47313c(null, 1, null);
        this.f113392u0 = new C47313c(null, 1, null);
        this.f113393v0 = new C47312b(null, 1, null);
        this.f113394w0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f113387p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Ql.b bVar = new Ql.b(view);
        C47313c c47313c = this.f113390s0;
        n<Object>[] nVarArr = f113384y0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, bVar);
        q5().F(new com.avito.android.calendar_select.presentation.mvicalendarselect.c(this));
        q5().G(new com.avito.android.calendar_select.presentation.mvicalendarselect.d(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object> nVar2 = nVarArr[3];
        this.f113393v0.b(this, recyclerView);
        com.avito.konveyor.adapter.a aVar = this.f113386o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f113385n0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        C47313c c47313c2 = this.f113394w0;
        n<Object> nVar3 = nVarArr[4];
        c47313c2.b(this, jVar);
        RecyclerView recyclerViewS5 = s5();
        n<Object> nVar4 = nVarArr[4];
        recyclerViewS5.setAdapter((com.avito.konveyor.adapter.j) c47313c2.a());
        RecyclerView.t recycledViewPool = recyclerViewS5.getRecycledViewPool();
        com.avito.konveyor.a aVar3 = this.f113385n0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        recycledViewPool.e(aVar3.Y(com.avito.android.calendar_select.presentation.view.konveyor.items.month.c.class), s5().getResources().getInteger(R.integer.calendar_select_max_recycled_views_count_month_item));
        RecyclerView.t recycledViewPool2 = recyclerViewS5.getRecycledViewPool();
        com.avito.konveyor.a aVar4 = this.f113385n0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        recycledViewPool2.e(aVar4.Y(com.avito.android.calendar_select.presentation.view.konveyor.items.day.b.class), s5().getResources().getInteger(R.integer.calendar_select_max_recycled_views_count_day_item));
        RecyclerView.t recycledViewPool3 = recyclerViewS5.getRecycledViewPool();
        com.avito.konveyor.a aVar5 = this.f113385n0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        recycledViewPool3.e(aVar5.Y(com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c.class), s5().getResources().getInteger(R.integer.calendar_select_max_recycled_views_count_empty_item));
        com.avito.konveyor.adapter.a aVar6 = this.f113386o0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        com.avito.android.calendar_select.presentation.mvicalendarselect.b bVar2 = new com.avito.android.calendar_select.presentation.mvicalendarselect.b(aVar6, this);
        requireContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = bVar2;
        recyclerViewS5.setLayoutManager(gridLayoutManager);
        Context context = s5().getContext();
        recyclerViewS5.l(new C15199a(new com.avito.android.calendar_select.presentation.mvicalendarselect.a(2, bVar2, GridLayoutManager.c.class, "getSpanIndex", "getSpanIndex(II)I", 0), context.getResources().getDimensionPixelSize(R.dimen.calendar_select_recycler_view_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.calendar_select_recycler_view_day_horizontal_padding), context.getResources().getDimensionPixelSize(R.dimen.calendar_select_recycler_view_day_vertical_margin)), -1);
        recyclerViewS5.setItemAnimator(null);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), 0, null, 0, 0, 26, null);
        C47313c c47313c3 = this.f113391t0;
        n<Object> nVar5 = nVarArr[1];
        c47313c3.b(this, lVar);
        Button button = (Button) view.findViewById(R.id.button_select);
        C47313c c47313c4 = this.f113392u0;
        n<Object> nVar6 = nVarArr[2];
        c47313c4.b(this, button);
        n<Object> nVar7 = nVarArr[2];
        ((Button) c47313c4.a()).setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 22));
        ScreenPerformanceTracker screenPerformanceTracker = this.f113387p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, t5(), new b(1, this, CalendarSelectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f113387p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        CalendarSettings calendarSettings;
        Bundle arguments = getArguments();
        if (arguments != null) {
            calendarSettings = (CalendarSettings) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("calendarSettings", CalendarSettings.class) : arguments.getParcelable("calendarSettings"));
        } else {
            calendarSettings = null;
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(CalendarSelectScreen.f90309d, s.c(this), null, 4, null);
        b.a aVarA = m.a();
        if (calendarSettings == null) {
            CalendarSettings.f113312l.getClass();
            C42784z0 c42784z0 = C42784z0.f406748b;
            calendarSettings = new CalendarSettings(null, null, c42784z0, null, c42784z0, null, null, CalendarSelectionType.f113306b, false, null);
        }
        aVarA.a(calendarSettings, c28478k, new d(), (com.avito.android.calendar_select.di.a) C29972i.a(C29972i.b(this), com.avito.android.calendar_select.di.a.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f113387p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f113387p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final InterfaceC14906a q5() {
        C47313c c47313c = this.f113390s0;
        n<Object> nVar = f113384y0[0];
        return (InterfaceC14906a) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l r5() {
        C47313c c47313c = this.f113391t0;
        n<Object> nVar = f113384y0[1];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final RecyclerView s5() {
        n<Object> nVar = f113384y0[3];
        return (RecyclerView) this.f113393v0.a();
    }

    public final com.avito.android.calendar_select.presentation.mvicalendarselect.h t5() {
        return (com.avito.android.calendar_select.presentation.mvicalendarselect.h) this.f113389r0.getValue();
    }
}

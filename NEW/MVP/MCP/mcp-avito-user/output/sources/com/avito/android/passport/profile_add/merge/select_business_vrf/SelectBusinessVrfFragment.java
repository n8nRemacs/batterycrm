package com.avito.android.passport.profile_add.merge.select_business_vrf;

import Cd.C13243a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.passport.profile_add.merge.select_business_vrf.a;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessListItem;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import dagger.internal.u;
import g60.InterfaceC40537a;
import g60.b;
import java.io.Serializable;
import java.util.List;
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
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SelectBusinessVrfFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/SelectBusinessVrfFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectBusinessVrfFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f213350n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f213351o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213352p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f213353q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f213354r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f213355s0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f213349u0 = {m0.f406844a.e(new Y(SelectBusinessVrfFragment.class, "params", "getParams()Lcom/avito/android/passport/profile_add/merge/select_business_vrf/SelectBusinessVrfOpenParams;", 0))};

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f213348t0 = new a(null);

    /* compiled from: SelectBusinessVrfFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/SelectBusinessVrfFragment$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectBusinessVrfFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<g60.b, G0> {
        @Override // Y41.l
        public final G0 invoke(g60.b bVar) {
            g60.b bVar2 = bVar;
            SelectBusinessVrfFragment selectBusinessVrfFragment = (SelectBusinessVrfFragment) this.receiver;
            a aVar = SelectBusinessVrfFragment.f213348t0;
            selectBusinessVrfFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.passport.profile_add.merge.b.a(selectBusinessVrfFragment.requireActivity());
            } else if (bVar2 instanceof b.d) {
                b.d dVar = (b.d) bVar2;
                com.avito.android.passport.profile_add.merge.b.c(selectBusinessVrfFragment.requireActivity(), dVar.f396296a, dVar.f396297b);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, selectBusinessVrfFragment, com.avito.android.printable_text.b.c(R.string.passport_common_error, new Serializable[0]), null, null, new f.c(((b.c) bVar2).f396295a), 0, ToastBarPosition.f181046d, 942);
            } else if (L.f(bVar2, b.C11191b.f396294a)) {
                com.avito.android.passport.profile_add.merge.b.c(selectBusinessVrfFragment.requireActivity(), false, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectBusinessVrfFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg60/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lg60/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<g60.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f213356l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar) {
            super(1);
            this.f213356l = qVar;
        }

        @Override // Y41.l
        public final G0 invoke(g60.c cVar) {
            g60.c cVar2 = cVar;
            q qVar = this.f213356l;
            boolean z12 = cVar2.f396309k;
            com.avito.android.status_view.g gVar = qVar.f213494k;
            if (z12) {
                D6.H(gVar.f284965h);
                D6.w(gVar.f284961d);
                gVar.f284967j.e();
            } else if (cVar2.f396310l) {
                Context context = qVar.f213486c;
                com.avito.android.status_view.g.a(gVar, context.getString(R.string.passport_business_vrf_select_vertical_error_title), context.getString(R.string.passport_business_vrf_select_vertical_error_subtitle), 12);
            } else {
                D6.w(gVar.f284965h);
                D6.w(gVar.f284961d);
                gVar.f284967j.e();
                I5.a(qVar.f213488e, cVar2.f396300b, false);
                com.avito.android.util.text.j.c(qVar.f213489f, cVar2.f396301c, null);
                com.avito.android.lib.design.button.b.a(qVar.f213491h, cVar2.f396304f, false);
                com.avito.android.lib.design.button.b.a(qVar.f213492i, cVar2.f396303e, false);
                List<PassportSelectBusinessListItem> list = cVar2.f396305g;
                qVar.f213484a.c(new UV0.c(list));
                List<K50.a> list2 = cVar2.f396306h;
                int size = list2.size();
                Input input = qVar.f213493j;
                RecyclerView recyclerView = qVar.f213490g;
                if (size == 1) {
                    D6.w(input);
                    D6.c(recyclerView, null, Integer.valueOf(y6.b(10)), null, null, 13);
                    qVar.f213487d.s(R.id.passport_select_business_vrf_transition).f44087o = true;
                } else if (list2.size() > 1) {
                    D6.G(input, cVar2.f396302d);
                    D6.c(recyclerView, null, Integer.valueOf(y6.b(12)), null, null, 13);
                    if (cVar2.f396308j) {
                        recyclerView.F0(list.size() - 1);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectBusinessVrfFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg60/a;", "action", "Lkotlin/G0;", "invoke", "(Lg60/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC40537a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40537a interfaceC40537a) {
            a aVar = SelectBusinessVrfFragment.f213348t0;
            ((r) SelectBusinessVrfFragment.this.f213351o0.getValue()).accept(interfaceC40537a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectBusinessVrfFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Integer, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            a aVar = SelectBusinessVrfFragment.f213348t0;
            ((r) SelectBusinessVrfFragment.this.f213351o0.getValue()).accept(new InterfaceC40537a.d(num));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f213359l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f213359l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f213359l);
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
            return SelectBusinessVrfFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f213361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f213361l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f213361l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213362l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213362l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f213362l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213363l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213363l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f213363l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectBusinessVrfFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/select_business_vrf/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<r> {
        public k() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final r invoke() {
            u uVar = SelectBusinessVrfFragment.this.f213350n0;
            if (uVar == null) {
                uVar = null;
            }
            return (r) uVar.get();
        }
    }

    public SelectBusinessVrfFragment() {
        super(R.layout.passport_select_business_vrf_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f213351o0 = new O0(m0.f406844a.b(r.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f213355s0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f213352p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f213353q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f213354r0;
        if (aVar == null) {
            aVar = null;
        }
        q qVar = new q(new d(), view, aVar, jVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f213352p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, (r) this.f213351o0.getValue(), new b(1, this, SelectBusinessVrfFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfOneTimeEvent;)V", 0), new c(qVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f213352p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c((com.avito.android.passport.profile_add.merge.select_business_vrf.c) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.merge.select_business_vrf.c.class), cv.c.b(this), (SelectBusinessVrfOpenParams) this.f213355s0.getValue(this, f213349u0[0]), new e(), com.avito.android.analytics.screens.s.c(this), null);
        this.f213350n0 = cVar.f213381o;
        this.f213352p0 = cVar.f213380n.get();
        this.f213353q0 = (com.avito.konveyor.adapter.j) cVar.f213382p.get();
        this.f213354r0 = cVar.f213390x.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213352p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}

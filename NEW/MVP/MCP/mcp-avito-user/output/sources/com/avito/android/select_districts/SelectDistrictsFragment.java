package com.avito.android.select_districts;

import Cd.C13243a;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select_districts.SelectDistrictsFragment;
import com.avito.android.select_districts.o;
import com.avito.android.select_districts.perfomance.SelectDistrictsScreen;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import nq0.c;
import pq0.InterfaceC47130a;
import pq0.b;
import pq0.c;
import z1.AbstractC50339a;

/* compiled from: SelectDistrictsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select_districts/SelectDistrictsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectDistrictsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f266889n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.select_districts.m f266890o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f266891p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public o.a f266892q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f266893r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public o f266894s0;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f266888u0 = {m0.f406844a.e(new Y(SelectDistrictsFragment.class, "screenParams", "getScreenParams()Lcom/avito/android/select_districts/SelectDistrictsScreenParams;", 0))};

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f266887t0 = new a(null);

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/SelectDistrictsFragment$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = SelectDistrictsFragment.f266887t0;
            SelectDistrictsFragment.this.r5().accept(new InterfaceC47130a.C12293a(str));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelectDistrictsFragment.f266887t0;
            SelectDistrictsFragment.this.r5().accept(InterfaceC47130a.d.f428800a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelectDistrictsFragment.f266887t0;
            SelectDistrictsFragment.this.r5().accept(InterfaceC47130a.c.f428799a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelectDistrictsFragment.f266887t0;
            SelectDistrictsFragment selectDistrictsFragment = SelectDistrictsFragment.this;
            selectDistrictsFragment.r5().accept(new InterfaceC47130a.h(selectDistrictsFragment.q5().f266911c));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectDistrictsFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpq0/b;", "event", "Lkotlin/G0;", "invoke", "(Lpq0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<pq0.b, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(pq0.b bVar) {
            pq0.b bVar2 = bVar;
            a aVar = SelectDistrictsFragment.f266887t0;
            SelectDistrictsFragment selectDistrictsFragment = SelectDistrictsFragment.this;
            if (bVar2 instanceof b.a) {
                Intent intent = new Intent();
                SelectDistrictsScreenParams selectDistrictsScreenParamsQ5 = selectDistrictsFragment.q5();
                selectDistrictsFragment.requireActivity().setResult(-1, intent.putExtra("extra_select_districts_result", new SelectDistrictsResult(selectDistrictsScreenParamsQ5.f266910b, ((b.a) bVar2).f428807a)));
                selectDistrictsFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpq0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lpq0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<pq0.c, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(pq0.c cVar) {
            pq0.c cVar2 = cVar;
            o oVar = SelectDistrictsFragment.this.f266894s0;
            if (oVar != null) {
                boolean zEquals = cVar2.equals(c.C12294c.f428814b);
                Input input = oVar.f267109j;
                if (zEquals) {
                    input.setEnabled(false);
                    C42670a c42670a = oVar.f267113n;
                    if (c42670a != null) {
                        C42670a.d(c42670a);
                    }
                    oVar.a(false);
                } else {
                    boolean z12 = cVar2 instanceof c.a;
                    TextView textView = oVar.f267110k;
                    RecyclerView recyclerView = oVar.f267111l;
                    if (z12) {
                        input.setEnabled(true);
                        textView.setVisibility(8);
                        C42670a c42670a2 = oVar.f267113n;
                        if (c42670a2 != null) {
                            c42670a2.b();
                        }
                        c.a aVar = (c.a) cVar2;
                        oVar.f267106g.c(new UV0.c(aVar.f428808b));
                        PrintableText printableText = aVar.f428811e;
                        String strK0 = printableText != null ? printableText.k0(oVar.f267100a.getContext()) : null;
                        Button button = oVar.f267112m;
                        com.avito.android.lib.design.button.b.a(button, strK0, false);
                        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), button.getVisibility() == 0 ? y6.b(76) : 0);
                        Integer num = aVar.f428812f;
                        if (num != null) {
                            recyclerView.A0(num.intValue());
                        }
                        oVar.a(aVar.f428810d);
                    } else if (cVar2.equals(c.b.f428813b)) {
                        input.setEnabled(false);
                        C42670a c42670a3 = oVar.f267113n;
                        if (c42670a3 != null) {
                            c42670a3.c(null, new q(oVar));
                        }
                        oVar.a(false);
                    } else if (cVar2 instanceof c.d) {
                        textView.setVisibility(0);
                        recyclerView.setVisibility(8);
                        oVar.a(((c.d) cVar2).f428815b);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f266902l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f266902l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f266902l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectDistrictsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f266904l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f266904l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f266904l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f266905l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f266905l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f266905l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f266906l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f266906l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f266906l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectDistrictsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/select_districts/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/select_districts/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.select_districts.l> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.select_districts.l invoke() {
            com.avito.android.select_districts.m mVar = SelectDistrictsFragment.this.f266890o0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.select_districts.l) mVar.get();
        }
    }

    public SelectDistrictsFragment() {
        super(0, 1, null);
        this.f266889n0 = new C35968w3(this);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f266891p0 = new O0(m0.f406844a.b(com.avito.android.select_districts.l.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f266893r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.fragment_select_districts, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f266893r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        o.a aVar = this.f266892q0;
        this.f266894s0 = (aVar != null ? aVar : null).a(view, new b(), new c(), new d(), new e(), new f());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f266893r0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new g(), new h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.avito.android.select_districts.c] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.avito.android.select_districts.d] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.select_districts.e] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(SelectDistrictsScreen.f267115d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        c.a aVarHj = ((c.b) C29972i.a(C29972i.b(this), c.b.class)).Hj();
        SelectDistrictsScreenParams selectDistrictsScreenParamsQ5 = q5();
        boolean z12 = !q5().f266912d.isEmpty();
        List<ParcelableEntity<String>> list = q5().f266912d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((ParcelableEntity) it.next()).getId());
        }
        aVarHj.a(c28478k, selectDistrictsScreenParamsQ5.f266911c, z12, C42745f0.P0(arrayList), new com.avito.android.select_districts.items.selectable.d() { // from class: com.avito.android.select_districts.c
            @Override // com.avito.android.select_districts.items.selectable.d
            public final void a(String str) {
                SelectDistrictsFragment.a aVar = SelectDistrictsFragment.f266887t0;
                this.f266913a.r5().accept(new InterfaceC47130a.b(str));
            }
        }, new com.avito.android.select_districts.items.selected.b() { // from class: com.avito.android.select_districts.d
            @Override // com.avito.android.select_districts.items.selected.b
            public final void a(String str) {
                SelectDistrictsFragment.a aVar = SelectDistrictsFragment.f266887t0;
                this.f266914a.r5().accept(new InterfaceC47130a.f(str));
            }
        }, new com.avito.android.select_districts.items.selected.a() { // from class: com.avito.android.select_districts.e
            @Override // com.avito.android.select_districts.items.selected.a
            public final void a(boolean z13) {
                SelectDistrictsFragment.a aVar = SelectDistrictsFragment.f266887t0;
                this.f266956a.r5().accept(new InterfaceC47130a.i(z13));
            }
        }).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f266893r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final SelectDistrictsScreenParams q5() {
        return (SelectDistrictsScreenParams) this.f266889n0.getValue(this, f266888u0[0]);
    }

    public final com.avito.android.select_districts.l r5() {
        return (com.avito.android.select_districts.l) this.f266891p0.getValue();
    }
}

package com.avito.android.publish.select;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.select.SelectViewModel;
import com.avito.android.publish.select.e;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.InterfaceC43543a;

/* compiled from: SelectFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/select/SelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectFragment extends BaseFragment implements com.avito.android.ui.fragments.c, Id0.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f242623n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f242624o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f242625p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f242626q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f242627r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C0 f242628s0;

    /* renamed from: t0, reason: collision with root package name */
    public SelectViewModel f242629t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f242630u0;

    /* renamed from: v0, reason: collision with root package name */
    public C33862g0 f242631v0;

    /* renamed from: w0, reason: collision with root package name */
    public Hf0.b f242632w0;

    /* compiled from: SelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SelectViewModel selectViewModel = SelectFragment.this.f242629t0;
            if (selectViewModel == null) {
                selectViewModel = null;
            }
            selectViewModel.f242640O.xe(null);
            return G0.f406611a;
        }
    }

    public SelectFragment() {
        super(0, 1, null);
    }

    @Override // Id0.c
    public final int K1() {
        return R.layout.publish_button;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        SelectViewModel selectViewModel = this.f242629t0;
        if (selectViewModel == null) {
            selectViewModel = null;
        }
        selectViewModel.f242640O.ye();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        io.reactivex.rxjava3.disposables.c cVar;
        super.onActivityCreated(bundle);
        View rootView = requireView().getRootView();
        C0 c02 = this.f242628s0;
        if (c02 == null) {
            c02 = null;
        }
        this.f242631v0 = new C33862g0(rootView, c02.qe());
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments.getInt("step_index");
        final SelectViewModel selectViewModel = this.f242629t0;
        if (selectViewModel == null) {
            selectViewModel = null;
        }
        Set<TV0.d<?, ?>> set = this.f242626q0;
        if (set == null) {
            set = null;
        }
        ParametersTree parametersTreeWa = selectViewModel.f242638M.wa();
        SelectParameter selectParameter = parametersTreeWa != null ? (SelectParameter) parametersTreeWa.getFirstParameterOfType(SelectParameter.class) : null;
        if (selectParameter != null) {
            selectViewModel.f242641P = selectParameter;
            selectViewModel.ke();
            Iterator<T> it = set.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                cVar = selectViewModel.f242643R;
                if (!zHasNext) {
                    break;
                }
                TV0.d dVar = (TV0.d) it.next();
                if (dVar instanceof com.avito.android.blueprints.publish.checkable.d) {
                    com.avito.android.blueprints.publish.checkable.d dVar2 = (com.avito.android.blueprints.publish.checkable.d) dVar;
                    z<String> zVarD = dVar2.d();
                    InterfaceC35745a5 interfaceC35745a5 = selectViewModel.f242634E;
                    C41982q1 c41982q1X0 = zVarD.x0(interfaceC35745a5.e());
                    r rVar = new r(selectViewModel);
                    l41.g<? super Throwable> gVar = s.f242711b;
                    InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                    cVar.b(c41982q1X0.v0(rVar, gVar, interfaceC43543a));
                    cVar.b(dVar2.getF106098e().x0(interfaceC35745a5.e()).v0(new p(selectViewModel), q.f242709b, interfaceC43543a));
                } else if (dVar instanceof com.avito.android.blueprints.publish.header.e) {
                    cVar.b(((com.avito.android.blueprints.publish.header.e) dVar).B().t0(new k(selectViewModel)));
                }
            }
            cVar.b(selectViewModel.f242637L.d9().N(l.f242704b).t0(new l41.g() { // from class: com.avito.android.publish.select.m
                @Override // l41.g
                public final void accept(Object obj) {
                    SelectViewModel selectViewModel2 = selectViewModel;
                    InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
                    if (interfaceC14249c instanceof SubmittingSelectDeeplink.b.a) {
                        String str = ((SubmittingSelectDeeplink.b.a) interfaceC14249c).f121886b;
                        SelectParameter selectParameter2 = selectViewModel2.f242641P;
                        if (selectParameter2 == null) {
                            selectParameter2 = null;
                        }
                        selectParameter2.setValue(str);
                        selectViewModel2.f242640O.xe(null);
                        return;
                    }
                    if (!(interfaceC14249c instanceof SubmittingSelectDeeplink.b.c)) {
                        if (interfaceC14249c instanceof SubmittingSelectDeeplink.b.C3604b) {
                            selectViewModel2.ke();
                        }
                    } else {
                        selectViewModel2.ke();
                        selectViewModel2.f242642Q.setValue(SelectViewModel.a.C7276a.f242649a);
                        b.a.a(selectViewModel2.f242637L, ((SubmittingSelectDeeplink.b.c) interfaceC14249c).f121888b, null, null, 6);
                    }
                }
            }));
            C0 c03 = selectViewModel.f242640O;
            cVar.b(c03.f231882t0.t0(new n(selectViewModel)));
            cVar.b(c03.Pe(i12).m(new o(selectViewModel)));
        }
        SelectViewModel selectViewModel2 = this.f242629t0;
        if (selectViewModel2 == null) {
            selectViewModel2 = null;
        }
        C33862g0 c33862g0 = this.f242631v0;
        (c33862g0 != null ? c33862g0 : null).b(new c(0, this, SelectFragment.class, "leavePublish", "leavePublish()V", 0), new d(selectViewModel2));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f242627r0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.select.di.a.a().a((com.avito.android.publish.select.di.l) C29972i.a(C29972i.b(this), com.avito.android.publish.select.di.l.class), cv.c.b(this), arguments.getInt("step_index")).a(this);
        t tVar = this.f242623n0;
        if (tVar == null) {
            tVar = null;
        }
        this.f242629t0 = (SelectViewModel) R0.a(this, tVar).a(SelectViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.select_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SelectViewModel selectViewModel = this.f242629t0;
        if (selectViewModel == null) {
            selectViewModel = null;
        }
        selectViewModel.f242643R.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.deeplink_handler.view.d dVar = this.f242627r0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, (com.avito.android.deeplink_handler.view.impl.i) e5(), 28);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f242630u0 = recyclerView;
        view.getContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        RecyclerView recyclerView2 = this.f242630u0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.j itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 500L;
        }
        RecyclerView recyclerView3 = this.f242630u0;
        RecyclerView recyclerView4 = recyclerView3 == null ? null : recyclerView3;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView4.l(new com.avito.android.blueprints.publish.header.a(recyclerView3.getResources()), -1);
        RecyclerView recyclerView5 = this.f242630u0;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        RecyclerView.Adapter<?> adapter = this.f242624o0;
        if (adapter == null) {
            adapter = null;
        }
        recyclerView5.setAdapter(adapter);
        SelectViewModel selectViewModel = this.f242629t0;
        (selectViewModel != null ? selectViewModel : null).f242642Q.observe(getViewLifecycleOwner(), new e.a(new com.avito.android.publish.select.a(this)));
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        Hf0.b bVar = new Hf0.b(view);
        this.f242632w0 = bVar;
        bVar.d(getString(R.string.continue_string));
        Hf0.b bVar2 = this.f242632w0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.b(new a());
        view.addOnLayoutChangeListener(new com.avito.android.publish.screen.step.select.a(this, getResources().getDimensionPixelSize(R.dimen.publish_container_vertical_padding), 1));
        SelectViewModel selectViewModel = this.f242629t0;
        (selectViewModel != null ? selectViewModel : null).f242644S.observe(getViewLifecycleOwner(), new e.a(new b(this)));
    }

    @Override // Id0.c
    public final void g2() {
    }
}

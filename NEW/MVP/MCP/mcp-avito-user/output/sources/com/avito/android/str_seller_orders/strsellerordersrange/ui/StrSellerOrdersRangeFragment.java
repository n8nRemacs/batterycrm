package com.avito.android.str_seller_orders.strsellerordersrange.ui;

import Cd.C13243a;
import Ez0.e;
import Fz0.InterfaceC13858a;
import Fz0.InterfaceC13859b;
import Fz0.c;
import Y41.l;
import Y41.p;
import Y41.q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
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
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import com.avito.android.str_seller_orders.strsellerordersrange.ui.StrSellerOrdersRangeFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrSellerOrdersRangeFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/StrSellerOrdersRangeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrSellerOrdersRangeFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f290324n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290325o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f290326p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public Ez0.f f290327q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.c f290328r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f290329s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f290330t0;

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f290323v0 = {m0.f406844a.e(new Y(StrSellerOrdersRangeFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/StrSellerOrdersRangeViewHolder;", 0))};

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f290322u0 = new a(null);

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/StrSellerOrdersRangeFragment$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC13859b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13859b interfaceC13859b) {
            InterfaceC13859b interfaceC13859b2 = interfaceC13859b;
            StrSellerOrdersRangeFragment strSellerOrdersRangeFragment = (StrSellerOrdersRangeFragment) this.receiver;
            a aVar = StrSellerOrdersRangeFragment.f290322u0;
            strSellerOrdersRangeFragment.getClass();
            if (interfaceC13859b2 instanceof InterfaceC13859b.C0319b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strSellerOrdersRangeFragment.f290326p0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC13859b.C0319b) interfaceC13859b2).f6114a, null, null, 6);
            } else if (interfaceC13859b2 instanceof InterfaceC13859b.a) {
                strSellerOrdersRangeFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<StrSellerOrdersRangeState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(StrSellerOrdersRangeState strSellerOrdersRangeState) {
            a aVar = StrSellerOrdersRangeFragment.f290322u0;
            StrSellerOrdersRangeFragment strSellerOrdersRangeFragment = StrSellerOrdersRangeFragment.this;
            Fz0.c cVar = strSellerOrdersRangeState.f290284h;
            if (cVar != null) {
                if (cVar instanceof c.C0320c) {
                    c.C0320c c0320c = (c.C0320c) cVar;
                    com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVarQ5 = strSellerOrdersRangeFragment.q5();
                    D6.w(cVarQ5.f290344d);
                    cVarQ5.f290346f.setImageDrawable(C35835l0.h(c0320c.f6118a, strSellerOrdersRangeFragment.requireContext()));
                    String str = c0320c.f6120c;
                    boolean z12 = str == null || str.length() == 0;
                    TextView textView = cVarQ5.f290347g;
                    if (z12) {
                        textView.setText(c0320c.f6119b);
                    } else {
                        textView.setText(str);
                    }
                    cVarQ5.f290348h.setText(c0320c.f6121d);
                    D6.H(cVarQ5.f290345e);
                    D6.w(cVarQ5.f290343c);
                    D6.w(cVarQ5.f290342b);
                } else if (cVar instanceof c.a) {
                    c.a aVar2 = (c.a) cVar;
                    com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVarQ52 = strSellerOrdersRangeFragment.q5();
                    D6.H(cVarQ52.f290344d);
                    D6.w(cVarQ52.f290345e);
                    com.avito.konveyor.adapter.d dVar = strSellerOrdersRangeFragment.f290325o0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(aVar2.f6116b, null);
                    D6.w(cVarQ52.f290343c);
                    String str2 = aVar2.f6115a;
                    TextView textView2 = cVarQ52.f290342b;
                    textView2.setText(str2);
                    D6.H(textView2);
                } else if (cVar instanceof c.d) {
                    c.d dVar2 = (c.d) cVar;
                    com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVarQ53 = strSellerOrdersRangeFragment.q5();
                    D6.H(cVarQ53.f290344d);
                    D6.w(cVarQ53.f290345e);
                    com.avito.konveyor.adapter.d dVar3 = strSellerOrdersRangeFragment.f290325o0;
                    if (dVar3 == null) {
                        dVar3 = null;
                    }
                    dVar3.l(dVar2.f6122a, null);
                    D6.H(cVarQ53.f290343c);
                    D6.w(cVarQ53.f290342b);
                } else if (cVar instanceof c.b) {
                    com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVarQ54 = strSellerOrdersRangeFragment.q5();
                    D6.w(cVarQ54.f290344d);
                    D6.w(cVarQ54.f290343c);
                    D6.w(cVarQ54.f290349i);
                    com.avito.android.image_loader.glide.utils.b.a(cVarQ54.f290346f, R.drawable.str_seller_orders_no_content_img);
                    cVarQ54.f290347g.setText(R.string.str_seller_orders_empty_state_header);
                    cVarQ54.f290348h.setText(R.string.str_seller_orders_empty_state_description);
                    TextView textView3 = cVarQ54.f290342b;
                    textView3.setText(((c.b) cVar).f6117a);
                    D6.H(textView3);
                    D6.H(cVarQ54.f290345e);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFz0/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerordersrange.ui.StrSellerOrdersRangeFragment$onViewCreated$2", f = "StrSellerOrdersRangeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC13858a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f290332q;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC13858a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f290332q = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f290332q);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements p<InterfaceC13858a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC13858a interfaceC13858a, Continuation<? super G0> continuation) {
            Ez0.e eVar = (Ez0.e) this.receiver;
            a aVar = StrSellerOrdersRangeFragment.f290322u0;
            eVar.accept(interfaceC13858a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f290333l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f290333l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f290333l);
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
            return StrSellerOrdersRangeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f290335l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f290335l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f290335l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290336l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290336l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f290336l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290337l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f290337l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrSellerOrdersRangeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEz0/e;", "kotlin.jvm.PlatformType", "invoke", "()LEz0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Ez0.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Ez0.e invoke() {
            Ez0.f fVar = StrSellerOrdersRangeFragment.this.f290327q0;
            if (fVar == null) {
                fVar = null;
            }
            return (Ez0.e) fVar.get();
        }
    }

    public StrSellerOrdersRangeFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f290329s0 = new O0(m0.f406844a.b(Ez0.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f290330t0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f290324n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f290324n0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (Ez0.e) this.f290329s0.getValue(), new b(1, this, StrSellerOrdersRangeFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.str_seller_orders_range_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVar = new com.avito.android.str_seller_orders.strsellerordersrange.ui.c(view);
        C47313c c47313c = this.f290330t0;
        n<Object> nVar = f290323v0[0];
        c47313c.b(this, cVar);
        com.avito.android.str_seller_orders.strsellerordersrange.ui.c cVarQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f290325o0;
        if (dVar == null) {
            dVar = null;
        }
        RecyclerView recyclerView = cVarQ5.f290344d;
        recyclerView.setAdapter(dVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        final int i12 = 0;
        cVarQ5.f290349i.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.strsellerordersrange.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersRangeFragment f290340c;

            {
                this.f290340c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerOrdersRangeFragment strSellerOrdersRangeFragment = this.f290340c;
                switch (i12) {
                    case 0:
                        StrSellerOrdersRangeFragment.a aVar = StrSellerOrdersRangeFragment.f290322u0;
                        ((e) strSellerOrdersRangeFragment.f290329s0.getValue()).accept(InterfaceC13858a.c.f6112a);
                        break;
                    default:
                        StrSellerOrdersRangeFragment.a aVar2 = StrSellerOrdersRangeFragment.f290322u0;
                        ((e) strSellerOrdersRangeFragment.f290329s0.getValue()).accept(InterfaceC13858a.C0318a.f6110a);
                        break;
                }
            }
        });
        final int i13 = 1;
        q5().f290341a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders.strsellerordersrange.ui.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrSellerOrdersRangeFragment f290340c;

            {
                this.f290340c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrSellerOrdersRangeFragment strSellerOrdersRangeFragment = this.f290340c;
                switch (i13) {
                    case 0:
                        StrSellerOrdersRangeFragment.a aVar = StrSellerOrdersRangeFragment.f290322u0;
                        ((e) strSellerOrdersRangeFragment.f290329s0.getValue()).accept(InterfaceC13858a.c.f6112a);
                        break;
                    default:
                        StrSellerOrdersRangeFragment.a aVar2 = StrSellerOrdersRangeFragment.f290322u0;
                        ((e) strSellerOrdersRangeFragment.f290329s0.getValue()).accept(InterfaceC13858a.C0318a.f6110a);
                        break;
                }
            }
        });
        com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.c cVar2 = this.f290328r0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        C43175k.K(new C43197r1(new e(2, (Ez0.e) this.f290329s0.getValue(), Ez0.e.class, "accept", "accept(Ljava/lang/Object;)V", 4), new C43152f0(C23069w.a(cVar2.getF290357c(), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e), new d(3, null))), C22981N.a(getLifecycle()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f290324n0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("start_date_param");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string2 = requireArguments().getString("end_date_param");
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string3 = requireArguments().getString("item_id_param");
        if (string3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.str_seller_orders.strsellerordersrange.di.a.a().a(s.c(this), (cz0.e) C29972i.a(C29972i.b(this), cz0.e.class), cv.c.b(this), string, string2, string3, bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f290324n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.str_seller_orders.strsellerordersrange.ui.c q5() {
        C47313c c47313c = this.f290330t0;
        n<Object> nVar = f290323v0[0];
        return (com.avito.android.str_seller_orders.strsellerordersrange.ui.c) c47313c.a();
    }
}

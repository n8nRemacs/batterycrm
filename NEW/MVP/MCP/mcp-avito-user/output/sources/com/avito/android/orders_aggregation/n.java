package com.avito.android.orders_aggregation;

import android.content.Context;
import android.view.View;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.orders_aggregation.x;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import com.google.android.material.appbar.MaterialToolbar;
import i50.AbstractC41226a;
import j50.C42199a;
import java.util.ArrayList;
import java.util.List;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: OrdersAggregationView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationView$observeViewModel$1", f = "OrdersAggregationView.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210287q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f210288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f210289s;

    /* compiled from: OrdersAggregationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orders_aggregation.OrdersAggregationView$observeViewModel$1$1", f = "OrdersAggregationView.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210290q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ t f210291r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m f210292s;

        /* compiled from: OrdersAggregationView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/x;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/orders_aggregation/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.orders_aggregation.n$a$a, reason: collision with other inner class name */
        public static final class C6279a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f210293b;

            public C6279a(m mVar) {
                this.f210293b = mVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                b.a cVar;
                x xVar = (x) obj;
                m mVar = this.f210293b;
                ScreenPerformanceTracker screenPerformanceTracker = mVar.f210268a;
                screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
                boolean z12 = xVar instanceof x.b;
                C42670a c42670a = mVar.f210279l;
                if (z12) {
                    x.b bVar = (x.b) xVar;
                    String str = bVar.f210365a;
                    MaterialToolbar materialToolbar = mVar.f210276i;
                    materialToolbar.setTitle(str);
                    List<AbstractC41226a> list = bVar.f210367c;
                    List<AbstractC41226a> list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    for (AbstractC41226a abstractC41226a : list2) {
                        if (abstractC41226a.getF405427h()) {
                            cVar = b.a.e.f180735a;
                        } else {
                            Integer f413507g = abstractC41226a.getF405426g();
                            cVar = f413507g != null ? new b.a.c(f413507g.intValue(), null, null, 6, null) : null;
                        }
                        arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(abstractC41226a.getF405425f()), cVar, false, 4, null));
                    }
                    boolean zF2 = L.f(mVar.f210283p, list);
                    TabGroup tabGroup = mVar.f210277j;
                    int i12 = bVar.f210366b;
                    if (!zF2) {
                        B2 b22 = mVar.f210272e;
                        b22.getClass();
                        kotlin.reflect.n<Object> nVar = B2.f67184X[43];
                        boolean zBooleanValue = ((Boolean) b22.f67200P.a().invoke()).booleanValue();
                        SafeViewPager safeViewPager = mVar.f210278k;
                        com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> jVar = mVar.f210271d;
                        if (zBooleanValue) {
                            jVar.E5(list);
                            androidx.viewpager.widget.a adapter = safeViewPager.getAdapter();
                            if (adapter != null) {
                                adapter.h();
                            }
                            tabGroup.l();
                            com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList, Integer.valueOf(i12));
                        } else {
                            jVar.E5(list);
                            androidx.viewpager.widget.a adapter2 = safeViewPager.getAdapter();
                            if (adapter2 != null) {
                                adapter2.h();
                            }
                        }
                        mVar.f210283p = list;
                    }
                    tabGroup.post(new Me.m((Object) mVar, (Object) bVar, arrayList, 20));
                    boolean z13 = (((AbstractC41226a) C42745f0.K(i12, list)) instanceof C42199a) && bVar.f210370f;
                    boolean z14 = bVar.f210369e;
                    boolean z15 = z14 && z13;
                    View view = mVar.f210280m;
                    boolean z16 = view.getVisibility() == 0;
                    view.setVisibility(z15 ? 0 : 8);
                    Input input = mVar.f210281n;
                    if (z16 != z15 && z15) {
                        input.v();
                    }
                    if (!z13) {
                        K2.d(input, true);
                    }
                    materialToolbar.getMenu().getItem(0).setVisible(z13 && !z14);
                    String deformattedText = input.getDeformattedText();
                    String str2 = bVar.f210368d;
                    if (!L.f(deformattedText, str2)) {
                        Input.t(input, str2, false, 6);
                    }
                    int length = str2.length();
                    Context context = mVar.f210275h;
                    input.setLeftIconColor(length > 0 ? C35835l0.e(R.attr.black, context) : C35835l0.e(R.attr.gray54, context));
                    c42670a.b();
                } else if (xVar instanceof x.c) {
                    C42670a.d(c42670a);
                } else if (xVar instanceof x.a) {
                    c42670a.c(null, new o((x.a) xVar));
                }
                ScreenPerformanceTracker.a.c(mVar.f210268a, null, null, null, 7);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, t tVar, Continuation continuation) {
            super(2, continuation);
            this.f210291r = tVar;
            this.f210292s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f210292s, this.f210291r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210290q;
            if (i12 == 0) {
                C42729a0.b(obj);
                n2<x> n2Var = this.f210291r.f210328R;
                C6279a c6279a = new C6279a(this.f210292s);
                this.f210290q = 1;
                if (n2Var.collect(c6279a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t tVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f210288r = mVar;
        this.f210289s = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f210288r, this.f210289s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210287q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m mVar = this.f210288r;
            InterfaceC22983P interfaceC22983P = mVar.f210270c;
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(mVar, this.f210289s, null);
            this.f210287q = 1;
            if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

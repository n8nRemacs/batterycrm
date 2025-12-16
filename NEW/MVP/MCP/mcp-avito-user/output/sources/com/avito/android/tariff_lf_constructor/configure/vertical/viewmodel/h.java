package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import Y41.p;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.p2;
import vZ.InterfaceC49286a;

/* compiled from: ConstructorConfigureVerticalViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/viewmodel/h;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final e f300669E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300670J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final R0 f300671K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final Z1<P2<List<? extends com.avito.conveyor_item.a>>> f300672L = p2.a(P2.c.f318721a);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final c f300673M = new c(N.f410714t2, this);

    /* compiled from: ConstructorConfigureVerticalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.ConstructorConfigureVerticalViewModel$loadData$1", f = "ConstructorConfigureVerticalViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f300674q;

        /* compiled from: ConstructorConfigureVerticalViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.h$a$a, reason: collision with other inner class name */
        public static final class C9194a extends kotlin.jvm.internal.N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ h f300676l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ P2.a f300677m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9194a(h hVar, P2.a aVar) {
                super(0);
                this.f300676l = hVar;
                this.f300677m = aVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f300676l.f300672L.setValue(this.f300677m);
                return G0.f406611a;
            }
        }

        /* compiled from: ConstructorConfigureVerticalViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ h f300678l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ P2.b f300679m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, P2.b bVar) {
                super(0);
                this.f300678l = hVar;
                this.f300679m = bVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f300678l.f300672L.setValue(new P2.b(this.f300679m.f318720a));
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f300674q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                hVar.f300672L.setValue(P2.c.f318721a);
                this.f300674q = 1;
                obj = hVar.f300669E.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.a) {
                k.a(hVar.f300670J, ((P2.a) p22).f318719a, new C9194a(hVar, (P2.a) p22));
            } else if (p22 instanceof P2.b) {
                ScreenPerformanceTracker screenPerformanceTracker = hVar.f300670J;
                b bVar = new b(hVar, (P2.b) p22);
                J.b bVar2 = J.b.f90385a;
                ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, bVar2, null, 11);
                screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
                bVar.invoke();
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, bVar2, null, 5);
            } else {
                boolean z12 = p22 instanceof P2.c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorConfigureVerticalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.ConstructorConfigureVerticalViewModel$observeItemClicks$1$1", f = "ConstructorConfigureVerticalViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f300680q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49286a f300681r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300682s;

        /* compiled from: ConstructorConfigureVerticalViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l f300683b;

            public a(com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar) {
                this.f300683b = lVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                DeepLink deepLink = (DeepLink) obj;
                com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = this.f300683b;
                if (lVar != null) {
                    lVar.y(deepLink);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC49286a interfaceC49286a, com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f300681r = interfaceC49286a;
            this.f300682s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f300681r, this.f300682s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.P0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f300680q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 f295266b = this.f300681r.getF295266b();
                l0.h hVar = new l0.h();
                ?? A12 = Q0.a();
                A12.q3();
                hVar.f406842b = A12;
                InterfaceC43160i interfaceC43160iG = C43175k.G(new j(new X(f295266b, new i(hVar, null)), hVar, null));
                a aVar = new a(this.f300682s);
                this.f300680q = 1;
                if (interfaceC43160iG.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f300684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(N.b bVar, h hVar) {
            super(bVar);
            this.f300684b = hVar;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
            h hVar = this.f300684b;
            k.a(hVar.f300670J, z.n(th2), hVar.new d(th2));
        }
    }

    /* compiled from: ConstructorConfigureVerticalViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Throwable f300686m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th2) {
            super(0);
            this.f300686m = th2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.this.f300672L.setValue(new P2.a(z.n(this.f300686m)));
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k e eVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k R0 r02) {
        this.f300669E = eVar;
        this.f300670J = screenPerformanceTracker;
        this.f300671K = r02;
        O();
    }

    public final void O() {
        ScreenPerformanceTracker.a.b(this.f300670J, null, 3);
        C43259k.d(N0.a(this), this.f300671K.c().plus(this.f300673M), null, new a(null), 2);
    }

    public final void ke(@Y61.k Set<? extends TV0.d<?, ?>> set, @Y61.l com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof InterfaceC49286a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C43259k.d(N0.a(this), this.f300671K.a(), null, new b((InterfaceC49286a) it.next(), lVar, null), 2);
        }
    }
}

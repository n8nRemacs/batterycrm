package com.avito.beduin.v2.component.scrollable_containers.compose;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.accordion.s;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.component.scrollable_containers.compose.h;
import fU0.AbstractC40338a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ScrollableContainerEffect.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isManualScroll", "compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m {

    /* compiled from: ScrollableContainerEffect.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f336303l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f336303l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f336303l.setValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: ScrollableContainerEffect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.component.scrollable_containers.compose.ScrollableContainerEffectKt$ScrollableContainerEffect$2$1", f = "ScrollableContainerEffect.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f336304q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f336305r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ScrollType, G0> f336306s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q<Integer, Integer, ScrollType, G0> f336307t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f336308u;

        /* compiled from: ScrollableContainerEffect.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f336309l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f336309l = fVar;
            }

            @Override // Y41.a
            public final Boolean invoke() {
                return Boolean.valueOf(((e) this.f336309l).f336272a.f29721h.a());
            }
        }

        /* compiled from: ScrollableContainerEffect.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isScrolling", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.m$b$b, reason: collision with other inner class name */
        public static final class C10434b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<ScrollType, G0> f336310b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f336311c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q<Integer, Integer, ScrollType, G0> f336312d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<Boolean> f336313e;

            /* JADX WARN: Multi-variable type inference failed */
            public C10434b(Y41.l<? super ScrollType, G0> lVar, f fVar, q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
                this.f336310b = lVar;
                this.f336311c = fVar;
                this.f336312d = qVar;
                this.f336313e = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f336313e;
                ScrollType scrollType = interfaceC22204y1.getF42167b().booleanValue() ? ScrollType.f335663c : ScrollType.f335664d;
                if (zBooleanValue) {
                    Y41.l<ScrollType, G0> lVar = this.f336310b;
                    if (lVar != null) {
                        lVar.invoke(scrollType);
                    }
                } else {
                    f fVar = this.f336311c;
                    int iH2 = ((e) fVar).f336272a.h();
                    h.a aVar = (h.a) C42745f0.S(((e) fVar).e().f336275a);
                    int i12 = aVar != null ? aVar.f336278a : 0;
                    q<Integer, Integer, ScrollType, G0> qVar = this.f336312d;
                    if (qVar != null) {
                        qVar.invoke(Boxing.boxInt(iH2), Boxing.boxInt(i12), scrollType);
                    }
                    interfaceC22204y1.setValue(Boolean.TRUE);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f fVar, Y41.l<? super ScrollType, G0> lVar, q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f336305r = fVar;
            this.f336306s = lVar;
            this.f336307t = qVar;
            this.f336308u = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f336305r, this.f336306s, this.f336307t, this.f336308u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f336304q;
            if (i12 == 0) {
                C42729a0.b(obj);
                f fVar = this.f336305r;
                C43188o0 c43188o0T = C43175k.t(C22126m3.n(new a(fVar)), 1);
                C10434b c10434b = new C10434b(this.f336306s, fVar, this.f336307t, this.f336308u);
                this.f336304q = 1;
                if (c43188o0T.collect(c10434b, this) == coroutine_suspended) {
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

    /* compiled from: ScrollableContainerEffect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f336314l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f336315m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ScrollType, G0> f336316n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ q<Integer, Integer, ScrollType, G0> f336317o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f f336318p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z12, com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, Y41.l<? super ScrollType, G0> lVar, q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, f fVar, int i12) {
            super(2);
            this.f336314l = z12;
            this.f336315m = cVar;
            this.f336316n = lVar;
            this.f336317o = qVar;
            this.f336318p = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            f fVar = this.f336318p;
            com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f336315m;
            Y41.l<ScrollType, G0> lVar = this.f336316n;
            m.a(this.f336314l, cVar, lVar, this.f336317o, fVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(boolean z12, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l Y41.l<? super ScrollType, G0> lVar, @Y61.l q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, @Y61.k f fVar, @Y61.l A a12, int i12) {
        B b12;
        B bE2 = a12.E(1610000953);
        int i13 = i12 | (bE2.B(cVar) ? 32 : 16) | (bE2.u(lVar) ? 256 : 128) | (bE2.u(qVar) ? 2048 : 1024) | (bE2.B(fVar) ? 16384 : 8192);
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            bE2.C(-434685742);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.TRUE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            Object objI = s.i(-434679041, bE2, false);
            if (objI == c1651a) {
                objI = new a(interfaceC22204y1);
                bE2.H(objI);
            }
            bE2.X(false);
            com.avito.beduin.v2.component.scrollable_containers.compose.a.a(z12, cVar, fVar, (Y41.a) objI, bE2, (i13 & 112) | 3078 | ((i13 >> 6) & 896), 0);
            bE2.C(-434674483);
            boolean z13 = ((i13 & 896) == 256) | ((57344 & i13) == 16384) | ((i13 & 7168) == 2048);
            Object objT2 = bE2.t();
            if (z13 || objT2 == c1651a) {
                b12 = bE2;
                b bVar = new b(fVar, lVar, qVar, interfaceC22204y1, null);
                b12.H(bVar);
                objT2 = bVar;
            } else {
                b12 = bE2;
            }
            b12.X(false);
            C22187u0.f(fVar, lVar, qVar, (p) objT2, b12);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(z12, cVar, lVar, qVar, fVar, i12);
        }
    }
}

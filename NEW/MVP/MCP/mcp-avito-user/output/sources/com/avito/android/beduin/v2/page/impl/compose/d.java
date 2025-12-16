package com.avito.android.beduin.v2.page.impl.compose;

import Hi.InterfaceC13994a;
import Y41.p;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.beduin.v2.page.impl.compose.k;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: BeduinV2PageComposeViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "Lcom/avito/android/beduin/v2/page/impl/compose/k;", "Lcom/avito/android/beduin/v2/page/impl/compose/m;", "Lcom/avito/android/beduin/v2/page/impl/compose/l;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends M0 implements com.avito.android.arch.mvi.android.k<k, m, l> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f104938E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f104939J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f104940K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f104941L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f104942M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ZS.b f104943N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.v2.page.impl.compose.mvi.d f104944O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104945P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104946Q = C42727D.c(new C3131d());

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104947R = C42727D.c(new f());

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104948S = C42727D.c(new e());

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeViewModel$accept$1", f = "BeduinV2PageComposeViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f104949q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k f104951s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f104951s = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f104951s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f104949q;
            if (i12 == 0) {
                C42729a0.b(obj);
                x xVar = (x) d.this.f104945P.getValue();
                InterfaceC40047a interfaceC40047a = ((k.a) this.f104951s).f104986a;
                this.f104949q = 1;
                if (xVar.ya(interfaceC40047a, this) == coroutine_suspended) {
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

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeViewModel$accept$2", f = "BeduinV2PageComposeViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f104952q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k f104954s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f104954s = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new b(this.f104954s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f104952q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) d.this.f104946Q.getValue();
                InterfaceC13994a interfaceC13994a = ((k.b) this.f104954s).f104987a;
                this.f104952q = 1;
                if (cVar.ya(interfaceC13994a, this) == coroutine_suspended) {
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

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f104955l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f104956m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n.a aVar, d dVar) {
            super(0);
            this.f104955l = aVar;
            this.f104956m = dVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f104955l.a(N0.a(this.f104956m));
        }
    }

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LHi/a;", "LHi/b;", "LHi/d;", "LHi/c;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.v2.page.impl.compose.d$d, reason: collision with other inner class name */
    public static final class C3131d extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC13994a, Hi.b, Hi.d, Hi.c>> {
        public C3131d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC13994a, Hi.b, Hi.d, Hi.c> invoke() {
            d dVar = d.this;
            return dVar.f104944O.a(null, N0.a(dVar));
        }
    }

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/beduin/v2/page/impl/compose/l;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<InterfaceC43160i<? extends l>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC43160i<? extends l> invoke() {
            d dVar = d.this;
            return C43175k.N(new com.avito.android.beduin.v2.page.impl.compose.e(((x) dVar.f104945P.getValue()).getEvents()), new com.avito.android.beduin.v2.page.impl.compose.f(((com.avito.android.arch.mvi.c) dVar.f104946Q.getValue()).f91928q));
        }
    }

    /* compiled from: BeduinV2PageComposeViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/beduin/v2/page/impl/compose/m;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<n2<? extends m>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends m> invoke() {
            d dVar = d.this;
            C1 c12 = new C1(new C43137a0(new g(dVar, null), (x) dVar.f104945P.getValue()), (com.avito.android.arch.mvi.c) dVar.f104946Q.getValue(), new h(3, null));
            A1.a aVarA = N0.a(dVar);
            i2.f411430a.getClass();
            i2 i2Var = i2.a.f411433c;
            AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
            Hi.d.f7616b.getClass();
            return C43175k.U(c12, aVarA, i2Var, new m(c11084c, Hi.d.f7617c));
        }
    }

    @Inject
    public d(@Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar, @Y61.k R0 r02, @Y61.k String str, @Y61.k ZS.b bVar2, @Y61.k com.avito.android.beduin.v2.page.impl.compose.mvi.d dVar) {
        this.f104938E = b12;
        this.f104939J = set;
        this.f104940K = bVar;
        this.f104941L = r02;
        this.f104942M = str;
        this.f104943N = bVar2;
        this.f104944O = dVar;
        this.f104945P = C42727D.c(new c(aVar, this));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<l> getEvents() {
        return (InterfaceC43160i) this.f104948S.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<m> getState() {
        return (n2) this.f104947R.getValue();
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k k kVar) {
        boolean z12 = kVar instanceof k.a;
        R0 r02 = this.f104941L;
        if (z12) {
            C43259k.d(N0.a(this), r02.b(), null, new a(kVar, null), 2);
        } else if (kVar instanceof k.b) {
            C43259k.d(N0.a(this), r02.b(), null, new b(kVar, null), 2);
        }
    }

    public final void le(@Y61.k InterfaceC13994a interfaceC13994a) {
        accept(new k.b(interfaceC13994a));
    }
}

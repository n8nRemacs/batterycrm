package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.runtime.C22061e3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class l0 extends SuspendLambda implements Y41.p<G1, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f29948q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f29949r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m0 f29950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29951t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f29952u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20307p<Float> f29953v;

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/G1;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<G1, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m0 f29954l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            super(2);
            this.f29954l = m0Var;
        }

        @Override // Y41.p
        public final G0 invoke(G1 g12, Integer num) {
            int iIntValue = num.intValue();
            m0 m0Var = this.f29954l;
            ((C22061e3) m0Var.f29982s).L3(m0Var.i(iIntValue));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, int i12, float f12, InterfaceC20307p<Float> interfaceC20307p, Continuation<? super l0> continuation) {
        super(2, continuation);
        this.f29950s = m0Var;
        this.f29951t = i12;
        this.f29952u = f12;
        this.f29953v = interfaceC20307p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        l0 l0Var = new l0(this.f29950s, this.f29951t, this.f29952u, this.f29953v, continuation);
        l0Var.f29949r = obj;
        return l0Var;
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super G0> continuation) {
        return ((l0) create(g12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f29948q;
        if (i13 == 0) {
            C42729a0.b(obj);
            G1 g12 = (G1) this.f29949r;
            m0 m0Var = this.f29950s;
            e0 e0Var = new e0(g12, m0Var);
            a aVar = new a(m0Var);
            this.f29948q = 1;
            float f12 = p0.f30020a;
            int i14 = this.f29951t;
            aVar.invoke(e0Var, Boxing.boxInt(i14));
            boolean z12 = i14 > m0Var.f29968e;
            int iD2 = (e0Var.d() - m0Var.f29968e) + 1;
            if (((z12 && i14 > e0Var.d()) || (!z12 && i14 < m0Var.f29968e)) && Math.abs(i14 - m0Var.f29968e) >= 3) {
                if (z12) {
                    i12 = i14 - iD2;
                    int i15 = m0Var.f29968e;
                    if (i12 < i15) {
                        i12 = i15;
                    }
                } else {
                    int i16 = iD2 + i14;
                    i12 = m0Var.f29968e;
                    if (i16 <= i12) {
                        i12 = i16;
                    }
                }
                e0Var.e(i12, 0);
            }
            Object objC = C20273d1.c(0.0f, e0Var.f(i14) + this.f29952u, this.f29953v, new q0(new l0.e(), e0Var), this, 4);
            if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objC = G0.f406611a;
            }
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

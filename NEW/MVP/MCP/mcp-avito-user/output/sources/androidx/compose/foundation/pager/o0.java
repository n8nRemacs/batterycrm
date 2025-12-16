package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.G1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PagerState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class o0 extends SuspendLambda implements Y41.p<G1, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f30017q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f30018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30019s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, int i12, Continuation continuation) {
        super(2, continuation);
        this.f30018r = m0Var;
        this.f30019s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new o0(this.f30018r, this.f30019s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super G0> continuation) {
        return ((o0) create(g12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f30017q;
        m0 m0Var = this.f30018r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f30017q = 1;
            Object objA = m0Var.f29988y.a(this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = G0.f406611a;
            }
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        double d12 = 0.0f;
        if (-0.5d > d12 || d12 > 0.5d) {
            androidx.compose.foundation.internal.e.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        m0Var.t(m0Var.i(this.f30019s), 0.0f, true);
        return G0.f406611a;
    }
}

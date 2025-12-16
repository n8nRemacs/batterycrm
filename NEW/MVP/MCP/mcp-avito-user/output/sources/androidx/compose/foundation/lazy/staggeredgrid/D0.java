package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.G1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class D0 extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y0 f29568q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f29569r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(y0 y0Var, int i12, Continuation continuation) {
        super(2, continuation);
        this.f29568q = y0Var;
        this.f29569r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new D0(this.f29568q, this.f29569r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
        return ((D0) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.D0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

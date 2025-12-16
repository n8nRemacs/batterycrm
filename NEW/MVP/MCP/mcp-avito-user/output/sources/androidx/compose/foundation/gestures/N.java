package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Draggable2D.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class N extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27365q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f27366r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Z, Continuation<? super kotlin.G0>, Object> f27367s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p12, Y41.p pVar, Continuation continuation) {
        super(2, continuation);
        MutatePriority mutatePriority = MutatePriority.f26797b;
        this.f27366r = p12;
        this.f27367s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        MutatePriority mutatePriority = MutatePriority.f26797b;
        return new N(this.f27366r, this.f27367s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((N) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27365q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
        C42729a0.b(obj);
        this.f27366r.getClass();
        this.f27365q = 1;
        throw null;
    }
}

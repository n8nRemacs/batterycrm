package androidx.work.impl.workers;

import Y41.p;
import androidx.work.G;
import androidx.work.impl.model.H;
import java.util.Objects;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ConstraintTrackingWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/constraints/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/work/impl/constraints/b;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class g extends SuspendLambda implements p<androidx.work.impl.constraints.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f56081q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(H h12, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f56081q = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new g(this.f56081q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(androidx.work.impl.constraints.b bVar, Continuation<? super G0> continuation) {
        return ((g) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        int i12 = h.f56082a;
        G gA2 = G.a();
        Objects.toString(this.f56081q);
        gA2.getClass();
        return G0.f406611a;
    }
}

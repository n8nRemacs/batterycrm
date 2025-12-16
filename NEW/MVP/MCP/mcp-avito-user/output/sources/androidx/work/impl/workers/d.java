package androidx.work.impl.workers;

import Y41.p;
import androidx.work.F;
import androidx.work.impl.model.H;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super F.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f56069q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f56070r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f56071s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.constraints.f f56072t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H f56073u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstraintTrackingWorker constraintTrackingWorker, F f12, androidx.work.impl.constraints.f fVar, H h12, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f56070r = constraintTrackingWorker;
        this.f56071s = f12;
        this.f56072t = fVar;
        this.f56073u = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new d(this.f56070r, this.f56071s, this.f56072t, this.f56073u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super F.a> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f56069q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f56069q = 1;
            obj = ConstraintTrackingWorker.c(this.f56070r, this.f56071s, this.f56072t, this.f56073u, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}

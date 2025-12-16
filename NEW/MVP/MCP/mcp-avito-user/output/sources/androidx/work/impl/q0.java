package androidx.work.impl;

import androidx.work.F;
import androidx.work.InterfaceC23639x;
import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WorkerWrapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", i = {}, l = {300, 311}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class q0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super F.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f55912q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0 f55913r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.work.F f55914s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23639x f55915t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l0 l0Var, androidx.work.F f12, InterfaceC23639x interfaceC23639x, Continuation<? super q0> continuation) {
        super(2, continuation);
        this.f55913r = l0Var;
        this.f55914s = f12;
        this.f55915t = interfaceC23639x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new q0(this.f55913r, this.f55914s, this.f55915t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super F.a> continuation) {
        return ((q0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f55912q;
        l0 l0Var = this.f55913r;
        androidx.work.F f12 = this.f55914s;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.work.impl.model.H h12 = l0Var.f55757a;
            androidx.work.impl.utils.taskexecutor.c cVar = l0Var.f55761e;
            this.f55912q = 1;
            if (androidx.work.impl.utils.M.a(l0Var.f55758b, h12, f12, this.f55915t, cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        int i13 = s0.f55932a;
        androidx.work.G.a().getClass();
        D0<F.a> d0StartWork = f12.startWork();
        this.f55912q = 2;
        obj = s0.a(d0StartWork, f12, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}

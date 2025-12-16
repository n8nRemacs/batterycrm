package com.avito.android.job.cv_packages.mvi;

import cQ.c;
import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;

/* compiled from: CvPackageActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$3", f = "CvPackageActor.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<I0<? super CvPackageInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f174449q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174450r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ cQ.c f174451s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cQ.c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f174451s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f174451s, continuation);
        dVar.f174450r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super CvPackageInternalAction> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f174449q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f174450r;
            CvPackageInternalAction.ExitFromFlowWithSomeResult exitFromFlowWithSomeResult = new CvPackageInternalAction.ExitFromFlowWithSomeResult(((c.a) this.f174451s).f57859a);
            this.f174449q = 1;
            if (i02.send(exitFromFlowWithSomeResult, this) == coroutine_suspended) {
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

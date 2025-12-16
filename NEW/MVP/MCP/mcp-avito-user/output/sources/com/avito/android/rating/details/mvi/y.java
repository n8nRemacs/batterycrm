package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating.details.mvi.entity.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$24", f = "RatingDetailsActor.kt", i = {0}, l = {287, 288}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247509q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247510r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247511s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247512t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247513u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.rating.details.mvi.entity.b bVar, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f247511s = c34175a;
        this.f247512t = aVar;
        this.f247513u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f247511s, this.f247512t, this.f247513u, continuation);
        yVar.f247510r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((y) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247509q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f247510r;
            RatingDetailsInternalAction.Loading loading = new RatingDetailsInternalAction.Loading(b.e.C7423b.f247441a);
            this.f247510r = interfaceC43172j;
            this.f247509q = 1;
            if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f247510r;
            C42729a0.b(obj);
        }
        InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
        long j12 = ((a.w) this.f247512t).f247413a;
        this.f247510r = null;
        this.f247509q = 2;
        if (C34175a.g(this.f247511s, interfaceC43172j2, j12, null, this.f247513u, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PositionInfoActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$blinkAnimationDone$1", f = "PositionInfoActor.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220498q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f220499r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f220499r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f220499r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220498q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.position_in_search.storage.g gVar = this.f220499r.f220484a;
            this.f220498q = 1;
            if (gVar.b(this) == coroutine_suspended) {
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

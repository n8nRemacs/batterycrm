package com.avito.android.review.report.mvi;

import Y41.p;
import cn0.AbstractC27228a;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComfortableDealReviewsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.review.report.mvi.ComfortableDealReviewsActor$process$1", f = "ComfortableDealReviewsActor.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ComfortableDealReviewsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f255409q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f255410r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC27228a f255411s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC27228a abstractC27228a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f255411s = abstractC27228a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f255411s, continuation);
        cVar.f255410r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ComfortableDealReviewsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f255409q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f255410r;
            if (L.f(this.f255411s, AbstractC27228a.C2064a.f58136a)) {
                ComfortableDealReviewsInternalAction.BackPressed backPressed = ComfortableDealReviewsInternalAction.BackPressed.f255413b;
                this.f255409q = 1;
                if (interfaceC43172j.emit(backPressed, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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

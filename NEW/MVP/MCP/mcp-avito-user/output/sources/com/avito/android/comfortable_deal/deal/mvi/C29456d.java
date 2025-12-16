package com.avito.android.comfortable_deal.deal.mvi;

import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$11", f = "DealActor.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.comfortable_deal.deal.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29456d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121593q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29453a f121595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121596t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29456d(C29453a c29453a, Ep.c cVar, Continuation<? super C29456d> continuation) {
        super(2, continuation);
        this.f121595s = c29453a;
        this.f121596t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29456d c29456d = new C29456d(this.f121595s, this.f121596t, continuation);
        c29456d.f121594r = obj;
        return c29456d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29456d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121593q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f121594r;
            Ep.c cVar = this.f121596t;
            String str = cVar.f4325b;
            if (str == null) {
                str = "";
            }
            CommentsFilter commentsFilter = cVar.f4331h.f4339h;
            this.f121593q = 1;
            if (C29453a.c(this.f121595s, interfaceC43172j, str, commentsFilter, this) == coroutine_suspended) {
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

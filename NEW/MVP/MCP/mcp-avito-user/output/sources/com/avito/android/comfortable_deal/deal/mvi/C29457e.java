package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$12", f = "DealActor.kt", i = {0, 0}, l = {204, 205}, m = "invokeSuspend", n = {"$this$flow", "filter"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.comfortable_deal.deal.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29457e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CommentsFilter f121597q;

    /* renamed from: r, reason: collision with root package name */
    public int f121598r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f121599s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121600t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121601u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C29453a f121602v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29457e(InterfaceC13517a interfaceC13517a, Ep.c cVar, C29453a c29453a, Continuation<? super C29457e> continuation) {
        super(2, continuation);
        this.f121600t = interfaceC13517a;
        this.f121601u = cVar;
        this.f121602v = c29453a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29457e c29457e = new C29457e(this.f121600t, this.f121601u, this.f121602v, continuation);
        c29457e.f121599s = obj;
        return c29457e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29457e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CommentsFilter commentsFilter;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121598r;
        Ep.c cVar = this.f121601u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f121599s;
            int iOrdinal = ((InterfaceC13517a.i) this.f121600t).f4278a.ordinal();
            if (iOrdinal == 0) {
                commentsFilter = CommentsFilter.f122615c;
            } else if (iOrdinal == 1) {
                commentsFilter = CommentsFilter.f122616d;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                commentsFilter = CommentsFilter.f122617e;
            }
            if (cVar.f4331h.f4339h == commentsFilter) {
                return G0.f406611a;
            }
            DealInternalAction.UpdateCommentsFilter updateCommentsFilter = new DealInternalAction.UpdateCommentsFilter(commentsFilter);
            this.f121599s = interfaceC43172j2;
            this.f121597q = commentsFilter;
            this.f121598r = 1;
            if (interfaceC43172j2.emit(updateCommentsFilter, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            commentsFilter = this.f121597q;
            interfaceC43172j = (InterfaceC43172j) this.f121599s;
            C42729a0.b(obj);
        }
        String str = cVar.f4325b;
        if (str == null) {
            str = "";
        }
        this.f121599s = null;
        this.f121597q = null;
        this.f121598r = 2;
        if (C29453a.c(this.f121602v, interfaceC43172j, str, commentsFilter, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

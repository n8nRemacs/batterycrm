package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
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
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$7", f = "RatingDetailsActor.kt", i = {0}, l = {170, 171}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247201q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247203s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247204t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C34175a c34175a, com.avito.android.rating.details.mvi.entity.b bVar, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f247203s = c34175a;
        this.f247204t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f247203s, this.f247204t, continuation);
        e12.f247202r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        SearchParametersEntry.SearchParametersBlock.Sort.Tooltip tooltip;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247201q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f247202r;
            C34175a c34175a = this.f247203s;
            SearchParametersEntry.SearchParametersBlock.Sort sortC = C34175a.c(c34175a, this.f247204t);
            if (sortC == null || (tooltip = sortC.getTooltip()) == null) {
                return G0.f406611a;
            }
            c34175a.f247274c.k(tooltip.getAnalyticsAction());
            String storageKey = tooltip.getStorageKey();
            this.f247202r = interfaceC43172j;
            this.f247201q = 1;
            if (c34175a.f247277f.b(storageKey, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f247202r;
            C42729a0.b(obj);
        }
        RatingDetailsInternalAction.SortTooltipShown sortTooltipShown = RatingDetailsInternalAction.SortTooltipShown.f247369b;
        this.f247202r = null;
        this.f247201q = 2;
        if (interfaceC43172j.emit(sortTooltipShown, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

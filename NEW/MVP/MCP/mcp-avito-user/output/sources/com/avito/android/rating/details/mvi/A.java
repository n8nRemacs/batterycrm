package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
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
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$3", f = "RatingDetailsActor.kt", i = {0}, l = {117, 118}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class A extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247183q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247185s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34175a f247186t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C34175a c34175a, com.avito.android.rating.details.mvi.entity.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f247185s = bVar;
        this.f247186t = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A a12 = new A(this.f247186t, this.f247185s, continuation);
        a12.f247184r = obj;
        return a12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((A) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        RatingAspectsEntry.Tooltip tooltip;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247183q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f247184r;
            RatingAspectsEntry ratingAspectsEntry = this.f247185s.f247424g;
            if (ratingAspectsEntry == null || (tooltip = ratingAspectsEntry.getTooltip()) == null) {
                return G0.f406611a;
            }
            com.avito.android.rating_persistence.aspects.e eVar = this.f247186t.f247276e;
            String storageKey = tooltip.getStorageKey();
            this.f247184r = interfaceC43172j;
            this.f247183q = 1;
            if (eVar.a(storageKey, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f247184r;
            C42729a0.b(obj);
        }
        RatingDetailsInternalAction.AspectsTooltipShown aspectsTooltipShown = RatingDetailsInternalAction.AspectsTooltipShown.f247312b;
        this.f247184r = null;
        this.f247183q = 2;
        if (interfaceC43172j.emit(aspectsTooltipShown, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

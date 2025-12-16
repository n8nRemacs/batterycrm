package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$HandleDeeplink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$23", f = "RatingDetailsActor.kt", i = {}, l = {281, 283}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction.HandleDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247505q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247506r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247507s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34175a f247508t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f247507s = aVar;
        this.f247508t = c34175a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f247508t, this.f247507s, continuation);
        xVar.f247506r = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction.HandleDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247505q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247506r;
            RatingDetailsInternalAction.HandleDeeplink handleDeeplink = new RatingDetailsInternalAction.HandleDeeplink(((a.p) this.f247507s).f247403a, null, null, 6, null);
            this.f247505q = 1;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        C34175a c34175a = this.f247508t;
        RatingDetailsArguments ratingDetailsArguments = c34175a.f247280i;
        RatingDetailsArguments.ItemReviews itemReviews = ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews ? (RatingDetailsArguments.ItemReviews) ratingDetailsArguments : null;
        if (itemReviews == null) {
            return G0.f406611a;
        }
        this.f247505q = 2;
        if (c34175a.f247275d.c(itemReviews.f246412f, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

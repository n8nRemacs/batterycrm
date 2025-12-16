package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
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
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$16", f = "RatingDetailsActor.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating.details.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34193p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247479q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247480r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247481s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34193p(com.avito.android.rating.details.mvi.entity.a aVar, Continuation<? super C34193p> continuation) {
        super(2, continuation);
        this.f247481s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34193p c34193p = new C34193p(this.f247481s, continuation);
        c34193p.f247480r = obj;
        return c34193p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34193p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247479q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247480r;
            RatingInfoWithHintItem.Hint hint = ((a.k) this.f247481s).f247397a.f250025h;
            if (hint == null) {
                return G0.f406611a;
            }
            RatingDetailsInternalAction.OpenInfoHintDialog openInfoHintDialog = new RatingDetailsInternalAction.OpenInfoHintDialog(hint);
            this.f247479q = 1;
            if (interfaceC43172j.emit(openInfoHintDialog, this) == coroutine_suspended) {
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

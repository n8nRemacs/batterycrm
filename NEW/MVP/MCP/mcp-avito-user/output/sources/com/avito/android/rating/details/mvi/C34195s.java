package com.avito.android.rating.details.mvi;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$process$19", f = "RatingDetailsActor.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.rating.details.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34195s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247487q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247489s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f247490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34195s(C34175a c34175a, com.avito.android.rating.details.mvi.entity.a aVar, Continuation<? super C34195s> continuation) {
        super(2, continuation);
        this.f247489s = c34175a;
        this.f247490t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34195s c34195s = new C34195s(this.f247489s, this.f247490t, continuation);
        c34195s.f247488r = obj;
        return c34195s;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34195s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247487q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247488r;
            this.f247489s.f247274c.f();
            a.h hVar = (a.h) this.f247490t;
            RatingDetailsInternalAction.OpenReviewGallery openReviewGallery = new RatingDetailsInternalAction.OpenReviewGallery(hVar.f247391a, hVar.f247392b);
            this.f247487q = 1;
            if (interfaceC43172j.emit(openReviewGallery, this) == coroutine_suspended) {
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

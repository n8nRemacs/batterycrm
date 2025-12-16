package com.avito.android.rating.details.answer.photo.mvi;

import Y41.p;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.ratings.ReviewData;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.review_reply.AddReviewReplyResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingAddAnswerPhotoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.answer.photo.mvi.RatingAddAnswerPhotoActor$handleAddAnswerSuccess$1", f = "RatingAddAnswerPhotoActor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f246706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f246707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f246708s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f246709t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TypedResult.Success<AddReviewReplyResult> f246710u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j12, d dVar, TypedResult.Success<AddReviewReplyResult> success, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f246708s = j12;
        this.f246709t = dVar;
        this.f246710u = success;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f246708s, this.f246709t, this.f246710u, continuation);
        bVar.f246707r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246706q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f246707r;
            Long lBoxLong = Boxing.boxLong(this.f246708s);
            com.avito.android.rating.details.answer.upload.a aVar = this.f246709t.f246717b;
            TypedResult.Success<AddReviewReplyResult> success = this.f246710u;
            RatingAddAnswerPhotoInternalAction.Finish finish = new RatingAddAnswerPhotoInternalAction.Finish(new ReviewReplyState.Result(new ReviewData(lBoxLong, aVar.a(success.getResult().getReply())), success.getResult().getMessage()));
            this.f246706q = 1;
            if (interfaceC43172j.emit(finish, this) == coroutine_suspended) {
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

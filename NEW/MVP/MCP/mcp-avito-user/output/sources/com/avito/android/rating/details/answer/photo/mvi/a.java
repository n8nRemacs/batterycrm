package com.avito.android.rating.details.answer.photo.mvi;

import Y41.p;
import com.avito.android.analytics.screens.mvi.t;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.review_reply.AddReviewReplyResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingAddAnswerPhotoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.answer.photo.mvi.RatingAddAnswerPhotoActor$handleAddAnswerError$1", f = "RatingAddAnswerPhotoActor.kt", i = {0}, l = {65, 67}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f246702q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f246703r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TypedResult.Error<AddReviewReplyResult> f246704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f246705t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TypedResult.Error<AddReviewReplyResult> error, d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f246704s = error;
        this.f246705t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f246704s, this.f246705t, continuation);
        aVar.f246703r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246702q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f246703r;
            RatingAddAnswerPhotoInternalAction.HideLoading hideLoading = RatingAddAnswerPhotoInternalAction.HideLoading.f246725b;
            this.f246703r = interfaceC43172j;
            this.f246702q = 1;
            if (interfaceC43172j.emit(hideLoading, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f246703r;
            C42729a0.b(obj);
        }
        TypedResult.Error<AddReviewReplyResult> error = this.f246704s;
        ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
        d dVar = this.f246705t;
        ApiError apiErrorA = dVar.f246718c.a(apiExceptionA);
        t showUserDialog = apiErrorA instanceof ApiError.ErrorDialog ? new RatingAddAnswerPhotoInternalAction.ShowUserDialog(((ApiError.ErrorDialog) apiErrorA).getUserDialog(), apiExceptionA) : new RatingAddAnswerPhotoInternalAction.ShowErrorToastBar(dVar.f246718c.b(apiErrorA), apiExceptionA);
        this.f246703r = null;
        this.f246702q = 2;
        if (interfaceC43172j.emit(showUserDialog, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

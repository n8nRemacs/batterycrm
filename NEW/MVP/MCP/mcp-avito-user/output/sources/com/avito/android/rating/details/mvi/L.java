package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: RatingDetailsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$UpdateAnswerAndActions;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsBootstrap$handleRevertAnswerResult$1", f = "RatingDetailsBootstrap.kt", i = {0, 0, 0}, l = {112, 113}, m = "invokeSuspend", n = {"$this$flow", "reviewId", "answer"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes16.dex */
final class L extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction.UpdateAnswerAndActions>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Long f247241q;

    /* renamed from: r, reason: collision with root package name */
    public BaseRatingReviewItem.ReviewAnswer f247242r;

    /* renamed from: s, reason: collision with root package name */
    public int f247243s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f247244t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C43501a f247245u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ I f247246v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C43501a c43501a, I i12, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f247245u = c43501a;
        this.f247246v = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        L l12 = new L(this.f247245u, this.f247246v, continuation);
        l12.f247244t = obj;
        return l12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction.UpdateAnswerAndActions> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((L) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f247243s
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.C42729a0.b(r11)
            goto La0
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem$ReviewAnswer r1 = r10.f247242r
            java.lang.Long r3 = r10.f247241q
            java.lang.Object r5 = r10.f247244t
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kotlin.C42729a0.b(r11)
            goto L86
        L28:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f247244t
            r5 = r11
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kv.a r11 = r10.f247245u
            com.avito.android.deeplink_handler.handler.bundle.a r1 = r11.f413260a
            android.os.Bundle r1 = r1.f134522c
            if (r1 == 0) goto L49
            java.lang.String r6 = "key_review_id"
            boolean r7 = r1.containsKey(r6)
            if (r7 == 0) goto L49
            long r6 = r1.getLong(r6)
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            goto L4a
        L49:
            r1 = r4
        L4a:
            com.avito.android.deeplink_handler.handler.bundle.a r11 = r11.f413260a
            android.os.Bundle r11 = r11.f134522c
            if (r11 == 0) goto L66
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r6 < r7) goto L5d
            java.lang.Object r11 = com.avito.android.publish.screen.objects.a.z(r11)
            android.os.Parcelable r11 = (android.os.Parcelable) r11
            goto L63
        L5d:
            java.lang.String r6 = "key_deleted_answer"
            android.os.Parcelable r11 = r11.getParcelable(r6)
        L63:
            com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem$ReviewAnswer r11 = (com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem.ReviewAnswer) r11
            goto L67
        L66:
            r11 = r4
        L67:
            if (r1 == 0) goto La0
            if (r11 == 0) goto La0
            com.avito.android.rating.details.mvi.I r6 = r10.f247246v
            com.avito.android.rating.details.interactor.e r6 = r6.f247223a
            long r7 = r1.longValue()
            r10.f247244t = r5
            r10.f247241q = r1
            r10.f247242r = r11
            r10.f247243s = r3
            java.lang.Object r3 = r6.a(r7, r10)
            if (r3 != r0) goto L82
            return r0
        L82:
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r9
        L86:
            java.util.List r11 = (java.util.List) r11
            com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$UpdateAnswerAndActions r6 = new com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$UpdateAnswerAndActions
            long r7 = r3.longValue()
            r6.<init>(r7, r1, r11)
            r10.f247244t = r4
            r10.f247241q = r4
            r10.f247242r = r4
            r10.f247243s = r2
            java.lang.Object r11 = r5.emit(r6, r10)
            if (r11 != r0) goto La0
            return r0
        La0:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

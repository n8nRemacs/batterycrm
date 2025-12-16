package com.avito.android.rating.details.answer.photo.mvi;

import Y41.p;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingAddAnswerPhotoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.answer.photo.mvi.RatingAddAnswerPhotoActor$process$1", f = "RatingAddAnswerPhotoActor.kt", i = {0, 0, 1, 1}, l = {37, 38, 44}, m = "invokeSuspend", n = {"$this$flow", "reviewId", "$this$flow", "reviewId"}, s = {"L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f246711q;

    /* renamed from: r, reason: collision with root package name */
    public int f246712r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f246713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f246714t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RatingAddAnswerPhotoState f246715u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, RatingAddAnswerPhotoState ratingAddAnswerPhotoState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f246714t = dVar;
        this.f246715u = ratingAddAnswerPhotoState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f246714t, this.f246715u, continuation);
        cVar.f246713s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r15
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f246712r
            r8 = 3
            r1 = 2
            r2 = 1
            com.avito.android.rating.details.answer.photo.mvi.d r12 = r6.f246714t
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2e
            if (r0 == r1) goto L21
            if (r0 != r8) goto L19
            kotlin.C42729a0.b(r16)
            goto Lb0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            long r0 = r6.f246711q
            java.lang.Object r2 = r6.f246713s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r16)
            r10 = r0
            r0 = r16
            goto L7a
        L2e:
            long r2 = r6.f246711q
            java.lang.Object r0 = r6.f246713s
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
            kotlin.C42729a0.b(r16)
            r11 = r0
            r9 = r2
            goto L5f
        L3a:
            kotlin.C42729a0.b(r16)
            java.lang.Object r0 = r6.f246713s
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
            com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments r3 = r12.f246719d
            java.lang.Long r3 = r3.f246620b
            if (r3 == 0) goto Lb9
            long r3 = r3.longValue()
            com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$LoadingAnswer r5 = new com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$LoadingAnswer
            r5.<init>()
            r6.f246713s = r0
            r6.f246711q = r3
            r6.f246712r = r2
            java.lang.Object r2 = r0.emit(r5, r15)
            if (r2 != r7) goto L5d
            return r7
        L5d:
            r11 = r0
            r9 = r3
        L5f:
            com.avito.android.rating.details.answer.photo.a r0 = r12.f246716a
            com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments r2 = r12.f246719d
            java.lang.String r3 = r2.f246621c
            com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState r2 = r6.f246715u
            java.lang.Object r4 = r2.f246738b
            r6.f246713s = r11
            r6.f246711q = r9
            r6.f246712r = r1
            r1 = r9
            r5 = r15
            java.lang.Object r0 = r0.a(r1, r3, r4, r5)
            if (r0 != r7) goto L78
            return r7
        L78:
            r2 = r11
            r10 = r9
        L7a:
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Success
            r3 = 0
            if (r1 == 0) goto L93
            r13 = r0
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            r12.getClass()
            com.avito.android.rating.details.answer.photo.mvi.b r0 = new com.avito.android.rating.details.answer.photo.mvi.b
            r14 = 0
            r9 = r0
            r9.<init>(r10, r12, r13, r14)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.C43175k.G(r0)
            goto La5
        L93:
            boolean r1 = r0 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto Lb3
            com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0
            r12.getClass()
            com.avito.android.rating.details.answer.photo.mvi.a r1 = new com.avito.android.rating.details.answer.photo.mvi.a
            r1.<init>(r0, r12, r3)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.C43175k.G(r1)
        La5:
            r6.f246713s = r3
            r6.f246712r = r8
            java.lang.Object r0 = kotlinx.coroutines.flow.C43175k.u(r15, r0, r2)
            if (r0 != r7) goto Lb0
            return r7
        Lb0:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lb9:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.answer.photo.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$deleteReview$1", f = "RatingDetailsActor.kt", i = {0, 1}, l = {424, 425, 426, 427}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.rating.details.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34178d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247302q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247303r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247304s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f247305t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247306u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34178d(C34175a c34175a, long j12, com.avito.android.rating.details.mvi.entity.b bVar, Continuation<? super C34178d> continuation) {
        super(2, continuation);
        this.f247304s = c34175a;
        this.f247305t = j12;
        this.f247306u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34178d c34178d = new C34178d(this.f247304s, this.f247305t, this.f247306u, continuation);
        c34178d.f247303r = obj;
        return c34178d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34178d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f247302q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.C42729a0.b(r12)
            goto L9f
        L22:
            java.lang.Object r1 = r11.f247303r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
        L29:
            r5 = r1
            goto L5e
        L2b:
            java.lang.Object r1 = r11.f247303r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L4d
        L33:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f247303r
            kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
            com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading r1 = new com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading
            com.avito.android.rating.details.mvi.entity.b$e$b r6 = com.avito.android.rating.details.mvi.entity.b.e.C7423b.f247441a
            r1.<init>(r6)
            r11.f247303r = r12
            r11.f247302q = r5
            java.lang.Object r1 = r12.emit(r1, r11)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            r1 = r12
        L4d:
            com.avito.android.rating.details.mvi.a r12 = r11.f247304s
            com.avito.android.rating.details.interactor.e r12 = r12.f247272a
            r11.f247303r = r1
            r11.f247302q = r4
            long r4 = r11.f247305t
            java.lang.Object r12 = r12.c(r4, r11)
            if (r12 != r0) goto L29
            return r0
        L5e:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r1 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            r4 = 0
            com.avito.android.rating.details.mvi.a r6 = r11.f247304s
            if (r1 == 0) goto L82
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r12 = r12.getResult()
            r8 = r12
            com.avito.android.remote.model.review_reply.DeleteReviewReplyResult r8 = (com.avito.android.remote.model.review_reply.DeleteReviewReplyResult) r8
            r11.f247303r = r4
            r11.f247302q = r3
            long r1 = r11.f247305t
            com.avito.android.rating.details.mvi.entity.b r9 = r11.f247306u
            r4 = r6
            r6 = r1
            r10 = r11
            java.lang.Object r12 = com.avito.android.rating.details.mvi.C34175a.g(r4, r5, r6, r8, r9, r10)
            if (r12 != r0) goto L9f
            return r0
        L82:
            boolean r1 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto La2
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r1 = r12.getError()
            java.lang.Throwable r12 = r12.getCause()
            com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r1, r12)
            r11.f247303r = r4
            r11.f247302q = r2
            java.lang.Object r12 = com.avito.android.rating.details.mvi.C34175a.f(r6, r5, r12, r11)
            if (r12 != r0) goto L9f
            return r0
        L9f:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        La2:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34178d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

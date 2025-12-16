package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsActor$deleteModelReview$1", f = "RatingDetailsActor.kt", i = {0, 1}, l = {432, 433, 434}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.rating.details.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34176b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247293q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247294r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34175a f247295s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f247296t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247297u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34176b(C34175a c34175a, long j12, com.avito.android.rating.details.mvi.entity.b bVar, Continuation<? super C34176b> continuation) {
        super(2, continuation);
        this.f247295s = c34175a;
        this.f247296t = j12;
        this.f247297u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34176b c34176b = new C34176b(this.f247295s, this.f247296t, this.f247297u, continuation);
        c34176b.f247294r = obj;
        return c34176b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34176b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
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
            int r1 = r10.f247293q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r11)
            goto L6f
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.f247294r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
        L24:
            r4 = r1
            goto L59
        L26:
            java.lang.Object r1 = r10.f247294r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L48
        L2e:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f247294r
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading r1 = new com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction$Loading
            com.avito.android.rating.details.mvi.entity.b$e$b r5 = com.avito.android.rating.details.mvi.entity.b.e.C7423b.f247441a
            r1.<init>(r5)
            r10.f247294r = r11
            r10.f247293q = r4
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L47
            return r0
        L47:
            r1 = r11
        L48:
            com.avito.android.rating.details.mvi.a r11 = r10.f247295s
            com.avito.android.rating.details.interactor.e r11 = r11.f247272a
            r10.f247294r = r1
            r10.f247293q = r3
            long r3 = r10.f247296t
            java.lang.Object r11 = r11.b(r3, r10)
            if (r11 != r0) goto L24
            return r0
        L59:
            r7 = r11
            com.avito.android.remote.model.review_reply.DeleteModelReviewResult r7 = (com.avito.android.remote.model.review_reply.DeleteModelReviewResult) r7
            r11 = 0
            r10.f247294r = r11
            r10.f247293q = r2
            long r5 = r10.f247296t
            com.avito.android.rating.details.mvi.entity.b r8 = r10.f247297u
            com.avito.android.rating.details.mvi.a r3 = r10.f247295s
            r9 = r10
            java.lang.Object r11 = com.avito.android.rating.details.mvi.C34175a.e(r3, r4, r5, r7, r8, r9)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.C34176b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

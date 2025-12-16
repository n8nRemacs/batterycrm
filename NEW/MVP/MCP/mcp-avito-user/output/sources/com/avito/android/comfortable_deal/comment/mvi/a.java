package com.avito.android.comfortable_deal.comment.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mp.C44116d;
import mp.InterfaceC44114b;

/* compiled from: CommentActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lmp/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.comment.mvi.CommentActor$process$1", f = "CommentActor.kt", i = {0, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC44114b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f120544q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120545r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C44116d f120546s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f120547t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C44116d c44116d, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f120546s = c44116d;
        this.f120547t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f120546s, this.f120547t, continuation);
        aVar.f120545r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC44114b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f120544q
            mp.d r2 = r7.f120546s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.C42729a0.b(r8)
            goto Lb0
        L24:
            java.lang.Object r1 = r7.f120545r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L67
        L2c:
            java.lang.Object r1 = r7.f120545r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L50
        L34:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f120545r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            boolean r1 = r2.f414759b
            if (r1 == 0) goto L42
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L42:
            mp.b$c r1 = mp.InterfaceC44114b.c.f414753a
            r7.f120545r = r8
            r7.f120544q = r6
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r1 = r8
        L50:
            com.avito.android.comfortable_deal.comment.mvi.b r8 = r7.f120547t
            com.avito.android.comfortable_deal.repository.a r8 = r8.f120548a
            java.lang.String r6 = r2.f414760c
            java.lang.String r2 = r2.f414761d
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            r7.f120545r = r1
            r7.f120544q = r5
            java.lang.Object r8 = r8.p(r6, r2, r7)
            if (r8 != r0) goto L67
            return r0
        L67:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r2 == 0) goto L8a
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            r8.getResult()
            mp.b$d r8 = new mp.b$d
            com.avito.android.comfortable_deal.comment.model.CommentResult r2 = new com.avito.android.comfortable_deal.comment.model.CommentResult
            com.avito.android.comfortable_deal.comment.model.CommentResultStrategy r3 = com.avito.android.comfortable_deal.comment.model.CommentResultStrategy.f120539b
            r2.<init>(r3, r5)
            r8.<init>(r2)
            r7.f120545r = r5
            r7.f120544q = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto Lb0
            return r0
        L8a:
            boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lb3
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r2 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
            mp.b$b r2 = new mp.b$b
            com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
            r2.<init>(r8)
            r7.f120545r = r5
            r7.f120544q = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto Lb0
            return r0
        Lb0:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lb3:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.comment.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

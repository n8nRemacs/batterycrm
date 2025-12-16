package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14384a;
import Le0.InterfaceC14385b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishRequestActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LLe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor$processUploadStatusChanged$1", f = "PublishRequestActor.kt", i = {0, 1}, l = {56, 57, 58, 61, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14385b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241907q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f241908r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14384a.e f241909s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f241910t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC14384a.e eVar, j jVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f241909s = eVar;
        this.f241910t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f241909s, this.f241910t, continuation);
        gVar.f241908r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14385b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f241907q
            com.avito.android.publish.screen.step.request.publish.mvi.j r2 = r9.f241910t
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.C42729a0.b(r10)
            goto L91
        L26:
            java.lang.Object r1 = r9.f241908r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L5e
        L2e:
            java.lang.Object r1 = r9.f241908r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L53
        L36:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f241908r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            Le0.a$e r1 = r9.f241909s
            com.avito.android.photo_cache.q r1 = r1.f10051a
            boolean r8 = r1 instanceof com.avito.android.photo_cache.q.c
            if (r8 == 0) goto L6a
            Le0.b$b r1 = Le0.InterfaceC14385b.C0622b.f10053a
            r9.f241908r = r10
            r9.f241907q = r7
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L52
            return r0
        L52:
            r1 = r10
        L53:
            r9.f241908r = r1
            r9.f241907q = r6
            java.lang.Object r10 = com.avito.android.publish.screen.step.request.publish.mvi.j.d(r2, r9)
            if (r10 != r0) goto L5e
            return r0
        L5e:
            r10 = 0
            r9.f241908r = r10
            r9.f241907q = r5
            java.lang.Object r10 = com.avito.android.publish.screen.step.request.publish.mvi.j.c(r2, r1, r9)
            if (r10 != r0) goto L91
            return r0
        L6a:
            boolean r2 = r1 instanceof com.avito.android.photo_cache.q.a
            if (r2 == 0) goto L79
            Le0.b$c r1 = Le0.InterfaceC14385b.c.f10054a
            r9.f241907q = r4
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L91
            return r0
        L79:
            boolean r2 = r1 instanceof com.avito.android.photo_cache.q.d
            if (r2 == 0) goto L91
            Le0.b$d r2 = new Le0.b$d
            com.avito.android.photo_cache.q$d r1 = (com.avito.android.photo_cache.q.d) r1
            int r4 = r1.f216341c
            int r1 = r1.f216340b
            r2.<init>(r4, r1)
            r9.f241907q = r3
            java.lang.Object r10 = r10.emit(r2, r9)
            if (r10 != r0) goto L91
            return r0
        L91:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.publish.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

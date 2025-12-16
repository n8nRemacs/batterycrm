package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14385b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishRequestActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LLe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor$processSkipPhotoUploadClick$1", f = "PublishRequestActor.kt", i = {0, 1}, l = {78, 79, 80}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14385b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241904q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f241905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f241906s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f241906s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f241906s, continuation);
        fVar.f241905r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14385b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f241904q
            com.avito.android.publish.screen.step.request.publish.mvi.j r2 = r6.f241906s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r7)
            goto L5b
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            java.lang.Object r1 = r6.f241905r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L4f
        L27:
            java.lang.Object r1 = r6.f241905r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L44
        L2f:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f241905r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            Le0.b$b r1 = Le0.InterfaceC14385b.C0622b.f10053a
            r6.f241905r = r7
            r6.f241904q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L43
            return r0
        L43:
            r1 = r7
        L44:
            r6.f241905r = r1
            r6.f241904q = r4
            java.lang.Object r7 = com.avito.android.publish.screen.step.request.publish.mvi.j.d(r2, r6)
            if (r7 != r0) goto L4f
            return r0
        L4f:
            r7 = 0
            r6.f241905r = r7
            r6.f241904q = r3
            java.lang.Object r7 = com.avito.android.publish.screen.step.request.publish.mvi.j.c(r2, r1, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.publish.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

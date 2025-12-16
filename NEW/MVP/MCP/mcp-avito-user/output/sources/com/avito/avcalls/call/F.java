package com.avito.avcalls.call;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {127}, m = "ping", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class F extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f332568q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f332570s;

    /* renamed from: t, reason: collision with root package name */
    public int f332571t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332570s = a12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            r6.f332569r = r7
            int r7 = r6.f332571t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.f332571t = r7
            com.avito.avcalls.call.A r7 = r6.f332570s
            r0 = 0
            r7.getClass()
            boolean r1 = r6 instanceof com.avito.avcalls.call.F
            if (r1 == 0) goto L20
            int r1 = r6.f332571t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L20
            int r1 = r1 - r2
            r6.f332571t = r1
            r1 = r6
            goto L25
        L20:
            com.avito.avcalls.call.F r1 = new com.avito.avcalls.call.F
            r1.<init>(r7, r6)
        L25:
            java.lang.Object r2 = r1.f332569r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.f332571t
            r5 = 1
            if (r4 == 0) goto L40
            if (r4 != r5) goto L38
            com.avito.avcalls.call.A r7 = r1.f332568q
            kotlin.C42729a0.b(r2)
            goto L55
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L40:
            kotlin.C42729a0.b(r2)
            com.avito.avcalls.utils.coroutines.e r2 = r7.f332549d
            r2.b()
            r1.f332568q = r7
            r1.f332571t = r5
            com.avito.avcalls.signaling.p r2 = r7.f332548c
            java.lang.Object r2 = r2.h(r0, r0, r1)
            if (r2 != r3) goto L55
            goto L5b
        L55:
            r3 = r2
            com.avito.avcalls.signaling.x r3 = (com.avito.avcalls.signaling.x) r3
            r7.g()
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

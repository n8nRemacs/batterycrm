package com.avito.avcalls.android.call;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {127}, m = "ping", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class C extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331407q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331408r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331409s;

    /* renamed from: t, reason: collision with root package name */
    public int f331410t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331409s = xVar;
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
            r6.f331408r = r7
            int r7 = r6.f331410t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.f331410t = r7
            com.avito.avcalls.android.call.x r7 = r6.f331409s
            r0 = 0
            r7.getClass()
            boolean r1 = r6 instanceof com.avito.avcalls.android.call.C
            if (r1 == 0) goto L20
            int r1 = r6.f331410t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L20
            int r1 = r1 - r2
            r6.f331410t = r1
            r1 = r6
            goto L25
        L20:
            com.avito.avcalls.android.call.C r1 = new com.avito.avcalls.android.call.C
            r1.<init>(r7, r6)
        L25:
            java.lang.Object r2 = r1.f331408r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.f331410t
            r5 = 1
            if (r4 == 0) goto L40
            if (r4 != r5) goto L38
            com.avito.avcalls.android.call.x r7 = r1.f331407q
            kotlin.C42729a0.b(r2)
            goto L55
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L40:
            kotlin.C42729a0.b(r2)
            com.avito.avcalls.android.utils.coroutines.e r2 = r7.f331638d
            r2.b()
            r1.f331407q = r7
            r1.f331410t = r5
            com.avito.avcalls.android.signaling.p r2 = r7.f331637c
            java.lang.Object r2 = r2.h(r0, r0, r1)
            if (r2 != r3) goto L55
            goto L5b
        L55:
            r3 = r2
            com.avito.avcalls.android.signaling.v r3 = (com.avito.avcalls.android.signaling.v) r3
            r7.g()
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

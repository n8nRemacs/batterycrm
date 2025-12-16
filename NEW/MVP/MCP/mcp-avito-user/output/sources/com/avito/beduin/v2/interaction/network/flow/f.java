package com.avito.beduin.v2.interaction.network.flow;

import Y41.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HttpRequestInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.network.flow.HttpRequestInteractionHandler$handle$3", f = "HttpRequestInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements q<InterfaceC43172j<? super dU0.f>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f337618q;

    public f() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        f fVar = new f(3, continuation);
        fVar.f337618q = th2;
        return fVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r5)
            java.lang.Throwable r5 = r4.f337618q
            RU0.b r0 = RU0.b.f14467a
            com.avito.beduin.v2.logger.LogLevel[] r1 = com.avito.beduin.v2.logger.LogLevel.f337864b
            r0.getClass()
            int r0 = RU0.b.f14469c
            r1 = 1
            if (r1 < r0) goto L54
            RU0.c r0 = RU0.b.f14468b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = RU0.b.f14470d
            java.lang.String r3 = ":HttpRequest"
            java.lang.String r1 = AK.c.s(r1, r2, r3)
            if (r5 == 0) goto L4f
            boolean r2 = r5 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L2c
            java.lang.String r5 = "onCanceled"
            goto L4d
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onError["
            r2.<init>(r3)
            java.lang.String r3 = r5.getMessage()
            if (r3 != 0) goto L47
            java.lang.Class r5 = r5.getClass()
            kotlin.jvm.internal.n0 r3 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r5 = r3.b(r5)
            java.lang.String r3 = r5.l0()
        L47:
            r5 = 93
            java.lang.String r5 = androidx.compose.runtime.C22026a.c(r2, r3, r5)
        L4d:
            if (r5 != 0) goto L51
        L4f:
            java.lang.String r5 = "onCompleted"
        L51:
            r0.d(r1, r5)
        L54:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.network.flow.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

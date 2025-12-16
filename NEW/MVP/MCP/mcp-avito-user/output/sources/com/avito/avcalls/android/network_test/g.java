package com.avito.avcalls.android.network_test;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: NetworkTestController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.network_test.NetworkTestController$startReceiving$1", f = "NetworkTestController.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331809q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331810r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f331811s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f331811s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f331811s, continuation);
        gVar.f331810r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f331809q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r7.f331810r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r8)
            goto L38
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f331810r
            kotlinx.coroutines.T r8 = (kotlinx.coroutines.T) r8
            r1 = r8
        L23:
            boolean r8 = kotlinx.coroutines.U.e(r1)
            if (r8 == 0) goto L5d
            com.avito.avcalls.android.network_test.e r8 = r7.f331811s
            com.avito.avcalls.android.network_test.x r8 = r8.f331802f
            r7.f331810r = r1
            r7.f331809q = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L38
            return r0
        L38:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L23
            com.avito.avcalls.android.network_test.e r3 = r7.f331811s
            com.avito.avcalls.android.network_test.i r3 = r3.f331800d
            long r4 = java.lang.System.currentTimeMillis()
            monitor-enter(r3)
            java.util.ArrayList r6 = r3.f331818b     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L5a
            kotlin.Q r5 = new kotlin.Q     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r8, r4)     // Catch: java.lang.Throwable -> L5a
            r6.add(r5)     // Catch: java.lang.Throwable -> L5a
            java.util.LinkedHashSet r4 = r3.f331819c     // Catch: java.lang.Throwable -> L5a
            r4.remove(r8)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r3)
            goto L23
        L5a:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5a
            throw r8
        L5d:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.network_test.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

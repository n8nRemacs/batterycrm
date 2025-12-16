package com.avito.avcalls.android.network_test;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: NetworkTestController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.network_test.NetworkTestController$startSending$1", f = "NetworkTestController.kt", i = {0, 0, 0, 1, 1, 1}, l = {78, 82}, m = "invokeSuspend", n = {"$this$launch", "packetId", "before", "$this$launch", "packetId", "before"}, s = {"L$0", "I$0", "J$0", "L$0", "I$0", "J$0"})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331812q;

    /* renamed from: r, reason: collision with root package name */
    public long f331813r;

    /* renamed from: s, reason: collision with root package name */
    public int f331814s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f331815t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f331816u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f331816u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f331816u, continuation);
        hVar.f331815t = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0077 -> B:23:0x007a). Please report as a decompilation issue!!! */
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
            int r1 = r11.f331814s
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L22
            if (r1 != r3) goto L1a
            long r4 = r11.f331813r
            int r1 = r11.f331812q
            java.lang.Object r6 = r11.f331815t
            kotlinx.coroutines.T r6 = (kotlinx.coroutines.T) r6
            kotlin.C42729a0.b(r12)
            goto L7a
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            long r4 = r11.f331813r
            int r1 = r11.f331812q
            java.lang.Object r6 = r11.f331815t
            kotlinx.coroutines.T r6 = (kotlinx.coroutines.T) r6
            kotlin.C42729a0.b(r12)
            goto L64
        L2e:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f331815t
            kotlinx.coroutines.T r12 = (kotlinx.coroutines.T) r12
            long r4 = java.lang.System.currentTimeMillis()
            r1 = 0
            r6 = r12
        L3b:
            com.avito.avcalls.android.network_test.e r12 = r11.f331816u
            com.avito.avcalls.android.network_test.a r12 = r12.f331797a
            int r7 = r12.f331785c
            if (r1 >= r7) goto La5
            if (r1 == 0) goto L67
            int r12 = r12.f331786d
            int r12 = r12 * r1
            long r7 = (long) r12
            long r7 = r7 + r4
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L64
            r11.f331815t = r6
            r11.f331812q = r1
            r11.f331813r = r4
            r11.f331814s = r2
            java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r7, r11)
            if (r12 != r0) goto L64
            return r0
        L64:
            kotlinx.coroutines.U.d(r6)
        L67:
            com.avito.avcalls.android.network_test.e r12 = r11.f331816u
            com.avito.avcalls.android.network_test.x r12 = r12.f331802f
            r11.f331815t = r6
            r11.f331812q = r1
            r11.f331813r = r4
            r11.f331814s = r3
            java.lang.Object r12 = r12.b(r1, r11)
            if (r12 != r0) goto L7a
            return r0
        L7a:
            com.avito.avcalls.android.network_test.e r12 = r11.f331816u
            com.avito.avcalls.android.network_test.i r12 = r12.f331800d
            long r7 = java.lang.System.currentTimeMillis()
            monitor-enter(r12)
            java.util.ArrayList r9 = r12.f331817a     // Catch: java.lang.Throwable -> La2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> La2
            kotlin.Q r8 = new kotlin.Q     // Catch: java.lang.Throwable -> La2
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> La2
            r9.add(r8)     // Catch: java.lang.Throwable -> La2
            java.util.LinkedHashSet r7 = r12.f331819c     // Catch: java.lang.Throwable -> La2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            r7.add(r8)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r12)
            int r1 = r1 + 1
            goto L3b
        La2:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> La2
            throw r0
        La5:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.network_test.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

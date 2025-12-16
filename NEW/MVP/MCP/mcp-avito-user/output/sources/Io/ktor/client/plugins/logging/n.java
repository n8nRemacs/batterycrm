package io.ktor.client.plugins.logging;

import com.yandex.metrica.YandexMetricaDefaultValues;
import io.ktor.client.request.d0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.Logging$setupRequestLogging$1", f = "Logging.kt", i = {0, 1}, l = {84, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$intercept", "$this$intercept"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class n extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f399541s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Continuation<? super n> continuation) {
        super(3, continuation);
        this.f399541s = kVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        n nVar = new n(this.f399541s, continuation);
        nVar.f399540r = eVar;
        return nVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Type inference failed for: r1v10, types: [io.ktor.util.pipeline.e] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.util.pipeline.e] */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.util.pipeline.e] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f399539q
            r2 = 2
            r3 = 1
            io.ktor.client.plugins.logging.k r4 = r8.f399541s
            if (r1 == 0) goto L28
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            io.ktor.util.pipeline.e r0 = r8.f399540r
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L17
            goto L9a
        L17:
            r9 = move-exception
            goto L9d
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            io.ktor.util.pipeline.e r1 = r8.f399540r
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L84
            goto L81
        L28:
            kotlin.C42729a0.b(r9)
            io.ktor.util.pipeline.e r1 = r8.f399540r
            TContext r9 = r1.f400528b
            io.ktor.client.request.d0 r9 = (io.ktor.client.request.d0) r9
            java.util.List<? extends Y41.l<? super io.ktor.client.request.d0, java.lang.Boolean>> r5 = r4.f399527c
            boolean r6 = r5.isEmpty()
            TContext r7 = r1.f400528b
            if (r6 != 0) goto L74
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L4b
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L4b
            goto L68
        L4b:
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r5.next()
            Y41.l r6 = (Y41.l) r6
            java.lang.Object r6 = r6.invoke(r9)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            goto L74
        L68:
            io.ktor.client.request.d0 r7 = (io.ktor.client.request.d0) r7
            io.ktor.util.c r9 = r7.f399712f
            io.ktor.util.b<kotlin.G0> r0 = io.ktor.client.plugins.logging.s.f399556b
            kotlin.G0 r1 = kotlin.G0.f406611a
            r9.a(r0, r1)
            return r1
        L74:
            io.ktor.client.request.d0 r7 = (io.ktor.client.request.d0) r7     // Catch: java.lang.Throwable -> L84
            r8.f399540r = r1     // Catch: java.lang.Throwable -> L84
            r8.f399539q = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = io.ktor.client.plugins.logging.k.a(r4, r7, r8)     // Catch: java.lang.Throwable -> L84
            if (r9 != r0) goto L81
            return r0
        L81:
            io.ktor.http.content.p r9 = (io.ktor.http.content.p) r9     // Catch: java.lang.Throwable -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            if (r9 != 0) goto L8f
            java.lang.Object r9 = r1.e()     // Catch: java.lang.Throwable -> L8c
            goto L8f
        L8c:
            r9 = move-exception
            r0 = r1
            goto L9d
        L8f:
            r8.f399540r = r1     // Catch: java.lang.Throwable -> L8c
            r8.f399539q = r2     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r9 = r1.g(r9, r8)     // Catch: java.lang.Throwable -> L8c
            if (r9 != r0) goto L9a
            return r0
        L9a:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L9d:
            TContext r0 = r0.f400528b
            io.ktor.client.request.d0 r0 = (io.ktor.client.request.d0) r0
            io.ktor.client.plugins.logging.LogLevel r1 = r4.f399526b
            boolean r1 = r1.f399492b
            if (r1 == 0) goto Lc8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "REQUEST "
            r1.<init>(r2)
            io.ktor.http.I0 r0 = r0.f399707a
            io.ktor.http.T0 r0 = io.ktor.http.S0.a(r0)
            r1.append(r0)
            java.lang.String r0 = " failed with exception: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            io.ktor.client.plugins.logging.f r1 = r4.f399525a
            r1.log(r0)
        Lc8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

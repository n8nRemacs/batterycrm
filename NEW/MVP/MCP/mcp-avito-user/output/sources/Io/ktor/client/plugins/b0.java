package io.ktor.client.plugins;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/m0;", "Lio/ktor/client/request/d0;", "request", "Lio/ktor/client/call/b;", "<anonymous>", "(Lio/ktor/client/plugins/m0;Lio/ktor/client/request/d0;)Lio/ktor/client/call/b;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetry$intercept$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {298, 314}, m = "invokeSuspend", n = {"$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$intercept", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class b0 extends SuspendLambda implements Y41.q<m0, io.ktor.client.request.d0, Continuation<? super io.ktor.client.call.b>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ U f399095A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399096B;

    /* renamed from: q, reason: collision with root package name */
    public Y41.q f399097q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.q f399098r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.p f399099s;

    /* renamed from: t, reason: collision with root package name */
    public Y41.p f399100t;

    /* renamed from: u, reason: collision with root package name */
    public Object f399101u;

    /* renamed from: v, reason: collision with root package name */
    public int f399102v;

    /* renamed from: w, reason: collision with root package name */
    public int f399103w;

    /* renamed from: x, reason: collision with root package name */
    public int f399104x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ m0 f399105y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.request.d0 f399106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(U u12, io.ktor.client.a aVar, Continuation<? super b0> continuation) {
        super(3, continuation);
        this.f399095A = u12;
        this.f399096B = aVar;
    }

    @Override // Y41.q
    public final Object invoke(m0 m0Var, io.ktor.client.request.d0 d0Var, Continuation<? super io.ktor.client.call.b> continuation) {
        b0 b0Var = new b0(this.f399095A, this.f399096B, continuation);
        b0Var.f399105y = m0Var;
        b0Var.f399106z = d0Var;
        return b0Var.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:34:0x00dd, B:35:0x00e5, B:38:0x0106, B:40:0x010f, B:44:0x011a, B:48:0x0120, B:50:0x012c, B:54:0x0138, B:11:0x005f), top: B:69:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:34:0x00dd, B:35:0x00e5, B:38:0x0106, B:40:0x010f, B:44:0x011a, B:48:0x0120, B:50:0x012c, B:54:0x0138, B:11:0x005f), top: B:69:0x005f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01b4 -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

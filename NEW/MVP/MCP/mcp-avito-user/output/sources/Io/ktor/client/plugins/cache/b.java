package io.ktor.client.plugins.cache;

import io.ktor.client.request.d0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "content", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", i = {1}, l = {145, 149, 155, 165, 170}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class b extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399126q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399127r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f399129t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399130u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, io.ktor.client.a aVar, Continuation<? super b> continuation) {
        super(3, continuation);
        this.f399129t = dVar;
        this.f399130u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, d0> eVar, Object obj, Continuation<? super G0> continuation) {
        b bVar = new b(this.f399129t, this.f399130u, continuation);
        bVar.f399127r = eVar;
        bVar.f399128s = obj;
        return bVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

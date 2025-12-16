package io.ktor.client.plugins.cache;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/d;", "Lkotlin/G0;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/d;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {188, 194, 198, 206, 210}, m = "invokeSuspend", n = {"$this$intercept", "response", "$this$intercept", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class c extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0>, io.ktor.client.statement.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399131q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399132r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.d f399133s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f399134t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.a f399135u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, io.ktor.client.a aVar, Continuation<? super c> continuation) {
        super(3, continuation);
        this.f399134t = dVar;
        this.f399135u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, G0> eVar, io.ktor.client.statement.d dVar, Continuation<? super G0> continuation) {
        c cVar = new c(this.f399134t, this.f399135u, continuation);
        cVar.f399132r = eVar;
        cVar.f399133s = dVar;
        return cVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

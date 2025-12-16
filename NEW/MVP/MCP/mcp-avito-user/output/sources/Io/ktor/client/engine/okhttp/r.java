package io.ktor.client.engine.okhttp;

import io.ktor.websocket.AbstractC41723i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC43088c;
import okhttp3.Request;

/* compiled from: OkHttpWebsocketSession.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/c;", "Lio/ktor/websocket/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/c;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", i = {0, 1, 1}, l = {62, 66}, m = "invokeSuspend", n = {"$this$actor", "websocket", "closeReason"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43088c<AbstractC41723i>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f398970q;

    /* renamed from: r, reason: collision with root package name */
    public Object f398971r;

    /* renamed from: s, reason: collision with root package name */
    public int f398972s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f398973t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f398974u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Request f398975v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Request request, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f398974u = sVar;
        this.f398975v = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f398974u, this.f398975v, continuation);
        rVar.f398973t = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43088c<AbstractC41723i> interfaceC43088c, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43088c, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x007a, B:26:0x0082, B:28:0x008c, B:30:0x0098, B:31:0x0099, B:21:0x006b, B:32:0x00ae, B:34:0x00b2, B:35:0x00bf, B:37:0x00c3, B:39:0x00e0, B:43:0x00e6, B:49:0x00f5, B:50:0x00fa), top: B:72:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:24:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

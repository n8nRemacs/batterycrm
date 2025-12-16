package io.ktor.websocket;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {88, 92, 95, 99}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
/* renamed from: io.ktor.websocket.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41731q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Exception f401606q;

    /* renamed from: r, reason: collision with root package name */
    public int f401607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41730p f401608s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41731q(C41730p c41730p, Continuation<? super C41731q> continuation) {
        super(2, continuation);
        this.f401608s = c41730p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C41731q(this.f401608s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C41731q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[Catch: all -> 0x003c, CancellationException -> 0x003e, ProtocolViolationException -> 0x0040, FrameTooBigException -> 0x0042, ChannelIOException -> 0x0079, EOFException | ClosedReceiveChannelException -> 0x007c, EOFException | ClosedReceiveChannelException -> 0x007c, TryCatch #3 {FrameTooBigException -> 0x0042, blocks: (B:18:0x0038, B:30:0x004b, B:33:0x005a, B:35:0x0062, B:39:0x006a, B:38:0x0068, B:40:0x006c, B:27:0x0044), top: B:64:0x0011, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0072 -> B:30:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41731q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

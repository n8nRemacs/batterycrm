package io.ktor.websocket;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RawWebSocketJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {67, 68, 71, 74}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
/* renamed from: io.ktor.websocket.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41736w extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f401635q;

    /* renamed from: r, reason: collision with root package name */
    public int f401636r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41739z f401637s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41736w(C41739z c41739z, Continuation<? super C41736w> continuation) {
        super(2, continuation);
        this.f401637s = c41739z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C41736w(this.f401637s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C41736w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[Catch: all -> 0x0043, CancellationException -> 0x0045, ProtocolViolationException -> 0x0047, FrameTooBigException -> 0x0049, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0045, blocks: (B:19:0x003e, B:34:0x005d, B:38:0x006b, B:40:0x0073, B:30:0x0050, B:33:0x0057), top: B:61:0x0013, outer: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0081 -> B:20:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41736w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

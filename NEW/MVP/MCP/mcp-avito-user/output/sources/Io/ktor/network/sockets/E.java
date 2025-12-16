package io.ktor.network.sockets;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.M0;

/* compiled from: DatagramSocketImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lio/ktor/network/sockets/w;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {51, 51}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class E extends SuspendLambda implements Y41.p<I0<? super C41580w>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public M0 f400220q;

    /* renamed from: r, reason: collision with root package name */
    public int f400221r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400222s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f400223t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f12, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f400223t = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f400223t, continuation);
        e12.f400222s = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super C41580w> i02, Continuation<? super G0> continuation) {
        return ((E) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:15:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f400221r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r7.f400222s
            kotlinx.coroutines.channels.I0 r1 = (kotlinx.coroutines.channels.I0) r1
            kotlin.C42729a0.b(r8)     // Catch: java.nio.channels.ClosedChannelException -> L56
            r8 = r1
            goto L30
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlinx.coroutines.channels.M0 r1 = r7.f400220q
            java.lang.Object r4 = r7.f400222s
            kotlinx.coroutines.channels.I0 r4 = (kotlinx.coroutines.channels.I0) r4
            kotlin.C42729a0.b(r8)     // Catch: java.nio.channels.ClosedChannelException -> L56
            goto L46
        L29:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f400222s
            kotlinx.coroutines.channels.I0 r8 = (kotlinx.coroutines.channels.I0) r8
        L30:
            kotlinx.coroutines.channels.M0 r1 = r8.r()     // Catch: java.nio.channels.ClosedChannelException -> L56
            io.ktor.network.sockets.F r4 = r7.f400223t     // Catch: java.nio.channels.ClosedChannelException -> L56
            r7.f400222s = r8     // Catch: java.nio.channels.ClosedChannelException -> L56
            r7.f400220q = r1     // Catch: java.nio.channels.ClosedChannelException -> L56
            r7.f400221r = r3     // Catch: java.nio.channels.ClosedChannelException -> L56
            java.lang.Object r4 = io.ktor.network.sockets.F.c(r4, r7)     // Catch: java.nio.channels.ClosedChannelException -> L56
            if (r4 != r0) goto L43
            return r0
        L43:
            r6 = r4
            r4 = r8
            r8 = r6
        L46:
            r7.f400222s = r4     // Catch: java.nio.channels.ClosedChannelException -> L56
            r5 = 0
            r7.f400220q = r5     // Catch: java.nio.channels.ClosedChannelException -> L56
            r7.f400221r = r2     // Catch: java.nio.channels.ClosedChannelException -> L56
            java.lang.Object r8 = r1.send(r8, r7)     // Catch: java.nio.channels.ClosedChannelException -> L56
            if (r8 != r0) goto L54
            return r0
        L54:
            r8 = r4
            goto L30
        L56:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package io.ktor.network.sockets;

import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SocketImpl.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", i = {0, 1}, l = {47, 65}, m = "connect$ktor_network", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class X extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y f400240q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400241r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y<SocketChannel> f400242s;

    /* renamed from: t, reason: collision with root package name */
    public int f400243t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400242s = y12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        r14.O0(io.ktor.network.selector.SelectInterest.CONNECT, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        throw new java.lang.IllegalStateException("localAddress and remoteAddress should not be null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return r14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

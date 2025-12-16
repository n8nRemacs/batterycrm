package io.ktor.network.sockets;

import io.ktor.network.sockets.Z;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocketImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/Y;", "Ljava/nio/channels/SocketChannel;", "S", "Lio/ktor/network/sockets/N;", "Lio/ktor/network/sockets/T;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class Y<S extends SocketChannel> extends N<S> implements T {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final S f400244m;

    /* JADX WARN: Multi-variable type inference failed */
    public Y(SocketChannel socketChannel, io.ktor.network.selector.k kVar, Z.e eVar, int i12, C42822w c42822w) {
        super(socketChannel, kVar, null, (i12 & 4) != 0 ? null : eVar);
        this.f400244m = socketChannel;
        if (socketChannel.isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    @Override // io.ktor.network.sockets.N, io.ktor.network.selector.j, io.ktor.network.selector.i
    /* renamed from: r */
    public final SelectableChannel getF400183b() {
        return this.f400244m;
    }
}

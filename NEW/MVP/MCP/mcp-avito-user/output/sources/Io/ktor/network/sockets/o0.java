package io.ktor.network.sockets;

import io.ktor.network.sockets.Z;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UDPSocketBuilder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/o0;", "Lio/ktor/network/sockets/r;", "Lio/ktor/network/sockets/Z$f;", "a", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class o0 implements r<o0, Z.f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.ktor.network.selector.a f400268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z.f f400269b;

    /* compiled from: UDPSocketBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/o0$a;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public o0(@Y61.k io.ktor.network.selector.a aVar, @Y61.k Z.f fVar) {
        this.f400268a = aVar;
        this.f400269b = fVar;
    }

    @Y61.k
    public final F a(@Y61.k H h12, @Y61.k Y41.l lVar) throws IOException {
        Z.f fVar = this.f400269b;
        Z.f fVar2 = new Z.f(new HashMap(fVar.f400246a));
        fVar.a(fVar);
        lVar.invoke(fVar2);
        io.ktor.network.selector.a aVar = this.f400268a;
        DatagramChannel datagramChannelOpenDatagramChannel = aVar.f400139b.openDatagramChannel();
        try {
            J.a(datagramChannelOpenDatagramChannel, fVar2);
            datagramChannelOpenDatagramChannel.configureBlocking(false);
            if (J.f400228a) {
                datagramChannelOpenDatagramChannel.bind((SocketAddress) null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(null);
            }
            datagramChannelOpenDatagramChannel.connect(h12.f400227a);
            return new F(datagramChannelOpenDatagramChannel, aVar);
        } catch (Throwable th2) {
            datagramChannelOpenDatagramChannel.close();
            throw th2;
        }
    }
}

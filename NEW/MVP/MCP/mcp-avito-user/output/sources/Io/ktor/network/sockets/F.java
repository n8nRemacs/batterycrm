package io.ktor.network.sockets;

import io.ktor.network.selector.SelectInterest;
import io.ktor.utils.io.core.C41640m;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.channels.C43124x;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.K0;

/* compiled from: DatagramSocketImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/F;", "Lio/ktor/network/sockets/g;", "Lio/ktor/network/sockets/u;", "Lio/ktor/network/sockets/N;", "Ljava/nio/channels/DatagramChannel;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class F extends N<DatagramChannel> implements InterfaceC41565g, InterfaceC41578u {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final DatagramChannel f400224m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A f400225n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final K0<C41580w> f400226o;

    public F(@Y61.k DatagramChannel datagramChannel, @Y61.k io.ktor.network.selector.a aVar) {
        super(datagramChannel, aVar, io.ktor.network.util.b.f400275a, null, 8, null);
        this.f400224m = datagramChannel;
        this.f400225n = new A(datagramChannel, this);
        this.f400226o = F0.d(this, C43262l0.f411947c, 0, new E(this, null), 2);
    }

    public static final Object c(F f12, Continuation continuation) {
        f12.getClass();
        io.ktor.utils.io.pool.f fVar = io.ktor.network.util.b.f400275a;
        ByteBuffer byteBufferS2 = fVar.S2();
        try {
            SocketAddress socketAddressReceive = f12.f400224m.receive(byteBufferS2);
            if (socketAddressReceive == null) {
                return f12.f(byteBufferS2, (ContinuationImpl) continuation);
            }
            f12.O0(SelectInterest.READ, false);
            byteBufferS2.flip();
            C41640m c41640m = new C41640m(null, 1, null);
            try {
                io.ktor.utils.io.core.F.a(c41640m, byteBufferS2);
                C41580w c41580w = new C41580w(c41640m.y(), I.a(socketAddressReceive));
                fVar.G4(byteBufferS2);
                return c41580w;
            } catch (Throwable th2) {
                c41640m.close();
                throw th2;
            }
        } catch (Throwable th3) {
            io.ktor.network.util.b.f400275a.G4(byteBufferS2);
            throw th3;
        }
    }

    @Override // io.ktor.network.sockets.N, io.ktor.network.selector.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C43124x) this.f400226o).c(null);
        super.close();
        this.f400225n.h(null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:31:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.network.sockets.D
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.network.sockets.D r0 = (io.ktor.network.sockets.D) r0
            int r1 = r0.f400219u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400219u = r1
            goto L18
        L13:
            io.ktor.network.sockets.D r0 = new io.ktor.network.sockets.D
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400217s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400219u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.nio.ByteBuffer r6 = r0.f400216r
            io.ktor.network.sockets.F r2 = r0.f400215q
            kotlin.C42729a0.b(r7)
            goto L4d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            r2 = r5
        L39:
            io.ktor.network.selector.SelectInterest r7 = io.ktor.network.selector.SelectInterest.READ
            r2.O0(r7, r3)
            r0.f400215q = r2
            r0.f400216r = r6
            r0.f400219u = r3
            io.ktor.network.selector.k r4 = r2.f400230g
            java.lang.Object r7 = r4.c1(r2, r7, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.nio.channels.DatagramChannel r7 = r2.f400224m     // Catch: java.lang.Throwable -> L80
            java.net.SocketAddress r7 = r7.receive(r6)     // Catch: java.lang.Throwable -> L80
            if (r7 != 0) goto L56
            goto L39
        L56:
            io.ktor.network.selector.SelectInterest r0 = io.ktor.network.selector.SelectInterest.READ
            r1 = 0
            r2.O0(r0, r1)
            r6.flip()
            io.ktor.utils.io.core.m r0 = new io.ktor.utils.io.core.m
            r1 = 0
            r0.<init>(r1, r3, r1)
            io.ktor.utils.io.core.F.a(r0, r6)     // Catch: java.lang.Throwable -> L7b
            io.ktor.utils.io.core.n r0 = r0.y()     // Catch: java.lang.Throwable -> L7b
            io.ktor.network.sockets.U r7 = io.ktor.network.sockets.I.a(r7)
            io.ktor.network.sockets.w r1 = new io.ktor.network.sockets.w
            r1.<init>(r0, r7)
            io.ktor.utils.io.pool.f r7 = io.ktor.network.util.b.f400275a
            r7.G4(r6)
            return r1
        L7b:
            r6 = move-exception
            r0.close()
            throw r6
        L80:
            r7 = move-exception
            io.ktor.utils.io.pool.f r0 = io.ktor.network.util.b.f400275a
            r0.G4(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.F.f(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.network.sockets.N, io.ktor.network.selector.j, io.ktor.network.selector.i
    /* renamed from: r */
    public final SelectableChannel getF400183b() {
        return this.f400224m;
    }
}

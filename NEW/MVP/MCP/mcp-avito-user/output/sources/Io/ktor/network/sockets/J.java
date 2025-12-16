package io.ktor.network.sockets;

import io.ktor.network.sockets.Z;
import java.io.IOException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import kotlin.Metadata;

/* compiled from: JavaSocketOptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-network"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f400228a;

    static {
        boolean z12;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z12 = true;
        } catch (ClassNotFoundException unused) {
            z12 = false;
        }
        f400228a = z12;
    }

    public static final void a(@Y61.k AbstractSelectableChannel abstractSelectableChannel, @Y61.k Z.f fVar) throws IOException {
        boolean z12 = abstractSelectableChannel instanceof SocketChannel;
        boolean z13 = f400228a;
        if (z12) {
            n0.f400257b.getClass();
            int i12 = fVar.f400248d;
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (z13) {
                    ((SocketChannel) abstractSelectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(iIntValue));
                } else {
                    ((SocketChannel) abstractSelectableChannel).socket().setReceiveBufferSize(iIntValue);
                }
            }
            int i13 = fVar.f400247c;
            Integer numValueOf2 = Integer.valueOf(i13);
            if (i13 <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                if (z13) {
                    ((SocketChannel) abstractSelectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(iIntValue2));
                } else {
                    ((SocketChannel) abstractSelectableChannel).socket().setSendBufferSize(iIntValue2);
                }
            }
        }
        boolean z14 = abstractSelectableChannel instanceof ServerSocketChannel;
        if (abstractSelectableChannel instanceof DatagramChannel) {
            n0.f400257b.getClass();
            if (z13) {
                ((DatagramChannel) abstractSelectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_BROADCAST, (SocketOption) Boolean.FALSE);
            } else {
                ((DatagramChannel) abstractSelectableChannel).socket().setBroadcast(false);
            }
            int i14 = fVar.f400248d;
            Integer numValueOf3 = Integer.valueOf(i14);
            if (i14 <= 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 != null) {
                int iIntValue3 = numValueOf3.intValue();
                if (z13) {
                    ((DatagramChannel) abstractSelectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(iIntValue3));
                } else {
                    ((DatagramChannel) abstractSelectableChannel).socket().setReceiveBufferSize(iIntValue3);
                }
            }
            int i15 = fVar.f400247c;
            Integer numValueOf4 = i15 > 0 ? Integer.valueOf(i15) : null;
            if (numValueOf4 != null) {
                int iIntValue4 = numValueOf4.intValue();
                if (z13) {
                    ((DatagramChannel) abstractSelectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(iIntValue4));
                } else {
                    ((DatagramChannel) abstractSelectableChannel).socket().setSendBufferSize(iIntValue4);
                }
            }
        }
    }
}

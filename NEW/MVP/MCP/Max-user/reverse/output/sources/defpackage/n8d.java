package defpackage;

import java.net.DatagramPacket;
import java.nio.ByteBuffer;
import java.time.Instant;

/* loaded from: classes3.dex */
public final class n8d {
    public final Instant a;
    public final ByteBuffer b;

    public n8d(DatagramPacket datagramPacket, Instant instant) {
        this.a = instant;
        this.b = ByteBuffer.wrap(datagramPacket.getData(), 0, datagramPacket.getLength());
    }
}

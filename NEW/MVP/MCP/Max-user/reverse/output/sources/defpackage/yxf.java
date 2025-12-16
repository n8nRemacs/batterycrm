package defpackage;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;

/* loaded from: classes2.dex */
public final class yxf {
    public final SSLEngine a;
    public final ByteBuffer b;
    public final ByteBuffer c;
    public final ByteBuffer d;

    public yxf(SSLEngine sSLEngine) {
        this.a = sSLEngine;
        this.b = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.c = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.d = ByteBuffer.allocate(sSLEngine.getSession().getApplicationBufferSize());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxf) && fni.a(this.a, ((yxf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TLSSession(sslEngine=" + this.a + ")";
    }
}

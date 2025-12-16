package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h34 {
    static long a(h34 h34Var) {
        byte[] bArr = (byte[]) ((uk4) h34Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface i34 {
    static long a(i34 i34Var) {
        byte[] bArr = (byte[]) ((vk4) i34Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}

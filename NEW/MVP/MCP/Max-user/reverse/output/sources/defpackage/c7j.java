package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c7j {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static t9f b(byte[] bArr) {
        qyg qygVar = new qyg(bArr);
        if (qygVar.c >= 32) {
            qygVar.E(0);
            if (qygVar.f() == qygVar.c() + 4 && qygVar.f() == 1886614376) {
                int iV = oy.v(qygVar.f());
                if (iV > 1) {
                    az1.s("Unsupported pssh version: ", 37, iV, "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(qygVar.m(), qygVar.m());
                if (iV == 1) {
                    qygVar.F(qygVar.v() * 16);
                }
                int iV2 = qygVar.v();
                if (iV2 == qygVar.c()) {
                    byte[] bArr2 = new byte[iV2];
                    qygVar.e(0, bArr2, iV2);
                    return new t9f(uuid, iV, bArr2);
                }
            }
        }
        return null;
    }

    public static final t9f c() {
        t9f t9fVar = new t9f(12);
        t9fVar.b = new AtomicReference(null);
        return t9fVar;
    }
}

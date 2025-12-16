package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class e72 extends rn5 {
    public final ArrayList a = new ArrayList();

    public e72(ByteBuffer byteBuffer) throws DecodeErrorException {
        int iB = b(byteBuffer, kbg.certificate_authorities.a, 2);
        int i = byteBuffer.getShort();
        if (iB != i + 2) {
            throw new DecodeErrorException("inconsistent length fields");
        }
        while (i > 0) {
            if (i < 2) {
                throw new DecodeErrorException("inconsistent length fields");
            }
            int i2 = i - 2;
            int i3 = byteBuffer.getShort() & 65535;
            if (i3 > i2) {
                throw new DecodeErrorException("inconsistent length fields");
            }
            if (i3 > byteBuffer.remaining()) {
                throw new DecodeErrorException("inconsistent length fields");
            }
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            i = i2 - i3;
            try {
                this.a.add(new X500Principal(bArr));
            } catch (IllegalArgumentException unused) {
                throw new DecodeErrorException("authority not in DER format");
            }
        }
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        ArrayList arrayList = this.a;
        int size = (arrayList.size() * 2) + arrayList.stream().mapToInt(new n0(4)).sum();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(kbg.certificate_authorities.a);
        byteBufferAllocate.putShort((short) (size + 2));
        byteBufferAllocate.putShort((short) size);
        arrayList.stream().forEach(new as(1, byteBufferAllocate));
        return byteBufferAllocate.array();
    }
}

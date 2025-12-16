package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.http.protocol.HTTP;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class bs extends rn5 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public /* synthetic */ bs() {
    }

    public static void c(int i, ByteBuffer byteBuffer) throws DecodeErrorException {
        if (byteBuffer.remaining() < i) {
            throw new DecodeErrorException("extension underflow");
        }
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                int size = list.size() + 6 + list.stream().mapToInt(new n0(3)).sum();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.putShort(kbg.application_layer_protocol_negotiation.a);
                byteBufferAllocate.putShort((short) (size - 4));
                byteBufferAllocate.putShort((short) (size - 6));
                list.forEach(new as(0, byteBufferAllocate));
                return byteBufferAllocate.array();
            default:
                short length = (short) ((String) this.b).length();
                short s = (short) (length + 5);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(s + 4);
                byteBufferAllocate2.putShort(kbg.server_name.a);
                byteBufferAllocate2.putShort(s);
                byteBufferAllocate2.putShort((short) (length + 3));
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.putShort(length);
                byteBufferAllocate2.put(((String) this.b).getBytes(Charset.forName(HTTP.ASCII)));
                return byteBufferAllocate2.array();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AlpnExtension " + ((List) this.b);
            default:
                return super.toString();
        }
    }

    public bs(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("protocol cannot be empty");
        }
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        this.b = Collections.unmodifiableList(arrayList);
    }

    public bs(ByteBuffer byteBuffer) throws DecodeErrorException {
        int iB = b(byteBuffer, kbg.application_layer_protocol_negotiation.a, 3);
        int i = byteBuffer.getShort();
        if (i == iB - 2) {
            this.b = new ArrayList();
            while (i > 0) {
                int i2 = byteBuffer.get() & 255;
                if (i2 <= i - 1) {
                    byte[] bArr = new byte[i2];
                    byteBuffer.get(bArr);
                    ((List) this.b).add(new String(bArr));
                    i -= i2 + 1;
                } else {
                    throw new DecodeErrorException("incorrect length");
                }
            }
            return;
        }
        throw new DecodeErrorException("inconsistent lengths");
    }
}

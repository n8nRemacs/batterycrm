package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class owg extends OutputStream {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ owg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).close();
                break;
            case 1:
            default:
                super.close();
                break;
            case 2:
                ((ctc) this.b).f.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.a) {
            case 0:
                ((OutputStream) this.b).flush();
                break;
            case 1:
            default:
                super.flush();
                break;
            case 2:
                ((ctc) this.b).f.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                if (!xxf.a(i)) {
                    outputStream.write(37);
                    int i3 = (i >> 4) & 15;
                    outputStream.write(i3 <= 9 ? i3 + 48 : i3 + 55);
                    int i4 = i & 15;
                    outputStream.write(i4 <= 9 ? i4 + 48 : i4 + 55);
                    break;
                } else {
                    outputStream.write(i);
                    break;
                }
            case 1:
                ((MessageDigest) obj).update((byte) i);
                break;
            default:
                nlf nlfVar = ((ctc) obj).f;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[]{(byte) i});
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iB = epi.b(iLimit, byteBufferAllocate);
                int i5 = iB + 1;
                byte[] bArr = new byte[i5 + iLimit];
                bArr[0] = 0;
                byteBufferAllocate.get(bArr, 1, iB);
                byteBufferWrap.get(bArr, i5, iLimit);
                nlfVar.write(bArr);
                break;
        }
    }

    public owg(ctc ctcVar) {
        this.a = 2;
        this.b = ctcVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 2:
                nlf nlfVar = ((ctc) this.b).f;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iB = epi.b(iLimit, byteBufferAllocate);
                int i = iB + 1;
                byte[] bArr2 = new byte[i + iLimit];
                bArr2[0] = 0;
                byteBufferAllocate.get(bArr2, 1, iB);
                byteBufferWrap.get(bArr2, i, iLimit);
                nlfVar.write(bArr2);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                OutputStream outputStream = (OutputStream) this.b;
                int i3 = i2 + i;
                int i4 = i;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!xxf.a(b)) {
                        if (i > i4) {
                            outputStream.write(bArr, i4, i - i4);
                        }
                        outputStream.write(37);
                        int i5 = (b >> 4) & 15;
                        outputStream.write(i5 <= 9 ? i5 + 48 : i5 + 55);
                        int i6 = b & 15;
                        outputStream.write(i6 <= 9 ? i6 + 48 : i6 + 55);
                        i4 = i + 1;
                    }
                    i++;
                }
                if (i4 < i3) {
                    outputStream.write(bArr, i4, i3 - i4);
                    return;
                }
                return;
            case 1:
                if (bArr == null || i + i2 > bArr.length) {
                    throw new IllegalArgumentException("wrong parameters for write");
                }
                if (i >= 0 && i2 >= 0) {
                    ((MessageDigest) this.b).update(bArr, i, i2);
                    return;
                }
                throw new IndexOutOfBoundsException("wrong index for write");
            default:
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                nlf nlfVar = ((ctc) this.b).f;
                int iLimit = byteBufferWrap.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                int iB = epi.b(iLimit, byteBufferAllocate);
                int i7 = iB + 1;
                byte[] bArr2 = new byte[i7 + iLimit];
                bArr2[0] = 0;
                byteBufferAllocate.get(bArr2, 1, iB);
                byteBufferWrap.get(bArr2, i7, iLimit);
                nlfVar.write(bArr2);
                return;
        }
    }
}

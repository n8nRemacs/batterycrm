package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f409291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409292b;

    /* renamed from: c, reason: collision with root package name */
    public int f409293c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final OutputStream f409294d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f409294d = outputStream;
        this.f409291a = bArr;
        this.f409292b = bArr.length;
    }

    public static int a(int i12, int i13) {
        return c(i13) + h(i12);
    }

    public static int b(int i12, int i13) {
        return c(i13) + h(i12);
    }

    public static int c(int i12) {
        if (i12 >= 0) {
            return f(i12);
        }
        return 10;
    }

    public static int d(int i12, o oVar) {
        return e(oVar) + h(i12);
    }

    public static int e(o oVar) {
        int serializedSize = oVar.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i12) {
        if ((i12 & (-128)) == 0) {
            return 1;
        }
        if ((i12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i12) == 0) {
            return 3;
        }
        return (i12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j12) {
        if (((-128) & j12) == 0) {
            return 1;
        }
        if (((-16384) & j12) == 0) {
            return 2;
        }
        if (((-2097152) & j12) == 0) {
            return 3;
        }
        if (((-268435456) & j12) == 0) {
            return 4;
        }
        if (((-34359738368L) & j12) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j12) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j12) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j12) == 0) {
            return 8;
        }
        return (j12 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i12) {
        return f(i12 << 3);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i12) {
        return new CodedOutputStream(outputStream, new byte[i12]);
    }

    public final void i() throws IOException {
        if (this.f409294d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        OutputStream outputStream = this.f409294d;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f409291a, 0, this.f409293c);
        this.f409293c = 0;
    }

    public final void l(int i12, int i13) throws IOException {
        x(i12, 0);
        n(i13);
    }

    public final void m(int i12, int i13) throws IOException {
        x(i12, 0);
        n(i13);
    }

    public final void n(int i12) throws IOException {
        if (i12 >= 0) {
            v(i12);
        } else {
            w(i12);
        }
    }

    public final void o(int i12, o oVar) throws IOException {
        x(i12, 2);
        p(oVar);
    }

    public final void p(o oVar) throws IOException {
        v(oVar.getSerializedSize());
        oVar.a(this);
    }

    public final void q(int i12) throws IOException {
        byte b12 = (byte) i12;
        if (this.f409293c == this.f409292b) {
            k();
        }
        int i13 = this.f409293c;
        this.f409293c = i13 + 1;
        this.f409291a[i13] = b12;
    }

    public final void r(d dVar) throws IOException {
        int size = dVar.size();
        int i12 = this.f409293c;
        int i13 = this.f409292b;
        int i14 = i13 - i12;
        byte[] bArr = this.f409291a;
        if (i14 >= size) {
            dVar.e(bArr, 0, i12, size);
            this.f409293c += size;
            return;
        }
        dVar.e(bArr, 0, i12, i14);
        int i15 = size - i14;
        this.f409293c = i13;
        k();
        if (i15 <= i13) {
            dVar.e(bArr, i14, 0, i15);
            this.f409293c = i15;
            return;
        }
        if (i14 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i14);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i15 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i15);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i16 = i14 + i15;
        if (i16 <= dVar.size()) {
            if (i15 > 0) {
                dVar.C(this.f409294d, i14, i15);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i16);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i12 = this.f409293c;
        int i13 = this.f409292b;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f409291a;
        if (i14 >= length) {
            System.arraycopy(bArr, 0, bArr2, i12, length);
            this.f409293c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i12, i14);
        int i15 = length - i14;
        this.f409293c = i13;
        k();
        if (i15 > i13) {
            this.f409294d.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f409293c = i15;
        }
    }

    public final void t(int i12) throws IOException {
        q(i12 & 255);
        q((i12 >> 8) & 255);
        q((i12 >> 16) & 255);
        q((i12 >> 24) & 255);
    }

    public final void u(long j12) throws IOException {
        q(((int) j12) & 255);
        q(((int) (j12 >> 8)) & 255);
        q(((int) (j12 >> 16)) & 255);
        q(((int) (j12 >> 24)) & 255);
        q(((int) (j12 >> 32)) & 255);
        q(((int) (j12 >> 40)) & 255);
        q(((int) (j12 >> 48)) & 255);
        q(((int) (j12 >> 56)) & 255);
    }

    public final void v(int i12) throws IOException {
        while ((i12 & (-128)) != 0) {
            q((i12 & 127) | 128);
            i12 >>>= 7;
        }
        q(i12);
    }

    public final void w(long j12) throws IOException {
        while (((-128) & j12) != 0) {
            q((((int) j12) & 127) | 128);
            j12 >>>= 7;
        }
        q((int) j12);
    }

    public final void x(int i12, int i13) throws IOException {
        v((i12 << 3) | i13);
    }
}

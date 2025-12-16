package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x77 extends InputStream {
    public static final /* synthetic */ int v0 = 0;
    public final DataInputStream a;
    public boolean b;
    public int t0;
    public int c = 0;
    public int d = 4;
    public int o = 0;
    public int X = 0;
    public byte[] Y = new byte[65536];
    public int Z = 0;
    public int s0 = 0;
    public final int u0 = 2;

    public x77(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    public final void P(int i) {
        if (this.s0 + i > this.Y.length) {
            byte[] bArr = new byte[(int) (r5.length * 1.5d)];
            byte[] bArr2 = this.Y;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.Y = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x77.Q():boolean");
    }

    public final int Z(int i, byte[] bArr, int i2) {
        int iMin = Math.min(i2, this.s0 - this.Z);
        System.arraycopy(this.Y, this.Z, bArr, i, iMin);
        this.Z += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void h0() throws IOException {
        byte b;
        DataInputStream dataInputStream = this.a;
        this.b = dataInputStream.readByte() == 67;
        if (this.u0 == 2) {
            byte[] bArr = this.Y;
            int i = this.s0;
            this.s0 = i + 1;
            bArr[i] = 67;
        } else {
            byte[] bArr2 = this.Y;
            int i2 = this.s0;
            this.s0 = i2 + 1;
            bArr2[i2] = 74;
        }
        do {
            b = dataInputStream.readByte();
            byte[] bArr3 = this.Y;
            int i3 = this.s0;
            this.s0 = i3 + 1;
            bArr3[i3] = b;
        } while (b != 0);
        this.t0 = i0();
        dataInputStream.readFully(this.Y, this.s0, 8);
        int i4 = this.s0 + 8;
        this.s0 = i4;
        this.c = i4;
        this.d = i4;
    }

    public final int i0() throws IOException {
        P(4);
        this.a.readFully(this.Y, this.s0, 4);
        byte[] bArr = this.Y;
        int i = this.s0;
        int i2 = i + 1;
        this.s0 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.s0 = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.s0 = i6;
        int i7 = bArr[i4] & 255;
        this.s0 = i + 4;
        int i8 = bArr[i6] & 255;
        this.c += 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | i8;
    }

    public final void j0(int i) throws IOException {
        P(i);
        this.a.readFully(this.Y, this.s0, i);
        this.s0 += i;
        this.c += i;
        this.o -= i;
    }

    public final int l() throws IOException {
        int i = this.a.read();
        P(1);
        byte[] bArr = this.Y;
        int i2 = this.s0;
        this.s0 = i2 + 1;
        bArr[i2] = (byte) i;
        this.o--;
        this.c++;
        return i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c;
        if (i == 0) {
            h0();
            byte[] bArr = this.Y;
            int i2 = this.Z;
            this.Z = i2 + 1;
            return bArr[i2];
        }
        int i3 = this.s0;
        int i4 = this.Z;
        if (i3 > i4) {
            byte[] bArr2 = this.Y;
            this.Z = i4 + 1;
            return bArr2[i4];
        }
        int i5 = this.X;
        if (i5 > 0) {
            this.X = i5 - 1;
            return -2;
        }
        if (this.d > i) {
            int i6 = this.a.read();
            if (i6 != -1) {
                this.c++;
            }
            return i6;
        }
        if (!Q()) {
            return -1;
        }
        byte[] bArr3 = this.Y;
        int i7 = this.Z;
        this.Z = i7 + 1;
        return bArr3[i7];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.l()
            r1 = 2
            if (r0 == r1) goto L3e
            r2 = 70
            if (r0 == r2) goto L3c
            r2 = 76
            if (r0 == r2) goto L3e
            r2 = 83
            if (r0 == r2) goto L40
            r2 = 73
            if (r0 == r2) goto L3c
            r2 = 74
            if (r0 == r2) goto L39
            r2 = 90
            if (r0 == r2) goto L37
            r2 = 91
            if (r0 == r2) goto L3e
            switch(r0) {
                case 4: goto L37;
                case 5: goto L40;
                case 6: goto L3c;
                case 7: goto L39;
                case 8: goto L37;
                case 9: goto L40;
                case 10: goto L3c;
                case 11: goto L39;
                default: goto L26;
            }
        L26:
            switch(r0) {
                case 66: goto L37;
                case 67: goto L40;
                case 68: goto L39;
                default: goto L29;
            }
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Signature type "
            java.lang.String r3 = " is not supported"
            java.lang.String r0 = defpackage.wy1.e(r0, r2, r3)
            r1.<init>(r0)
            throw r1
        L37:
            r1 = 1
            goto L40
        L39:
            r1 = 8
            goto L40
        L3c:
            r1 = 4
            goto L40
        L3e:
            int r1 = r4.t0
        L40:
            r4.j0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x77.v():void");
    }

    public final int w() {
        this.o -= 4;
        return i0();
    }

    public final int y() throws IOException {
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        P(2);
        byte[] bArr = this.Y;
        int i3 = this.s0;
        int i4 = i3 + 1;
        this.s0 = i4;
        bArr[i3] = (byte) i;
        this.s0 = i3 + 2;
        bArr[i4] = (byte) i2;
        this.o -= 2;
        this.c += 2;
        return i2 | (i << 8);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        if (i3 == 0) {
            h0();
            return Z(i, bArr, i2);
        }
        if (this.s0 > this.Z) {
            return Z(i, bArr, i2);
        }
        int i4 = this.X;
        if (i4 > 0) {
            int iMin = Math.min(i2, i4);
            Arrays.fill(bArr, i, i + iMin, (byte) -2);
            this.X -= iMin;
            return iMin;
        }
        int i5 = this.d;
        if (i5 > i3) {
            int i6 = this.a.read(bArr, i, Math.min(i2, i5 - i3));
            if (i6 != -1) {
                this.c += i6;
            }
            return i6;
        }
        if (Q()) {
            return Z(i, bArr, i2);
        }
        return -1;
    }
}

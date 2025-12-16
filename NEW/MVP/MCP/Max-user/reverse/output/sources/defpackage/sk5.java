package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class sk5 extends FilterOutputStream {
    public static final byte[] Y = "Exif\u0000\u0000".getBytes(dk5.d);
    public int X;
    public final hk5 a;
    public final byte[] b;
    public final ByteBuffer c;
    public int d;
    public int o;

    public sk5(ByteArrayOutputStream byteArrayOutputStream, hk5 hk5Var) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = 0;
        this.a = hk5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0367, code lost:
    
        if (r3 <= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0369, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk5.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}

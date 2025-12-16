package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gg8 {
    public final long a;
    public final byte[] b;
    public final int c;

    public gg8(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = bArr.length + 30;
    }

    public final void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(35);
        yqi.a(outputStream, String.valueOf(i));
        outputStream.write(32);
        yqi.a(outputStream, String.valueOf(this.a));
        yqi.a(outputStream, " | ");
        outputStream.write(this.b);
        outputStream.write(10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gg8)) {
            return false;
        }
        gg8 gg8Var = (gg8) obj;
        return this.a == gg8Var.a && Arrays.equals(this.b, gg8Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.a) | Arrays.hashCode(this.b);
    }

    public final String toString() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, 0);
        return byteArrayOutputStream.toString();
    }
}

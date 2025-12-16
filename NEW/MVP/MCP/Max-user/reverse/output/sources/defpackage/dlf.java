package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class dlf extends atc implements blf {
    public boolean X;
    public int Y;
    public ylf a;
    public int b;
    public long c;
    public int d;
    public byte[] o;

    public dlf(int i, long j, byte[] bArr, int i2, int i3, boolean z, int i4) {
        this.a = (ylf) Stream.of((Object[]) ylf.values()).filter(new fb3(i, 3)).findFirst().get();
        this.b = i;
        this.c = j;
        byte[] bArr2 = new byte[i3];
        this.o = bArr2;
        ByteBuffer.wrap(bArr2).put(bArr, i2, i3);
        this.d = i3;
        this.X = z;
        this.Y = epi.a(this.d) + epi.a(this.c) + epi.a(i) + 1 + this.d;
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        try {
            yscVar.O0.i(this);
        } catch (TransportError e) {
            yscVar.f(utb.e(e.a), null, 1);
        }
    }

    @Override // defpackage.blf
    public final long b() {
        return this.c + this.d;
    }

    @Override // defpackage.atc
    public final int c() {
        return this.Y;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        blf blfVar = (blf) obj;
        return this.c != blfVar.getOffset() ? Long.compare(this.c, blfVar.getOffset()) : Long.compare(this.d, blfVar.getLength());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlf)) {
            return false;
        }
        dlf dlfVar = (dlf) obj;
        return this.b == dlfVar.b && this.c == dlfVar.c && this.d == dlfVar.d && this.X == dlfVar.X && Arrays.equals(this.o, dlfVar.o);
    }

    @Override // defpackage.blf
    public final byte[] f() {
        return this.o;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        if (this.Y > byteBuffer.remaining()) {
            throw new IllegalArgumentException();
        }
        byte b = (byte) 14;
        if (this.X) {
            b = (byte) (b | 1);
        }
        byteBuffer.put(b);
        epi.b(this.b, byteBuffer);
        epi.c(this.c, byteBuffer);
        epi.b(this.d, byteBuffer);
        byteBuffer.put(this.o);
    }

    @Override // defpackage.blf
    public final int getLength() {
        return this.d;
    }

    @Override // defpackage.blf
    public final long getOffset() {
        return this.c;
    }

    public final void h(ByteBuffer byteBuffer, bh8 bh8Var) {
        int iPosition = byteBuffer.position();
        byte b = byteBuffer.get();
        boolean z = (b & 4) == 4;
        boolean z2 = (b & 2) == 2;
        this.X = (b & 1) == 1;
        this.b = atc.e(byteBuffer);
        this.a = (ylf) Stream.of((Object[]) ylf.values()).filter(new a6(12, this)).findFirst().get();
        if (z) {
            this.c = epi.i(byteBuffer);
        }
        if (z2) {
            this.d = epi.g(byteBuffer);
        } else {
            this.d = byteBuffer.limit() - byteBuffer.position();
        }
        byte[] bArr = new byte[this.d];
        this.o = bArr;
        byteBuffer.get(bArr);
        this.Y = byteBuffer.position() - iPosition;
        bh8Var.decrypted("Stream data", this.o);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
    }

    @Override // defpackage.blf
    public final boolean isFinal() {
        return this.X;
    }

    public final String toString() {
        int i = this.b;
        String str = this.a.b;
        long j = this.c;
        int i2 = this.d;
        String str2 = this.X ? ",fin" : "";
        StringBuilder sb = new StringBuilder("StreamFrame[");
        sb.append(i);
        sb.append("(");
        sb.append(str);
        sb.append("),");
        utb.n(sb, j, ",", i2);
        return ho7.l(sb, str2, "]");
    }
}

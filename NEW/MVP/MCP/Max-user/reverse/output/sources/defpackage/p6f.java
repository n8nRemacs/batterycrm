package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class p6f implements j50 {
    public int b;
    public float c;
    public float d;
    public h50 e;
    public h50 f;
    public h50 g;
    public h50 h;
    public boolean i;
    public n6f j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.j50
    public final boolean a() {
        if (!this.p) {
            return false;
        }
        n6f n6fVar = this.j;
        return n6fVar == null || (n6fVar.m * n6fVar.b) * 2 == 0;
    }

    @Override // defpackage.j50
    public final ByteBuffer b() {
        n6f n6fVar = this.j;
        if (n6fVar != null) {
            int i = n6fVar.b;
            int i2 = n6fVar.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i, n6fVar.m);
                int i3 = iMin * i;
                shortBuffer.put(n6fVar.l, 0, i3);
                int i4 = n6fVar.m - iMin;
                n6fVar.m = i4;
                short[] sArr = n6fVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = j50.a;
        return byteBuffer;
    }

    @Override // defpackage.j50
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            n6f n6fVar = this.j;
            n6fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = n6fVar.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = n6fVar.c(n6fVar.j, n6fVar.k, i2);
            n6fVar.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, n6fVar.k * i, ((i2 * i) * 2) / 2);
            n6fVar.k += i2;
            n6fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.j50
    public final void d() {
        n6f n6fVar = this.j;
        if (n6fVar != null) {
            int i = n6fVar.k;
            float f = n6fVar.c;
            float f2 = n6fVar.d;
            int i2 = n6fVar.m + ((int) ((((i / (f / f2)) + n6fVar.o) / (n6fVar.e * f2)) + 0.5f));
            short[] sArr = n6fVar.j;
            int i3 = n6fVar.h * 2;
            n6fVar.j = n6fVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = n6fVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                n6fVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            n6fVar.k = i3 + n6fVar.k;
            n6fVar.f();
            if (n6fVar.m > i2) {
                n6fVar.m = i2;
            }
            n6fVar.k = 0;
            n6fVar.r = 0;
            n6fVar.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.j50
    public final h50 e(h50 h50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (h50Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(h50Var);
        }
        int i = this.b;
        if (i == -1) {
            i = h50Var.a;
        }
        this.e = h50Var;
        h50 h50Var2 = new h50(i, h50Var.b, 2);
        this.f = h50Var2;
        this.i = true;
        return h50Var2;
    }

    @Override // defpackage.j50
    public final void flush() {
        if (isActive()) {
            h50 h50Var = this.e;
            this.g = h50Var;
            h50 h50Var2 = this.f;
            this.h = h50Var2;
            if (this.i) {
                this.j = new n6f(h50Var.a, h50Var.b, this.c, this.d, h50Var2.a);
            } else {
                n6f n6fVar = this.j;
                if (n6fVar != null) {
                    n6fVar.k = 0;
                    n6fVar.m = 0;
                    n6fVar.o = 0;
                    n6fVar.p = 0;
                    n6fVar.q = 0;
                    n6fVar.r = 0;
                    n6fVar.s = 0;
                    n6fVar.t = 0;
                    n6fVar.u = 0;
                    n6fVar.v = 0;
                }
            }
        }
        this.m = j50.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.j50
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.j50
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        h50 h50Var = h50.e;
        this.e = h50Var;
        this.f = h50Var;
        this.g = h50Var;
        this.h = h50Var;
        ByteBuffer byteBuffer = j50.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}

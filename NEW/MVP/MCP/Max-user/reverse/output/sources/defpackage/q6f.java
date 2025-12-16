package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class q6f implements l50 {
    public final boolean b;
    public int c;
    public float d = 1.0f;
    public float e = 1.0f;
    public i50 f;
    public i50 g;
    public i50 h;
    public i50 i;
    public boolean j;
    public o6f k;
    public ByteBuffer l;
    public ShortBuffer m;
    public ByteBuffer n;
    public long o;
    public long p;
    public boolean q;

    public q6f(boolean z) {
        i50 i50Var = i50.e;
        this.f = i50Var;
        this.g = i50Var;
        this.h = i50Var;
        this.i = i50Var;
        ByteBuffer byteBuffer = l50.a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = byteBuffer;
        this.c = -1;
        this.b = z;
    }

    @Override // defpackage.l50
    public final boolean a() {
        if (this.q) {
            o6f o6fVar = this.k;
            if (o6fVar != null) {
                hsi.g(o6fVar.m >= 0);
                if (o6fVar.m * o6fVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.l50
    public final ByteBuffer b() {
        o6f o6fVar = this.k;
        if (o6fVar != null) {
            int i = o6fVar.b;
            hsi.g(o6fVar.m >= 0);
            int i2 = o6fVar.m * i * 2;
            if (i2 > 0) {
                if (this.l.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.l = byteBufferOrder;
                    this.m = byteBufferOrder.asShortBuffer();
                } else {
                    this.l.clear();
                    this.m.clear();
                }
                ShortBuffer shortBuffer = this.m;
                hsi.g(o6fVar.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, o6fVar.m);
                int i3 = iMin * i;
                shortBuffer.put(o6fVar.l, 0, i3);
                int i4 = o6fVar.m - iMin;
                o6fVar.m = i4;
                short[] sArr = o6fVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.p += i2;
                this.l.limit(i2);
                this.n = this.l;
            }
        }
        ByteBuffer byteBuffer = this.n;
        this.n = l50.a;
        return byteBuffer;
    }

    @Override // defpackage.l50
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o6f o6fVar = this.k;
            o6fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.o += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = o6fVar.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = o6fVar.c(o6fVar.j, o6fVar.k, i2);
            o6fVar.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, o6fVar.k * i, ((i2 * i) * 2) / 2);
            o6fVar.k += i2;
            o6fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.l50
    public final void d() {
        o6f o6fVar = this.k;
        if (o6fVar != null) {
            int i = o6fVar.k;
            float f = o6fVar.c;
            float f2 = o6fVar.d;
            double d = f / f2;
            int i2 = o6fVar.m + ((int) (((((((i - r6) / d) + o6fVar.r) + o6fVar.w) + o6fVar.o) / (o6fVar.e * f2)) + 0.5d));
            o6fVar.w = 0.0d;
            short[] sArr = o6fVar.j;
            int i3 = o6fVar.h * 2;
            o6fVar.j = o6fVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = o6fVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                o6fVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            o6fVar.k = i3 + o6fVar.k;
            o6fVar.f();
            if (o6fVar.m > i2) {
                o6fVar.m = Math.max(i2, 0);
            }
            o6fVar.k = 0;
            o6fVar.r = 0;
            o6fVar.o = 0;
        }
        this.q = true;
    }

    @Override // defpackage.l50
    public final i50 e(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (i50Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
        }
        int i = this.c;
        if (i == -1) {
            i = i50Var.a;
        }
        this.f = i50Var;
        i50 i50Var2 = new i50(i, i50Var.b, 2);
        this.g = i50Var2;
        this.j = true;
        return i50Var2;
    }

    @Override // defpackage.l50
    public final long f(long j) {
        if (this.p < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / this.d);
        }
        long j2 = this.o;
        this.k.getClass();
        long j3 = j2 - ((r2.k * r2.b) * 2);
        int i = this.i.a;
        int i2 = this.h.a;
        return i == i2 ? zxg.e0(j, this.p, j3, RoundingMode.DOWN) : zxg.e0(j, this.p * i2, j3 * i, RoundingMode.DOWN);
    }

    @Override // defpackage.l50
    public final void flush() {
        if (isActive()) {
            i50 i50Var = this.f;
            this.h = i50Var;
            i50 i50Var2 = this.g;
            this.i = i50Var2;
            if (this.j) {
                this.k = new o6f(i50Var.a, i50Var.b, this.d, this.e, i50Var2.a);
            } else {
                o6f o6fVar = this.k;
                if (o6fVar != null) {
                    o6fVar.k = 0;
                    o6fVar.m = 0;
                    o6fVar.o = 0;
                    o6fVar.p = 0;
                    o6fVar.q = 0;
                    o6fVar.r = 0;
                    o6fVar.s = 0;
                    o6fVar.t = 0;
                    o6fVar.u = 0;
                    o6fVar.v = 0;
                    o6fVar.w = 0.0d;
                }
            }
        }
        this.n = l50.a;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }

    @Override // defpackage.l50
    public final boolean isActive() {
        if (this.g.a != -1) {
            return this.b || Math.abs(this.d - 1.0f) >= 1.0E-4f || Math.abs(this.e - 1.0f) >= 1.0E-4f || this.g.a != this.f.a;
        }
        return false;
    }

    @Override // defpackage.l50
    public final void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        i50 i50Var = i50.e;
        this.f = i50Var;
        this.g = i50Var;
        this.h = i50Var;
        this.i = i50Var;
        ByteBuffer byteBuffer = l50.a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }
}

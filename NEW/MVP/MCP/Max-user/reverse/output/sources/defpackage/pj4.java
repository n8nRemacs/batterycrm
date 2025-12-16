package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class pj4 {
    public int b;
    public long h;
    public long j;
    public final SparseArray a = new SparseArray();
    public i50 c = i50.e;
    public int d = -1;
    public bz1[] e = new bz1[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = BuildConfig.MAX_TIME_TO_UPLOAD;

    public final int a(i50 i50Var, long j) throws AudioProcessor$UnhandledAudioFormatException {
        c();
        c();
        i50 i50Var2 = this.c;
        if (i50Var.a != i50Var2.a || !wsi.a(i50Var) || !wsi.a(i50Var2)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.c, i50Var);
        }
        long jP = zxg.p(i50Var.a, j - this.f);
        int i = this.b;
        this.b = i + 1;
        this.a.append(i, new oj4(this, i50Var, ka2.a(i50Var.b, this.c.b), jP));
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        return i;
    }

    public final bz1 b(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.d * this.c.d).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        bz1 bz1Var = new bz1();
        bz1Var.c = byteBufferOrder;
        bz1Var.a = j;
        bz1Var.b = this.d + j;
        return bz1Var;
    }

    public final void c() {
        hsi.f("Audio mixer is not configured.", !this.c.equals(i50.e));
    }

    public final void d(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        hsi.f("Audio mixer already configured.", this.c.equals(i50.e));
        if (!wsi.a(i50Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", i50Var);
        }
        this.c = i50Var;
        this.d = (500 * i50Var.a) / 1000;
        this.f = 0L;
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        this.e = new bz1[]{b(0L), b(this.d)};
        this.g = Math.min(this.i, this.h + this.d);
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        int i2;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = this.a;
            hsi.f("Source not found.", zxg.k(sparseArray, i));
            oj4 oj4Var = (oj4) sparseArray.get(i);
            if (oj4Var.a >= this.g) {
                return;
            }
            long jMin = Math.min(oj4Var.a + (byteBuffer.remaining() / oj4Var.b.d), this.g);
            if (oj4Var.c.d) {
                oj4Var.a(jMin, byteBuffer);
                return;
            }
            long j = oj4Var.a;
            long j2 = this.h;
            if (j < j2) {
                oj4Var.a(Math.min(jMin, j2), byteBuffer);
                if (oj4Var.a == jMin) {
                    return;
                }
            }
            bz1[] bz1VarArr = this.e;
            int length = bz1VarArr.length;
            int i3 = 0;
            while (i3 < length) {
                bz1 bz1Var = bz1VarArr[i3];
                long j3 = oj4Var.a;
                long j4 = bz1Var.b;
                ByteBuffer byteBuffer2 = (ByteBuffer) bz1Var.c;
                if (j3 >= j4) {
                    i2 = i3;
                } else {
                    byteBuffer2.position(byteBuffer2.position() + (((int) (j3 - bz1Var.a)) * this.c.d));
                    long jMin2 = Math.min(jMin, bz1Var.b);
                    i50 i50Var = this.c;
                    i2 = i3;
                    hsi.b(jMin2 >= oj4Var.a);
                    int i4 = (int) (jMin2 - oj4Var.a);
                    i50 i50Var2 = oj4Var.b;
                    ka2 ka2Var = oj4Var.c;
                    oj4Var.d.getClass();
                    wsi.d(byteBuffer, i50Var2, byteBuffer2, i50Var, ka2Var, i4, true);
                    oj4Var.a = jMin2;
                    byteBuffer2.reset();
                    if (oj4Var.a == jMin) {
                        return;
                    }
                }
                i3 = i2 + 1;
            }
        }
    }
}

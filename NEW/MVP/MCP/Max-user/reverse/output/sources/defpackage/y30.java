package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class y30 implements sx6 {
    public final i50 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public jkc f;
    public ph4 g;
    public g50 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public y30(i50 i50Var, g95 g95Var, hf6 hf6Var) throws AudioProcessor$UnhandledAudioFormatException {
        i50 i50Var2 = new i50(hf6Var);
        hsi.a(i50Var2, (i50Var2.c == -1 || i50Var2.a == -1 || i50Var2.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            ph4 ph4Var = new ph4(2);
            ph4Var.o = byteBufferOrder;
            this.b.add(ph4Var);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new jkc(i50Var2);
        g50 g50VarK = k(g95Var, hf6Var, i50Var2, i50Var);
        this.h = g50VarK;
        g50VarK.b();
        i50 i50Var3 = this.h.d;
        this.a = i50Var3;
        hsi.a(i50Var3, i50Var3.c == 2);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    public static g50 k(g95 g95Var, hf6 hf6Var, i50 i50Var, i50 i50Var2) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        tg7 tg7Var = new tg7(4);
        g95Var.getClass();
        tg7Var.d(g95Var.f.a);
        int i2 = i50Var2.a;
        int i3 = i50Var2.b;
        if (i2 != -1) {
            q6f q6fVar = new q6f(false);
            hsi.b(i2 == -1 || i2 > 0);
            q6fVar.c = i2;
            tg7Var.a(q6fVar);
        }
        if (i3 == 1 || i3 == 2) {
            ja2 ja2Var = new ja2();
            ka2 ka2VarA = ka2.a(1, i3);
            int i4 = ka2VarA.a;
            SparseArray sparseArray = ja2Var.i;
            sparseArray.put(i4, ka2VarA);
            ka2 ka2VarA2 = ka2.a(2, i3);
            sparseArray.put(ka2VarA2.a, ka2VarA2);
            tg7Var.a(ja2Var);
        }
        g50 g50Var = new g50(tg7Var.i());
        i50 i50VarA = g50Var.a(i50Var);
        if ((i2 == -1 || i2 == i50VarA.a) && ((i3 == -1 || i3 == i50VarA.b) && ((i = i50Var2.c) == -1 || i == i50VarA.c))) {
            return g50Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", i50Var);
    }

    @Override // defpackage.qva
    public final void a(g95 g95Var, long j, hf6 hf6Var, boolean z) {
        if (hf6Var == null) {
            hsi.f("Could not generate silent audio because duration is unknown.", j != -9223372036854775807L);
        } else {
            hsi.g(xz9.i(hf6Var.n));
            i50 i50Var = new i50(hf6Var);
            if (i50Var.c != -1 && i50Var.a != -1 && i50Var.b != -1) {
                z = true;
            }
            hsi.f(i50Var, z);
        }
        this.d.add(new x30(g95Var, j, hf6Var, z));
    }

    @Override // defpackage.zwd
    public final ph4 e() {
        if (this.d.isEmpty()) {
            return (ph4) this.b.peek();
        }
        return null;
    }

    @Override // defpackage.zwd
    public final boolean g() {
        hsi.g(this.d.isEmpty());
        ph4 ph4Var = (ph4) this.b.remove();
        this.c.add(ph4Var);
        this.e.compareAndSet(-9223372036854775807L, ph4Var.Y);
        return true;
    }

    public final void i() {
        jkc jkcVar = this.f;
        long j = this.l;
        long j2 = this.m;
        ((AtomicLong) jkcVar.c).addAndGet(r3.d * zxg.p(((i50) jkcVar.a).a, j - zxg.c0(((i50) jkcVar.a).a, j2 / r5.d)));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void j(ph4 ph4Var) {
        ph4Var.w();
        ph4Var.Y = 0L;
        this.b.add(ph4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer l() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y30.l():java.nio.ByteBuffer");
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        ph4 ph4Var = this.g;
        if ((ph4Var == null || (byteBuffer = ph4Var.o) == null || !byteBuffer.hasRemaining()) && !this.f.s() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (this.n) {
            return false;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return false;
        }
        long j2 = this.m;
        i50 i50Var = (i50) this.f.a;
        return j - zxg.c0(i50Var.a, j2 / ((long) i50Var.d)) > 2000;
    }
}

package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class fe5 extends bxd implements sx6 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final hf6 e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public ph4 n;

    public fe5(hf6 hf6Var, chg chgVar, u9a u9aVar, w86 w86Var, long j) {
        super(hf6Var, u9aVar);
        this.e = hf6Var;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        w86Var.f(chgVar);
    }

    @Override // defpackage.qva
    public final void a(g95 g95Var, long j, hf6 hf6Var, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j);
    }

    @Override // defpackage.zwd
    public final ph4 e() {
        if (this.n == null) {
            ph4 ph4Var = (ph4) this.h.poll();
            this.n = ph4Var;
            if (!this.l) {
                if (ph4Var == null) {
                    ph4 ph4Var2 = new ph4(2);
                    this.n = ph4Var2;
                    ph4Var2.o = o;
                } else {
                    long j = this.m;
                    ph4Var.o.getClass();
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.zwd
    public final boolean g() {
        ph4 ph4Var = this.n;
        ph4Var.getClass();
        this.n = null;
        if (ph4Var.j(4)) {
            this.j = true;
        } else {
            ph4Var.Y = this.k + this.f + ph4Var.Y;
            this.i.add(ph4Var);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j = this.m;
            ph4Var.o.getClass();
            long jCapacity = j + r0.capacity();
            this.m = jCapacity;
            this.l = size >= 10 && (size >= 200 || jCapacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    @Override // defpackage.bxd
    public final sx6 j(g95 g95Var, hf6 hf6Var, int i) {
        return this;
    }

    @Override // defpackage.bxd
    public final ph4 k() {
        return (ph4) this.i.peek();
    }

    @Override // defpackage.bxd
    public final hf6 l() {
        return this.e;
    }

    @Override // defpackage.bxd
    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    @Override // defpackage.bxd
    public final void o() {
    }

    @Override // defpackage.bxd
    public final void p() {
        ph4 ph4Var = (ph4) this.i.remove();
        ph4Var.w();
        ph4Var.Y = 0L;
        this.h.add(ph4Var);
    }
}

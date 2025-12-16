package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.media3.transformer.ExportException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class eee implements au, zt {
    public static final hf6 J0;
    public int A0;
    public int B0;
    public hf6 C0;
    public hf6 D0;
    public volatile boolean E0;
    public volatile long F0;
    public volatile long G0;
    public volatile boolean H0;
    public volatile boolean I0;
    public final HashMap X;
    public final HashMap Y;
    public final tg7 Z;
    public final zjd a;
    public final xpb b;
    public final ym3 c;
    public final khg d;
    public final wwf o;
    public final AtomicInteger s0;
    public final AtomicInteger t0;
    public boolean u0;
    public int v0;
    public au w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    static {
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("audio/mp4a-latm");
        ff6Var.F = 44100;
        ff6Var.E = 2;
        new hf6(ff6Var);
        ff6 ff6Var2 = new ff6();
        ff6Var2.t = 1;
        ff6Var2.u = 1;
        ff6Var2.m = xz9.n("image/raw");
        ff6Var2.C = gf3.i;
        J0 = new hf6(ff6Var2);
    }

    public eee(h95 h95Var, yt ytVar, ym3 ym3Var, khg khgVar, mwf mwfVar, Looper looper) {
        zjd zjdVar = h95Var.a;
        this.a = zjdVar;
        xpb xpbVar = new xpb(this, ytVar, false, 6);
        this.b = xpbVar;
        this.c = ym3Var;
        this.d = khgVar;
        this.o = mwfVar.a(looper, null);
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Z = new tg7(4);
        this.s0 = new AtomicInteger();
        this.t0 = new AtomicInteger();
        this.u0 = true;
        this.w0 = xpbVar.h((g95) zjdVar.get(0), looper, this, ym3Var);
    }

    @Override // defpackage.zt
    public final void a(int i) {
        this.s0.set(i);
        this.t0.set(i);
    }

    @Override // defpackage.zt
    public final void c(ExportException exportException) {
        this.d.c(exportException);
    }

    @Override // defpackage.zt
    public final void d(long j) {
        hsi.a("Could not retrieve required duration for EditedMediaItem " + this.v0, j != -9223372036854775807L || i());
        this.G0 = ((g95) this.a.get(this.v0)).b(j);
        this.F0 = j;
        int i = this.a.d;
    }

    @Override // defpackage.zt
    public final boolean e(int i, hf6 hf6Var) {
        boolean z = tfi.e(hf6Var.n) == 1;
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        if (z) {
            this.C0 = hf6Var;
        } else {
            this.D0 = hf6Var;
        }
        if (!this.u0) {
            boolean z2 = z ? this.y0 : this.z0;
            if (z2) {
                return z2;
            }
            hsi.b((i & 1) != 0);
            return z2;
        }
        this.s0.get();
        if (!this.x0) {
            this.d.a(this.s0.get());
            this.x0 = true;
        }
        boolean zE = this.d.e(i, hf6Var);
        if (z) {
            this.y0 = zE;
            return zE;
        }
        this.z0 = zE;
        return zE;
    }

    public final void f() {
        int i = this.A0;
        zjd zjdVar = this.a;
        int i2 = i * zjdVar.d;
        int i3 = this.v0;
        if (i2 + i3 >= this.B0) {
            ah7 ah7VarJ = this.w0.j();
            this.Z.a(new mn5(this.F0, this.C0, this.D0, (String) ah7VarJ.get(1), (String) ah7VarJ.get(2)));
            this.B0++;
        }
    }

    @Override // defpackage.au
    public final int g(l16 l16Var) {
        int iG = this.w0.g(l16Var);
        int i = this.a.d;
        if (i == 1 || iG == 0) {
            return iG;
        }
        int iZ = zxg.Z(this.v0, i);
        if (iG == 2) {
            iZ += l16Var.b / i;
        }
        l16Var.b = iZ;
        return 2;
    }

    public final void h(Bitmap bitmap) {
        dee deeVar = (dee) this.X.get(2);
        deeVar.getClass();
        if (deeVar.a.d(bitmap, new ct3(0, this.F0, 30.0f).a()) == 1) {
            deeVar.f();
            return;
        }
        wwf wwfVar = this.o;
        wwfVar.a.postDelayed(new aee(this, 0, bitmap), 10L);
    }

    public final boolean i() {
        return this.v0 == this.a.d - 1;
    }

    @Override // defpackage.au
    public final ah7 j() {
        return this.w0.j();
    }

    public final void k(int i, hf6 hf6Var) {
        qva qvaVar = (qva) this.Y.get(Integer.valueOf(i));
        if (qvaVar == null) {
            return;
        }
        g95 g95Var = (g95) this.a.get(this.v0);
        long j = this.F0;
        if (g95.c(g95Var.a) && i == 1) {
            hf6Var = null;
        }
        qvaVar.a(g95Var, j, hf6Var, i());
    }

    @Override // defpackage.zt
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final dee b(hf6 hf6Var) {
        dee deeVar;
        int iE = tfi.e(hf6Var.n);
        zxg.I(iE);
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        if (this.u0) {
            if (iE == 2) {
                this.I0 = true;
            } else {
                this.H0 = true;
            }
            zwd zwdVarB = this.d.b(hf6Var);
            if (zwdVarB == null) {
                return null;
            }
            deeVar = new dee(this, zwdVarB, iE);
            this.X.put(Integer.valueOf(iE), deeVar);
            this.s0.get();
        } else {
            String str = iE == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.";
            deeVar = (dee) this.X.get(Integer.valueOf(iE));
            hsi.i(deeVar, str);
        }
        k(iE, hf6Var);
        if (this.s0.get() == 1 && this.X.size() == 2) {
            if (iE == 1) {
                k(2, J0);
                this.t0.incrementAndGet();
                this.o.d(new awa(29, this));
                return deeVar;
            }
            k(1, null);
        }
        return deeVar;
    }

    @Override // defpackage.au
    public final void release() {
        this.w0.release();
        this.E0 = true;
    }

    @Override // defpackage.au
    public final void start() {
        this.w0.start();
        int i = this.a.d;
    }
}

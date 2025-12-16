package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lhg {
    public RuntimeException A;
    public int B;
    public int C;
    public boolean D;
    public final Context a;
    public final pm3 b;
    public final boolean c;
    public final jkc d;
    public final w7c e;
    public final e07 f;
    public final mwf g;
    public final long h;
    public final HandlerThread i;
    public final wwf j;
    public final ArrayList k;
    public final Object l;
    public final k5i m;
    public final ArrayList n;
    public final u9a o;
    public final yn3 p;
    public final Object q;
    public final Object r;
    public final l16 s;
    public final Object t;
    public final wg7 u;
    public final int v;
    public final boolean w;
    public boolean x;
    public long y;
    public int z;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lhg] */
    public lhg(Context context, pm3 pm3Var, chg chgVar, yt ytVar, u1j u1jVar, c4h c4hVar, cd3 cd3Var, wg7 wg7Var, int i, u9a u9aVar, w7c w7cVar, w86 w86Var, wwf wwfVar, uy0 uy0Var, mwf mwfVar, long j, LogSessionId logSessionId, boolean z) {
        pm3 pm3Var2 = pm3Var;
        ?? obj = new Object();
        obj.a = context;
        obj.b = pm3Var2;
        jkc jkcVar = new jkc();
        jkcVar.a = cd3Var;
        obj.d = jkcVar;
        obj.u = wg7Var;
        obj.v = i;
        obj.e = w7cVar;
        obj.f = wwfVar;
        obj.g = mwfVar;
        obj.h = j;
        obj.o = u9aVar;
        obj.w = z;
        StringBuilder sbN = az1.n("Init ", Integer.toHexString(System.identityHashCode(obj)), " [AndroidXMedia3/1.8.0] [");
        sbN.append(zxg.a);
        sbN.append("]");
        Log.i("TransformerInternal", sbN.toString());
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        obj.i = handlerThread;
        handlerThread.start();
        obj.k = new ArrayList();
        Looper looper = handlerThread.getLooper();
        obj.l = new Object();
        k5i k5iVar = new k5i(pm3Var2);
        wg7 wg7Var2 = pm3Var2.a;
        obj.m = k5iVar;
        int i2 = 0;
        lhg lhgVar = obj;
        while (i2 < wg7Var2.size()) {
            lhg lhgVar2 = lhgVar;
            int i3 = i2;
            pm3 pm3Var3 = pm3Var2;
            lhgVar2.k.add(new eee((h95) wg7Var2.get(i3), ytVar, new ym3(chgVar.d, pm3Var3.g), new khg(lhgVar, i2, pm3Var2, chgVar, u1jVar, c4hVar, w86Var, uy0Var, logSessionId), mwfVar, looper));
            lhgVar2.z++;
            i2 = i3 + 1;
            lhgVar = lhgVar2;
            pm3Var2 = pm3Var3;
        }
        lhg lhgVar3 = lhgVar;
        lhgVar3.c = lhgVar3.z != wg7Var2.size();
        lhgVar3.q = new Object();
        lhgVar3.p = new yn3();
        lhgVar3.r = new Object();
        lhgVar3.s = new l16(11);
        lhgVar3.t = new Object();
        lhgVar3.n = new ArrayList();
        lhgVar3.j = mwfVar.a(looper, new dn3(9, lhgVar3));
    }

    public final void a() {
        synchronized (this.t) {
            try {
                if (this.D) {
                    return;
                }
                e();
                this.j.b(null, 4, 1, 0).b();
                this.g.getClass();
                this.p.b();
                this.p.d();
                RuntimeException runtimeException = this.A;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0184 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhg.b():void");
    }

    public final void c(int i, ExportException exportException) {
        int i2;
        tg7 tg7Var = new tg7(4);
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            eee eeeVar = (eee) this.k.get(i3);
            eeeVar.f();
            tg7Var.d(eeeVar.Z.i());
        }
        boolean z = i == 1;
        boolean z2 = this.D;
        ExportException exportException2 = null;
        if (!z2) {
            synchronized (this.t) {
                this.D = true;
            }
            Log.i("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "] [" + e19.b() + "]");
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                try {
                    ((bxd) this.n.get(i4)).o();
                } catch (RuntimeException e) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.d(e);
                        this.A = e;
                    }
                }
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                try {
                    ((eee) this.k.get(i5)).release();
                } catch (RuntimeException e2) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.d(e2);
                        this.A = e2;
                    }
                }
            }
            try {
                u9a u9aVar = this.o;
                if (i == 0) {
                    i2 = 0;
                } else {
                    int i6 = 1;
                    if (i != 1) {
                        i6 = 2;
                        if (i != 2) {
                            throw new IllegalStateException(ho7.f(i, "Unexpected end reason "));
                        }
                    }
                    i2 = i6;
                }
                u9aVar.b(i2);
            } catch (MuxerException e3) {
                if (exportException2 == null) {
                    exportException2 = new ExportException("Muxer error", e3, 7001, 0);
                }
            } catch (RuntimeException e4) {
                if (exportException2 == null) {
                    ExportException exportExceptionD = ExportException.d(e4);
                    this.A = e4;
                    exportException2 = exportExceptionD;
                }
            }
            wwf wwfVar = this.j;
            HandlerThread handlerThread = this.i;
            Objects.requireNonNull(handlerThread);
            wwfVar.d(new bee(26, handlerThread));
        }
        if (z) {
            this.p.f();
            return;
        }
        if (exportException == null) {
            exportException = exportException2;
        }
        if (exportException == null) {
            if (z2) {
                return;
            }
            hsi.g(((wwf) this.f).a.post(new aee(this, 27, tg7Var)));
            return;
        }
        if (z2) {
            Log.w("TransformerInternal", "Export error after export ended", exportException);
        } else {
            hsi.g(((wwf) this.f).a.post(new zcd(this, tg7Var, exportException, 13)));
        }
    }

    public final void d(ExportException exportException) {
        synchronized (this.t) {
            try {
                if (this.D) {
                    Log.w("TransformerInternal", "Export error after export ended", exportException);
                } else {
                    e();
                    this.j.b(exportException, 4, 2, 0).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        hsi.f("Internal thread is dead.", this.i.isAlive());
    }
}

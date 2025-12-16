package defpackage;

import android.os.SystemClock;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class fyi extends j3 {
    public static final vf7 t0 = vf7.b;
    public static boolean u0 = true;
    public final fcj X;
    public final vhb Y;
    public final dp0 Z = new dp0();
    public final oi0 d;
    public final i0j o;
    public boolean s0;

    public fyi(o1a o1aVar, oi0 oi0Var, i0j i0jVar, fcj fcjVar) {
        s5j.h(o1aVar, "MlKitContext can not be null");
        this.d = oi0Var;
        this.o = i0jVar;
        this.X = fcjVar;
        this.Y = new vhb(o1aVar.b());
    }

    @Override // defpackage.j3
    public final List t(nm7 nm7Var) throws Throwable {
        fyi fyiVar;
        nm7 nm7Var2;
        synchronized (this) {
            try {
                try {
                    dp0 dp0Var = this.Z;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    dp0Var.a(nm7Var);
                    try {
                        ArrayList arrayListA = this.o.a(nm7Var);
                        fyiVar = this;
                        nm7Var2 = nm7Var;
                        try {
                            fyiVar.z(u6j.NO_ERROR, jElapsedRealtime, nm7Var2, arrayListA);
                            u0 = false;
                            return arrayListA;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            fyiVar.z(mlKitException.a == 14 ? u6j.MODEL_NOT_DOWNLOADED : u6j.UNKNOWN_ERROR, jElapsedRealtime, nm7Var2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e2) {
                        e = e2;
                        fyiVar = this;
                        nm7Var2 = nm7Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void z(u6j u6jVar, long j, nm7 nm7Var, List list) {
        c0 c0Var = new c0();
        c0 c0Var2 = new c0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mi0 mi0Var = (mi0) it.next();
                int format = mi0Var.a.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                e7j e7jVar = (e7j) zei.a.get(format);
                if (e7jVar == null) {
                    e7jVar = e7j.FORMAT_UNKNOWN;
                }
                c0Var.h(e7jVar);
                f7j f7jVar = (f7j) zei.b.get(mi0Var.a.d());
                if (f7jVar == null) {
                    f7jVar = f7j.TYPE_UNKNOWN;
                }
                c0Var2.h(f7jVar);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        wo8 wo8Var = new wo8();
        wo8Var.b = this;
        wo8Var.a = jElapsedRealtime;
        wo8Var.c = u6jVar;
        wo8Var.d = c0Var;
        wo8Var.o = c0Var2;
        wo8Var.X = nm7Var;
        this.X.b(wo8Var, v6j.ON_DEVICE_BARCODE_DETECT);
        v6d v6dVar = new v6d(4);
        v6dVar.b = u6jVar;
        v6dVar.c = Boolean.valueOf(u0);
        v6dVar.d = zei.a(this.d);
        v6dVar.o = c0Var.j();
        v6dVar.X = c0Var2.j();
        spi.a.execute(new uvf(this.X, new ani(v6dVar), jElapsedRealtime, new nud(11, this)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.s0;
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        vhb vhbVar = this.Y;
        int i = true != z ? 24301 : 24302;
        int i2 = u6jVar.a;
        synchronized (vhbVar) {
            AtomicLong atomicLong = (AtomicLong) vhbVar.c;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) vhbVar.c).get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            ((bci) vhbVar.b).d(new j3g(0, Arrays.asList(new mz9(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1)))).j(new v32(vhbVar, jElapsedRealtime2, 20));
        }
    }
}

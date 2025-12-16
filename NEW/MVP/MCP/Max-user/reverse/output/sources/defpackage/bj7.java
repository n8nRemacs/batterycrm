package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class bj7 implements de8, f84 {
    public static final String D0 = de8.class.getSimpleName();
    public final ConcurrentHashMap A0;
    public x9f B0;
    public final Object C0;
    public final tcf X;
    public final zn1 Y;
    public final tcf Z;
    public final /* synthetic */ ContextScope a;
    public final a84 b;
    public final lzf c;
    public final ContentResolver d;
    public final k18 o;
    public final tcf s0;
    public final zn1 t0;
    public final tcf u0;
    public final y83 v0;
    public final AtomicInteger w0;
    public x9f x0;
    public final AtomicInteger y0;
    public final ConcurrentHashMap z0;

    public bj7(Context context, a84 a84Var, lzf lzfVar, k18 k18Var) {
        this.a = d7j.a(zk6.a().plus(((q2b) lzfVar).b()));
        this.b = a84Var;
        this.c = lzfVar;
        this.d = context.getContentResolver();
        this.o = k18Var;
        tcf tcfVarA = ucf.a(new vo6(ro6.a, 0, false, true));
        this.X = tcfVarA;
        this.Y = new zn1(new hbd(tcfVarA), 3);
        this.Z = ucf.a(new vo6(so6.a, 0, false, false));
        tcf tcfVarA2 = ucf.a(new vo6(qo6.a, 0, false, true));
        this.s0 = tcfVarA2;
        this.t0 = new zn1(new hbd(tcfVarA2), 4);
        tcf tcfVarA3 = ucf.a(null);
        this.u0 = tcfVarA3;
        this.v0 = new y83(new d53(tcfVarA3, 12), 11, this);
        this.w0 = new AtomicInteger(0);
        this.y0 = new AtomicInteger(-1);
        this.z0 = new ConcurrentHashMap();
        this.A0 = new ConcurrentHashMap();
        ob4 ob4Var = new ob4(this);
        Iterator it = ve3.j(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI).iterator();
        while (it.hasNext()) {
            try {
                this.d.registerContentObserver((Uri) it.next(), true, ob4Var);
            } catch (Throwable th) {
                this.b.i(bd5.a, th);
            }
        }
        a3b a3bVar = new a3b(21, this);
        a84 a84Var2 = this.b;
        lzf lzfVar2 = this.c;
        e44 e44Var = new e44(29, this);
        fs4 fs4Var = new fs4();
        fs4Var.a = this;
        fs4Var.b = a84Var2;
        fs4Var.c = a3bVar;
        fs4Var.d = e44Var;
        wqi.c("fs4", "init", new Object[0]);
        svi.e(this, ((q2b) lzfVar2).c().plus(a84Var2), null, new in8(fs4Var, null), 2);
        this.C0 = new Object();
    }

    public static final Object a(bj7 bj7Var, uo6 uo6Var, dtf dtfVar) {
        return svi.i(((q2b) bj7Var.c).b(), new zi7(uo6Var, bj7Var, null), dtfVar);
    }

    public final boolean b(vo6 vo6Var) {
        List list;
        return (vo6Var.b == 0 || (list = (List) this.z0.get(vo6Var.a)) == null || list.size() >= vo6Var.b) ? false : true;
    }

    public final Object c(vo6 vo6Var, int i, dtf dtfVar) {
        return svi.i(((q2b) this.c).b(), new ri7(vo6Var, i, this, null), dtfVar);
    }

    public final void d() {
        x9f x9fVar;
        synchronized (this.C0) {
            try {
                wqi.c(D0, "onContentChanged()", new Object[0]);
                x9f x9fVar2 = this.B0;
                if (x9fVar2 != null && x9fVar2.isActive() && (x9fVar = this.B0) != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                this.B0 = svi.e(this, this.b, null, new si7(this, null), 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        x9f x9fVar = this.x0;
        AtomicInteger atomicInteger = this.w0;
        String str = D0;
        if (x9fVar != null) {
            int i = atomicInteger.get();
            x9f x9fVar2 = this.x0;
            Boolean boolValueOf = x9fVar2 != null ? Boolean.valueOf(x9fVar2.isActive()) : null;
            x9f x9fVar3 = this.x0;
            wqi.c(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + boolValueOf + ", prefetchJob.isCompleted = " + (x9fVar3 != null ? Boolean.valueOf(x9fVar3.isCompleted()) : null), new Object[0]);
            return;
        }
        if (!((qsb) this.o.getValue()).e()) {
            wqi.c(str, "permission is not granted", new Object[0]);
            return;
        }
        final int iIncrementAndGet = atomicInteger.incrementAndGet();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        wqi.c(str, "prefetch " + iIncrementAndGet + " start", new Object[0]);
        x9f x9fVarE = svi.e(this, this.b, null, new vi7(this, iIncrementAndGet, null), 2);
        x9fVarE.invokeOnCompletion(new em6() { // from class: ci7
            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                String str2 = bj7.D0;
                if (!(th instanceof CancellationException)) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    int i2 = iIncrementAndGet;
                    if (th == null) {
                        StringBuilder sbM = u45.m(i2, jElapsedRealtime2, "prefetch ", " completed, all time = ");
                        sbM.append("ms");
                        wqi.c(str2, sbM.toString(), new Object[0]);
                    } else {
                        StringBuilder sbM2 = u45.m(i2, jElapsedRealtime2, "prefetch ", " completion error, all time = ");
                        sbM2.append("ms");
                        wqi.e(str2, sbM2.toString(), th);
                    }
                }
                return qqg.a;
            }
        });
        this.x0 = x9fVarE;
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}

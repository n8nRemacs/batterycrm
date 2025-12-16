package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wq6 implements Runnable {
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;
    public static final ThreadLocal o = new ThreadLocal();
    public static final s55 X = new s55(29);

    public static mid c(RecyclerView recyclerView, int i, long j) {
        int iO = recyclerView.s0.O();
        for (int i2 = 0; i2 < iO; i2++) {
            mid midVarU = RecyclerView.U(recyclerView.s0.N(i2));
            if (midVarU.c == i && !midVarU.o()) {
                return null;
            }
        }
        did didVar = recyclerView.c;
        try {
            recyclerView.e0();
            mid midVarK = didVar.k(i, j);
            if (midVarK != null) {
                if (!midVarK.m() || midVarK.o()) {
                    didVar.a(midVarK, false);
                } else {
                    didVar.h(midVarK.a);
                }
            }
            recyclerView.f0(false);
            return midVarK;
        } catch (Throwable th) {
            recyclerView.f0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.F0) {
            if (RecyclerView.K1 && !this.a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        w93 w93Var = recyclerView.q1;
        w93Var.a = i;
        w93Var.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq6.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = beg.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = beg.a;
            Trace.endSection();
            throw th;
        }
    }
}

package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class k87 extends k2g {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k87(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.k2g
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                m87 m87Var = (m87) this.f;
                m87Var.getClass();
                try {
                    m87Var.G0.y(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    m87Var.c(2, 2, e);
                    return -1L;
                }
            case 1:
                z95 z95Var = (z95) this.f;
                long jNanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) z95Var.d).iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                qbd qbdVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    qbd qbdVar2 = (qbd) it.next();
                    synchronized (qbdVar2) {
                        if (z95Var.l(qbdVar2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - qbdVar2.p;
                            if (j2 > j) {
                                qbdVar = qbdVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = z95Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (qbdVar) {
                    if (!qbdVar.o.isEmpty()) {
                        return 0L;
                    }
                    if (qbdVar.p + j != jNanoTime) {
                        return 0L;
                    }
                    qbdVar.i = true;
                    ((ConcurrentLinkedQueue) z95Var.d).remove(qbdVar);
                    yxg.d(qbdVar.c);
                    if (!((ConcurrentLinkedQueue) z95Var.d).isEmpty()) {
                        return 0L;
                    }
                    ((y2g) z95Var.b).a();
                    return 0L;
                }
            default:
                ((cm6) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k87(String str, m87 m87Var) {
        super(str, true);
        this.e = 0;
        this.f = m87Var;
    }
}

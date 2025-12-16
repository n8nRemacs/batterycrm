package defpackage;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final class b36 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public long e;
    public final bh8 i;
    public int k;
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public long f = 0;
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();

    public b36(long j, long j2, long j3, long j4, bh8 bh8Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.i = bh8Var;
        this.e = j;
    }

    public final long a(ctc ctcVar) {
        int i = ctcVar.a;
        long jLongValue = ((Long) this.g.get(Integer.valueOf(i))).longValue() - ((Long) this.h.get(Integer.valueOf(i))).longValue();
        long j = this.e - this.f;
        return jLongValue > j ? j : jLongValue;
    }

    public final void b(mr8 mr8Var) {
        synchronized (this) {
            try {
                int i = mr8Var.b;
                long j = mr8Var.c;
                if (this.g.containsKey(Integer.valueOf(i))) {
                    if (j > ((Long) this.g.get(Integer.valueOf(i))).longValue()) {
                        boolean z = ((Long) this.h.get(Integer.valueOf(i))).longValue() == ((Long) this.g.get(Integer.valueOf(i))).longValue() && this.f != this.e;
                        this.g.put(Integer.valueOf(i), Long.valueOf(j));
                        if (z) {
                            ((qlf) ((c36) this.j.get(Integer.valueOf(i)))).i0();
                        }
                    }
                } else if (i % 2 == 0 && i > this.k) {
                    throw new TransportError(6);
                }
            } finally {
            }
        }
    }
}

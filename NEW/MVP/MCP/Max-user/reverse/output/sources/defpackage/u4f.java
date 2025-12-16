package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class u4f implements eh0 {
    public final int a;
    public final double b;
    public final ArrayDeque c;
    public final TreeSet d;
    public double e;
    public long f;

    public u4f(double d) {
        hsi.b(d >= 0.0d && d <= 1.0d);
        this.a = 10;
        this.b = d;
        this.c = new ArrayDeque();
        this.d = new TreeSet();
        this.f = Long.MIN_VALUE;
    }

    @Override // defpackage.eh0
    public final void a(long j, long j2) {
        ArrayDeque arrayDeque;
        TreeSet treeSet;
        long j3;
        while (true) {
            arrayDeque = this.c;
            int size = arrayDeque.size();
            int i = this.a;
            treeSet = this.d;
            if (size < i) {
                break;
            }
            t4f t4fVar = (t4f) arrayDeque.remove();
            treeSet.remove(t4fVar);
            this.e -= t4fVar.b;
        }
        double dSqrt = Math.sqrt(j);
        t4f t4fVar2 = new t4f((j * 8000000) / j2, dSqrt);
        arrayDeque.add(t4fVar2);
        treeSet.add(t4fVar2);
        this.e += dSqrt;
        if (!arrayDeque.isEmpty()) {
            double d = this.e * this.b;
            Iterator it = treeSet.iterator();
            double d2 = 0.0d;
            double d3 = 0.0d;
            long j4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    j3 = j4;
                    break;
                }
                t4f t4fVar3 = (t4f) it.next();
                double d4 = t4fVar3.b;
                long j5 = t4fVar3.a;
                double d5 = d4 / 2.0d;
                double d6 = d2 + d5;
                if (d6 < d) {
                    d3 = d6;
                    d2 = d5 + d6;
                    j4 = j5;
                } else if (j4 == 0) {
                    j3 = j5;
                } else {
                    j3 = ((long) (((d - d3) * (j5 - j4)) / (d6 - d3))) + j4;
                }
            }
        } else {
            j3 = Long.MIN_VALUE;
        }
        this.f = j3;
    }

    @Override // defpackage.eh0
    public final long b() {
        return this.f;
    }

    @Override // defpackage.eh0
    public final void reset() {
        this.c.clear();
        this.d.clear();
        this.e = 0.0d;
        this.f = Long.MIN_VALUE;
    }
}

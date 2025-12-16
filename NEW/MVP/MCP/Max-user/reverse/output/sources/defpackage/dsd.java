package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class dsd implements rrf, qrf {
    public static final TreeMap s0 = new TreeMap();
    public final byte[][] X;
    public final int[] Y;
    public int Z;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] o;

    public dsd(int i) {
        this.a = i;
        int i2 = i + 1;
        this.Y = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.o = new String[i2];
        this.X = new byte[i2][];
    }

    public static final dsd c(int i, String str) {
        TreeMap treeMap = s0;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                dsd dsdVar = new dsd(i);
                dsdVar.b = str;
                dsdVar.Z = i;
                return dsdVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            dsd dsdVar2 = (dsd) entryCeilingEntry.getValue();
            dsdVar2.b = str;
            dsdVar2.Z = i;
            return dsdVar2;
        }
    }

    @Override // defpackage.qrf
    public final void D(int i, byte[] bArr) {
        this.Y[i] = 5;
        this.X[i] = bArr;
    }

    @Override // defpackage.qrf
    public final void S(int i) {
        this.Y[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.qrf
    public final void f(int i, String str) {
        this.Y[i] = 4;
        this.o[i] = str;
    }

    @Override // defpackage.qrf
    public final void g(int i, double d) {
        this.Y[i] = 3;
        this.d[i] = d;
    }

    @Override // defpackage.qrf
    public final void k(int i, long j) {
        this.Y[i] = 2;
        this.c[i] = j;
    }

    @Override // defpackage.rrf
    public final String l() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.rrf
    public final void w(qrf qrfVar) {
        int i = this.Z;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.Y[i2];
            if (i3 == 1) {
                qrfVar.S(i2);
            } else if (i3 == 2) {
                qrfVar.k(i2, this.c[i2]);
            } else if (i3 == 3) {
                qrfVar.g(i2, this.d[i2]);
            } else if (i3 == 4) {
                String str = this.o[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                qrfVar.f(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.X[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                qrfVar.D(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void y() {
        TreeMap treeMap = s0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}

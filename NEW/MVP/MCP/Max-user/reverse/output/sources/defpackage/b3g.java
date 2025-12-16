package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class b3g {
    public static final b3g h = new b3g(new vgd(new no3(ho7.l(new StringBuilder(), yxg.g, " TaskRunner"), true)));
    public static final Logger i = Logger.getLogger(b3g.class.getName());
    public boolean b;
    public long c;
    public final vgd g;
    public int a = 10000;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final r98 f = new r98(26, this);

    public b3g(vgd vgdVar) {
        this.g = vgdVar;
    }

    public static final void a(b3g b3gVar, k2g k2gVar) {
        byte[] bArr = yxg.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(k2gVar.c);
        try {
            long jA = k2gVar.a();
            synchronized (b3gVar) {
                b3gVar.b(k2gVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (b3gVar) {
                b3gVar.b(k2gVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(k2g k2gVar, long j) {
        byte[] bArr = yxg.a;
        y2g y2gVar = k2gVar.a;
        if (y2gVar.b != k2gVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = y2gVar.d;
        y2gVar.d = false;
        y2gVar.b = null;
        this.d.remove(y2gVar);
        if (j != -1 && !z && !y2gVar.a) {
            y2gVar.d(k2gVar, j, true);
        }
        if (y2gVar.c.isEmpty()) {
            return;
        }
        this.e.add(y2gVar);
    }

    public final k2g c() {
        boolean z;
        byte[] bArr = yxg.a;
        while (true) {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
            k2g k2gVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                k2g k2gVar2 = (k2g) ((y2g) it.next()).c.get(0);
                long jMax = Math.max(0L, k2gVar2.b - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (k2gVar != null) {
                        z = true;
                        break;
                    }
                    k2gVar = k2gVar2;
                }
            }
            ArrayList arrayList2 = this.d;
            if (k2gVar != null) {
                byte[] bArr2 = yxg.a;
                k2gVar.b = -1L;
                y2g y2gVar = k2gVar.a;
                y2gVar.c.remove(k2gVar);
                arrayList.remove(y2gVar);
                y2gVar.b = k2gVar;
                arrayList2.add(y2gVar);
                if (z || (!this.b && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.g.b).execute(this.f);
                }
                return k2gVar;
            }
            if (!this.b) {
                this.b = true;
                this.c = jNanoTime + jMin;
                try {
                    try {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ((y2g) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            y2g y2gVar2 = (y2g) arrayList.get(size2);
                            y2gVar2.b();
                            if (y2gVar2.c.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.b = false;
                }
            } else if (jMin < this.c - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void d(y2g y2gVar) {
        byte[] bArr = yxg.a;
        if (y2gVar.b == null) {
            boolean zIsEmpty = y2gVar.c.isEmpty();
            ArrayList arrayList = this.e;
            if (zIsEmpty) {
                arrayList.remove(y2gVar);
            } else if (!arrayList.contains(y2gVar)) {
                arrayList.add(y2gVar);
            }
        }
        if (this.b) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.g.b).execute(this.f);
        }
    }

    public final y2g e() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        return new y2g(this, ho7.f(i2, "Q"));
    }
}

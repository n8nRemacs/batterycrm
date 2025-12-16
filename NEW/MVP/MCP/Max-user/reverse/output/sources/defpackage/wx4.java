package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class wx4 implements nv5 {
    public static final long m = TimeUnit.HOURS.toMillis(2);
    public static final long n = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final HashSet d;
    public long e;
    public final gcf f;
    public final s75 g;
    public final q85 h;
    public final qha i;
    public final by0 j;
    public final r8j k;
    public final Object l = new Object();

    public wx4(s75 s75Var, q85 q85Var, dq0 dq0Var, rha rhaVar, qha qhaVar, ExecutorService executorService) {
        gcf gcfVar;
        this.a = dq0Var.b;
        long j = dq0Var.c;
        this.b = j;
        this.c = j;
        gcf gcfVar2 = gcf.h;
        synchronized (gcf.class) {
            try {
                if (gcf.h == null) {
                    gcf.h = new gcf();
                }
                gcfVar = gcf.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = gcfVar;
        this.g = s75Var;
        this.h = q85Var;
        this.e = -1L;
        this.i = qhaVar;
        by0 by0Var = new by0();
        by0Var.a = false;
        by0Var.b = -1L;
        by0Var.c = -1L;
        this.j = by0Var;
        this.k = r8j.A0;
        this.d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a(long j) throws IOException {
        s75 s75Var = this.g;
        try {
            ArrayList arrayListC = c(s75Var.d());
            by0 by0Var = this.j;
            long jA = by0Var.a() - j;
            Iterator it = arrayListC.iterator();
            int i = 0;
            long j2 = 0;
            while (it.hasNext()) {
                gl4 gl4Var = (gl4) it.next();
                if (j2 > jA) {
                    break;
                }
                long jC = s75Var.c(gl4Var);
                this.d.remove(gl4Var.a);
                if (jC > 0) {
                    i++;
                    j2 += jC;
                    ukd.K().L();
                }
            }
            by0Var.b(-j2, -i);
            s75Var.b();
        } catch (IOException e) {
            e.getMessage();
            this.i.getClass();
            throw e;
        }
    }

    public final mv5 b(ty0 ty0Var) {
        mv5 mv5VarA;
        ukd ukdVarK = ukd.K();
        try {
            synchronized (this.l) {
                try {
                    ArrayList arrayListC = ywi.c(ty0Var);
                    String str = null;
                    mv5VarA = null;
                    for (int i = 0; i < arrayListC.size() && (mv5VarA = this.g.a(ty0Var, (str = (String) arrayListC.get(i)))) == null; i++) {
                    }
                    if (mv5VarA == null) {
                        this.d.remove(str);
                    } else {
                        str.getClass();
                        this.d.add(str);
                    }
                } finally {
                }
            }
            return mv5VarA;
        } catch (IOException unused) {
            this.i.getClass();
            return null;
        } finally {
            ukdVarK.L();
        }
    }

    public final ArrayList c(Collection collection) {
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + m;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gl4 gl4Var = (gl4) it.next();
            if (gl4Var.a() > jCurrentTimeMillis) {
                arrayList.add(gl4Var);
            } else {
                arrayList2.add(gl4Var);
            }
        }
        this.h.getClass();
        Collections.sort(arrayList2, new s55(25));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mv5 d(defpackage.c1f r11, defpackage.i00 r12) {
        /*
            r10 = this;
            ukd r0 = defpackage.ukd.K()
            java.lang.Object r1 = r10.l
            monitor-enter(r1)
            java.lang.String r2 = r11.a     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
            java.lang.String r3 = "SHA-1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> Lb3 java.security.NoSuchAlgorithmException -> Lb5 java.io.UnsupportedEncodingException -> Lbc
            int r4 = r2.length     // Catch: java.lang.Throwable -> Lb3 java.security.NoSuchAlgorithmException -> Lb5 java.io.UnsupportedEncodingException -> Lbc
            r5 = 0
            r3.update(r2, r5, r4)     // Catch: java.lang.Throwable -> Lb3 java.security.NoSuchAlgorithmException -> Lb5 java.io.UnsupportedEncodingException -> Lbc
            byte[] r2 = r3.digest()     // Catch: java.lang.Throwable -> Lb3 java.security.NoSuchAlgorithmException -> Lb5 java.io.UnsupportedEncodingException -> Lbc
            r3 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Throwable -> Lb3 java.security.NoSuchAlgorithmException -> Lb5 java.io.UnsupportedEncodingException -> Lbc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            hc8 r11 = r10.f(r2, r11)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            r1 = 1
            r11.P(r12)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r12 = r10.l     // Catch: java.lang.Throwable -> L78
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L78
            mv5 r3 = r11.z()     // Catch: java.lang.Throwable -> L7a
            java.util.HashSet r4 = r10.d     // Catch: java.lang.Throwable -> L7a
            r4.add(r2)     // Catch: java.lang.Throwable -> L7a
            by0 r2 = r10.j     // Catch: java.lang.Throwable -> L7a
            java.io.File r4 = r3.a     // Catch: java.lang.Throwable -> L7a
            long r6 = r4.length()     // Catch: java.lang.Throwable -> L7a
            r8 = 1
            r2.b(r6, r8)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7a
            java.io.File r12 = r3.a     // Catch: java.lang.Throwable -> L78
            r12.length()     // Catch: java.lang.Throwable -> L78
            by0 r12 = r10.j     // Catch: java.lang.Throwable -> L78
            r12.a()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r11 = r11.c     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            boolean r12 = r11.exists()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r12 == 0) goto L65
            boolean r11 = r11.delete()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r11 == 0) goto L66
        L65:
            r5 = r1
        L66:
            if (r5 != 0) goto L74
            java.lang.Class<wx4> r11 = defpackage.wx4.class
            java.lang.String r12 = "Failed to delete temp file"
            defpackage.op5.a(r11, r12)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            goto L74
        L70:
            r11 = move-exception
            goto Laf
        L72:
            r11 = move-exception
            goto L98
        L74:
            r0.L()
            return r3
        L78:
            r12 = move-exception
            goto L7d
        L7a:
            r2 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L78
        L7d:
            java.lang.Object r11 = r11.c     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            boolean r2 = r11.exists()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r2 == 0) goto L8d
            boolean r11 = r11.delete()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            if (r11 == 0) goto L8e
        L8d:
            r5 = r1
        L8e:
            if (r5 != 0) goto L97
            java.lang.Class<wx4> r11 = defpackage.wx4.class
            java.lang.String r1 = "Failed to delete temp file"
            defpackage.op5.a(r11, r1)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L97:
            throw r12     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L98:
            java.lang.Class<wx4> r12 = defpackage.wx4.class
            java.lang.String r1 = "Failed inserting a file into the cache"
            ch8 r2 = defpackage.op5.a     // Catch: java.lang.Throwable -> L70
            r3 = 6
            boolean r2 = r2.h(r3)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto Lae
            ch8 r2 = defpackage.op5.a     // Catch: java.lang.Throwable -> L70
            java.lang.String r12 = r12.getSimpleName()     // Catch: java.lang.Throwable -> L70
            r2.e(r12, r1, r11)     // Catch: java.lang.Throwable -> L70
        Lae:
            throw r11     // Catch: java.lang.Throwable -> L70
        Laf:
            r0.L()
            throw r11
        Lb3:
            r11 = move-exception
            goto Lc3
        Lb5:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
            throw r12     // Catch: java.lang.Throwable -> Lb3 java.io.UnsupportedEncodingException -> Lbc
        Lbc:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb3
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lb3
            throw r12     // Catch: java.lang.Throwable -> Lb3
        Lc3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb3
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx4.d(c1f, i00):mv5");
    }

    public final boolean e() {
        boolean z;
        boolean z2;
        Iterator it;
        boolean z3;
        int i;
        long j;
        long j2;
        this.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        by0 by0Var = this.j;
        synchronized (by0Var) {
            z = by0Var.a;
        }
        boolean z4 = false;
        long jMax = -1;
        if (z) {
            long j3 = this.e;
            if (j3 != -1 && jCurrentTimeMillis - j3 <= n) {
                return false;
            }
        }
        this.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j4 = m + jCurrentTimeMillis2;
        try {
            it = this.g.d().iterator();
            z3 = false;
            i = 0;
            j = 0;
        } catch (IOException e) {
            e = e;
            z2 = z4;
        }
        while (true) {
            z2 = z4;
            if (!it.hasNext()) {
                break;
            }
            try {
                gl4 gl4Var = (gl4) it.next();
                i++;
                if (gl4Var.c < 0) {
                    gl4Var.c = gl4Var.b.a.length();
                }
                j += gl4Var.c;
                if (gl4Var.a() > j4) {
                    if (gl4Var.c < 0) {
                        gl4Var.c = gl4Var.b.a.length();
                    }
                    jMax = Math.max(gl4Var.a() - jCurrentTimeMillis2, jMax);
                    z3 = true;
                }
                z4 = z2;
            } catch (IOException e2) {
                e = e2;
            }
            e = e2;
            qha qhaVar = this.i;
            e.getMessage();
            qhaVar.getClass();
            return z2;
        }
        if (z3) {
            this.i.getClass();
        }
        by0 by0Var2 = this.j;
        synchronized (by0Var2) {
            j2 = by0Var2.c;
        }
        long j5 = i;
        if (j2 != j5 || this.j.a() != j) {
            by0 by0Var3 = this.j;
            synchronized (by0Var3) {
                by0Var3.c = j5;
                by0Var3.b = j;
                by0Var3.a = true;
            }
        }
        this.e = jCurrentTimeMillis2;
        return true;
    }

    public final hc8 f(String str, c1f c1fVar) {
        synchronized (this.l) {
            boolean zE = e();
            g();
            long jA = this.j.a();
            if (jA > this.c && !zE) {
                by0 by0Var = this.j;
                synchronized (by0Var) {
                    by0Var.a = false;
                    by0Var.c = -1L;
                    by0Var.b = -1L;
                }
                e();
            }
            long j = this.c;
            if (jA > j) {
                a((j * 9) / 10);
            }
        }
        return this.g.e(str, c1fVar);
    }

    public final void g() {
        char c = this.g.isExternal() ? (char) 2 : (char) 1;
        gcf gcfVar = this.f;
        long jA = this.b - this.j.a();
        gcfVar.a();
        gcfVar.a();
        ReentrantLock reentrantLock = gcfVar.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - gcfVar.e > gcf.i) {
                    gcfVar.a = gcf.b(gcfVar.a, gcfVar.b);
                    gcfVar.c = gcf.b(gcfVar.c, gcfVar.d);
                    gcfVar.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c == 1 ? gcfVar.a : gcfVar.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}

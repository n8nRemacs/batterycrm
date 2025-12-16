package defpackage;

import java.io.Serializable;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/* loaded from: classes.dex */
public class b6 {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;

    public b6(m5c m5cVar, rde rdeVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.f = new ArrayList();
        this.h = new HashMap();
        this.a = 0;
        this.c = clockSystemUTC;
        this.d = m5cVar;
        this.e = rdeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r4 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r8 > r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r6 < r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r13.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r0.b(r1) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r0.equals(r1) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r0.b(r1) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r1.b(r0) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        r2 = r0.a;
        r6 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r2 > r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r4 >= r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        if (r2 >= r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r4 != r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        r1 = new defpackage.n7d(r2, r8 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r2 <= r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r4 <= r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r1 = new defpackage.n7d(r6 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r2 != r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        if (r4 <= r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r1 = new defpackage.n7d(r6 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r2 >= r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        if (r4 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        r1 = new defpackage.n7d(r2, r8 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b0, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
    
        r13.set(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bb, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.util.ArrayList r13, defpackage.z5 r14) {
        /*
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L8
            goto Lc8
        L8:
            java.util.ListIterator r13 = r13.listIterator()
            java.util.List r14 = r14.d
            java.util.ListIterator r14 = r14.listIterator()
            java.lang.Object r0 = r13.next()
            n7d r0 = (defpackage.n7d) r0
        L18:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto Lc8
            java.lang.Object r1 = r14.next()
            n7d r1 = (defpackage.n7d) r1
        L24:
            long r2 = r0.a
            long r4 = r0.b
            long r6 = r1.b
            long r8 = r1.a
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 <= 0) goto L3d
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r0 = r13.next()
            n7d r0 = (defpackage.n7d) r0
            goto L24
        L3d:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L42
            goto L18
        L42:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L4e
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L4e
            r13.remove()
            goto L18
        L4e:
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L55
            goto L18
        L55:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto Lc2
            boolean r2 = r0.b(r1)
            if (r2 != 0) goto Lbc
            boolean r2 = r1.b(r0)
            if (r2 != 0) goto Lb6
            long r2 = r0.a
            long r6 = r1.b
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 > 0) goto Lb0
            if (r10 >= 0) goto L72
            goto Lb0
        L72:
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r10 = 1
            if (r1 >= 0) goto L83
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L83
            n7d r1 = new n7d
            long r8 = r8 - r10
            r1.<init>(r2, r8)
            goto Lb1
        L83:
            if (r1 <= 0) goto L90
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L90
            n7d r1 = new n7d
            long r6 = r6 + r10
            r1.<init>(r6, r4)
            goto Lb1
        L90:
            if (r1 != 0) goto L9d
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L9d
            n7d r1 = new n7d
            long r6 = r6 + r10
            r1.<init>(r6, r4)
            goto Lb1
        L9d:
            if (r1 >= 0) goto Laa
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Laa
            n7d r1 = new n7d
            long r8 = r8 - r10
            r1.<init>(r2, r8)
            goto Lb1
        Laa:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
        Lb0:
            r1 = r0
        Lb1:
            r13.set(r1)
            goto L18
        Lb6:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        Lbc:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        Lc2:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6.h(java.util.ArrayList, z5):void");
    }

    public synchronized Optional a() {
        int millis;
        try {
            Instant instant = (Instant) this.g;
            int i = 0;
            if (instant != null && ((m5c) this.d) == m5c.c && (millis = (int) Duration.between(instant, ((Clock) this.c).instant()).toMillis()) >= 0) {
                i = millis;
            }
            return !((ArrayList) this.f).isEmpty() ? Optional.of(new z5((ArrayList) this.f, i)) : Optional.empty();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean b() {
        return !((ArrayList) this.f).isEmpty();
    }

    public synchronized boolean c() {
        return this.b;
    }

    public synchronized void d(btc btcVar) {
        try {
            if (btcVar.c()) {
                n7d.a(btcVar.m().longValue(), (ArrayList) this.f);
                if (btcVar.p()) {
                    this.b = true;
                    if (((Instant) this.g) == null) {
                        this.g = ((Clock) this.c).instant();
                    }
                    m5c m5cVar = (m5c) this.d;
                    if (m5cVar != m5c.c) {
                        ((rde) this.e).h(m5cVar, 0);
                    } else {
                        int i = this.a + 1;
                        this.a = i;
                        if (i >= 2) {
                            ((rde) this.e).h(m5cVar, 0);
                            this.a = 0;
                        } else {
                            ((rde) this.e).h(m5cVar, 20);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(z5 z5Var) {
        Optional optionalFindFirst = z5Var.d.stream().flatMap(new m0(5)).filter(new a6(0, this)).findFirst();
        if (optionalFindFirst.isPresent()) {
            h((ArrayList) this.f, (z5) ((HashMap) this.h).get(optionalFindFirst.get()));
            ((HashMap) this.h).keySet().removeIf(new a6(1, optionalFindFirst));
        }
    }

    public synchronized void f(z5 z5Var, long j) {
        ((HashMap) this.h).put(Long.valueOf(j), z5Var);
        this.b = false;
        this.g = null;
        this.a = 0;
    }

    public void g(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = (byte[]) this.e;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.e = null;
            ((ev0) this.d).a.set(0, bArr);
        }
    }

    public void i() {
        this.b = false;
        this.a = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.c)[i] = -1;
        }
    }

    public void j() {
        xr4 xr4Var;
        if (this.b) {
            this.b = false;
            aqc aqcVar = (aqc) this.h;
            if (aqcVar == null || (xr4Var = (xr4) aqcVar.c) == null || xr4Var.d) {
                return;
            }
            xr4Var.j.set(xr4Var.k);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [float[], java.io.Serializable] */
    public b6() {
        this.c = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        i();
    }

    public b6(ev0 ev0Var, Object obj, boolean z) {
        this.d = ev0Var;
        this.c = obj;
        this.b = z;
    }
}

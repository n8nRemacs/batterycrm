package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.k9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes8.dex */
public final class fp {

    /* renamed from: h, reason: collision with root package name */
    public static final z71<String> f385444h = new D0(0);

    /* renamed from: i, reason: collision with root package name */
    private static final Random f385445i = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final i91.d f385446a;

    /* renamed from: b, reason: collision with root package name */
    private final i91.b f385447b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f385448c;

    /* renamed from: d, reason: collision with root package name */
    private final z71<String> f385449d;

    /* renamed from: e, reason: collision with root package name */
    private et0 f385450e;

    /* renamed from: f, reason: collision with root package name */
    private i91 f385451f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private String f385452g;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f385453a;

        /* renamed from: b, reason: collision with root package name */
        private int f385454b;

        /* renamed from: c, reason: collision with root package name */
        private long f385455c;

        /* renamed from: d, reason: collision with root package name */
        private jd0.b f385456d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f385457e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f385458f;

        public a(String str, int i12, jd0.b bVar) {
            this.f385453a = str;
            this.f385454b = i12;
            this.f385455c = bVar == null ? -1L : bVar.f385283d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f385456d = bVar;
        }

        public final boolean a(i91 i91Var, i91 i91Var2) {
            int i12 = this.f385454b;
            if (i12 < i91Var.b()) {
                i91Var.a(i12, fp.this.f385446a, 0L);
                for (int i13 = fp.this.f385446a.f386418o; i13 <= fp.this.f385446a.f386419p; i13++) {
                    int iA2 = i91Var2.a(i91Var.a(i13));
                    if (iA2 != -1) {
                        i12 = i91Var2.a(iA2, fp.this.f385447b, false).f386391c;
                        break;
                    }
                }
                i12 = -1;
            } else if (i12 >= i91Var2.b()) {
                i12 = -1;
            }
            this.f385454b = i12;
            if (i12 == -1) {
                return false;
            }
            jd0.b bVar = this.f385456d;
            return bVar == null || i91Var2.a(bVar.f385280a) != -1;
        }

        public final void b(int i12, @j.P jd0.b bVar) {
            if (this.f385455c == -1 && i12 == this.f385454b && bVar != null) {
                this.f385455c = bVar.f385283d;
            }
        }

        public final boolean a(int i12, @j.P jd0.b bVar) {
            if (bVar == null) {
                return i12 == this.f385454b;
            }
            jd0.b bVar2 = this.f385456d;
            return bVar2 == null ? !bVar.a() && bVar.f385283d == this.f385455c : bVar.f385283d == bVar2.f385283d && bVar.f385281b == bVar2.f385281b && bVar.f385282c == bVar2.f385282c;
        }

        public final boolean a(k9.a aVar) {
            long j12 = this.f385455c;
            if (j12 == -1) {
                return false;
            }
            jd0.b bVar = aVar.f387078d;
            if (bVar == null) {
                return this.f385454b != aVar.f387077c;
            }
            if (bVar.f385283d > j12) {
                return true;
            }
            if (this.f385456d == null) {
                return false;
            }
            int iA2 = aVar.f387076b.a(bVar.f385280a);
            int iA3 = aVar.f387076b.a(this.f385456d.f385280a);
            jd0.b bVar2 = aVar.f387078d;
            if (bVar2.f385283d < this.f385456d.f385283d || iA2 < iA3) {
                return false;
            }
            if (iA2 > iA3) {
                return true;
            }
            if (bVar2.a()) {
                jd0.b bVar3 = aVar.f387078d;
                int i12 = bVar3.f385281b;
                int i13 = bVar3.f385282c;
                jd0.b bVar4 = this.f385456d;
                int i14 = bVar4.f385281b;
                return i12 > i14 || (i12 == i14 && i13 > bVar4.f385282c);
            }
            int i15 = aVar.f387078d.f385284e;
            return i15 == -1 || i15 > this.f385456d.f385281b;
        }
    }

    public fp() {
        this(f385444h);
    }

    public final synchronized void d(k9.a aVar) {
        try {
            this.f385450e.getClass();
            i91 i91Var = this.f385451f;
            this.f385451f = aVar.f387076b;
            Iterator<a> it = this.f385448c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.a(i91Var, this.f385451f) || next.a(aVar)) {
                    it.remove();
                    if (next.f385457e) {
                        if (next.f385453a.equals(this.f385452g)) {
                            this.f385452g = null;
                        }
                        ((bd0) this.f385450e).b(aVar, next.f385453a);
                    }
                }
            }
            b(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public fp(z71<String> z71Var) {
        this.f385449d = z71Var;
        this.f385446a = new i91.d();
        this.f385447b = new i91.b();
        this.f385448c = new HashMap<>();
        this.f385451f = i91.f386387a;
    }

    public final void a(et0 et0Var) {
        this.f385450e = et0Var;
    }

    @j.P
    public final synchronized String b() {
        return this.f385452g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r7.f387078d.f385283d < r0.f385455c) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(com.yandex.mobile.ads.impl.k9.a r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.mobile.ads.impl.et0 r0 = r6.f385450e     // Catch: java.lang.Throwable -> L33
            r0.getClass()     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.i91 r0 = r7.f387076b     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L10
            monitor-exit(r6)
            return
        L10:
            java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.fp$a> r0 = r6.f385448c     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r6.f385452g     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.fp$a r0 = (com.yandex.mobile.ads.impl.fp.a) r0     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jd0$b r1 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L44
            if (r0 == 0) goto L44
            long r1 = com.yandex.mobile.ads.impl.fp.a.b(r0)     // Catch: java.lang.Throwable -> L33
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L36
            int r0 = com.yandex.mobile.ads.impl.fp.a.c(r0)     // Catch: java.lang.Throwable -> L33
            int r1 = r7.f387077c     // Catch: java.lang.Throwable -> L33
            if (r0 == r1) goto L44
            goto L42
        L33:
            r7 = move-exception
            goto Ld8
        L36:
            com.yandex.mobile.ads.impl.jd0$b r1 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            long r1 = r1.f385283d     // Catch: java.lang.Throwable -> L33
            long r3 = com.yandex.mobile.ads.impl.fp.a.b(r0)     // Catch: java.lang.Throwable -> L33
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
        L42:
            monitor-exit(r6)
            return
        L44:
            int r0 = r7.f387077c     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jd0$b r1 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.fp$a r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r6.f385452g     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L56
            java.lang.String r1 = com.yandex.mobile.ads.impl.fp.a.a(r0)     // Catch: java.lang.Throwable -> L33
            r6.f385452g = r1     // Catch: java.lang.Throwable -> L33
        L56:
            com.yandex.mobile.ads.impl.jd0$b r1 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto La8
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto La8
            com.yandex.mobile.ads.impl.jd0$b r1 = new com.yandex.mobile.ads.impl.jd0$b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jd0$b r2 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r2.f385280a     // Catch: java.lang.Throwable -> L33
            long r4 = r2.f385283d     // Catch: java.lang.Throwable -> L33
            int r2 = r2.f385281b     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L33
            int r2 = r7.f387077c     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.fp$a r1 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L33
            boolean r2 = com.yandex.mobile.ads.impl.fp.a.d(r1)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto La8
            com.yandex.mobile.ads.impl.fp.a.e(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.i91 r1 = r7.f387076b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jd0$b r2 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.f385280a     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.i91$b r3 = r6.f385447b     // Catch: java.lang.Throwable -> L33
            r1.a(r2, r3)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.i91$b r1 = r6.f385447b     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.jd0$b r2 = r7.f387078d     // Catch: java.lang.Throwable -> L33
            int r2 = r2.f385281b     // Catch: java.lang.Throwable -> L33
            long r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L33
            long r1 = com.yandex.mobile.ads.impl.pc1.b(r1)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.i91$b r3 = r6.f385447b     // Catch: java.lang.Throwable -> L33
            long r3 = r3.f386393e     // Catch: java.lang.Throwable -> L33
            long r3 = com.yandex.mobile.ads.impl.pc1.b(r3)     // Catch: java.lang.Throwable -> L33
            long r3 = r3 + r1
            r1 = 0
            java.lang.Math.max(r1, r3)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.et0 r1 = r6.f385450e     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
        La8:
            boolean r1 = com.yandex.mobile.ads.impl.fp.a.d(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Lb6
            com.yandex.mobile.ads.impl.fp.a.e(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.et0 r1 = r6.f385450e     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
        Lb6:
            java.lang.String r1 = com.yandex.mobile.ads.impl.fp.a.a(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r6.f385452g     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto Ld6
            boolean r1 = com.yandex.mobile.ads.impl.fp.a.f(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Ld6
            com.yandex.mobile.ads.impl.fp.a.g(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.et0 r1 = r6.f385450e     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = com.yandex.mobile.ads.impl.fp.a.a(r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.bd0 r1 = (com.yandex.mobile.ads.impl.bd0) r1     // Catch: java.lang.Throwable -> L33
            r1.a(r7, r0)     // Catch: java.lang.Throwable -> L33
        Ld6:
            monitor-exit(r6)
            return
        Ld8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fp.c(com.yandex.mobile.ads.impl.k9$a):void");
    }

    @v61.m
    private void b(k9.a aVar) {
        if (aVar.f387076b.c()) {
            this.f385452g = null;
            return;
        }
        a aVar2 = this.f385448c.get(this.f385452g);
        this.f385452g = a(aVar.f387077c, aVar.f387078d).f385453a;
        c(aVar);
        jd0.b bVar = aVar.f387078d;
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (aVar2 != null && aVar2.f385455c == aVar.f387078d.f385283d && aVar2.f385456d != null && aVar2.f385456d.f385281b == aVar.f387078d.f385281b && aVar2.f385456d.f385282c == aVar.f387078d.f385282c) {
            return;
        }
        jd0.b bVar2 = aVar.f387078d;
        a(aVar.f387077c, new jd0.b(bVar2.f385280a, bVar2.f385283d));
        this.f385450e.getClass();
    }

    public final synchronized String a(i91 i91Var, jd0.b bVar) {
        return a(i91Var.a(bVar.f385280a, this.f385447b).f386391c, bVar).f385453a;
    }

    public final synchronized void a(k9.a aVar, int i12) {
        try {
            this.f385450e.getClass();
            boolean z12 = i12 == 0;
            Iterator<a> it = this.f385448c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(aVar)) {
                    it.remove();
                    if (next.f385457e) {
                        boolean zEquals = next.f385453a.equals(this.f385452g);
                        if (z12 && zEquals) {
                            boolean unused = next.f385458f;
                        }
                        if (zEquals) {
                            this.f385452g = null;
                        }
                        ((bd0) this.f385450e).b(aVar, next.f385453a);
                    }
                }
            }
            b(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(k9.a aVar) {
        et0 et0Var;
        this.f385452g = null;
        Iterator<a> it = this.f385448c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f385457e && (et0Var = this.f385450e) != null) {
                ((bd0) et0Var).b(aVar, next.f385453a);
            }
        }
    }

    private a a(int i12, @j.P jd0.b bVar) {
        a aVar = null;
        long j12 = Long.MAX_VALUE;
        for (a aVar2 : this.f385448c.values()) {
            aVar2.b(i12, bVar);
            if (aVar2.a(i12, bVar)) {
                long j13 = aVar2.f385455c;
                if (j13 == -1 || j13 < j12) {
                    aVar = aVar2;
                    j12 = j13;
                } else if (j13 == j12) {
                    int i13 = pc1.f388768a;
                    if (aVar.f385456d != null && aVar2.f385456d != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f385449d.get();
        a aVar3 = new a(str, i12, bVar);
        this.f385448c.put(str, aVar3);
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a() {
        byte[] bArr = new byte[12];
        f385445i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}

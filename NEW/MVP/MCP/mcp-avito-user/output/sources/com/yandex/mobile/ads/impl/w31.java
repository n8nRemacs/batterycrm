package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import com.yandex.mobile.ads.impl.yg;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class w31 implements yg {

    /* renamed from: k, reason: collision with root package name */
    private static final HashSet<File> f391272k = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f391273a;

    /* renamed from: b, reason: collision with root package name */
    private final fh f391274b;

    /* renamed from: c, reason: collision with root package name */
    private final qh f391275c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final hh f391276d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<yg.b>> f391277e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f391278f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f391279g;

    /* renamed from: h, reason: collision with root package name */
    private long f391280h;

    /* renamed from: i, reason: collision with root package name */
    private long f391281i;

    /* renamed from: j, reason: collision with root package name */
    private yg.a f391282j;

    public w31(File file, c90 c90Var, @j.P kt ktVar) {
        this(file, c90Var, new qh(ktVar, file), new hh(ktVar));
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized long a() {
        return this.f391281i;
    }

    @Override // com.yandex.mobile.ads.impl.yg
    @j.P
    public final synchronized lh c(String str, long j12, long j13) {
        x31 x31VarB;
        x31 x31VarA;
        boolean z12;
        try {
        } finally {
        }
        synchronized (this) {
            yg.a aVar = this.f391282j;
            if (aVar != null) {
                throw aVar;
            }
        }
        ph phVarA = this.f391275c.a(str);
        if (phVarA == null) {
            x31VarA = x31.a(str, j12, j13);
        } else {
            while (true) {
                x31VarB = phVarA.b(j12, j13);
                if (!x31VarB.f387481d || x31VarB.f387482e.length() == x31VarB.f387480c) {
                    break;
                }
                b();
            }
            x31VarA = x31VarB;
        }
        if (!x31VarA.f387481d) {
            boolean zD2 = this.f391275c.b(str).d(j12, x31VarA.f387480c);
            if (zD2) {
                return x31VarA;
            }
            return null;
        }
        if (this.f391279g) {
            File file = x31VarA.f387482e;
            file.getClass();
            String name = file.getName();
            long j14 = x31VarA.f387480c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            hh hhVar = this.f391276d;
            if (hhVar != null) {
                try {
                    hhVar.a(name, j14, jCurrentTimeMillis);
                } catch (IOException unused) {
                    ka0.d("SimpleCache", "Failed to update index with new touch timestamp.");
                }
                z12 = false;
            } else {
                z12 = true;
            }
            x31 x31VarA2 = this.f391275c.a(str).a(x31VarA, jCurrentTimeMillis, z12);
            ArrayList<yg.b> arrayList = this.f391277e.get(x31VarA.f387478a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a(this, x31VarA, x31VarA2);
                }
            }
            c90 c90Var = (c90) this.f391274b;
            c90Var.a(x31VarA);
            c90Var.a(this, x31VarA2);
            x31VarA = x31VarA2;
        }
        return x31VarA;
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized long d(String str, long j12, long j13) {
        ph phVarA;
        if (j13 == -1) {
            j13 = Long.MAX_VALUE;
        }
        phVarA = this.f391275c.a(str);
        return phVarA != null ? phVarA.a(j12, j13) : -j13;
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized lh e(String str, long j12, long j13) {
        lh lhVarC;
        synchronized (this) {
            yg.a aVar = this.f391282j;
            if (aVar != null) {
                throw aVar;
            }
        }
        return lhVarC;
        while (true) {
            lhVarC = c(str, j12, j13);
            if (lhVarC != null) {
                return lhVarC;
            }
            wait();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized File a(String str, long j12, long j13) {
        try {
            synchronized (this) {
                yg.a aVar = this.f391282j;
                if (aVar != null) {
                    throw aVar;
                }
            }
            return new File(file, i + "." + j12 + "." + jCurrentTimeMillis + ".v3.exo");
        } catch (Throwable th2) {
            throw th2;
        }
        ph phVarA = this.f391275c.a(str);
        phVarA.getClass();
        db.b(phVarA.c(j12, j13));
        if (!this.f391273a.exists()) {
            a(this.f391273a);
            b();
        }
        ((c90) this.f391274b).a(this, j13);
        File file = new File(this.f391273a, Integer.toString(this.f391278f.nextInt(10)));
        if (!file.exists()) {
            a(file);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i12 = phVarA.f388832a;
        int i13 = x31.f391545j;
        return new File(file, i12 + "." + j12 + "." + jCurrentTimeMillis + ".v3.exo");
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized void b(lh lhVar) {
        ph phVarA = this.f391275c.a(lhVar.f387478a);
        phVarA.getClass();
        phVarA.a(lhVar.f387479b);
        this.f391275c.c(phVarA.f388833b);
        notifyAll();
    }

    public w31(File file, c90 c90Var, qh qhVar, @j.P hh hhVar) {
        if (c(file)) {
            this.f391273a = file;
            this.f391274b = c90Var;
            this.f391275c = qhVar;
            this.f391276d = hhVar;
            this.f391277e = new HashMap<>();
            this.f391278f = new Random();
            this.f391279g = true;
            this.f391280h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new v31(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.j(file, "Another SimpleCache instance uses the folder: "));
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized long b(String str, long j12, long j13) {
        long j14;
        long j15 = j13 == -1 ? Long.MAX_VALUE : j12 + j13;
        long j16 = j15 >= 0 ? j15 : Long.MAX_VALUE;
        long j17 = j12;
        j14 = 0;
        while (j17 < j16) {
            long jD2 = d(str, j17, j16 - j17);
            if (jD2 > 0) {
                j14 += jD2;
            } else {
                jD2 = -jD2;
            }
            j17 += jD2;
        }
        return j14;
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized oo b(String str) {
        ph phVarA;
        try {
            phVarA = this.f391275c.a(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return phVarA != null ? phVarA.a() : oo.f388598c;
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        Iterator<ph> it = this.f391275c.a().iterator();
        while (it.hasNext()) {
            Iterator<x31> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                x31 next = it2.next();
                if (next.f387482e.length() != next.f387480c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c((lh) arrayList.get(i12));
        }
    }

    private static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, up1.a(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file2, "Failed to create UID file: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000f, B:14:0x0017, B:16:0x004c, B:20:0x0058, B:21:0x005b, B:23:0x005f, B:24:0x0063, B:27:0x006e, B:28:0x0073, B:29:0x0074, B:31:0x0092, B:33:0x0099, B:34:0x00a5, B:36:0x00b1, B:40:0x00b7, B:41:0x00bc, B:35:0x00ac), top: B:44:0x0001, inners: #1, #2 }] */
    @Override // com.yandex.mobile.ads.impl.yg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.io.File r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r10.exists()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L9
            monitor-exit(r9)
            return
        L9:
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            r10.delete()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r9)
            return
        L14:
            r10 = move-exception
            goto Lbd
        L17:
            com.yandex.mobile.ads.impl.qh r5 = r9.f391275c     // Catch: java.lang.Throwable -> L14
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r10
            r1 = r11
            com.yandex.mobile.ads.impl.x31 r11 = com.yandex.mobile.ads.impl.x31.a(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L14
            r11.getClass()     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.qh r12 = r9.f391275c     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r11.f387478a     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.ph r12 = r12.a(r0)     // Catch: java.lang.Throwable -> L14
            r12.getClass()     // Catch: java.lang.Throwable -> L14
            long r0 = r11.f387479b     // Catch: java.lang.Throwable -> L14
            long r2 = r11.f387480c     // Catch: java.lang.Throwable -> L14
            boolean r0 = r12.c(r0, r2)     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.db.b(r0)     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.oo r12 = r12.a()     // Catch: java.lang.Throwable -> L14
            long r0 = r12.b()     // Catch: java.lang.Throwable -> L14
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 1
            if (r12 == 0) goto L5b
            long r3 = r11.f387479b     // Catch: java.lang.Throwable -> L14
            long r5 = r11.f387480c     // Catch: java.lang.Throwable -> L14
            long r3 = r3 + r5
            int r12 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r12 > 0) goto L57
            r12 = r2
            goto L58
        L57:
            r12 = 0
        L58:
            com.yandex.mobile.ads.impl.db.b(r12)     // Catch: java.lang.Throwable -> L14
        L5b:
            com.yandex.mobile.ads.impl.hh r12 = r9.f391276d     // Catch: java.lang.Throwable -> L14
            if (r12 == 0) goto L74
            java.lang.String r4 = r10.getName()     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.hh r3 = r9.f391276d     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L6d
            long r5 = r11.f387480c     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L6d
            long r7 = r11.f387483f     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L6d
            r3.a(r4, r5, r7)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L6d
            goto L74
        L6d:
            r10 = move-exception
            com.yandex.mobile.ads.impl.yg$a r11 = new com.yandex.mobile.ads.impl.yg$a     // Catch: java.lang.Throwable -> L14
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L14
            throw r11     // Catch: java.lang.Throwable -> L14
        L74:
            com.yandex.mobile.ads.impl.qh r10 = r9.f391275c     // Catch: java.lang.Throwable -> L14
            java.lang.String r12 = r11.f387478a     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.ph r10 = r10.b(r12)     // Catch: java.lang.Throwable -> L14
            r10.a(r11)     // Catch: java.lang.Throwable -> L14
            long r0 = r9.f391281i     // Catch: java.lang.Throwable -> L14
            long r3 = r11.f387480c     // Catch: java.lang.Throwable -> L14
            long r0 = r0 + r3
            r9.f391281i = r0     // Catch: java.lang.Throwable -> L14
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.yandex.mobile.ads.impl.yg$b>> r10 = r9.f391277e     // Catch: java.lang.Throwable -> L14
            java.lang.String r12 = r11.f387478a     // Catch: java.lang.Throwable -> L14
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L14
            if (r10 == 0) goto La5
            int r12 = r10.size()     // Catch: java.lang.Throwable -> L14
            int r12 = r12 - r2
        L97:
            if (r12 < 0) goto La5
            java.lang.Object r0 = r10.get(r12)     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.yg$b r0 = (com.yandex.mobile.ads.impl.yg.b) r0     // Catch: java.lang.Throwable -> L14
            r0.a(r9, r11)     // Catch: java.lang.Throwable -> L14
            int r12 = r12 + (-1)
            goto L97
        La5:
            com.yandex.mobile.ads.impl.fh r10 = r9.f391274b     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.c90 r10 = (com.yandex.mobile.ads.impl.c90) r10     // Catch: java.lang.Throwable -> L14
            r10.a(r9, r11)     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.qh r10 = r9.f391275c     // Catch: java.lang.Throwable -> Lb6
            r10.c()     // Catch: java.lang.Throwable -> Lb6
            r9.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r9)
            return
        Lb6:
            r10 = move-exception
            com.yandex.mobile.ads.impl.yg$a r11 = new com.yandex.mobile.ads.impl.yg$a     // Catch: java.lang.Throwable -> L14
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L14
            throw r11     // Catch: java.lang.Throwable -> L14
        Lbd:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L14
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.w31.a(java.io.File, long):void");
    }

    private void c(lh lhVar) {
        ph phVarA = this.f391275c.a(lhVar.f387478a);
        if (phVarA == null || !phVarA.a(lhVar)) {
            return;
        }
        this.f391281i -= lhVar.f387480c;
        if (this.f391276d != null) {
            String name = lhVar.f387482e.getName();
            try {
                this.f391276d.a(name);
            } catch (IOException unused) {
                yk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f391275c.c(phVarA.f388833b);
        ArrayList<yg.b> arrayList = this.f391277e.get(lhVar.f387478a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(lhVar);
            }
        }
        ((c90) this.f391274b).a(lhVar);
    }

    private static synchronized boolean c(File file) {
        return f391272k.add(file.getAbsoluteFile());
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized void a(String str) {
        TreeSet treeSet;
        synchronized (this) {
            try {
                ph phVarA = this.f391275c.a(str);
                if (phVarA != null && !phVarA.c()) {
                    treeSet = new TreeSet((Collection) phVarA.b());
                } else {
                    treeSet = new TreeSet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            c((lh) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized void a(lh lhVar) {
        c(lhVar);
    }

    @Override // com.yandex.mobile.ads.impl.yg
    public final synchronized void a(String str, tl tlVar) {
        try {
            synchronized (this) {
                synchronized (this) {
                    yg.a aVar = this.f391282j;
                    if (aVar != null) {
                        throw aVar;
                    }
                }
                return;
            }
            this.f391275c.c();
            return;
        } catch (Throwable th2) {
            throw new yg.a(th2);
        }
        this.f391275c.a(str, tlVar);
    }

    public static void a(w31 w31Var) throws NumberFormatException {
        long j12;
        if (!w31Var.f391273a.exists()) {
            try {
                a(w31Var.f391273a);
            } catch (yg.a e12) {
                w31Var.f391282j = e12;
                return;
            }
        }
        File[] fileArrListFiles = w31Var.f391273a.listFiles();
        if (fileArrListFiles == null) {
            StringBuilder sbA = Cif.a("Failed to list cache directory files: ");
            sbA.append(w31Var.f391273a);
            String string = sbA.toString();
            ka0.b("SimpleCache", string);
            w31Var.f391282j = new yg.a(string);
            return;
        }
        int length = fileArrListFiles.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                j12 = -1;
                break;
            }
            File file = fileArrListFiles[i12];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j12 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ka0.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i12++;
        }
        w31Var.f391280h = j12;
        if (j12 == -1) {
            try {
                w31Var.f391280h = b(w31Var.f391273a);
            } catch (IOException e13) {
                StringBuilder sbA2 = Cif.a("Failed to create cache UID: ");
                sbA2.append(w31Var.f391273a);
                String string2 = sbA2.toString();
                ka0.a("SimpleCache", string2, e13);
                w31Var.f391282j = new yg.a(string2, e13);
                return;
            }
        }
        try {
            w31Var.f391275c.a(w31Var.f391280h);
            hh hhVar = w31Var.f391276d;
            if (hhVar != null) {
                hhVar.a(w31Var.f391280h);
                HashMap mapA = w31Var.f391276d.a();
                w31Var.a(w31Var.f391273a, true, fileArrListFiles, mapA);
                w31Var.f391276d.a(mapA.keySet());
            } else {
                w31Var.a(w31Var.f391273a, true, fileArrListFiles, null);
            }
            w31Var.f391275c.b();
            try {
                w31Var.f391275c.c();
            } catch (Throwable th2) {
                ka0.a("SimpleCache", "Storing index file failed", th2);
            }
        } catch (Throwable th3) {
            StringBuilder sbA3 = Cif.a("Failed to initialize cache indices: ");
            sbA3.append(w31Var.f391273a);
            String string3 = sbA3.toString();
            ka0.a("SimpleCache", string3, th3);
            w31Var.f391282j = new yg.a(string3, th3);
        }
    }

    private void a(File file, boolean z12, @j.P File[] fileArr, @j.P HashMap map) throws NumberFormatException {
        long j12;
        long j13;
        if (fileArr == null || fileArr.length == 0) {
            if (z12) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z12 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z12 || (!name.startsWith("yandex_cached_content_index.exi") && !name.endsWith(".uid"))) {
                gh ghVar = map != null ? (gh) map.remove(name) : null;
                if (ghVar != null) {
                    j13 = ghVar.f385744a;
                    j12 = ghVar.f385745b;
                } else {
                    j12 = -9223372036854775807L;
                    j13 = -1;
                }
                x31 x31VarA = x31.a(file2, j13, j12, this.f391275c);
                if (x31VarA != null) {
                    this.f391275c.b(x31VarA.f387478a).a(x31VarA);
                    this.f391281i += x31VarA.f387480c;
                    ArrayList<yg.b> arrayList = this.f391277e.get(x31VarA.f387478a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).a(this, x31VarA);
                        }
                    }
                    ((c90) this.f391274b).a(this, x31VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static void a(File file) throws yg.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ka0.b("SimpleCache", str);
        throw new yg.a(str);
    }
}

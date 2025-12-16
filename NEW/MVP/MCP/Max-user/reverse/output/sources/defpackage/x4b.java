package defpackage;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class x4b {
    public final mwa a;
    public final ContextScope b;
    public final mwa c;
    public final om8 d;
    public final SimpleDateFormat e;
    public final bwf f;
    public final n9a g;
    public final pv0 h;
    public final pv0 i;
    public final ey2 j;
    public volatile x9f k;
    public final n9a l;
    public final AtomicInteger m;

    public x4b(mwa mwaVar, ContextScope contextScope, mwa mwaVar2) {
        om8 om8Var = new om8(2);
        this.a = mwaVar;
        this.b = contextScope;
        this.c = mwaVar2;
        this.d = om8Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.e = simpleDateFormat;
        this.f = new bwf(new fr7(26, this));
        Symbol symbol = o9a.a;
        this.g = new n9a();
        this.h = gzi.a(16384, 1, 4);
        this.i = gzi.a(16384, 3, 4);
        this.j = new ey2(1);
        this.l = new n9a();
        this.m = new AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.x4b r12, defpackage.q44 r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof defpackage.k4b
            if (r0 == 0) goto L16
            r0 = r13
            k4b r0 = (defpackage.k4b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            k4b r0 = new k4b
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            n9a r12 = r0.o
            x4b r0 = r0.d
            defpackage.g8j.b(r13)
            r13 = r12
            r12 = r0
            goto L4b
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.g8j.b(r13)
            n9a r13 = r12.g
            r0.d = r12
            r0.o = r13
            r0.Z = r2
            java.lang.Object r0 = r13.e(r3, r0)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L4b
            return r1
        L4b:
            java.nio.file.Path r12 = r12.f()     // Catch: java.lang.Throwable -> L63
            java.io.File r12 = r12.toFile()     // Catch: java.lang.Throwable -> L63
            i4b r0 = new i4b     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.io.File[] r12 = r12.listFiles(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 0
            if (r12 != 0) goto L65
            java.io.File[] r12 = new java.io.File[r0]     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r12 = move-exception
            goto La5
        L65:
            int r1 = r12.length     // Catch: java.lang.Throwable -> L63
            r4 = 0
            r6 = r0
        L69:
            if (r6 >= r1) goto L75
            r7 = r12[r6]     // Catch: java.lang.Throwable -> L63
            long r7 = r7.length()     // Catch: java.lang.Throwable -> L63
            long r4 = r4 + r7
            int r6 = r6 + 1
            goto L69
        L75:
            r1 = 1024(0x400, float:1.435E-42)
            long r6 = (long) r1     // Catch: java.lang.Throwable -> L63
            long r8 = r4 / r6
            r10 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L9f
            r1 = r12
            java.lang.Comparable[] r1 = (java.lang.Comparable[]) r1     // Catch: java.lang.Throwable -> L63
            int r8 = r1.length     // Catch: java.lang.Throwable -> L63
            if (r8 <= r2) goto L89
            java.util.Arrays.sort(r1)     // Catch: java.lang.Throwable -> L63
        L89:
            int r1 = r12.length     // Catch: java.lang.Throwable -> L63
        L8a:
            if (r0 >= r1) goto L9f
            r2 = r12[r0]     // Catch: java.lang.Throwable -> L63
            long r8 = r4 / r6
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L9f
            long r8 = r2.length()     // Catch: java.lang.Throwable -> L63
            long r4 = r4 - r8
            r2.delete()     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + 1
            goto L8a
        L9f:
            qqg r12 = defpackage.qqg.a     // Catch: java.lang.Throwable -> L63
            r13.g(r3)
            return r12
        La5:
            r13.g(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4b.a(x4b, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:26:0x00c4, B:28:0x00cc, B:30:0x00df, B:34:0x0128, B:36:0x0131, B:40:0x0144), top: B:51:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00be -> B:51:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.x4b r19, java.nio.file.Path r20, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4b.b(x4b, java.nio.file.Path, q44):java.lang.Object");
    }

    public static final void c(x4b x4bVar, Path path) throws IOException {
        int i;
        double dA;
        DecimalFormat decimalFormat;
        String strConcat;
        x4bVar.getClass();
        long size = Files.size(path);
        Path pathResolve = path.getParent().resolve(zob.a(path).concat(".zip"));
        int i2 = f2a.b;
        long jNanoTime = System.nanoTime() - f2a.a;
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(pathResolve.toFile(), false));
            try {
                zipOutputStream.putNextEntry(new ZipEntry(zob.a(path).concat(".log")));
                do {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        zipOutputStream.write(bArr, 0, i);
                    }
                } while (i >= 0);
                zipOutputStream.closeEntry();
                zipOutputStream.finish();
                zipOutputStream.close();
                Files.deleteIfExists(path);
                fileInputStream.close();
                long jA = c9g.a(jNanoTime);
                l6b l6bVar = wqi.a;
                if (l6bVar == null) {
                    return;
                }
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    String strA = zob.a(path);
                    long j = 1024;
                    long j2 = size / j;
                    long size2 = Files.size(pathResolve) / j;
                    y65 y65Var = y65.MILLISECONDS;
                    if (jA == s65.b) {
                        dA = Double.POSITIVE_INFINITY;
                    } else if (jA == s65.c) {
                        dA = Double.NEGATIVE_INFINITY;
                    } else {
                        dA = w9j.a(jA >> 1, (((int) jA) & 1) == 0 ? y65.NANOSECONDS : y65Var, y65Var);
                    }
                    if (Double.isInfinite(dA)) {
                        strConcat = String.valueOf(dA);
                    } else {
                        ThreadLocal[] threadLocalArr = u65.a;
                        if (threadLocalArr.length > 0) {
                            ThreadLocal threadLocal = threadLocalArr[0];
                            Object obj = threadLocal.get();
                            Object obj2 = obj;
                            if (obj == null) {
                                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                                threadLocal.set(decimalFormat2);
                                obj2 = decimalFormat2;
                            }
                            decimalFormat = (DecimalFormat) obj2;
                        } else {
                            decimalFormat = new DecimalFormat("0");
                            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                        }
                        strConcat = decimalFormat.format(dA).concat(w9j.f(y65Var));
                    }
                    StringBuilder sbQ = xrf.q("Log ", j2, strA, ", size=");
                    az1.r(size2, "kb, deflatedSize=", "kb, saved at ", sbQ);
                    sbQ.append(strConcat);
                    l6bVar.c(lg8Var, "OneMeFileLogger", sbQ.toString(), null);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r4j.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [j9a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.q44 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.l4b
            if (r0 == 0) goto L13
            r0 = r8
            l4b r0 = (defpackage.l4b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            l4b r0 = new l4b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            j9a r1 = r0.o
            x4b r0 = r0.d
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L86
        L2f:
            r8 = move-exception
            goto L96
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            j9a r2 = r0.o
            x4b r6 = r0.d
            defpackage.g8j.b(r8)
            r8 = r2
            goto L56
        L43:
            defpackage.g8j.b(r8)
            n9a r8 = r7.l
            r0.d = r7
            r0.o = r8
            r0.Z = r4
            java.lang.Object r2 = r8.e(r5, r0)
            if (r2 != r1) goto L55
            goto L83
        L55:
            r6 = r7
        L56:
            pv0 r2 = r6.h     // Catch: java.lang.Throwable -> L6f
            r2.i(r5)     // Catch: java.lang.Throwable -> L6f
            x9f r2 = r6.k     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L73
            boolean r2 = r2.isCancelled()     // Catch: java.lang.Throwable -> L6f
            if (r2 != r4) goto L73
            java.lang.String r0 = "OneMeFileLogger"
            java.lang.String r1 = "Maybe Logger are crash internally we give up!"
            r2 = 6
            android.util.Log.println(r2, r0, r1)     // Catch: java.lang.Throwable -> L6f
            r1 = r8
            goto L8e
        L6f:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto L96
        L73:
            x9f r2 = r6.k     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L88
            r0.d = r6     // Catch: java.lang.Throwable -> L6f
            r0.o = r8     // Catch: java.lang.Throwable -> L6f
            r0.Z = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.join(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r1) goto L84
        L83:
            return r1
        L84:
            r1 = r8
            r0 = r6
        L86:
            r6 = r0
            goto L89
        L88:
            r1 = r8
        L89:
            pv0 r8 = r6.i     // Catch: java.lang.Throwable -> L2f
            r8.i(r5)     // Catch: java.lang.Throwable -> L2f
        L8e:
            qqg r8 = defpackage.qqg.a     // Catch: java.lang.Throwable -> L2f
            n9a r1 = (defpackage.n9a) r1
            r1.g(r5)
            return r8
        L96:
            n9a r1 = (defpackage.n9a) r1
            r1.g(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4b.d(q44):java.lang.Object");
    }

    public final j4b e() {
        Object objB = this.i.b();
        boolean z = objB instanceof ma2;
        Object obj = objB;
        if (z) {
            j4b j4bVar = new j4b();
            j4bVar.b = "";
            j4bVar.c = lg8.c;
            obj = j4bVar;
        }
        return (j4b) obj;
    }

    public final Path f() {
        return (Path) this.f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0, types: [em6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16, types: [j9a] */
    /* JADX WARN: Type inference failed for: r10v18, types: [j9a] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.em6 r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4b.g(em6, q44):java.lang.Object");
    }

    public final void h(BufferedWriter bufferedWriter, j4b j4bVar) throws IOException {
        long j = j4bVar.a;
        ey2 ey2Var = this.j;
        long j2 = j - ey2Var.b;
        if (j2 < 0 || j2 >= 60000) {
            Instant instantTruncatedTo = Instant.ofEpochMilli(j).truncatedTo(ChronoUnit.MINUTES);
            ey2Var.b = instantTruncatedTo.toEpochMilli();
            ey2Var.d = ((SimpleDateFormat) ey2Var.c).format(Date.from(instantTruncatedTo));
        }
        bufferedWriter.write((String) ey2Var.d);
        int i = (int) (j % 60000);
        bufferedWriter.write((i / 10000) + 48);
        bufferedWriter.write(((i % 10000) / 1000) + 48);
        bufferedWriter.write(46);
        bufferedWriter.write(((i % 1000) / 100) + 48);
        bufferedWriter.write(((i % 100) / 10) + 48);
        bufferedWriter.write((i % 10) + 48);
        bufferedWriter.write(32);
        if (vmf.s(j4bVar.b, " ", false)) {
            bufferedWriter.write(dnf.q(j4bVar.b, " ", "_"));
        } else {
            bufferedWriter.write(j4bVar.b);
        }
        bufferedWriter.write(32);
        bufferedWriter.write(String.valueOf(j4bVar.c.b));
        bufferedWriter.write(32);
        String str = j4bVar.d;
        if (str == null) {
            str = "";
        }
        bufferedWriter.write(str);
        bufferedWriter.write(32);
        String str2 = j4bVar.e;
        bufferedWriter.write(str2 != null ? str2 : "");
        bufferedWriter.write(10);
        Throwable th = j4bVar.f;
        if (th != null) {
            bufferedWriter.write(saj.d(th));
            bufferedWriter.write(10);
        }
    }
}

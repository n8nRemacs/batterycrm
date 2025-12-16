package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class quf {
    public static final String h = guf.class.getName();
    public final u6b a;
    public final suf b;
    public final qx5 c;
    public final dd d;
    public final ContextScope e;
    public final n9a f;
    public final LinkedHashMap g;

    public quf(u6b u6bVar, suf sufVar, qx5 qx5Var, dd ddVar, g4b g4bVar, a84 a84Var) {
        this.a = u6bVar;
        this.b = sufVar;
        this.c = qx5Var;
        this.d = ddVar;
        yy7[] yy7VarArr = g4b.q;
        this.e = d7j.a(zk6.a().plus(new lj5(g4bVar.f(0, "media-conv-helper", 2, 5, false))).plus(a84Var));
        Symbol symbol = o9a.a;
        this.f = new n9a();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.quf r12, defpackage.k2h r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quf.a(quf, k2h, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9, types: [k2h] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.quf r13, defpackage.k2h r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quf.b(quf, k2h, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[Catch: all -> 0x0133, TRY_ENTER, TryCatch #2 {all -> 0x0133, blocks: (B:52:0x0129, B:49:0x0102, B:55:0x0138), top: B:99:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #2 {all -> 0x0133, blocks: (B:52:0x0129, B:49:0x0102, B:55:0x0138), top: B:99:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0126 -> B:99:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.k2h r17, defpackage.q34 r18, defpackage.q44 r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quf.c(k2h, q34, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, qqg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.k2h r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ouf
            if (r0 == 0) goto L13
            r0 = r7
            ouf r0 = (defpackage.ouf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ouf r0 = new ouf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            k2h r6 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L45
        L29:
            r7 = move-exception
            goto L48
        L2b:
            r6 = move-exception
            goto L68
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.g8j.b(r7)
            suf r7 = r5.b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.d = r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.Y = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r6 = r7.b(r6, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 != r1) goto L45
            return r1
        L45:
            qqg r6 = defpackage.qqg.a
            return r6
        L48:
            java.lang.String r0 = defpackage.quf.h
            l6b r1 = defpackage.wqi.a
            if (r1 == 0) goto L67
            lg8 r2 = defpackage.lg8.Y
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "putConversionInRepository: failed, videoConversion="
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.c(r2, r0, r6, r7)
        L67:
            throw r7
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quf.d(k2h, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.l2h r7, defpackage.q44 r8) {
        /*
            r6 = this;
            java.lang.String r0 = defpackage.quf.h
            java.lang.String r1 = "removeFromRepository: success, conversionData = "
            boolean r2 = r8 instanceof defpackage.puf
            if (r2 == 0) goto L17
            r2 = r8
            puf r2 = (defpackage.puf) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            puf r2 = new puf
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.o
            g84 r3 = defpackage.g84.a
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            l2h r7 = r2.d
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            goto L49
        L2d:
            r8 = move-exception
            goto L67
        L2f:
            r7 = move-exception
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.g8j.b(r8)
            suf r8 = r6.b     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r2.d = r7     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r2.Y = r5     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.Object r8 = r8.c(r7, r2)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            if (r8 != r3) goto L49
            return r3
        L49:
            l6b r8 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            if (r8 != 0) goto L4e
            goto L85
        L4e:
            lg8 r2 = defpackage.lg8.d     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            boolean r3 = r8.b(r2)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            if (r3 == 0) goto L85
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r3.append(r7)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r3 = 0
            r8.c(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            goto L85
        L67:
            l6b r1 = defpackage.wqi.a
            if (r1 != 0) goto L6c
            goto L85
        L6c:
            lg8 r2 = defpackage.lg8.Y
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L85
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "removeFromRepository: failed conversionData = "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.c(r2, r0, r7, r8)
        L85:
            qqg r7 = defpackage.qqg.a
            return r7
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quf.e(l2h, q44):java.lang.Object");
    }
}

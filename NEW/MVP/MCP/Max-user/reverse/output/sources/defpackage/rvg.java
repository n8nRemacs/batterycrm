package defpackage;

import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.Symbol;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* loaded from: classes2.dex */
public final class rvg {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final String e = rvg.class.getName();
    public final k18 f;
    public final n9a g;
    public final w8a h;

    public rvg(k18 k18Var, long j, long j2, int i, String str) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.f = k18Var;
        Symbol symbol = o9a.a;
        this.g = new n9a();
        this.h = new w8a();
    }

    public static String d(ood oodVar) {
        Object ipdVar;
        try {
            ipdVar = ood.c(oodVar, "X-Reason");
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        return (String) ipdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lvg
            if (r0 == 0) goto L13
            r0 = r5
            lvg r0 = (defpackage.lvg) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            lvg r0 = new lvg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            n9a r1 = r0.o
            rvg r0 = r0.d
            defpackage.g8j.b(r5)
            goto L47
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            defpackage.g8j.b(r5)
            r0.d = r4
            n9a r1 = r4.g
            r0.o = r1
            r0.Z = r2
            java.lang.Object r5 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r4
        L47:
            int r5 = r0.c     // Catch: java.lang.Throwable -> L51
            r2 = 3
            if (r5 != r2) goto L53
            utg r5 = r0.b()     // Catch: java.lang.Throwable -> L51
            goto L57
        L51:
            r5 = move-exception
            goto L5b
        L53:
            utg r5 = r0.c()     // Catch: java.lang.Throwable -> L51
        L57:
            r1.g(r3)
            return r5
        L5b:
            r1.g(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.a(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.utg b() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.b():utg");
    }

    public final utg c() {
        w8a w8aVar = this.h;
        int i = w8aVar.b;
        long j = this.b;
        if (i == 0) {
            utg utgVar = new utg(0L, j);
            w8aVar.b(utgVar);
            return utgVar;
        }
        if (i != 1) {
            return null;
        }
        if (w8aVar.h()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        long j2 = ((utg) w8aVar.a[0]).b;
        if (j2 == j) {
            return null;
        }
        utg utgVar2 = new utg(j2, j - j2);
        w8aVar.b(utgVar2);
        return utgVar2;
    }

    public final void e(ood oodVar) throws HttpErrorException {
        int i = oodVar.d;
        qod qodVar = oodVar.Y;
        o97 o97VarE = uog.e(i, d(oodVar));
        boolean zL = oodVar.l();
        String str = this.e;
        if (zL || o97VarE.equals(uog.a) || o97VarE.equals(uog.b)) {
            wqi.q(str, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0", new Object[0]);
            return;
        }
        if (o97VarE.equals(uog.g) || o97VarE.equals(uog.e)) {
            wqi.q(str, "getErrorUploadPositionFromResponse forbidden or bad request: error=" + o97VarE, new Object[0]);
            throw new HttpUrlExpiredException("Expired url on GET", o97VarE, qodVar != null ? qodVar.Q() : null);
        }
        wqi.e(str, "getErrorUploadPositionFromResponse error=" + o97VarE, null);
        throw new HttpErrorException("Failed receiving upload status", o97VarE, qodVar != null ? qodVar.Q() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(defpackage.ga7 r7, defpackage.q44 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mvg
            if (r0 == 0) goto L13
            r0 = r8
            mvg r0 = (defpackage.mvg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mvg r0 = new mvg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.o
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            rvg r7 = r0.d
            defpackage.g8j.b(r8)
            goto L8e
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.g8j.b(r8)
            kw6 r8 = new kw6
            r8.<init>()
            r8.a = r7
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r8.l(r7)
            java.lang.String r7 = r6.d
            java.lang.String r7 = android.net.Uri.encode(r7)
            java.lang.String r1 = "attachment; filename="
            java.lang.String r7 = defpackage.wy1.h(r1, r7)
            java.lang.Object r1 = r8.c
            i17 r1 = (defpackage.i17) r1
            java.lang.String r4 = "content-disposition"
            r1.a(r4, r7)
            long r4 = r6.b
            java.lang.String r7 = "bytes 0-/"
            java.lang.String r7 = defpackage.vb9.e(r4, r7)
            java.lang.Object r1 = r8.c
            i17 r1 = (defpackage.i17) r1
            java.lang.String r4 = "content-range"
            r1.a(r4, r7)
            java.lang.String r7 = "HEAD"
            r8.e(r7, r2)
            zmd r7 = r8.a()
            k18 r8 = r6.f
            java.lang.Object r8 = r8.getValue()
            sua r8 = (defpackage.sua) r8
            mbd r7 = r8.b(r7)
            r0.d = r6
            r0.Y = r3
            java.lang.Object r8 = defpackage.izi.a(r7, r0)
            g84 r7 = defpackage.g84.a
            if (r8 != r7) goto L8d
            return r7
        L8d:
            r7 = r6
        L8e:
            ood r8 = (defpackage.ood) r8
            boolean r0 = r8.l()
            if (r0 != 0) goto Lc0
            r7.getClass()
            int r7 = r8.d
            java.lang.String r8 = d(r8)
            o97 r7 = defpackage.uog.e(r7, r8)
            o97 r8 = defpackage.uog.j
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lb3
            o97 r8 = defpackage.uog.i
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto Lc0
        Lb3:
            one.me.sdk.transfer.exceptions.HttpErrorException r8 = new one.me.sdk.transfer.exceptions.HttpErrorException
            java.lang.String r0 = r7.b
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "Undefined upload error"
        Lbb:
            r1 = 4
            r8.<init>(r0, r7, r2, r1)
            return r8
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.f(ga7, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ga7 r22, defpackage.q44 r23) throws one.me.sdk.transfer.exceptions.HttpErrorException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.g(ga7, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ga7 r8, defpackage.q44 r9) throws one.me.sdk.transfer.exceptions.HttpErrorException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ovg
            if (r0 == 0) goto L13
            r0 = r9
            ovg r0 = (defpackage.ovg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ovg r0 = new ovg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            rvg r8 = r0.d
            defpackage.g8j.b(r9)
            goto L6d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.g8j.b(r9)
            kw6 r9 = new kw6
            r9.<init>()
            r9.a = r8
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            r9.l(r8)
            vy5 r8 = new vy5
            r1 = 1
            r8.<init>(r1)
            java.lang.String r1 = "POST"
            r9.e(r1, r8)
            zmd r8 = r9.a()
            k18 r9 = r7.f
            java.lang.Object r9 = r9.getValue()
            sua r9 = (defpackage.sua) r9
            mbd r8 = r9.b(r8)
            r0.d = r7
            r0.Y = r2
            java.lang.Object r9 = defpackage.izi.a(r8, r0)
            g84 r8 = defpackage.g84.a
            if (r9 != r8) goto L6c
            return r8
        L6c:
            r8 = r7
        L6d:
            ood r9 = (defpackage.ood) r9
            boolean r0 = r9.l()
            r1 = 0
            if (r0 == 0) goto Laa
            r8.getClass()
            java.lang.String r0 = "X-Last-Known-Byte"
            j17 r3 = r9.X
            java.lang.String r0 = r3.a(r0)
            r3 = 0
            if (r0 == 0) goto L86
            goto L87
        L86:
            r0 = r3
        L87:
            if (r0 == 0) goto Lad
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L91
            r5 = 1
            long r3 = r3 + r5
            goto Lae
        L91:
            one.me.sdk.transfer.exceptions.HttpUrlExpiredException r8 = new one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            java.lang.String r1 = "Cannot parse range header='"
            java.lang.String r2 = "'"
            java.lang.String r0 = defpackage.ho7.i(r1, r0, r2)
            qod r9 = r9.Y
            if (r9 == 0) goto La4
            java.lang.String r9 = r9.Q()
            goto La5
        La4:
            r9 = r3
        La5:
            r1 = 2
            r8.<init>(r0, r3, r9, r1)
            throw r8
        Laa:
            r8.e(r9)
        Lad:
            r3 = r1
        Lae:
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 == 0) goto Lbc
            w8a r8 = r8.h
            utg r9 = new utg
            r9.<init>(r1, r3)
            r8.b(r9)
        Lbc:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.h(ga7, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r7.h(r11, r1) == r2) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[Catch: all -> 0x0037, TryCatch #4 {all -> 0x0037, blocks: (B:14:0x0033, B:49:0x00b7, B:71:0x00ff, B:52:0x00be, B:54:0x00c6, B:70:0x00ed, B:74:0x0107, B:78:0x011c, B:79:0x011f, B:77:0x0114, B:80:0x0120), top: B:86:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114 A[Catch: all -> 0x0037, TryCatch #4 {all -> 0x0037, blocks: (B:14:0x0033, B:49:0x00b7, B:71:0x00ff, B:52:0x00be, B:54:0x00c6, B:70:0x00ed, B:74:0x0107, B:78:0x011c, B:79:0x011f, B:77:0x0114, B:80:0x0120), top: B:86:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ga7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ga7 r11, defpackage.q44 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.i(ga7, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.q44 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.qvg
            if (r0 == 0) goto L13
            r0 = r9
            qvg r0 = (defpackage.qvg) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qvg r0 = new qvg
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            n9a r1 = r0.o
            rvg r0 = r0.d
            defpackage.g8j.b(r9)
            goto L47
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.g8j.b(r9)
            r0.d = r8
            n9a r1 = r8.g
            r0.o = r1
            r0.Z = r2
            java.lang.Object r9 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L46
            return r0
        L46:
            r0 = r8
        L47:
            w8a r9 = r0.h     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r0 = r9.a     // Catch: java.lang.Throwable -> L5c
            int r9 = r9.b     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            r2 = 0
        L50:
            if (r2 >= r9) goto L5e
            r6 = r0[r2]     // Catch: java.lang.Throwable -> L5c
            utg r6 = (defpackage.utg) r6     // Catch: java.lang.Throwable -> L5c
            long r6 = r6.c     // Catch: java.lang.Throwable -> L5c
            long r4 = r4 + r6
            int r2 = r2 + 1
            goto L50
        L5c:
            r9 = move-exception
            goto L67
        L5e:
            java.lang.Long r9 = new java.lang.Long     // Catch: java.lang.Throwable -> L5c
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            r1.g(r3)
            return r9
        L67:
            r1.g(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvg.j(q44):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sbM = az1.m("(");
        w8a w8aVar = this.h;
        Object[] objArr = w8aVar.a;
        int i = w8aVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            utg utgVar = (utg) objArr[i2];
            if (sbM.length() > 1) {
                sbM.append(",");
            }
            sbM.append(utgVar.a);
            sbM.append("-");
            sbM.append((utgVar.a + utgVar.b) - 1);
        }
        sbM.append(")");
        return sbM.toString();
    }
}

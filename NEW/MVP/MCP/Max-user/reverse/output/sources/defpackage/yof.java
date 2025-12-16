package defpackage;

import java.io.EOFException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class yof implements sfg {
    public final sfg a;
    public final rof b;
    public tof g;
    public hf6 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = zxg.b;
    public final umb c = new umb();

    public yof(sfg sfgVar, rof rofVar) {
        this.a = sfgVar;
        this.b = rofVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.sfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r9, int r11, int r12, int r13, defpackage.qfg r14) {
        /*
            r8 = this;
            tof r0 = r8.g
            if (r0 != 0) goto Lf
            sfg r1 = r8.a
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.a(r2, r4, r5, r6, r7)
            return
        Lf:
            r5 = r12
            r6 = r13
            r7 = r14
            r13 = r11
            r11 = r9
            r1 = 0
            if (r7 != 0) goto L19
            r9 = 1
            goto L1a
        L19:
            r9 = r1
        L1a:
            java.lang.String r10 = "DRM on subtitles is not supported"
            defpackage.hsi.a(r10, r9)
            int r9 = r8.e
            int r9 = r9 - r6
            int r2 = r9 - r5
            tof r0 = r8.g     // Catch: java.lang.RuntimeException -> L45
            byte[] r3 = r8.f     // Catch: java.lang.RuntimeException -> L45
            sof r4 = defpackage.sof.c     // Catch: java.lang.RuntimeException -> L45
            lr5 r9 = new lr5     // Catch: java.lang.RuntimeException -> L45
            r14 = 4
            r10 = r8
            r9.<init>(r10, r11, r13, r14)     // Catch: java.lang.RuntimeException -> L41
            r6 = r10
            r14 = r9
            r9 = r0
            r11 = r2
            r10 = r3
            r13 = r4
            r12 = r5
            r9.r(r10, r11, r12, r13, r14)     // Catch: java.lang.RuntimeException -> L3d
            r5 = r12
            goto L53
        L3d:
            r0 = move-exception
            r5 = r12
        L3f:
            r9 = r0
            goto L48
        L41:
            r0 = move-exception
            r6 = r10
        L43:
            r11 = r2
            goto L3f
        L45:
            r0 = move-exception
            r6 = r8
            goto L43
        L48:
            boolean r10 = r6.i
            if (r10 == 0) goto L60
            java.lang.String r10 = "SubtitleTranscodingTO"
            java.lang.String r12 = "Parsing subtitles failed, ignoring sample."
            defpackage.a8i.m(r10, r12, r9)
        L53:
            int r2 = r11 + r5
            r6.d = r2
            int r9 = r6.e
            if (r2 != r9) goto L5f
            r6.d = r1
            r6.e = r1
        L5f:
            return
        L60:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yof.a(long, int, int, int, qfg):void");
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(umbVar, i, i2);
            return;
        }
        e(i);
        umbVar.h(this.e, this.f, i);
        this.e += i;
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(ke4Var, i, z);
        }
        e(i);
        int i2 = ke4Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
        hf6Var.n.getClass();
        String str = hf6Var.n;
        hsi.b(xz9.h(str) == 3);
        boolean zEquals = hf6Var.equals(this.h);
        rof rofVar = this.b;
        if (!zEquals) {
            this.h = hf6Var;
            this.g = rofVar.f(hf6Var) ? rofVar.x(hf6Var) : null;
        }
        tof tofVar = this.g;
        sfg sfgVar = this.a;
        if (tofVar == null) {
            sfgVar.d(hf6Var);
            return;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.m = xz9.n("application/x-media3-cues");
        ff6VarA.j = str;
        ff6VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        ff6VarA.K = rofVar.J(hf6Var);
        a9h.m(ff6VarA, sfgVar);
    }

    public final void e(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}

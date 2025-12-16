package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class njf extends xfh {
    public final k18 X;
    public final k18 Y;
    public final long b;
    public final fif c;
    public final lzf d;
    public final kif o;
    public final tcf t0;
    public final hbd u0;
    public final us v0;
    public final ci5 Z = new ci5(0);
    public final ci5 s0 = new ci5(0);

    public njf(long j, fif fifVar, lzf lzfVar, kif kifVar, k18 k18Var, k18 k18Var2) {
        this.b = j;
        this.c = fifVar;
        this.d = lzfVar;
        this.o = kifVar;
        this.X = k18Var;
        this.Y = k18Var2;
        tcf tcfVarA = ucf.a(bze.c);
        this.t0 = tcfVarA;
        this.u0 = new hbd(tcfVarA);
        this.v0 = new us(0);
        gw0.w(gw0.u(new g56(new z41(fifVar.e, kifVar.e, hjf.Z, 3), new ijf(this, null), 1), ((q2b) lzfVar).b()), this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.njf r10, java.util.List r11, defpackage.hif r12, defpackage.q44 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.jjf
            if (r0 == 0) goto L13
            r0 = r13
            jjf r0 = (defpackage.jjf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            jjf r0 = new jjf
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            njf r10 = r0.d
            defpackage.g8j.b(r13)
            goto Lc2
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            njf r10 = r0.d
            defpackage.g8j.b(r13)
            goto L8b
        L3b:
            defpackage.g8j.b(r13)
            java.lang.Class<njf> r13 = defpackage.njf.class
            java.lang.String r13 = r13.getName()
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L49
            goto L79
        L49:
            lg8 r5 = defpackage.lg8.d
            boolean r6 = r2.b(r5)
            if (r6 == 0) goto L79
            int r6 = r11.size()
            r12.getClass()
            hif r7 = defpackage.kif.k
            if (r12 != r7) goto L5e
            r7 = r3
            goto L5f
        L5e:
            r7 = 0
        L5f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Showcase content. Sets size from sections:"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ", search in initial:"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r2.c(r5, r13, r6, r7)
        L79:
            r12.getClass()
            hif r13 = defpackage.kif.k
            if (r12 != r13) goto L9e
            r0.d = r10
            r0.Y = r3
            java.lang.Object r13 = r10.w(r11, r0)
            if (r13 != r1) goto L8b
            goto Lc1
        L8b:
            java.util.List r13 = (java.util.List) r13
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L96
            bze r11 = defpackage.bze.c
            goto Lc5
        L96:
            bze r11 = new bze
            aze r12 = defpackage.aze.b
            r11.<init>(r12, r13)
            goto Lc5
        L9e:
            boolean r11 = r12.b
            if (r11 == 0) goto Lb7
            tcf r11 = r10.t0
            java.lang.Object r11 = r11.getValue()
            bze r11 = (defpackage.bze) r11
            aze r12 = defpackage.aze.a
            java.util.List r13 = r11.b
            r11.getClass()
            bze r11 = new bze
            r11.<init>(r12, r13)
            goto Lc5
        Lb7:
            r0.d = r10
            r0.Y = r4
            java.lang.Object r13 = r10.v(r12, r0)
            if (r13 != r1) goto Lc2
        Lc1:
            return r1
        Lc2:
            r11 = r13
            bze r11 = (defpackage.bze) r11
        Lc5:
            tcf r10 = r10.t0
            r10.setValue(r11)
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njf.t(njf, java.util.List, hif, q44):java.lang.Object");
    }

    public final boolean u() {
        List list;
        kif kifVar = this.o;
        if (kifVar.a()) {
            return (((gif) kifVar.g.get()).a == 0 || (list = ((hif) kifVar.d.getValue()).a) == null || list.isEmpty()) ? false : true;
        }
        fif fifVar = this.c;
        Long l = (Long) fifVar.f.get();
        return (l == null || l.longValue() != 0) && !((Collection) fifVar.d.getValue()).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.hif r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kjf
            if (r0 == 0) goto L13
            r0 = r7
            kjf r0 = (defpackage.kjf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kjf r0 = new kjf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            aze r6 = r0.d
            defpackage.g8j.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.g8j.b(r7)
            java.util.List r7 = r6.a
            aze r1 = defpackage.aze.d
            if (r7 == 0) goto L42
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3f
            goto L42
        L3f:
            aze r7 = defpackage.aze.c
            goto L43
        L42:
            r7 = r1
        L43:
            hd5 r3 = defpackage.hd5.a
            if (r7 != r1) goto L48
            goto L62
        L48:
            java.util.List r6 = r6.a
            if (r6 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r6
        L4e:
            r0.d = r7
            r0.Y = r2
            java.lang.Object r6 = r5.w(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L5b
            return r0
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            r7 = r6
        L62:
            bze r6 = new bze
            r6.<init>(r7, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njf.v(hif, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List r38, defpackage.q44 r39) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njf.w(java.util.List, q44):java.lang.Object");
    }
}

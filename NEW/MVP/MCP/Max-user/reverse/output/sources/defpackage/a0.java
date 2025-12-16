package defpackage;

/* loaded from: classes.dex */
public final class a0 extends xfh {
    public final ci5 X;
    public final tcf Y;
    public final hbd Z;
    public final age b;
    public final w63 c;
    public final c6i d;
    public final k18 o;
    public x9f s0;

    public a0() {
        f fVar = f.a;
        bwf bwfVarD = fVar.getAccessor().d(81);
        age ageVar = (age) fVar.getAccessor().c(47);
        w63 w63Var = (w63) fVar.getAccessor().c(109);
        c6i c6iVar = (c6i) fVar.getAccessor().c(186);
        this.b = ageVar;
        this.c = w63Var;
        this.d = c6iVar;
        this.o = bwfVarD;
        this.X = new ci5(0);
        tcf tcfVarA = ucf.a(hd5.a);
        this.Y = tcfVarA;
        this.Z = new hbd(tcfVarA);
        svi.e(this.a, null, null, new r(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.a0 r5, defpackage.pb2 r6, defpackage.q44 r7) {
        /*
            qqg r0 = defpackage.qqg.a
            boolean r1 = r7 instanceof defpackage.z
            if (r1 == 0) goto L15
            r1 = r7
            z r1 = (defpackage.z) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            z r1 = new z
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            pb2 r6 = r1.o
            a0 r5 = r1.d
            defpackage.g8j.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.g8j.b(r7)
            l6b r7 = defpackage.wqi.a
            if (r7 == 0) goto L3d
            goto L3e
        L3d:
            r7 = 0
        L3e:
            if (r7 != 0) goto L41
            return r0
        L41:
            r1.d = r5
            r1.o = r6
            r1.Z = r4
            java.lang.Comparable r7 = r7.a(r1)
            if (r7 != r2) goto L4e
            return r2
        L4e:
            java.nio.file.Path r7 = (java.nio.file.Path) r7
            java.io.File r7 = r7.toFile()
            android.net.Uri r7 = android.net.Uri.fromFile(r7)
            java.lang.String r7 = r7.toString()
            l1f r1 = new l1f
            r2 = 7
            r1.<init>(r2, r7)
            long r6 = r6.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
            dhe r1 = new dhe
            r1.<init>(r6, r2)
            ehe r6 = new ehe
            r6.<init>(r1)
            c6i r5 = r5.d
            r5.b(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0.t(a0, pb2, q44):java.lang.Object");
    }

    public final void u() {
        x9f x9fVar = this.s0;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.s0 = svi.e(this.a, null, null, new w(this, null), 3);
        }
    }
}

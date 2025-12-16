package defpackage;

/* loaded from: classes2.dex */
public final class suf {
    public final q9b a;
    public final bwf b = new bwf(new prd(27, this));

    public suf(q9b q9bVar) {
        this.a = q9bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.l2h r9, defpackage.q44 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ruf
            if (r0 == 0) goto L13
            r0 = r10
            ruf r0 = (defpackage.ruf) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ruf r0 = new ruf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r10)
            goto L81
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            defpackage.g8j.b(r10)
            bwf r10 = r8.b
            java.lang.Object r10 = r10.getValue()
            fuf r10 = (defpackage.fuf) r10
            java.lang.String r1 = r9.a
            p2h r9 = r9.b
            gsc r3 = r9.a
            float r4 = r9.b
            float r5 = r9.c
            boolean r9 = r9.d
            r0.X = r2
            r10.getClass()
            r6 = 5
            java.lang.String r7 = "\n            SELECT * FROM video_conversions \n            WHERE source_uri=? \n            AND quality=? \n            AND start_trim_position=? \n            AND end_trim_position=? \n            AND mute=?\n        "
            dsd r7 = defpackage.dsd.c(r6, r7)
            if (r1 != 0) goto L56
            r7.S(r2)
            goto L59
        L56:
            r7.f(r2, r1)
        L59:
            int r1 = r3.b
            long r1 = (long) r1
            r3 = 2
            r7.k(r3, r1)
            r1 = 3
            double r2 = (double) r4
            r7.g(r1, r2)
            r1 = 4
            double r2 = (double) r5
            r7.g(r1, r2)
            long r1 = (long) r9
            android.os.CancellationSignal r9 = defpackage.xrf.m(r7, r6, r1)
            lrd r1 = r10.a
            jad r2 = new jad
            r3 = 14
            r2.<init>(r10, r3, r7)
            java.lang.Object r10 = defpackage.k7j.a(r1, r9, r2, r0)
            g84 r9 = defpackage.g84.a
            if (r10 != r9) goto L81
            return r9
        L81:
            n2h r10 = (defpackage.n2h) r10
            if (r10 == 0) goto L8a
            k2h r9 = defpackage.j8.b(r10)
            return r9
        L8a:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suf.a(l2h, q44):java.lang.Object");
    }

    public final Object b(k2h k2hVar, ouf oufVar) {
        fuf fufVar = (fuf) this.b.getValue();
        Object objB = k7j.b(fufVar.a, new jad(fufVar, 13, j8.c(k2hVar)), oufVar);
        return objB == g84.a ? objB : qqg.a;
    }

    public final Object c(l2h l2hVar, puf pufVar) {
        fuf fufVar = (fuf) this.b.getValue();
        String str = l2hVar.a;
        p2h p2hVar = l2hVar.b;
        Object objB = k7j.b(fufVar.a, new euf(fufVar, str, p2hVar.a, p2hVar.b, p2hVar.c, p2hVar.d, 0), pufVar);
        return objB == g84.a ? objB : qqg.a;
    }
}

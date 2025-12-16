package defpackage;

import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class g2b {
    public final String a = g2b.class.getName();
    public final bwf b;
    public final bwf c;
    public final k18 d;
    public final k18 e;

    public g2b(bwf bwfVar, bwf bwfVar2, k18 k18Var, k18 k18Var2) {
        this.b = bwfVar;
        this.c = bwfVar2;
        this.d = k18Var;
        this.e = k18Var2;
    }

    public static boolean d(ho8 ho8Var, MessageModel messageModel, d7c d7cVar) {
        if (messageModel.G0 == xi9.Y) {
            return true;
        }
        lz lzVar = messageModel.t0;
        long j = lzVar.a;
        int i = mz.b;
        if ((j & 8) != 0 || lzVar.a()) {
            return true;
        }
        CharSequence charSequenceB = d7cVar.b(((go8) ho8Var).a);
        return (charSequenceB == null || charSequenceB.length() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ho8 r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.d2b
            if (r0 == 0) goto L13
            r0 = r7
            d2b r0 = (defpackage.d2b) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            d2b r0 = new d2b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            go8 r6 = r0.d
            defpackage.g8j.b(r7)
            goto L64
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.g8j.b(r7)
            go8 r6 = (defpackage.go8) r6
            one.me.messages.list.loader.MessageModel r7 = r6.b()
            dl9 r7 = r7.J0
            dl9 r1 = defpackage.dl9.d
            boolean r7 = defpackage.fni.a(r7, r1)
            if (r7 != 0) goto L49
            one.me.messages.list.loader.MessageModel r6 = r6.b()
            dl9 r6 = r6.J0
            return r6
        L49:
            k18 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            l24 r7 = (defpackage.l24) r7
            one.me.messages.list.loader.MessageModel r1 = r6.b()
            long r3 = r1.E0
            r0.d = r6
            r0.Y = r2
            java.lang.Comparable r7 = r7.b(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L64
            return r0
        L64:
            ku3 r7 = (defpackage.ku3) r7
            one.me.messages.list.loader.MessageModel r6 = r6.b()
            long r0 = r6.E0
            r6 = 0
            if (r7 == 0) goto L74
            java.lang.CharSequence r2 = r7.o()
            goto L75
        L74:
            r2 = r6
        L75:
            if (r7 == 0) goto L7d
            il0 r6 = defpackage.il0.b
            java.lang.String r6 = r7.r(r6)
        L7d:
            dl9 r7 = new dl9
            r7.<init>(r0, r2, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2b.a(ho8, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.go8 r6, int r7, int r8, int r9, defpackage.q44 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.e2b
            if (r0 == 0) goto L13
            r0 = r10
            e2b r0 = (defpackage.e2b) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            e2b r0 = new e2b
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            int r9 = r0.X
            go8 r6 = r0.o
            g2b r7 = r0.d
            defpackage.g8j.b(r10)
            goto L9d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.g8j.b(r10)
            pb2 r10 = r6.a
            boolean r10 = r10.Q()
            r1 = 0
            if (r10 == 0) goto L42
            goto Lc4
        L42:
            pb2 r10 = r6.a
            boolean r3 = r10.M()
            if (r3 == 0) goto L66
            boolean r3 = defpackage.fn9.f(r8)
            if (r3 != 0) goto L66
            boolean r6 = r10.b0()
            bwf r7 = r5.b
            java.lang.Object r7 = r7.getValue()
            tde r7 = (defpackage.tde) r7
            java.lang.String r8 = r10.s()
            r9 = 4
            android.text.Layout r6 = defpackage.tde.b(r7, r8, r6, r9)
            return r6
        L66:
            boolean r10 = defpackage.du0.a(r7)
            if (r10 == 0) goto Lc4
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r10 = r10 & r7
            if (r10 == 0) goto L72
            goto L77
        L72:
            r10 = 268435456(0x10000000, float:2.524355E-29)
            r7 = r7 & r10
            if (r7 == 0) goto Lc4
        L77:
            boolean r7 = defpackage.fn9.f(r8)
            if (r7 != 0) goto Lc4
            k18 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            l24 r7 = (defpackage.l24) r7
            one.me.messages.list.loader.MessageModel r8 = r6.b()
            long r3 = r8.E0
            r0.d = r5
            r0.o = r6
            r0.X = r9
            r0.s0 = r2
            java.lang.Comparable r10 = r7.b(r3, r0)
            g84 r7 = defpackage.g84.a
            if (r10 != r7) goto L9c
            return r7
        L9c:
            r7 = r5
        L9d:
            ku3 r10 = (defpackage.ku3) r10
            r8 = 0
            if (r10 == 0) goto La9
            boolean r10 = r10.x()
            if (r10 != r2) goto La9
            goto Laa
        La9:
            r2 = r8
        Laa:
            bwf r7 = r7.b
            java.lang.Object r7 = r7.getValue()
            tde r7 = (defpackage.tde) r7
            d7c r6 = r6.b
            f7b r8 = r6.a
            int r8 = r8.h()
            r6.d(r8)
            java.lang.CharSequence r6 = r6.h
            android.text.Layout r6 = r7.a(r9, r6, r2)
            return r6
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2b.b(go8, int, int, int, q44):java.lang.Object");
    }

    public final boolean c(ho8 ho8Var, MessageModel messageModel, MessageModel messageModel2) {
        if (messageModel2 != null) {
            long j = messageModel2.a;
            long j2 = messageModel2.c;
            if (messageModel2.l() || messageModel2.z0 != null) {
                return false;
            }
            long j3 = messageModel.c;
            if ((j3 >= 0 || j2 <= 0) && (j3 <= 0 || j2 >= 0)) {
                d7c d7cVar = (d7c) ((c7c) this.d.getValue()).c.get(Long.valueOf(j));
                if (d7cVar == null) {
                    wqi.q(this.a, "PreProcessedData for message=MessageModel(" + j + ") is null", new Object[0]);
                    return false;
                }
                go8 go8Var = (go8) ho8Var;
                d7c d7cVar2 = go8Var.b;
                d7cVar2.e();
                mf4 mf4Var = d7cVar2.m;
                d7cVar.e();
                if (ml6.j(mf4Var, d7cVar.m) && messageModel.E0 == messageModel2.E0 && !d(ho8Var, messageModel, go8Var.b) && !d(ho8Var, messageModel2, d7cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0320 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final defpackage.go8 r25, defpackage.q44 r26) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2b.e(go8, q44):java.lang.Object");
    }
}

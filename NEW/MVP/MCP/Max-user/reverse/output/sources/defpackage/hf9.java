package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class hf9 extends xfh {
    public static final /* synthetic */ yy7[] K0 = {new z8a(hf9.class, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, hf9.class, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;"), new z8a(hf9.class, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;")};
    public final sc9 A0;
    public final t9f B0;
    public final t9f C0;
    public final t9f D0;
    public final LongSparseArray E0;
    public final tcf F0;
    public final hbd G0;
    public final ci5 H0;
    public final bwf I0;
    public final String J0;
    public final pb3 X;
    public final lzf Y;
    public final k18 Z;
    public final long b;
    public final long c;
    public final long d;
    public final age o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public hf9(long j, long j2, long j3) {
        gq9 gq9Var = gq9.a;
        age ageVar = (age) gq9Var.getAccessor().c(47);
        pb3 pb3Var = (pb3) gq9Var.getAccessor().c(46);
        lzf dispatchers = gq9Var.getDispatchers();
        k18 k18Var = fq9.a;
        bwf bwfVarD = gq9Var.getAccessor().d(109);
        bwf bwfVarD2 = gq9Var.getAccessor().d(138);
        bwf bwfVarD3 = gq9Var.getAccessor().d(110);
        bwf bwfVarD4 = gq9Var.getAccessor().d(HttpStatus.SC_MULTI_STATUS);
        bwf bwfVarD5 = gq9Var.getAccessor().d(360);
        bwf bwfVarD6 = gq9Var.getAccessor().d(349);
        bwf bwfVarD7 = gq9Var.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT);
        bwf bwfVarD8 = gq9Var.getAccessor().d(150);
        bwf bwfVarD9 = gq9Var.getAccessor().d(48);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = ageVar;
        this.X = pb3Var;
        this.Y = dispatchers;
        this.Z = bwfVarD;
        this.s0 = bwfVarD2;
        this.t0 = bwfVarD3;
        this.u0 = bwfVarD4;
        this.v0 = bwfVarD5;
        this.w0 = bwfVarD6;
        this.x0 = bwfVarD7;
        this.y0 = bwfVarD8;
        this.z0 = bwfVarD9;
        w5 w5Var = ((lr9) gq9Var.getAccessor().c(539)).a;
        this.A0 = new sc9(j2, j, (tw0) w5Var.c(49), (lzf) w5Var.c(8));
        this.B0 = c7j.c();
        this.C0 = c7j.c();
        this.D0 = c7j.c();
        this.E0 = new LongSparseArray();
        tcf tcfVarA = ucf.a(hd5.a);
        this.F0 = tcfVarA;
        this.G0 = new hbd(tcfVarA);
        this.H0 = new ci5(0);
        this.I0 = new bwf(new fr7(12, this));
        this.J0 = hf9.class.getName();
    }

    public static final void t(hf9 hf9Var) {
        tcf tcfVar = hf9Var.F0;
        LongSparseArray longSparseArray = hf9Var.E0;
        if (longSparseArray.size() == 0) {
            return;
        }
        List list = (List) tcfVar.getValue();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                tcfVar.m(null, arrayList);
                return;
            }
            t98 kc9Var = (t98) it.next();
            kc9 kc9Var2 = kc9Var instanceof kc9 ? (kc9) kc9Var : null;
            if (kc9Var2 != null) {
                long j = kc9Var2.a;
                if (longSparseArray.indexOfKey(j) >= 0) {
                    kc9 kc9Var3 = (kc9) kc9Var;
                    kc9Var = new kc9(kc9Var3.a, kc9Var3.b, kc9Var3.c, kc9Var3.d, kc9Var3.o, kc9Var3.X, kc9Var3.Y, (x8d) longSparseArray.get(j), kc9Var3.s0, kc9Var3.t0);
                }
            }
            arrayList.add(kc9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.hf9 r9, defpackage.pb2 r10, defpackage.q44 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.ze9
            if (r0 == 0) goto L13
            r0 = r11
            ze9 r0 = (defpackage.ze9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ze9 r0 = new ze9
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 3
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L4e
            if (r1 == r5) goto L44
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L34
            java.lang.Object r9 = r0.d
            f9a r9 = (defpackage.f9a) r9
            defpackage.g8j.b(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.d
            f9a r9 = (defpackage.f9a) r9
            defpackage.g8j.b(r11)
            goto L96
        L44:
            pb2 r10 = r0.o
            java.lang.Object r9 = r0.d
            hf9 r9 = (defpackage.hf9) r9
            defpackage.g8j.b(r11)
            goto L6a
        L4e:
            defpackage.g8j.b(r11)
            k18 r11 = r9.s0
            java.lang.Object r11 = r11.getValue()
            gx9 r11 = (defpackage.gx9) r11
            long r7 = r9.c
            r0.d = r9
            r0.o = r10
            r0.Z = r5
            bsd r11 = r11.a
            java.lang.Object r11 = r11.j(r7, r0)
            if (r11 != r6) goto L6a
            goto La6
        L6a:
            si9 r11 = (defpackage.si9) r11
            boolean r1 = r9.z()
            tcf r5 = r9.F0
            r7 = 0
            if (r1 == 0) goto Lac
            if (r11 != 0) goto L78
            goto Lac
        L78:
            rf2 r1 = r10.b
            int r1 = r1.c()
            rf2 r8 = r10.b
            java.util.Map r8 = r8.e
            int r8 = r8.size()
            if (r1 > r8) goto L9a
            r0.d = r5
            r0.o = r7
            r0.Z = r4
            java.io.Serializable r11 = r9.x(r10, r0, r11)
            if (r11 != r6) goto L95
            goto La6
        L95:
            r9 = r5
        L96:
            r9.setValue(r11)
            return r2
        L9a:
            r0.d = r5
            r0.o = r7
            r0.Z = r3
            java.io.Serializable r11 = r9.y(r10, r0, r11)
            if (r11 != r6) goto La7
        La6:
            return r6
        La7:
            r9 = r5
        La8:
            r9.setValue(r11)
            return r2
        Lac:
            hd5 r9 = defpackage.hd5.a
            r5.m(r7, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.u(hf9, pb2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.hf9 r7, defpackage.pb2 r8, defpackage.q44 r9) {
        /*
            qqg r0 = defpackage.qqg.a
            boolean r1 = r9 instanceof defpackage.bf9
            if (r1 == 0) goto L15
            r1 = r9
            bf9 r1 = (defpackage.bf9) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            bf9 r1 = new bf9
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            hf9 r7 = r1.d
            defpackage.g8j.b(r9)
            goto L56
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.g8j.b(r9)
            java.lang.String r9 = r7.J0
            java.lang.String r3 = "load reactions"
            defpackage.wqi.d(r9, r3)
            lzf r9 = r7.Y
            q2b r9 = (defpackage.q2b) r9
            z74 r9 = r9.b()
            cf9 r3 = new cf9
            r3.<init>(r7, r8, r5)
            r1.d = r7
            r1.Y = r4
            java.lang.Object r9 = defpackage.svi.i(r9, r3, r1)
            if (r9 != r2) goto L56
            return r2
        L56:
            zl9 r9 = (defpackage.zl9) r9
            java.lang.String r8 = r7.J0
            l6b r1 = defpackage.wqi.a
            if (r1 != 0) goto L5f
            goto L87
        L5f:
            lg8 r2 = defpackage.lg8.d
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L87
            if (r9 == 0) goto L75
            java.lang.Object r3 = r9.a
            int r3 = r3.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            goto L76
        L75:
            r4 = r5
        L76:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "reactions count: "
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.c(r2, r8, r3, r5)
        L87:
            if (r9 != 0) goto L8a
            goto Lab
        L8a:
            android.util.LongSparseArray r8 = r7.E0
            r8.clear()
            java.lang.Object r8 = r9.a
            java.util.Iterator r8 = r8.iterator()
        L95:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lab
            java.lang.Object r9 = r8.next()
            tl9 r9 = (defpackage.tl9) r9
            android.util.LongSparseArray r1 = r7.E0
            long r2 = r9.a
            x8d r9 = r9.b
            r1.put(r2, r9)
            goto L95
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.v(hf9, pb2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.q44 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.df9
            if (r0 == 0) goto L13
            r0 = r6
            df9 r0 = (defpackage.df9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            df9 r0 = new df9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            hf9 r1 = r0.o
            hf9 r0 = r0.d
            defpackage.g8j.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.g8j.b(r6)
            k18 r6 = r5.t0
            java.lang.Object r6 = r6.getValue()
            klc r6 = (defpackage.klc) r6
            pb3 r1 = r5.X
            w4e r1 = (defpackage.w4e) r1
            long r3 = r1.s()
            r0.d = r5
            r0.o = r5
            r0.Z = r2
            java.lang.Object r6 = r6.a(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L53
            return r0
        L53:
            r0 = r5
            r1 = r0
        L55:
            xac r6 = (defpackage.xac) r6
            ku3 r6 = r6.d
            gx3 r6 = defpackage.po8.r(r6)
            k18 r2 = r0.x0
            java.lang.Object r2 = r2.getValue()
            f8c r2 = (defpackage.f8c) r2
            pb3 r0 = r0.X
            w4e r0 = (defpackage.w4e) r0
            long r3 = r0.s()
            b8c r0 = r2.a(r3)
            c8c r0 = defpackage.po8.k(r0)
            ar2 r2 = new ar2
            r3 = 0
            r2.<init>(r6, r0, r3)
            kc9 r6 = r1.B(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.A(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kc9 B(defpackage.ar2 r25) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.B(ar2):kc9");
    }

    @Override // defpackage.xfh
    public final void s() {
        this.E0.clear();
        sc9 sc9Var = this.A0;
        sc9Var.c.f(sc9Var);
    }

    public final pb2 w() {
        return (pb2) ((w63) this.Z.getValue()).j(this.b).a.getValue();
    }

    /* JADX WARN: Path cross not found for [B:21:0x00a5, B:25:0x00ad], limit reached: 100 */
    /* JADX WARN: Path cross not found for [B:25:0x00ad, B:21:0x00a5], limit reached: 100 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x019a -> B:63:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable x(defpackage.pb2 r18, defpackage.q44 r19, defpackage.si9 r20) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.x(pb2, q44, si9):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable y(defpackage.pb2 r10, defpackage.q44 r11, defpackage.si9 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf9.y(pb2, q44, si9):java.io.Serializable");
    }

    public final boolean z() {
        pb2 pb2VarW = w();
        if (pb2VarW == null) {
            return false;
        }
        rf2 rf2Var = pb2VarW.b;
        return (pb2VarW.Q() || pb2VarW.M() || this.d == 0 || rf2Var.c() > ((Number) this.I0.getValue()).intValue() || rf2Var.c() <= 1) ? false : true;
    }
}

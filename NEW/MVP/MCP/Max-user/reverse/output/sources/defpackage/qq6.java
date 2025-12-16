package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qq6 extends dtf implements sm6 {
    public final /* synthetic */ vd8 X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ tq6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq6(tq6 tq6Var, vd8 vd8Var, List list, Continuation continuation) {
        super(2, continuation);
        this.o = tq6Var;
        this.X = vd8Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qq6(this.o, this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            defpackage.g8j.b(r19)
            tq6 r1 = r0.o
            xo6 r2 = r1.b
            boolean r3 = r2.b
            r4 = 0
            vd8 r7 = r0.X
            if (r3 != 0) goto L17
            ud8 r3 = r7.v0
            ud8 r5 = defpackage.ud8.d
            if (r3 != r5) goto L17
            return r4
        L17:
            java.util.List r3 = r0.Y
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r3.next()
            r6 = r5
            fce r6 = (defpackage.fce) r6
            pd8 r6 = r6.a
            android.net.Uri r8 = r7.b
            android.net.Uri r6 = r6.c()
            boolean r6 = defpackage.goi.a(r8, r6)
            if (r6 == 0) goto L1d
            goto L3a
        L39:
            r5 = r4
        L3a:
            fce r5 = (defpackage.fce) r5
            if (r5 == 0) goto L46
            zub r3 = r5.c
            if (r3 == 0) goto L46
            android.net.Uri r3 = r3.o
            r11 = r3
            goto L47
        L46:
            r11 = r4
        L47:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            r8 = 0
            if (r3 < r6) goto L50
        L4e:
            r3 = r8
            goto L58
        L50:
            java.lang.Integer r3 = r7.X
            if (r3 == 0) goto L4e
            int r3 = r3.intValue()
        L58:
            android.net.Uri r6 = r7.u0
            if (r5 == 0) goto L84
            pd8 r9 = r5.a
            zub r10 = r5.c
            boolean r10 = defpackage.zub.b(r10, r9)
            if (r10 == 0) goto L84
            zub r3 = r5.c
            android.net.Uri r3 = defpackage.zub.a(r3, r9)
            if (r3 == 0) goto L81
            java.lang.String r10 = r3.getPath()
            if (r10 == 0) goto L81
            java.lang.String r9 = r9.c
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L81
            r17 = r3
        L7e:
            r16 = r8
            goto L88
        L81:
            r17 = r6
            goto L7e
        L84:
            r16 = r3
            r17 = r6
        L88:
            boolean r6 = r2.c
            qp6 r2 = r1.x0
            ynd r8 = r2.g
            dce r1 = r1.E0
            pd8 r2 = defpackage.nqi.b(r7)
            int r12 = r1.g(r2)
            if (r5 == 0) goto L9e
            p2h r1 = r5.b
            r10 = r1
            goto L9f
        L9e:
            r10 = r4
        L9f:
            if (r5 == 0) goto La3
            zub r4 = r5.c
        La3:
            r9 = r4
            op6 r5 = new op6
            r13 = 1
            long r14 = r7.a
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq6.n(java.lang.Object):java.lang.Object");
    }
}

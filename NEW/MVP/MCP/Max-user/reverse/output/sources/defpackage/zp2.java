package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zp2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp2(yq2 yq2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zp2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zp2(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r12 == r8) goto L25;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            yq2 r0 = r11.X
            ci5 r1 = r0.U0
            int r2 = r11.o
            qqg r3 = defpackage.qqg.a
            long r4 = r11.Y
            r6 = 2
            r7 = 1
            g84 r8 = defpackage.g84.a
            if (r2 == 0) goto L24
            if (r2 == r7) goto L20
            if (r2 != r6) goto L18
            defpackage.g8j.b(r12)
            goto L7a
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            defpackage.g8j.b(r12)
            goto L38
        L24:
            defpackage.g8j.b(r12)
            k18 r12 = r0.J0
            java.lang.Object r12 = r12.getValue()
            vr6 r12 = (defpackage.vr6) r12
            r11.o = r7
            java.lang.Object r12 = defpackage.vr6.a(r12, r4, r11)
            if (r12 != r8) goto L38
            goto L79
        L38:
            ku3 r12 = (defpackage.ku3) r12
            k18 r2 = r0.K0
            java.lang.Object r2 = r2.getValue()
            pb3 r2 = (defpackage.pb3) r2
            w4e r2 = (defpackage.w4e) r2
            long r9 = r2.s()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r7 = 6
            r9 = 0
            if (r2 != 0) goto L5e
            vh5 r12 = new vh5
            int r0 = defpackage.mvd.H1
            n5g r2 = new n5g
            r2.<init>(r0)
            r12.<init>(r2, r9, r7)
            defpackage.xfh.r(r1, r12)
            return r3
        L5e:
            if (r12 == 0) goto L9c
            int r2 = r12.m()
            if (r2 != 0) goto L9c
            boolean r12 = r12.B()
            if (r12 == 0) goto L6d
            goto L9c
        L6d:
            w63 r12 = r0.D()
            r11.o = r6
            java.lang.Object r12 = r12.p(r4, r11)
            if (r12 != r8) goto L7a
        L79:
            return r8
        L7a:
            pb2 r12 = (defpackage.pb2) r12
            ci5 r0 = r0.V0
            ko2 r1 = defpackage.ko2.c
            long r4 = r12.a
            r1.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r12.<init>(r1)
            r12.append(r4)
            java.lang.String r1 = "&type=local"
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            defpackage.xc0.l(r12, r0)
            return r3
        L9c:
            vh5 r12 = new vh5
            int r0 = defpackage.l7b.P0
            n5g r2 = new n5g
            r2.<init>(r0)
            r12.<init>(r2, r9, r7)
            defpackage.xfh.r(r1, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp2.n(java.lang.Object):java.lang.Object");
    }
}

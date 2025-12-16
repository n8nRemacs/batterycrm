package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vc2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sd2 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc2(sd2 sd2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = sd2Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vc2) l((jfc) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vc2 vc2Var = new vc2(this.Y, this.Z, continuation);
        vc2Var.X = obj;
        return vc2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            sd2 r0 = r10.Y
            jve r1 = r0.f
            int r2 = r10.o
            r3 = 2
            r4 = 1
            qqg r5 = defpackage.qqg.a
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.g8j.b(r11)
            return r5
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            defpackage.g8j.b(r11)
            return r5
        L20:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            jfc r11 = (defpackage.jfc) r11
            boolean r2 = r11 instanceof defpackage.ffc
            if (r2 == 0) goto Lac
            ffc r11 = (defpackage.ffc) r11
            long r6 = r11.a
            java.util.concurrent.atomic.AtomicLong r11 = r0.x
            long r8 = r11.get()
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            g84 r2 = defpackage.g84.a
            if (r11 != 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r11 = r0.A
            r3 = 0
            r11.set(r3)
            pb2 r11 = r0.p()
            if (r11 != 0) goto L48
            goto Lac
        L48:
            defpackage.sd2.m(r0, r11)
            cfc r0 = r0.j
            cfc r3 = defpackage.cfc.b
            if (r0 != r3) goto Lac
            boolean r11 = r11.M()
            if (r11 == 0) goto Lac
            xcc r11 = new xcc
            long r6 = r10.Z
            r11.<init>(r6)
            r10.o = r4
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r2) goto Lac
            goto L97
        L67:
            java.util.concurrent.atomic.AtomicLong r11 = r0.z
            long r8 = r11.get()
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L98
            pb2 r11 = r0.p()
            if (r11 != 0) goto L78
            goto Lac
        L78:
            defpackage.sd2.m(r0, r11)
            cdc r11 = new cdc
            int r0 = defpackage.u8b.e2
            n5g r4 = new n5g
            r4.<init>(r0)
            int r0 = defpackage.yud.A
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            r0 = 6
            r11.<init>(r4, r6, r0)
            r10.o = r3
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r2) goto Lac
        L97:
            return r2
        L98:
            java.util.concurrent.atomic.AtomicLong r11 = r0.y
            long r1 = r11.get()
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 != 0) goto Lac
            pb2 r11 = r0.p()
            if (r11 != 0) goto La9
            goto Lac
        La9:
            defpackage.sd2.m(r0, r11)
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc2.n(java.lang.Object):java.lang.Object");
    }
}

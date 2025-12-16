package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tt9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ vu9 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tt9 tt9Var = new tt9(this.Z, this.Y, continuation);
        tt9Var.X = obj;
        return tt9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.o
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            qqg r5 = defpackage.qqg.a
            vu9 r6 = r11.Z
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L24
            if (r0 == r3) goto L20
            if (r0 != r2) goto L18
            defpackage.g8j.b(r12)
            return r5
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            defpackage.g8j.b(r12)
            goto L70
        L24:
            java.lang.Object r0 = r11.X
            bs4 r0 = (defpackage.bs4) r0
            defpackage.g8j.b(r12)
            goto L65
        L2c:
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r11.X
            f84 r12 = (defpackage.f84) r12
            java.util.List r0 = r11.Y
            java.lang.Object r0 = defpackage.ue3.I(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L99
            long r8 = r0.longValue()
            lzf r0 = r6.X
            q2b r0 = (defpackage.q2b) r0
            z74 r0 = r0.b()
            st9 r10 = new st9
            r10.<init>(r6, r8, r1)
            cs4 r0 = defpackage.svi.b(r12, r0, r10, r3)
            k18 r12 = r6.M0
            java.lang.Object r12 = r12.getValue()
            bl9 r12 = (defpackage.bl9) r12
            r11.X = r0
            r11.o = r4
            java.lang.Object r12 = r12.a(r8, r11)
            if (r12 != r7) goto L65
            goto L98
        L65:
            r11.X = r1
            r11.o = r3
            java.lang.Object r12 = r0.c(r11)
            if (r12 != r7) goto L70
            goto L98
        L70:
            si9 r12 = (defpackage.si9) r12
            if (r12 == 0) goto L99
            yy7[] r0 = defpackage.vu9.U1
            csg r0 = r6.F()
            long r3 = r12.c
            r8 = 1
            long r3 = r3 - r8
            r11.o = r2
            ci5 r12 = r0.f
            jve r12 = r12.b
            zrg r0 = new zrg
            r0.<init>(r3)
            java.lang.Object r12 = r12.a(r0, r11)
            if (r12 != r7) goto L91
            goto L92
        L91:
            r12 = r5
        L92:
            if (r12 != r7) goto L95
            goto L96
        L95:
            r12 = r5
        L96:
            if (r12 != r7) goto L99
        L98:
            return r7
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt9.n(java.lang.Object):java.lang.Object");
    }
}

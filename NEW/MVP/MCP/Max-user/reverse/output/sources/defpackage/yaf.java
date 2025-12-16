package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class yaf extends dtf implements sm6 {
    public final /* synthetic */ StartConversationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaf(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.X = startConversationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yaf yafVar = (yaf) l((nx3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yafVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yaf yafVar = new yaf(continuation, this.X);
        yafVar.o = obj;
        return yafVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.o
            nx3 r13 = (defpackage.nx3) r13
            one.me.startconversation.StartConversationScreen r0 = r12.X
            b0i r1 = r0.B0
            ji0 r2 = r0.A0
            b0i r3 = r0.z0
            ji0 r4 = r0.D0
            fb6 r5 = r0.x0
            hd5 r6 = defpackage.hd5.a
            r5.E(r6)
            ji0 r7 = r0.C0
            r7.E(r6)
            ji0 r8 = r0.y0
            r8.E(r6)
            nbf r9 = r0.z0()
            q24 r9 = r9.w0
            hbd r9 = r9.i
            mcf r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            nx3 r9 = (defpackage.nx3) r9
            boolean r9 = r9.b()
            if (r9 == 0) goto L7b
            hs r9 = r0.o
            yy7[] r10 = one.me.startconversation.StartConversationScreen.H0
            r11 = 2
            r10 = r10[r11]
            java.lang.Object r9 = r9.a(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7b
            k18 r9 = r0.v0
            java.lang.Object r9 = r9.getValue()
            qsb r9 = (defpackage.qsb) r9
            java.lang.String[] r10 = defpackage.qsb.f
            boolean r9 = r9.c(r10)
            u14 r10 = new u14
            int r11 = defpackage.yud.a
            int r11 = defpackage.v1b.a
            if (r9 == 0) goto L64
            int r11 = defpackage.v1b.s
            goto L66
        L64:
            int r11 = defpackage.v1b.r
        L66:
            if (r9 == 0) goto L6a
            r9 = 0
            goto L70
        L6a:
            int r9 = defpackage.v1b.q
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L70:
            r10.<init>(r11, r9)
            java.util.List r9 = java.util.Collections.singletonList(r10)
            r4.E(r9)
            goto L7e
        L7b:
            r4.E(r6)
        L7e:
            java.lang.CharSequence r4 = r0.y0()
            qqg r9 = defpackage.qqg.a
            if (r4 == 0) goto L9d
            int r4 = r4.length()
            if (r4 != 0) goto L8d
            goto L9d
        L8d:
            java.util.List r0 = r13.a
            r3.E(r0)
            java.util.List r0 = r13.b
            r2.E(r0)
            java.util.List r13 = r13.c
            r1.E(r13)
            return r9
        L9d:
            nbf r13 = r0.z0()
            hbd r13 = r13.y0
            mcf r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            r5.E(r13)
            java.util.List r13 = defpackage.lni.b()
            r7.E(r13)
            nbf r13 = r0.z0()
            hbd r13 = r13.v0
            mcf r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            nx3 r13 = (defpackage.nx3) r13
            java.util.List r13 = r13.a
            r3.E(r13)
            r2.E(r6)
            nbf r13 = r0.z0()
            hbd r13 = r13.v0
            mcf r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            nx3 r13 = (defpackage.nx3) r13
            java.util.List r13 = r13.c
            r1.E(r13)
            k18 r13 = r0.s0
            java.lang.Object r13 = r13.getValue()
            zh0 r13 = (defpackage.zh0) r13
            hbd r13 = r13.Z
            mcf r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            r8.E(r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yaf.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class cv8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cv8 cv8Var = (cv8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cv8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cv8 cv8Var = new cv8(continuation, this.X);
        cv8Var.o = obj;
        return cv8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r8.o
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0 = 1
            r1 = 0
            one.me.chatscreen.mediabar.MediaBarWidget r2 = r8.X
            if (r9 != 0) goto L20
            yy7[] r9 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            mu8 r9 = r2.N0()
            boolean r9 = r9.v()
            if (r9 == 0) goto L1e
            goto L20
        L1e:
            r9 = r1
            goto L21
        L20:
            r9 = r0
        L21:
            yy7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            o6c r3 = r2.J0()
            m6c r3 = r3.getScrollState()
            m6c r4 = defpackage.m6c.a
            if (r3 != r4) goto L31
            r3 = r0
            goto L32
        L31:
            r3 = r1
        L32:
            ik9 r4 = r2.I0()
            r5 = 8
            if (r9 == 0) goto L3c
            r6 = r1
            goto L3d
        L3c:
            r6 = r5
        L3d:
            r4.setVisibility(r6)
            sn0 r4 = r2.O0
            yy7[] r6 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r7 = 16
            r6 = r6[r7]
            java.lang.Object r4 = r4.getValue()
            f82 r4 = (defpackage.f82) r4
            if (r9 != 0) goto L51
            goto L52
        L51:
            r1 = r5
        L52:
            r4.setVisibility(r1)
            ytd r1 = r2.H0()
            boolean r1 = r1.n()
            if (r1 == 0) goto L6d
            if (r9 == 0) goto L63
            if (r3 == 0) goto L6d
        L63:
            mu8 r9 = r2.N0()
            s7c r9 = r9.w0
            r9.E(r0)
            goto L80
        L6d:
            if (r9 == 0) goto L71
            if (r3 == 0) goto L80
        L71:
            int r9 = defpackage.xz7.a
            int r9 = defpackage.xz7.c
            boolean r9 = defpackage.xz7.b(r9)
            if (r9 == 0) goto L80
            og6 r9 = r2.Z0
            r9.k()
        L80:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv8.n(java.lang.Object):java.lang.Object");
    }
}

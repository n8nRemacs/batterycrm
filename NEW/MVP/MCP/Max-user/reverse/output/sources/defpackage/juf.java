package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class juf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ quf Y;
    public final /* synthetic */ l2h Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juf(quf qufVar, l2h l2hVar, Continuation continuation) {
        super(2, continuation);
        this.Y = qufVar;
        this.Z = l2hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((juf) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        juf jufVar = new juf(this.Y, this.Z, continuation);
        jufVar.X = obj;
        return jufVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (((defpackage.pac) r0).a.h(r11, r10) != r5) goto L22;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.o
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L24
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            defpackage.g8j.b(r11)
            goto L69
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r0 = r10.X
            sac r0 = (defpackage.sac) r0
            defpackage.g8j.b(r11)
            goto L5a
        L24:
            java.lang.Object r0 = r10.X
            sac r0 = (defpackage.sac) r0
            defpackage.g8j.b(r11)
            goto L4d
        L2c:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            sac r11 = (defpackage.sac) r11
            r10.X = r11
            r10.o = r4
            quf r0 = r10.Y
            n9a r4 = r0.f
            muf r6 = new muf
            r7 = 1
            l2h r8 = r10.Z
            r6.<init>(r0, r8, r1, r7)
            java.lang.Object r0 = defpackage.oxi.b(r4, r1, r6, r10)
            if (r0 != r5) goto L4a
            goto L68
        L4a:
            r9 = r0
            r0 = r11
            r11 = r9
        L4d:
            bs4 r11 = (defpackage.bs4) r11
            r10.X = r0
            r10.o = r3
            java.lang.Object r11 = r11.c(r10)
            if (r11 != r5) goto L5a
            goto L68
        L5a:
            r10.X = r1
            r10.o = r2
            pac r0 = (defpackage.pac) r0
            pv0 r0 = r0.a
            java.lang.Object r11 = r0.h(r11, r10)
            if (r11 != r5) goto L69
        L68:
            return r5
        L69:
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juf.n(java.lang.Object):java.lang.Object");
    }
}

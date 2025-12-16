package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tm2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wm2 Y;
    public final /* synthetic */ fh2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm2(wm2 wm2Var, fh2 fh2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wm2Var;
        this.Z = fh2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tm2) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tm2 tm2Var = new tm2(this.Y, this.Z, continuation);
        tm2Var.X = obj;
        return tm2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.a(r5, r4) == r3) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r5)
            goto L4d
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r0 = r4.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r5)
            goto L41
        L20:
            defpackage.g8j.b(r5)
            java.lang.Object r5 = r4.X
            r0 = r5
            z26 r0 = (defpackage.z26) r0
            wm2 r5 = r4.Y
            java.lang.Object r5 = r5.i
            k18 r5 = (defpackage.k18) r5
            java.lang.Object r5 = r5.getValue()
            hwa r5 = (defpackage.hwa) r5
            r4.X = r0
            r4.o = r2
            fh2 r2 = r4.Z
            java.lang.Object r5 = r5.F(r2, r4)
            if (r5 != r3) goto L41
            goto L4c
        L41:
            r2 = 0
            r4.X = r2
            r4.o = r1
            java.lang.Object r5 = r0.a(r5, r4)
            if (r5 != r3) goto L4d
        L4c:
            return r3
        L4d:
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm2.n(java.lang.Object):java.lang.Object");
    }
}

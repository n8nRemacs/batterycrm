package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class au9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ List Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((au9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new au9(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (defpackage.svi.i(r8, r0, r7) == r4) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            r1 = 2
            r2 = 1
            vu9 r3 = r7.X
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r8)
            goto L57
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.g8j.b(r8)
            goto L38
        L1e:
            defpackage.g8j.b(r8)
            k18 r8 = r3.J0
            java.lang.Object r8 = r8.getValue()
            ix9 r8 = (defpackage.ix9) r8
            cw9 r0 = r3.b
            long r5 = r0.a
            r7.o = r2
            java.util.List r0 = r7.Y
            java.lang.Object r8 = r8.a(r5, r7, r0)
            if (r8 != r4) goto L38
            goto L56
        L38:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L57
            lzf r8 = r3.X
            q2b r8 = (defpackage.q2b) r8
            wl8 r8 = r8.c()
            zt9 r0 = new zt9
            r2 = 0
            r0.<init>(r3, r2)
            r7.o = r1
            java.lang.Object r8 = defpackage.svi.i(r8, r0, r7)
            if (r8 != r4) goto L57
        L56:
            return r4
        L57:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au9.n(java.lang.Object):java.lang.Object");
    }
}

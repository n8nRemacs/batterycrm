package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l9 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ m9 Y;
    public final /* synthetic */ Set Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(int i, m9 m9Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = m9Var;
        this.Z = set;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l9(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r12.a(r0, r11) == r4) goto L19;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.o
            r1 = 2
            m9 r2 = r11.Y
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1b
            if (r0 != r1) goto L13
            defpackage.g8j.b(r12)
            r8 = r11
            goto L57
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            defpackage.g8j.b(r12)
            r8 = r11
            goto L4a
        L20:
            defpackage.g8j.b(r12)
            int r12 = r11.X
            int r0 = defpackage.v8b.i
            if (r12 != r0) goto L2b
            r10 = r3
            goto L2d
        L2b:
            r12 = 0
            r10 = r12
        L2d:
            yy7[] r12 = defpackage.m9.i
            k18 r12 = r2.b
            java.lang.Object r12 = r12.getValue()
            r5 = r12
            w63 r5 = (defpackage.w63) r5
            long r6 = r2.a
            java.util.Set r12 = r11.Z
            java.util.List r9 = defpackage.ue3.d0(r12)
            r11.o = r3
            r8 = r11
            java.lang.Object r12 = r5.d(r6, r8, r9, r10)
            if (r12 != r4) goto L4a
            goto L56
        L4a:
            jve r12 = r2.e
            jc3 r0 = defpackage.jc3.b
            r8.o = r1
            java.lang.Object r12 = r12.a(r0, r11)
            if (r12 != r4) goto L57
        L56:
            return r4
        L57:
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9.n(java.lang.Object):java.lang.Object");
    }
}

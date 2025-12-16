package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ee1 extends dtf implements um6 {
    public /* synthetic */ z26 X;
    public /* synthetic */ Object[] Y;
    public final /* synthetic */ f84 Z;
    public int o;
    public final /* synthetic */ List s0;
    public final /* synthetic */ he1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(Continuation continuation, f84 f84Var, List list, he1 he1Var) {
        super(3, continuation);
        this.Z = f84Var;
        this.s0 = list;
        this.t0 = he1Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ee1 ee1Var = new ee1((Continuation) obj3, this.Z, this.s0, this.t0);
        ee1Var.X = (z26) obj;
        ee1Var.Y = (Object[]) obj2;
        return ee1Var.n(qqg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r6.t(r5, r7, r11) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r12.a(r0, r11) == r4) goto L30;
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
            r2 = 0
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r12)
            goto L8d
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object[] r0 = r11.Y
            ku3[] r0 = (defpackage.ku3[]) r0
            z26 r3 = r11.X
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L7f
            goto L7f
        L24:
            defpackage.g8j.b(r12)
            z26 r12 = r11.X
            java.lang.Object[] r0 = r11.Y
            ku3[] r0 = (defpackage.ku3[]) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.length
            r7 = 0
            r8 = r7
        L35:
            if (r7 >= r6) goto L54
            r9 = r0[r7]
            int r10 = r8 + 1
            boolean r9 = defpackage.u5j.h(r9)
            if (r9 == 0) goto L4a
            java.util.List r9 = r11.s0
            java.lang.Object r8 = r9.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            goto L4b
        L4a:
            r8 = r2
        L4b:
            if (r8 == 0) goto L50
            r5.add(r8)
        L50:
            int r7 = r7 + 1
            r8 = r10
            goto L35
        L54:
            n8a r5 = defpackage.dsi.i(r5)
            boolean r6 = r5.j()
            if (r6 == 0) goto L80
            he1 r6 = r11.t0     // Catch: java.lang.Throwable -> L7e
            k18 r6 = r6.t0     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L7e
            k1a r6 = (defpackage.k1a) r6     // Catch: java.lang.Throwable -> L7e
            int r7 = defpackage.s65.d     // Catch: java.lang.Throwable -> L7e
            y65 r7 = defpackage.y65.SECONDS     // Catch: java.lang.Throwable -> L7e
            r8 = 5
            long r7 = defpackage.v9j.h(r8, r7)     // Catch: java.lang.Throwable -> L7e
            r11.X = r12     // Catch: java.lang.Throwable -> L7e
            r11.Y = r0     // Catch: java.lang.Throwable -> L7e
            r11.o = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r3 = r6.t(r5, r7, r11)     // Catch: java.lang.Throwable -> L7e
            if (r3 != r4) goto L7e
            goto L8c
        L7e:
            r3 = r12
        L7f:
            r12 = r3
        L80:
            r11.X = r2
            r11.Y = r2
            r11.o = r1
            java.lang.Object r12 = r12.a(r0, r11)
            if (r12 != r4) goto L8d
        L8c:
            return r4
        L8d:
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee1.n(java.lang.Object):java.lang.Object");
    }
}

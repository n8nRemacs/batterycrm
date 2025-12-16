package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v1e extends dtf implements sm6 {
    public String X;
    public int Y;
    public final /* synthetic */ long Z;
    public Set o;
    public final /* synthetic */ d2e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1e(long j, d2e d2eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = d2eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v1e) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v1e(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r1.d(r3, r11) != r9) goto L37;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            d2e r0 = r11.s0
            at1 r1 = r0.a
            int r2 = r11.Y
            long r3 = r11.Z
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            g84 r9 = defpackage.g84.a
            if (r2 == 0) goto L31
            if (r2 == r7) goto L2b
            if (r2 == r6) goto L23
            if (r2 != r5) goto L1b
            defpackage.g8j.b(r12)
            goto La3
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.String r2 = r11.X
            java.util.Set r3 = r11.o
            defpackage.g8j.b(r12)
            goto L70
        L2b:
            java.util.Set r2 = r11.o
            defpackage.g8j.b(r12)
            goto L4b
        L31:
            defpackage.g8j.b(r12)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r3)
            java.util.Set r12 = java.util.Collections.singleton(r12)
            r11.o = r12
            r11.Y = r7
            java.lang.Object r2 = r1.b(r12, r11)
            if (r2 != r9) goto L48
            goto La2
        L48:
            r10 = r2
            r2 = r12
            r12 = r10
        L4b:
            java.util.Map r12 = (java.util.Map) r12
            java.util.Collection r12 = r12.values()
            java.lang.Object r12 = defpackage.ue3.H(r12)
            gs1 r12 = (defpackage.gs1) r12
            if (r12 == 0) goto L5e
            java.lang.String r12 = r12.getName()
            goto L5f
        L5e:
            r12 = r8
        L5f:
            r11.o = r2
            r11.X = r12
            r11.Y = r6
            java.lang.Object r3 = r1.c(r3, r11)
            if (r3 != r9) goto L6c
            goto La2
        L6c:
            r10 = r2
            r2 = r12
            r12 = r3
            r3 = r10
        L70:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L96
            if (r2 == 0) goto L96
            boolean r12 = defpackage.vmf.F(r2)
            if (r12 == 0) goto L81
            goto L96
        L81:
            tcf r12 = r0.s0
        L83:
            java.lang.Object r0 = r12.getValue()
            r1 = r0
            e2e r1 = (defpackage.e2e) r1
            r3 = 7
            e2e r1 = defpackage.e2e.a(r1, r8, r8, r2, r3)
            boolean r0 = r12.c(r0, r1)
            if (r0 == 0) goto L83
            goto La3
        L96:
            r11.o = r8
            r11.X = r8
            r11.Y = r5
            java.lang.Object r12 = r1.d(r3, r11)
            if (r12 != r9) goto La3
        La2:
            return r9
        La3:
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1e.n(java.lang.Object):java.lang.Object");
    }
}

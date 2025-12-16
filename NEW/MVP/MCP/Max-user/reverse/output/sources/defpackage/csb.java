package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class csb extends dtf implements sm6 {
    public final /* synthetic */ esb X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csb(esb esbVar, Continuation continuation) {
        super(2, continuation);
        this.X = esbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((csb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new csb(this.X, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.o
            r2 = 3
            r3 = 2
            r4 = 1
            qqg r5 = defpackage.qqg.a
            esb r6 = r0.X
            g84 r7 = defpackage.g84.a
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            defpackage.g8j.b(r17)
            return r5
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            defpackage.g8j.b(r17)
            goto L86
        L25:
            defpackage.g8j.b(r17)
            return r5
        L29:
            defpackage.g8j.b(r17)
            pb3 r1 = r6.b
            pe8 r1 = (defpackage.pe8) r1
            fde r8 = r1.N0
            yy7[] r9 = defpackage.pe8.U0
            r10 = 27
            r9 = r9[r10]
            java.lang.Object r1 = r8.D(r1, r9)
            java.lang.Number r1 = (java.lang.Number) r1
            long r8 = r1.longValue()
            r10 = -1
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L53
            pv0 r1 = r6.d
            r0.o = r4
            java.lang.Object r1 = r1.h(r5, r0)
            if (r1 != r7) goto L91
            goto L90
        L53:
            java.time.ZoneOffset r1 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.now(r1)
            java.time.Instant r1 = r1.toInstant()
            long r10 = r1.toEpochMilli()
            rt5 r1 = r6.a
            gu5 r1 = (defpackage.gu5) r1
            cu5 r1 = r1.p
            java.lang.Object r1 = r1.f()
            java.lang.Number r1 = (java.lang.Number) r1
            long r12 = r1.longValue()
            r1 = 1000(0x3e8, float:1.401E-42)
            long r14 = (long) r1
            long r12 = r12 * r14
            long r12 = r12 + r8
            r8 = 0
            long r12 = r12 - r10
            long r8 = java.lang.Math.max(r8, r12)
            r0.o = r3
            java.lang.Object r1 = defpackage.s8j.c(r8, r0)
            if (r1 != r7) goto L86
            goto L90
        L86:
            pv0 r1 = r6.d
            r0.o = r2
            java.lang.Object r1 = r1.h(r5, r0)
            if (r1 != r7) goto L91
        L90:
            return r7
        L91:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dif extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ fif Y;
    public ahf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dif(fif fifVar, Continuation continuation) {
        super(2, continuation);
        this.Y = fifVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dif) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dif(this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r12 == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.X
            r1 = 2
            r2 = 1
            fif r3 = r11.Y
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            ahf r0 = r11.o
            defpackage.g8j.b(r12)
            r9 = r11
            goto L62
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            defpackage.g8j.b(r12)
            r9 = r11
            goto L46
        L22:
            defpackage.g8j.b(r12)
            java.util.concurrent.atomic.AtomicReference r12 = r3.f
            java.lang.Object r12 = r12.get()
            java.lang.Long r12 = (java.lang.Long) r12
            k18 r0 = r3.b
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            ehf r5 = (defpackage.ehf) r5
            long r7 = r12.longValue()
            r11.X = r2
            r6 = 0
            r10 = 5
            r9 = r11
            java.lang.Object r12 = defpackage.ehf.d(r5, r6, r7, r9, r10)
            if (r12 != r4) goto L46
            goto L61
        L46:
            r0 = r12
            ahf r0 = (defpackage.ahf) r0
            k18 r12 = r3.a
            java.lang.Object r12 = r12.getValue()
            igf r12 = (defpackage.igf) r12
            java.util.List r2 = r0.a
            m2f r12 = r12.b(r2)
            r9.o = r0
            r9.X = r1
            java.lang.Object r12 = defpackage.n8j.b(r12, r11)
            if (r12 != r4) goto L62
        L61:
            return r4
        L62:
            java.util.List r12 = (java.util.List) r12
            java.util.concurrent.atomic.AtomicReference r1 = r3.f
            cif r2 = new cif
            r4 = 0
            r2.<init>(r0, r4)
            r1.updateAndGet(r2)
            tcf r0 = r3.d
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r12 = defpackage.ue3.T(r1, r12)
            r1 = 0
            r0.m(r1, r12)
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.n(java.lang.Object):java.lang.Object");
    }
}

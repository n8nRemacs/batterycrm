package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t96 extends dtf implements sm6 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ ca6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t96(Set set, ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t96(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (defpackage.ca6.u(r6, r5) == r0) goto L30;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r5.o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.g8j.b(r6)
            goto L86
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            defpackage.g8j.b(r6)
            goto L7b
        L1d:
            defpackage.g8j.b(r6)
            java.util.Set r6 = r5.X
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L66
            ca6 r6 = r5.Y
            java.util.concurrent.atomic.AtomicReference r6 = r6.C0
            java.lang.Object r6 = r6.get()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L66
            ca6 r6 = r5.Y
            f86 r1 = r6.E0
            if (r1 == 0) goto L5a
            java.util.Set r1 = r1.o
            if (r1 == 0) goto L5a
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r6.v(r3)
            goto L46
        L5a:
            java.util.concurrent.atomic.AtomicReference r6 = r6.C0
            lk2 r1 = new lk2
            r3 = 2
            r1.<init>(r3)
            r6.updateAndGet(r1)
            goto L7b
        L66:
            java.util.Set r6 = r5.X
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L7b
            ca6 r6 = r5.Y
            java.util.Set r1 = r5.X
            r5.o = r3
            java.lang.Object r6 = defpackage.ca6.t(r6, r1, r5)
            if (r6 != r0) goto L7b
            goto L85
        L7b:
            ca6 r6 = r5.Y
            r5.o = r2
            java.lang.Object r6 = defpackage.ca6.u(r6, r5)
            if (r6 != r0) goto L86
        L85:
            return r0
        L86:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l86 extends dtf implements sm6 {
    public p86 X;
    public Iterator Y;
    public int Z;
    public int o;
    public final /* synthetic */ p86 s0;
    public final /* synthetic */ n73 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l86(p86 p86Var, n73 n73Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = p86Var;
        this.t0 = n73Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l86) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l86(this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:27:0x0078). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.Z
            r1 = 0
            p86 r2 = r9.s0
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 != r3) goto L14
            int r0 = r9.o
            java.util.Iterator r4 = r9.Y
            p86 r5 = r9.X
            defpackage.g8j.b(r10)
            goto L78
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            defpackage.g8j.b(r10)
            va4 r10 = r2.c
            java.lang.String r0 = r2.a
            mcf r10 = r10.h(r0)
            java.lang.Object r10 = r10.getValue()
            f86 r10 = (defpackage.f86) r10
            if (r10 == 0) goto L3d
            java.util.Set r10 = r10.d
            if (r10 == 0) goto L3d
            da6 r0 = defpackage.da6.X
            boolean r10 = r10.contains(r0)
            if (r10 != r3) goto L3d
            r10 = r3
            goto L3e
        L3d:
            r10 = r1
        L3e:
            n73 r0 = r9.t0
            java.util.Collection r0 = r0.b
            if (r0 == 0) goto L4c
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4c
        L4a:
            r1 = r3
            goto L84
        L4c:
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
            r5 = r2
            r0 = r10
        L53:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L82
            java.lang.Object r10 = r4.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            ch2 r10 = r5.b
            java.lang.String r8 = r5.a
            r9.X = r5
            r9.Y = r4
            r9.o = r0
            r9.Z = r3
            java.lang.Boolean r10 = r10.g(r6, r8)
            g84 r6 = defpackage.g84.a
            if (r10 != r6) goto L78
            return r6
        L78:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L53
            r10 = r0
            goto L84
        L82:
            r10 = r0
            goto L4a
        L84:
            qqg r0 = defpackage.qqg.a
            if (r1 == 0) goto L8b
            if (r10 != 0) goto L8b
            return r0
        L8b:
            defpackage.p86.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l86.n(java.lang.Object):java.lang.Object");
    }
}

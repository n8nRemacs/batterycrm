package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rq6 extends dtf implements sm6 {
    public tq6 X;
    public Collection Y;
    public Iterator Z;
    public List o;
    public int s0;
    public final /* synthetic */ tq6 t0;
    public final /* synthetic */ List u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq6(tq6 tq6Var, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = tq6Var;
        this.u0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rq6(this.t0, this.u0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r10 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r10 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:27:0x00a3). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.s0
            r1 = 0
            r2 = 2
            r3 = 1
            tq6 r4 = r9.t0
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L28
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1c
            java.util.Iterator r0 = r9.Z
            java.util.Collection r3 = r9.Y
            tq6 r4 = r9.X
            java.util.List r6 = r9.o
            defpackage.g8j.b(r10)
            goto La3
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            defpackage.g8j.b(r10)
            goto L58
        L28:
            defpackage.g8j.b(r10)
            xo6 r10 = r4.b
            boolean r10 = r10.c
            if (r10 == 0) goto L5d
            tcf r10 = r4.N0
            java.lang.Object r10 = r10.getValue()
            cce r0 = defpackage.cce.a
            if (r10 != r0) goto L5d
            tcf r10 = r4.N0
            r9.s0 = r3
            d53 r0 = new d53
            r3 = 12
            r0.<init>(r10, r3)
            bc2 r10 = new bc2
            r3 = 6
            r10.<init>(r0, r3)
            java.lang.Object r10 = defpackage.gw0.p(r10, r9)
            if (r10 != r5) goto L53
            goto L55
        L53:
            qqg r10 = defpackage.qqg.a
        L55:
            if (r10 != r5) goto L58
            goto La2
        L58:
            tcf r10 = r4.N0
            r10.setValue(r1)
        L5d:
            dce r10 = r4.E0
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r10 = r10.a
            r0.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r3 = r9.u0
            java.util.Iterator r3 = r3.iterator()
            r6 = r0
            r0 = r3
            r3 = r10
        L77:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto Lab
            java.lang.Object r10 = r0.next()
            vd8 r10 = (defpackage.vd8) r10
            r9.o = r6
            r9.X = r4
            r9.Y = r3
            r9.Z = r0
            r9.s0 = r2
            lzf r7 = r4.v()
            q2b r7 = (defpackage.q2b) r7
            z74 r7 = r7.f()
            qq6 r8 = new qq6
            r8.<init>(r4, r10, r6, r1)
            java.lang.Object r10 = defpackage.svi.i(r7, r8, r9)
            if (r10 != r5) goto La3
        La2:
            return r5
        La3:
            op6 r10 = (defpackage.op6) r10
            if (r10 == 0) goto L77
            r3.add(r10)
            goto L77
        Lab:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq6.n(java.lang.Object):java.lang.Object");
    }
}

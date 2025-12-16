package defpackage;

import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wpf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ a93 Y;
    public final /* synthetic */ LinkedHashSet Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpf(a93 a93Var, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.Y = a93Var;
        this.Z = linkedHashSet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wpf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wpf(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r8 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r8 == r5) goto L22;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.X
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L11
            int r0 = r7.o
            defpackage.g8j.b(r8)
            goto L6a
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            int r0 = r7.o
            defpackage.g8j.b(r8)
            goto L4d
        L1f:
            defpackage.g8j.b(r8)
            a93 r8 = r7.Y
            java.lang.Object r0 = r8.a
            pf2 r0 = (defpackage.pf2) r0
            pf2 r4 = defpackage.pf2.b
            if (r0 != r4) goto L2e
            r0 = r3
            goto L2f
        L2e:
            r0 = r1
        L2f:
            java.util.LinkedHashSet r4 = r7.Z
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L50
            java.lang.Object r8 = r8.c
            xqf r8 = (defpackage.xqf) r8
            r7.o = r0
            r7.X = r3
            spf r2 = r8.m
            qpf r8 = r8.b()
            r2.getClass()
            java.lang.Object r8 = r8.b(r4, r7)
            if (r8 != r5) goto L4d
            goto L69
        L4d:
            java.util.List r8 = (java.util.List) r8
            goto L6c
        L50:
            java.lang.Object r8 = r8.d
            v6d r8 = (defpackage.v6d) r8
            r7.o = r0
            r7.X = r2
            java.lang.Object r2 = r8.d
            spf r2 = (defpackage.spf) r2
            java.lang.Object r8 = r8.X
            lz9 r8 = (defpackage.lz9) r8
            r2.getClass()
            java.lang.Object r8 = r8.b(r4, r7)
            if (r8 != r5) goto L6a
        L69:
            return r5
        L6a:
            java.util.List r8 = (java.util.List) r8
        L6c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.we3.q(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L7b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r8.next()
            gpf r4 = (defpackage.gpf) r4
            yqf r5 = new yqf
            if (r0 != 0) goto L8d
            r6 = r3
            goto L8e
        L8d:
            r6 = r1
        L8e:
            r5.<init>(r4, r6)
            r2.add(r5)
            goto L7b
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpf.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uj extends dtf implements sm6 {
    public final /* synthetic */ wj X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(wj wjVar, Continuation continuation) {
        super(2, continuation);
        this.X = wjVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uj) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uj(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r8 != r5) goto L24;
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
            r1 = 3
            r2 = 2
            r3 = 1
            wj r4 = r7.X
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L25
            if (r0 == r3) goto L21
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            defpackage.g8j.b(r8)
            goto L76
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.g8j.b(r8)
            goto L51
        L21:
            defpackage.g8j.b(r8)
            goto L3b
        L25:
            defpackage.g8j.b(r8)
            yy7[] r8 = defpackage.wj.p
            bwf r8 = r4.i
            java.lang.Object r8 = r8.getValue()
            kad r8 = (defpackage.kad) r8
            r7.o = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r5) goto L3b
            goto L75
        L3b:
            iad r8 = (defpackage.iad) r8
            if (r8 == 0) goto L4a
            r7.o = r2
            yy7[] r0 = defpackage.wj.p
            java.lang.Object r8 = r4.f(r8, r7)
            if (r8 != r5) goto L51
            goto L75
        L4a:
            java.lang.String r8 = r4.f
            java.lang.String r0 = "Didn't find section with Reactions. Warmup"
            defpackage.wqi.d(r8, r0)
        L51:
            yy7[] r8 = defpackage.wj.p
            ei r8 = r4.h()
            r7.o = r1
            r8.getClass()
            java.lang.String r0 = "SELECT * FROM animoji"
            r1 = 0
            dsd r0 = defpackage.dsd.c(r1, r0)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            lrd r3 = r8.a
            di r6 = new di
            r6.<init>(r8, r0, r1)
            java.lang.Object r8 = defpackage.k7j.a(r3, r2, r6, r7)
            if (r8 != r5) goto L76
        L75:
            return r5
        L76:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L7c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r8.next()
            si r0 = (defpackage.si) r0
            vh r0 = defpackage.wj.l(r0)
            r4.j(r0)
            goto L7c
        L90:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj.n(java.lang.Object):java.lang.Object");
    }
}

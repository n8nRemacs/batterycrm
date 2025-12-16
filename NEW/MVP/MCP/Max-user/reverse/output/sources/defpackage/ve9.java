package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ve9 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ s5i Y;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve9(s5i s5iVar, Continuation continuation) {
        super(2, continuation);
        this.Y = s5iVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ve9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ve9(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.X
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            s5i r5 = r8.Y
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L38
            if (r0 == r4) goto L34
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r8.o
            java.util.Collection r0 = (java.util.Collection) r0
            defpackage.g8j.b(r9)
            goto L7a
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r0 = r8.o
            zde r0 = (defpackage.zde) r0
            defpackage.g8j.b(r9)
            goto L66
        L2c:
            java.lang.Object r0 = r8.o
            zde r0 = (defpackage.zde) r0
            defpackage.g8j.b(r9)
            goto L52
        L34:
            defpackage.g8j.b(r9)
            goto L44
        L38:
            defpackage.g8j.b(r9)
            r8.X = r4
            java.lang.Object r9 = defpackage.s5i.d(r5, r8)
            if (r9 != r6) goto L44
            goto L76
        L44:
            r0 = r9
            zde r0 = (defpackage.zde) r0
            r8.o = r0
            r8.X = r3
            java.lang.Object r9 = defpackage.s5i.e(r5, r8)
            if (r9 != r6) goto L52
            goto L76
        L52:
            zde r9 = (defpackage.zde) r9
            java.util.List r0 = defpackage.lee.o(r0)
            r8.o = r9
            r8.X = r2
            java.lang.Object r0 = defpackage.hui.b(r0, r8)
            if (r0 != r6) goto L63
            goto L76
        L63:
            r7 = r0
            r0 = r9
            r9 = r7
        L66:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r0 = defpackage.lee.o(r0)
            r8.o = r9
            r8.X = r1
            java.lang.Object r0 = defpackage.hui.b(r0, r8)
            if (r0 != r6) goto L77
        L76:
            return r6
        L77:
            r7 = r0
            r0 = r9
            r9 = r7
        L7a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r9 = defpackage.ue3.T(r0, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            java.lang.Object r9 = r5.c
            k18 r9 = (defpackage.k18) r9
            java.lang.Object r9 = r9.getValue()
            v04 r9 = (defpackage.v04) r9
            wm7 r1 = new wm7
            r2 = 18
            r1.<init>(r2)
            r9.c(r0, r1)
            n8a r9 = new n8a
            int r1 = r0.size()
            r9.<init>(r1)
            kv r1 = new kv
            r2 = 1
            r1.<init>(r9, r2)
            a6 r9 = new a6
            r2 = 5
            r9.<init>(r2, r1)
            r0.removeIf(r9)
            java.lang.Object r9 = r5.j
            tcf r9 = (defpackage.tcf) r9
            r1 = 0
            r9.m(r1, r0)
            java.lang.Object r9 = r5.g
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            r0 = 0
            r9.set(r0)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve9.n(java.lang.Object):java.lang.Object");
    }
}

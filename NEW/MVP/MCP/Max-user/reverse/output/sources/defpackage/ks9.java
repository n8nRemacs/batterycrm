package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ks9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ks9) l((fw9) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ks9 ks9Var = new ks9(this.Y, continuation);
        ks9Var.X = obj;
        return ks9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            vu9 r0 = r9.Y
            lzf r1 = r0.X
            java.util.concurrent.ConcurrentHashMap r2 = r0.K1
            int r3 = r9.o
            r4 = 2
            r5 = 1
            qqg r6 = defpackage.qqg.a
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            defpackage.g8j.b(r10)
            return r6
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            defpackage.g8j.b(r10)
            return r6
        L22:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            fw9 r10 = (defpackage.fw9) r10
            boolean r3 = r10 instanceof defpackage.dw9
            r7 = 0
            g84 r8 = defpackage.g84.a
            if (r3 == 0) goto L53
            dw9 r10 = (defpackage.dw9) r10
            r9.o = r5
            java.lang.String r3 = r10.b
            boolean r2 = r2.remove(r3, r6)
            if (r2 != 0) goto L3d
            goto L4f
        L3d:
            q2b r1 = (defpackage.q2b) r1
            wl8 r1 = r1.c()
            us9 r2 = new us9
            r2.<init>(r0, r10, r7)
            java.lang.Object r10 = defpackage.svi.i(r1, r2, r9)
            if (r10 != r8) goto L4f
            goto L50
        L4f:
            r10 = r6
        L50:
            if (r10 != r8) goto L7a
            goto L79
        L53:
            boolean r3 = r10 instanceof defpackage.ew9
            if (r3 == 0) goto L7b
            ew9 r10 = (defpackage.ew9) r10
            r9.o = r4
            java.lang.String r3 = r10.b
            boolean r2 = r2.remove(r3, r6)
            if (r2 != 0) goto L64
            goto L76
        L64:
            q2b r1 = (defpackage.q2b) r1
            wl8 r1 = r1.c()
            vs9 r2 = new vs9
            r2.<init>(r0, r10, r7)
            java.lang.Object r10 = defpackage.svi.i(r1, r2, r9)
            if (r10 != r8) goto L76
            goto L77
        L76:
            r10 = r6
        L77:
            if (r10 != r8) goto L7a
        L79:
            return r8
        L7a:
            return r6
        L7b:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks9.n(java.lang.Object):java.lang.Object");
    }
}

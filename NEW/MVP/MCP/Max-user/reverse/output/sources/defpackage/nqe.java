package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nqe extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ere Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nqe) l((io3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nqe nqeVar = new nqe(this.Y, continuation);
        nqeVar.X = obj;
        return nqeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (defpackage.ere.v(r4, r6) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (defpackage.ere.v(r4, r6) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (defpackage.ere.v(r4, r6) == r5) goto L27;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 3
            r2 = 2
            r3 = 1
            ere r4 = r6.Y
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            defpackage.g8j.b(r7)
            goto L65
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            defpackage.g8j.b(r7)
            goto L4e
        L1f:
            defpackage.g8j.b(r7)
            goto L6a
        L23:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            io3 r7 = (defpackage.io3) r7
            go3 r0 = defpackage.go3.a
            boolean r0 = defpackage.fni.a(r7, r0)
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L3d
            r6.o = r3
            java.lang.Object r7 = defpackage.ere.v(r4, r6)
            if (r7 != r5) goto L6a
            goto L64
        L3d:
            eo3 r0 = defpackage.eo3.a
            boolean r0 = defpackage.fni.a(r7, r0)
            if (r0 == 0) goto L54
            r6.o = r2
            java.lang.Object r7 = defpackage.ere.v(r4, r6)
            if (r7 != r5) goto L4e
            goto L64
        L4e:
            hme r7 = defpackage.fme.o
            r4.A(r7)
            goto L6a
        L54:
            fo3 r0 = defpackage.fo3.a
            boolean r7 = defpackage.fni.a(r7, r0)
            if (r7 == 0) goto L6d
            r6.o = r1
            java.lang.Object r7 = defpackage.ere.v(r4, r6)
            if (r7 != r5) goto L65
        L64:
            return r5
        L65:
            hme r7 = defpackage.fme.n
            r4.A(r7)
        L6a:
            qqg r7 = defpackage.qqg.a
            return r7
        L6d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.n(java.lang.Object):java.lang.Object");
    }
}

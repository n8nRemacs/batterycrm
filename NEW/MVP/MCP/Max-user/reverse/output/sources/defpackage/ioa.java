package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ioa extends dtf implements sm6 {
    public final /* synthetic */ loa X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioa(loa loaVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = loaVar;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ioa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ioa(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r0.g(r8.Y, r8.Z, r8) == r7) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.o
            loa r1 = r8.X
            r6 = 2
            r2 = 1
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1a
            if (r0 != r6) goto L12
            defpackage.g8j.b(r9)
            goto L50
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1a:
            defpackage.g8j.b(r9)
            r0 = r1
            r1 = r9
            goto L32
        L20:
            defpackage.g8j.b(r9)
            r8.o = r2
            r0 = r1
            long r1 = r8.Y
            long r3 = r8.Z
            r5 = r8
            java.lang.Object r1 = r0.b(r1, r3, r5)
            if (r1 != r7) goto L32
            goto L4f
        L32:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L50
            k18 r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            qpa r0 = (defpackage.qpa) r0
            r8.o = r6
            long r1 = r8.Y
            long r3 = r8.Z
            r5 = r8
            java.lang.Object r0 = r0.g(r1, r3, r5)
            if (r0 != r7) goto L50
        L4f:
            return r7
        L50:
            qqg r0 = defpackage.qqg.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioa.n(java.lang.Object):java.lang.Object");
    }
}

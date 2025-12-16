package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class af9 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ hf9 Y;
    public final /* synthetic */ boolean Z;
    public pb2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af9(hf9 hf9Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = hf9Var;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((af9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new af9(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (defpackage.hf9.v(r4, r0, r6) == r5) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            r1 = 2
            r2 = 1
            qqg r3 = defpackage.qqg.a
            hf9 r4 = r6.Y
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            defpackage.g8j.b(r7)
            goto L4f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            pb2 r0 = r6.o
            defpackage.g8j.b(r7)
            goto L3e
        L22:
            defpackage.g8j.b(r7)
            java.lang.String r7 = r4.J0
            java.lang.String r0 = "load members with read status"
            defpackage.wqi.d(r7, r0)
            pb2 r0 = r4.w()
            if (r0 != 0) goto L33
            goto L42
        L33:
            r6.o = r0
            r6.X = r2
            java.lang.Object r7 = defpackage.hf9.u(r4, r0, r6)
            if (r7 != r5) goto L3e
            goto L4e
        L3e:
            boolean r7 = r6.Z
            if (r7 != 0) goto L43
        L42:
            return r3
        L43:
            r7 = 0
            r6.o = r7
            r6.X = r1
            java.lang.Object r7 = defpackage.hf9.v(r4, r0, r6)
            if (r7 != r5) goto L4f
        L4e:
            return r5
        L4f:
            defpackage.hf9.t(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af9.n(java.lang.Object):java.lang.Object");
    }
}

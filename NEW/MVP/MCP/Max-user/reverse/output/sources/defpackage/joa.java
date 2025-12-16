package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class joa extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ loa Y;
    public final /* synthetic */ long Z;
    public pb2 o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joa(loa loaVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = loaVar;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((joa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new joa(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            qqg r1 = defpackage.qqg.a
            r2 = 3
            r3 = 2
            r4 = 1
            loa r5 = r13.Y
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L29
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L17
            defpackage.g8j.b(r14)
            return r1
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            pb2 r0 = r13.o
            defpackage.g8j.b(r14)
            goto L52
        L25:
            defpackage.g8j.b(r14)
            goto L3f
        L29:
            defpackage.g8j.b(r14)
            k18 r14 = r5.b
            java.lang.Object r14 = r14.getValue()
            w63 r14 = (defpackage.w63) r14
            r13.X = r4
            long r7 = r13.Z
            pb2 r14 = r14.g(r7)
            if (r14 != r6) goto L3f
            goto L75
        L3f:
            r0 = r14
            pb2 r0 = (defpackage.pb2) r0
            if (r0 != 0) goto L45
            goto L76
        L45:
            r13.o = r0
            r13.X = r3
            long r3 = r13.s0
            java.lang.Object r14 = defpackage.loa.a(r5, r0, r3, r13)
            if (r14 != r6) goto L52
            goto L75
        L52:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L76
            k18 r14 = r5.o
            java.lang.Object r14 = r14.getValue()
            r7 = r14
            qpa r7 = (defpackage.qpa) r7
            rf2 r14 = r0.b
            long r8 = r14.a
            r14 = 0
            r13.o = r14
            r13.X = r2
            long r10 = r13.s0
            r12 = r13
            java.lang.Object r14 = r7.g(r8, r10, r12)
            if (r14 != r6) goto L76
        L75:
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joa.n(java.lang.Object):java.lang.Object");
    }
}

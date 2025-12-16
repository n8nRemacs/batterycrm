package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class koa extends dtf implements sm6 {
    public final /* synthetic */ loa X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koa(loa loaVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = loaVar;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((koa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new koa(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r1 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r1 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r0.g(r13.Y, r13.Z, r13) != r12) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            loa r0 = r13.X
            k18 r6 = r0.d
            k18 r7 = r0.b
            int r1 = r13.o
            r8 = 5
            r9 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            long r10 = r13.Y
            g84 r12 = defpackage.g84.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L39
            if (r1 == r3) goto L34
            if (r1 == r2) goto L2f
            if (r1 == r9) goto L2a
            if (r1 != r8) goto L22
            defpackage.g8j.b(r14)
            goto Lc1
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2a:
            defpackage.g8j.b(r14)
            r1 = r14
            goto L8c
        L2f:
            defpackage.g8j.b(r14)
            r1 = r14
            goto L75
        L34:
            defpackage.g8j.b(r14)
            r1 = r14
            goto L60
        L39:
            defpackage.g8j.b(r14)
            r1 = r14
            goto L51
        L3e:
            defpackage.g8j.b(r14)
            java.lang.Object r1 = r7.getValue()
            w63 r1 = (defpackage.w63) r1
            r13.o = r4
            java.lang.Object r1 = r1.h(r10, r13)
            if (r1 != r12) goto L51
            goto Lc0
        L51:
            pb2 r1 = (defpackage.pb2) r1
            if (r1 == 0) goto L67
            r13.o = r3
            long r2 = r13.Z
            java.lang.Object r1 = defpackage.loa.a(r0, r1, r2, r13)
            if (r1 != r12) goto L60
            goto Lc0
        L60:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L7b
        L67:
            r13.o = r2
            long r1 = r13.Y
            long r3 = r13.Z
            r5 = r13
            java.lang.Object r1 = r0.b(r1, r3, r5)
            if (r1 != r12) goto L75
            goto Lc0
        L75:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
        L7b:
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r7.getValue()
            w63 r1 = (defpackage.w63) r1
            r13.o = r9
            java.lang.Object r1 = r1.h(r10, r13)
            if (r1 != r12) goto L8c
            goto Lc0
        L8c:
            pb2 r1 = (defpackage.pb2) r1
            if (r1 == 0) goto Lab
            rf2 r1 = r1.b
            int r2 = r1.m
            if (r2 <= 0) goto La0
            java.lang.Object r1 = r6.getValue()
            y7b r1 = (defpackage.y7b) r1
            r1.e(r10)
            goto Lab
        La0:
            java.lang.Object r2 = r6.getValue()
            y7b r2 = (defpackage.y7b) r2
            long r3 = r1.a
            r2.a(r3)
        Lab:
            k18 r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            qpa r0 = (defpackage.qpa) r0
            r13.o = r8
            long r1 = r13.Y
            long r3 = r13.Z
            r5 = r13
            java.lang.Object r0 = r0.g(r1, r3, r5)
            if (r0 != r12) goto Lc1
        Lc0:
            return r12
        Lc1:
            qqg r0 = defpackage.qqg.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koa.n(java.lang.Object):java.lang.Object");
    }
}

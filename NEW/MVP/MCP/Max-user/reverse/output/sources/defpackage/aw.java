package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aw extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cs4 Y;
    public final /* synthetic */ cs4 Z;
    public int o;
    public final /* synthetic */ xw s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(cs4 cs4Var, cs4 cs4Var2, xw xwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = cs4Var;
        this.Z = cs4Var2;
        this.s0 = xwVar;
        this.t0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aw(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r14.o(r7, false, r13) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            xw r0 = r13.s0
            g84 r1 = defpackage.g84.a
            int r2 = r13.X
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            defpackage.g8j.b(r14)
            goto La9
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            int r2 = r13.o
            defpackage.g8j.b(r14)
            goto L4a
        L24:
            defpackage.g8j.b(r14)
            goto L37
        L28:
            defpackage.g8j.b(r14)
            cs4 r14 = r13.Y
            r13.X = r5
            java.lang.Object r14 = r14.awaitInternal(r13)
            if (r14 != r1) goto L37
            goto La8
        L37:
            java.lang.Number r14 = (java.lang.Number) r14
            int r2 = r14.intValue()
            cs4 r14 = r13.Z
            r13.o = r2
            r13.X = r4
            java.lang.Object r14 = r14.awaitInternal(r13)
            if (r14 != r1) goto L4a
            goto La8
        L4a:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r4 = 0
            if (r2 > 0) goto L57
            if (r14 <= 0) goto L56
            goto L57
        L56:
            r5 = r4
        L57:
            iv6 r14 = r0.c
            long r6 = r13.t0
            java.lang.Object r14 = r14.b
            java.lang.String r14 = (java.lang.String) r14
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L64
            goto L92
        L64:
            lg8 r8 = defpackage.lg8.d
            boolean r9 = r2.b(r8)
            if (r9 == 0) goto L92
            long r9 = r0.f()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "loadAroundSync: finish remote fetch, hasNew:"
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = ", aroundT:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = ", requestT:"
            r11.append(r9)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r7 = 0
            r2.c(r8, r14, r6, r7)
        L92:
            if (r5 == 0) goto La9
            long r5 = r0.f()
            long r7 = r13.t0
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 != 0) goto La9
            xw r14 = r13.s0
            r13.X = r3
            java.lang.Object r14 = r14.o(r7, r4, r13)
            if (r14 != r1) goto La9
        La8:
            return r1
        La9:
            qqg r14 = defpackage.qqg.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.n(java.lang.Object):java.lang.Object");
    }
}

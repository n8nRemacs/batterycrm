package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class czd extends dpd implements sm6 {
    public int X;
    public int Y;
    public int Z;
    public Object[] c;
    public long[] d;
    public int o;
    public long s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ c9a v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czd(c9a c9aVar, Continuation continuation) {
        super(2, continuation);
        this.v0 = c9aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((czd) l((fee) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        czd czdVar = new czd(this.v0, continuation);
        czdVar.u0 = obj;
        return czdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:22:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:19:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.t0
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L22
            int r1 = r0.Z
            int r5 = r0.Y
            long r6 = r0.s0
            int r8 = r0.X
            int r9 = r0.o
            long[] r10 = r0.d
            java.lang.Object[] r11 = r0.c
            java.lang.Object r12 = r0.u0
            fee r12 = (defpackage.fee) r12
            defpackage.g8j.b(r20)
            goto L86
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            defpackage.g8j.b(r20)
            java.lang.Object r1 = r0.u0
            fee r1 = (defpackage.fee) r1
            c9a r5 = r0.v0
            java.lang.Object[] r6 = r5.b
            long[] r5 = r5.a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L94
            r8 = r2
        L3d:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L8f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L5e:
            if (r1 >= r5) goto L89
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.u0 = r12
            r0.c = r11
            r0.d = r10
            r0.o = r9
            r0.X = r8
            r0.s0 = r6
            r0.Y = r5
            r0.Z = r1
            r0.t0 = r4
            r12.b(r2, r0)
            g84 r1 = defpackage.g84.a
            return r1
        L86:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L5e
        L89:
            if (r5 != r3) goto L94
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L8f:
            if (r8 == r7) goto L94
            int r8 = r8 + 1
            goto L3d
        L94:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czd.n(java.lang.Object):java.lang.Object");
    }
}

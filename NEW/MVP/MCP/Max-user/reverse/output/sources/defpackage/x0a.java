package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x0a extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k1a Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0a(k1a k1aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = k1aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x0a) l((n8a) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x0a x0aVar = new x0a(this.Y, continuation);
        x0aVar.X = obj;
        return x0aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            defpackage.g8j.b(r18)
            goto L82
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L16:
            defpackage.g8j.b(r18)
            java.lang.Object r1 = r0.X
            n8a r1 = (defpackage.n8a) r1
            n8a r3 = new n8a
            int r4 = r1.d
            r3.<init>(r4)
            long[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L67
            r6 = 0
            r7 = r6
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L49:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            r3.a(r13)
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r5) goto L67
            int r7 = r7 + 1
            goto L2f
        L67:
            k1a r1 = r0.Y
            java.util.List r3 = r1.a(r3)
            int r4 = defpackage.s65.d
            r4 = 10
            y65 r5 = defpackage.y65.SECONDS
            long r4 = defpackage.v9j.h(r4, r5)
            r0.o = r2
            java.lang.Object r1 = r1.j(r4, r0, r3)
            g84 r2 = defpackage.g84.a
            if (r1 != r2) goto L82
            return r2
        L82:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0a.n(java.lang.Object):java.lang.Object");
    }
}

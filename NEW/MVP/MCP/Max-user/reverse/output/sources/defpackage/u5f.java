package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u5f extends dtf implements sm6 {
    public sm6 X;
    public Iterator Y;
    public lm7 Z;
    public v5f o;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ ArrayList u0;
    public final /* synthetic */ v5f v0;
    public final /* synthetic */ bzb w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5f(ArrayList arrayList, v5f v5fVar, bzb bzbVar, Continuation continuation) {
        super(2, continuation);
        this.u0 = arrayList;
        this.v0 = v5fVar;
        this.w0 = bzbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u5f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u5f u5fVar = new u5f(this.u0, this.v0, this.w0, continuation);
        u5fVar.t0 = obj;
        return u5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r0
  0x0035: PHI (r0v2 f84) = (r0v1 f84), (r0v3 f84) binds: [B:10:0x002d, B:18:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:23:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.s0
            r1 = 2
            r2 = 1
            r3 = 0
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            lm7 r0 = r10.Z
            java.util.Iterator r5 = r10.Y
            sm6 r6 = r10.X
            v5f r7 = r10.o
            java.lang.Object r8 = r10.t0
            f84 r8 = (defpackage.f84) r8
            defpackage.g8j.b(r11)
            goto L7f
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r0 = r10.t0
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r11)
            goto L50
        L2d:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.t0
            f84 r11 = (defpackage.f84) r11
            r0 = r11
        L35:
            boolean r11 = defpackage.d7j.f(r0)
            if (r11 == 0) goto L8c
            r10.t0 = r0
            r10.o = r3
            r10.X = r3
            r10.Y = r3
            r10.Z = r3
            r10.s0 = r2
            r5 = 1800(0x708, double:8.893E-321)
            java.lang.Object r11 = defpackage.s8j.c(r5, r10)
            if (r11 != r4) goto L50
            goto L7c
        L50:
            java.util.ArrayList r11 = r10.u0
            java.util.Iterator r11 = r11.iterator()
            v5f r5 = r10.v0
            bzb r6 = r10.w0
            r7 = r5
            r5 = r11
        L5c:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L35
            java.lang.Object r11 = r5.next()
            lm7 r11 = (defpackage.lm7) r11
            r10.t0 = r0
            r10.o = r7
            r10.X = r6
            r10.Y = r5
            r10.Z = r11
            r10.s0 = r1
            r8 = 80
            java.lang.Object r8 = defpackage.s8j.c(r8, r10)
            if (r8 != r4) goto L7d
        L7c:
            return r4
        L7d:
            r8 = r0
            r0 = r11
        L7f:
            x38 r11 = r7.a
            t5f r9 = new t5f
            r9.<init>(r6, r0, r3)
            r0 = 3
            defpackage.svi.e(r11, r3, r3, r9, r0)
            r0 = r8
            goto L5c
        L8c:
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5f.n(java.lang.Object):java.lang.Object");
    }
}

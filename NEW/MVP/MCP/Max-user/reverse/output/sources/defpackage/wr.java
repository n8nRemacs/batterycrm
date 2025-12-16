package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wr extends dtf implements sm6 {
    public xr X;
    public Object Y;
    public pr Z;
    public f9a o;
    public List s0;
    public int t0;
    public final /* synthetic */ xr u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(xr xrVar, Continuation continuation) {
        super(2, continuation);
        this.u0 = xrVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wr) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wr(this.u0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r9 != r3) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Type inference failed for: r6v5, types: [f9a] */
    /* JADX WARN: Type inference failed for: r7v7, types: [f9a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:18:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.t0
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L32
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1a
            java.util.List r0 = r8.s0
            pr r4 = r8.Z
            java.lang.Object r5 = r8.Y
            xr r6 = r8.X
            f9a r7 = r8.o
            defpackage.g8j.b(r9)
            goto L73
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            pr r0 = r8.Z
            java.lang.Object r4 = r8.Y
            xr r5 = r8.X
            f9a r6 = r8.o
            defpackage.g8j.b(r9)
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r0
            goto L5d
        L32:
            defpackage.g8j.b(r9)
            xr r9 = r8.u0
            tcf r0 = r9.B0
        L39:
            java.lang.Object r4 = r0.getValue()
            r5 = r4
            pr r5 = (defpackage.pr) r5
            java.util.List r6 = r5.a
            r8.o = r0
            r8.X = r9
            r8.Y = r4
            r8.Z = r5
            r7 = 0
            r8.s0 = r7
            r8.t0 = r2
            java.util.ArrayList r6 = defpackage.xr.v(r9, r6)
            if (r6 != r3) goto L56
            goto L72
        L56:
            r7 = r6
            r6 = r9
            r9 = r7
            r7 = r5
            r5 = r4
            r4 = r7
            r7 = r0
        L5d:
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r8.o = r7
            r8.X = r6
            r8.Y = r5
            r8.Z = r4
            r8.s0 = r0
            r8.t0 = r1
            android.graphics.drawable.Drawable r9 = defpackage.xr.u(r6)
            if (r9 != r3) goto L73
        L72:
            return r3
        L73:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            pr r9 = defpackage.pr.a(r4, r0, r9)
            boolean r9 = r7.c(r5, r9)
            if (r9 == 0) goto L82
            qqg r9 = defpackage.qqg.a
            return r9
        L82:
            r9 = r6
            r0 = r7
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr.n(java.lang.Object):java.lang.Object");
    }
}

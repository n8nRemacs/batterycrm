package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wt6 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ zt6 Z;
    public Iterator o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ CharSequence t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt6(List list, zt6 zt6Var, long j, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = zt6Var;
        this.s0 = j;
        this.t0 = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wt6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wt6(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[PHI: r0
  0x004d: PHI (r0v9 java.util.Iterator) = (r0v2 java.util.Iterator), (r0v10 java.util.Iterator) binds: [B:12:0x0048, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:18:0x0066). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto Le
            java.util.Iterator r0 = r6.o
            defpackage.g8j.b(r7)
            goto L66
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            defpackage.g8j.b(r7)
            x74 r7 = r6.b
            kotlinx.coroutines.internal.ContextScope r7 = defpackage.d7j.a(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            java.util.List r4 = r6.Y
            int r3 = defpackage.we3.q(r4, r3)
            r0.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r3.next()
            vt6 r5 = new vt6
            r5.<init>(r4, r1)
            r4 = 3
            cs4 r4 = defpackage.svi.b(r7, r1, r5, r4)
            r0.add(r4)
            goto L30
        L48:
            java.util.Iterator r7 = r0.iterator()
            r0 = r7
        L4d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r0.next()
            bs4 r7 = (defpackage.bs4) r7
            r6.o = r0
            r6.X = r2
            java.lang.Object r7 = r7.c(r6)
            g84 r3 = defpackage.g84.a
            if (r7 != r3) goto L66
            return r3
        L66:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L4d
            r1 = r7
        L6b:
            if (r1 != 0) goto Lb7
            lc0 r7 = new lc0
            zt6 r0 = r6.Z
            android.content.Context r0 = r0.a()
            java.lang.Long r1 = new java.lang.Long
            long r2 = r6.s0
            r1.<init>(r2)
            java.lang.CharSequence r2 = r6.t0
            mc0 r1 = defpackage.fui.a(r2, r1)
            v1a r2 = defpackage.a93.s0
            a93 r2 = r2.x(r0)
            yeb r2 = r2.k()
            lxa r3 = defpackage.lxa.a
            r7.<init>(r0, r3, r1, r2)
            r0 = 80
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vw4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = defpackage.kti.d(r1)
            android.content.res.Resources r2 = defpackage.vw4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.kti.d(r0)
            android.graphics.Bitmap r7 = defpackage.q9j.b(r7, r1, r0)
            return r7
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt6.n(java.lang.Object):java.lang.Object");
    }
}

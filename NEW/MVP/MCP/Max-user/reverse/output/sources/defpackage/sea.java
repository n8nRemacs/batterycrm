package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sea extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public Object o;
    public final /* synthetic */ vea s0;
    public final /* synthetic */ RectF t0;
    public final /* synthetic */ int u0;
    public final /* synthetic */ Rect v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sea(String str, vea veaVar, RectF rectF, int i, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = veaVar;
        this.t0 = rectF;
        this.u0 = i;
        this.v0 = rect;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sea) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sea seaVar = new sea(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        seaVar.Y = obj;
        return seaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            bd5 r1 = defpackage.bd5.a
            java.lang.String r2 = r13.Z
            vea r3 = r13.s0
            r4 = 2
            r5 = 1
            r6 = 0
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L36
            if (r0 == r5) goto L2a
            if (r0 != r4) goto L22
            java.lang.Object r0 = r13.o
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r1 = r13.Y
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            defpackage.g8j.b(r14)     // Catch: java.lang.Throwable -> L1f
            goto L7b
        L1f:
            r0 = move-exception
            r14 = r0
            goto L83
        L22:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2a:
            java.lang.Object r0 = r13.o
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r13.Y
            vea r5 = (defpackage.vea) r5
            defpackage.g8j.b(r14)     // Catch: java.lang.Throwable -> L1f
            goto L55
        L36:
            defpackage.g8j.b(r14)
            java.lang.Object r14 = r13.Y
            f84 r14 = (defpackage.f84) r14
            android.graphics.Rect r14 = r13.v0
            da1 r0 = new da1     // Catch: java.lang.Throwable -> L1f
            r8 = 8
            r0.<init>(r2, r14, r3, r8)     // Catch: java.lang.Throwable -> L1f
            r13.Y = r3     // Catch: java.lang.Throwable -> L1f
            r13.o = r2     // Catch: java.lang.Throwable -> L1f
            r13.X = r5     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r14 = defpackage.vmi.i(r1, r0, r13)     // Catch: java.lang.Throwable -> L1f
            if (r14 != r7) goto L53
            goto L79
        L53:
            r0 = r2
            r5 = r3
        L55:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.lang.Throwable -> L1f
            if (r14 == 0) goto L88
            iz5 r0 = r5.a()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = "jpg"
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            java.io.File r0 = r0.m(r6, r8)     // Catch: java.lang.Throwable -> L1f
            da1 r8 = new da1     // Catch: java.lang.Throwable -> L1f
            r9 = 9
            r8.<init>(r0, r14, r5, r9)     // Catch: java.lang.Throwable -> L1f
            r13.Y = r14     // Catch: java.lang.Throwable -> L1f
            r13.o = r0     // Catch: java.lang.Throwable -> L1f
            r13.X = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = defpackage.vmi.i(r1, r8, r13)     // Catch: java.lang.Throwable -> L1f
            if (r1 != r7) goto L7a
        L79:
            return r7
        L7a:
            r1 = r14
        L7b:
            r1.recycle()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1f
            goto L88
        L83:
            ipd r0 = new ipd
            r0.<init>(r14)
        L88:
            boolean r14 = r0 instanceof defpackage.ipd
            if (r14 == 0) goto L8d
            r0 = r2
        L8d:
            java.lang.String r0 = (java.lang.String) r0
            tcf r14 = r3.j
            wc0 r1 = new wc0
            n10 r7 = new n10
            android.graphics.RectF r3 = r13.t0
            float r8 = r3.left
            float r9 = r3.top
            float r10 = r3.right
            float r11 = r3.bottom
            r12 = 2
            r7.<init>(r8, r9, r10, r11, r12)
            int r3 = r13.u0
            r1.<init>(r0, r2, r7, r3)
            r14.m(r6, r1)
            qqg r14 = defpackage.qqg.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sea.n(java.lang.Object):java.lang.Object");
    }
}

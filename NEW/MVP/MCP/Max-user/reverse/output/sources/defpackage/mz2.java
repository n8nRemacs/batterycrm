package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mz2 extends dtf implements sm6 {
    public sz2 X;
    public int Y;
    public /* synthetic */ Object Z;
    public File o;
    public final /* synthetic */ sz2 s0;
    public final /* synthetic */ Uri t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz2(sz2 sz2Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.s0 = sz2Var;
        this.t0 = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mz2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mz2 mz2Var = new mz2(this.s0, this.t0, continuation);
        mz2Var.Z = obj;
        return mz2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r7.Y
            r3 = 1
            if (r2 == 0) goto L22
            if (r2 != r3) goto L1a
            sz2 r1 = r7.X
            java.io.File r2 = r7.o
            java.lang.Object r3 = r7.Z
            f84 r3 = (defpackage.f84) r3
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L17
            goto L6a
        L17:
            r8 = move-exception
            goto L9b
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.Z
            f84 r8 = (defpackage.f84) r8
            sz2 r2 = r7.s0
            yy7[] r4 = defpackage.sz2.H0
            iz5 r2 = r2.v()
            sz2 r4 = r7.s0
            java.lang.String r4 = r4.E0
            java.io.File r2 = r2.p(r4)
            android.net.Uri r4 = r7.t0
            sz2 r5 = r7.s0
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L70
            if (r4 == 0) goto L70
            k18 r6 = r5.v0     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L6c
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L6c
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L6c
            java.io.InputStream r4 = r6.openInputStream(r4)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L70
            b6a r6 = defpackage.b6a.v0     // Catch: java.lang.Throwable -> L6c
            r7.Z = r8     // Catch: java.lang.Throwable -> L6c
            r7.o = r2     // Catch: java.lang.Throwable -> L6c
            r7.X = r5     // Catch: java.lang.Throwable -> L6c
            r7.Y = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r3 = r6.T(r2, r4, r7)     // Catch: java.lang.Throwable -> L6c
            if (r3 != r1) goto L68
            return r1
        L68:
            r3 = r8
            r1 = r5
        L6a:
            r5 = r1
            goto L71
        L6c:
            r1 = move-exception
            r3 = r8
            r8 = r1
            goto L9b
        L70:
            r3 = r8
        L71:
            age r8 = r5.d     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L17
            defpackage.tfi.k(r8, r1, r1)     // Catch: java.lang.Throwable -> L17
            age r8 = r5.d     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L17
            defpackage.tfi.j(r8, r1)     // Catch: java.lang.Throwable -> L17
            ci5 r8 = r5.y0     // Catch: java.lang.Throwable -> L17
            ty2 r1 = new ty2     // Catch: java.lang.Throwable -> L17
            android.net.Uri r4 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L17
            defpackage.xfh.r(r8, r1)     // Catch: java.lang.Throwable -> L17
            r1 = r0
            goto La0
        L9b:
            ipd r1 = new ipd
            r1.<init>(r8)
        La0:
            sz2 r8 = r7.s0
            java.lang.Throwable r1 = defpackage.kpd.a(r1)
            if (r1 == 0) goto Ld7
            r2 = 0
            r8.E0 = r2
            k18 r8 = r8.u0
            java.lang.Object r8 = r8.getValue()
            ccb r8 = (defpackage.ccb) r8
            int r2 = defpackage.mvd.s
            n5g r4 = new n5g
            r4.<init>(r2)
            r8.g(r4)
            qcb r2 = new qcb
            int r4 = defpackage.yud.J
            r2.<init>(r4)
            r8.e(r2)
            r8.i()
            java.lang.Class r8 = r3.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = "failed to copy picked image, e:"
            defpackage.wqi.e(r8, r2, r1)
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz2.n(java.lang.Object):java.lang.Object");
    }
}

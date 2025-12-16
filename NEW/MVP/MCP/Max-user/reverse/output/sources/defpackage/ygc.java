package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ygc extends dtf implements sm6 {
    public fhc X;
    public int Y;
    public /* synthetic */ Object Z;
    public File o;
    public final /* synthetic */ fhc s0;
    public final /* synthetic */ Uri t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygc(fhc fhcVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.s0 = fhcVar;
        this.t0 = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ygc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ygc ygcVar = new ygc(this.s0, this.t0, continuation);
        ygcVar.Z = obj;
        return ygcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            fhc r0 = r7.s0
            java.util.concurrent.atomic.AtomicReference r1 = r0.y0
            int r2 = r7.Y
            qqg r3 = defpackage.qqg.a
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 != r4) goto L1c
            fhc r2 = r7.X
            java.io.File r4 = r7.o
            java.lang.Object r5 = r7.Z
            f84 r5 = (defpackage.f84) r5
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L19
            goto L71
        L19:
            r8 = move-exception
            goto Laa
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.Z
            r5 = r8
            f84 r5 = (defpackage.f84) r5
            yy7[] r8 = defpackage.fhc.z0
            k18 r8 = r0.X
            java.lang.Object r8 = r8.getValue()
            iz5 r8 = (defpackage.iz5) r8
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r8 = r8.p(r2)
            boolean r2 = r8.exists()     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L73
            android.net.Uri r2 = r7.t0
            if (r2 == 0) goto L73
            k18 r6 = r0.Y     // Catch: java.lang.Throwable -> L19
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L19
            android.app.Application r6 = (android.app.Application) r6     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.io.InputStream r2 = r6.openInputStream(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L73
            b6a r6 = defpackage.b6a.v0     // Catch: java.lang.Throwable -> L19
            r7.Z = r5     // Catch: java.lang.Throwable -> L19
            r7.o = r8     // Catch: java.lang.Throwable -> L19
            r7.X = r0     // Catch: java.lang.Throwable -> L19
            r7.Y = r4     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r6.T(r8, r2, r7)     // Catch: java.lang.Throwable -> L19
            g84 r4 = defpackage.g84.a
            if (r2 != r4) goto L6f
            return r4
        L6f:
            r4 = r8
            r2 = r0
        L71:
            r8 = r4
            goto L74
        L73:
            r2 = r0
        L74:
            k18 r4 = r2.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L19
            age r4 = (defpackage.age) r4     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L19
            defpackage.tfi.k(r4, r6, r6)     // Catch: java.lang.Throwable -> L19
            k18 r4 = r2.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L19
            age r4 = (defpackage.age) r4     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L19
            defpackage.tfi.j(r4, r6)     // Catch: java.lang.Throwable -> L19
            ci5 r2 = r2.v0     // Catch: java.lang.Throwable -> L19
            vfc r4 = new vfc     // Catch: java.lang.Throwable -> L19
            android.net.Uri r6 = android.net.Uri.fromFile(r8)     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r6, r8)     // Catch: java.lang.Throwable -> L19
            defpackage.xfh.r(r2, r4)     // Catch: java.lang.Throwable -> L19
            r2 = r3
            goto Laf
        Laa:
            ipd r2 = new ipd
            r2.<init>(r8)
        Laf:
            java.lang.Throwable r8 = defpackage.kpd.a(r2)
            if (r8 == 0) goto Ldd
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "failed to copy picked image, e:"
            defpackage.wqi.e(r2, r4, r8)
            r8 = 0
            r1.set(r8)
            ci5 r8 = r0.v0
            dgc r0 = new dgc
            int r1 = defpackage.u8b.p
            n5g r2 = new n5g
            r2.<init>(r1)
            int r1 = defpackage.yud.J
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r2, r1)
            defpackage.xfh.r(r8, r0)
        Ldd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygc.n(java.lang.Object):java.lang.Object");
    }
}

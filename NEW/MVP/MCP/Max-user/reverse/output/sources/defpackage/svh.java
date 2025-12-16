package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class svh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uvh Y;
    public final /* synthetic */ Uri Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svh(uvh uvhVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = uvhVar;
        this.Z = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((svh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        svh svhVar = new svh(this.Y, this.Z, continuation);
        svhVar.X = obj;
        return svhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
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
            int r2 = r7.o
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            java.lang.Object r1 = r7.X
            java.io.File r1 = (java.io.File) r1
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L13
            goto L65
        L13:
            r8 = move-exception
            goto L6e
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            f84 r8 = (defpackage.f84) r8
            uvh r8 = r7.Y
            yy7[] r2 = defpackage.uvh.o1
            k18 r8 = r8.B0
            java.lang.Object r8 = r8.getValue()
            iz5 r8 = (defpackage.iz5) r8
            uvh r2 = r7.Y
            java.lang.String r2 = r2.T0
            java.io.File r8 = r8.p(r2)
            android.net.Uri r2 = r7.Z
            uvh r4 = r7.Y
            boolean r5 = r8.exists()     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L6c
            if (r2 == 0) goto L6c
            k18 r4 = r4.C0     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L67
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L67
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L67
            java.io.InputStream r2 = r4.openInputStream(r2)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L57
            goto L6c
        L57:
            b6a r4 = defpackage.b6a.v0     // Catch: java.lang.Throwable -> L67
            r7.X = r8     // Catch: java.lang.Throwable -> L67
            r7.o = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r4.T(r8, r2, r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != r1) goto L64
            return r1
        L64:
            r1 = r8
        L65:
            r8 = r1
            goto L6c
        L67:
            r1 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
            goto L6e
        L6c:
            r2 = r0
            goto L74
        L6e:
            ipd r2 = new ipd
            r2.<init>(r8)
            r8 = r1
        L74:
            uvh r1 = r7.Y
            java.lang.Throwable r3 = defpackage.kpd.a(r2)
            if (r3 == 0) goto L8d
            r4 = 0
            r1.T0 = r4
            ci5 r4 = r1.Z0
            cuh r5 = defpackage.cuh.a
            defpackage.xfh.r(r4, r5)
            java.lang.String r1 = r1.F0
            java.lang.String r4 = "failed to copy picked image, e:"
            defpackage.wqi.e(r1, r4, r3)
        L8d:
            uvh r1 = r7.Y
            boolean r3 = r2 instanceof defpackage.ipd
            if (r3 != 0) goto La3
            qqg r2 = (defpackage.qqg) r2
            ci5 r1 = r1.Z0
            xuh r2 = new xuh
            android.net.Uri r8 = android.net.Uri.fromFile(r8)
            r2.<init>(r8)
            defpackage.xfh.r(r1, r2)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svh.n(java.lang.Object):java.lang.Object");
    }
}

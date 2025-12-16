package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rea extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vea Z;
    public vea o;
    public final /* synthetic */ Uri s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rea(vea veaVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = veaVar;
        this.s0 = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rea) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rea reaVar = new rea(this.Z, this.s0, continuation);
        reaVar.Y = obj;
        return reaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r2.a(r4, r8) != r1) goto L29;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r8.X
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            defpackage.g8j.b(r9)     // Catch: java.lang.Throwable -> L14
            goto Lad
        L14:
            r9 = move-exception
            goto Laf
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            vea r2 = r8.o
            java.lang.Object r4 = r8.Y
            java.io.File r4 = (java.io.File) r4
            defpackage.g8j.b(r9)     // Catch: java.lang.Throwable -> L14
            goto L6d
        L29:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r8.Y
            f84 r9 = (defpackage.f84) r9
            vea r9 = r8.Z
            iz5 r9 = r9.a()
            vea r2 = r8.Z
            java.lang.String r2 = r2.l
            java.io.File r9 = r9.p(r2)
            android.net.Uri r2 = r8.s0
            vea r6 = r8.Z
            boolean r7 = r9.exists()     // Catch: java.lang.Throwable -> L14
            if (r7 != 0) goto L6f
            if (r2 == 0) goto L6f
            k18 r7 = r6.c     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L14
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Throwable -> L14
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L14
            java.io.InputStream r2 = r7.openInputStream(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L6f
            b6a r7 = defpackage.b6a.v0     // Catch: java.lang.Throwable -> L14
            r8.Y = r9     // Catch: java.lang.Throwable -> L14
            r8.o = r6     // Catch: java.lang.Throwable -> L14
            r8.X = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r7.T(r9, r2, r8)     // Catch: java.lang.Throwable -> L14
            if (r2 != r1) goto L6b
            goto Lac
        L6b:
            r4 = r9
            r2 = r6
        L6d:
            r6 = r2
            r9 = r4
        L6f:
            k18 r2 = r6.d     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L14
            age r2 = (defpackage.age) r2     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L14
            defpackage.tfi.k(r2, r4, r4)     // Catch: java.lang.Throwable -> L14
            k18 r2 = r6.d     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L14
            age r2 = (defpackage.age) r2     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L14
            defpackage.tfi.j(r2, r4)     // Catch: java.lang.Throwable -> L14
            jve r2 = r6.h     // Catch: java.lang.Throwable -> L14
            uc0 r4 = new uc0     // Catch: java.lang.Throwable -> L14
            android.net.Uri r6 = android.net.Uri.fromFile(r9)     // Catch: java.lang.Throwable -> L14
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r6, r9)     // Catch: java.lang.Throwable -> L14
            r8.Y = r5     // Catch: java.lang.Throwable -> L14
            r8.o = r5     // Catch: java.lang.Throwable -> L14
            r8.X = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r9 = r2.a(r4, r8)     // Catch: java.lang.Throwable -> L14
            if (r9 != r1) goto Lad
        Lac:
            return r1
        Lad:
            r1 = r0
            goto Lb4
        Laf:
            ipd r1 = new ipd
            r1.<init>(r9)
        Lb4:
            vea r9 = r8.Z
            java.lang.Throwable r1 = defpackage.kpd.a(r1)
            if (r1 == 0) goto Le4
            java.lang.String r2 = r9.f
            java.lang.String r3 = "failed to copy picked image, e:"
            defpackage.wqi.e(r2, r3, r1)
            r9.l = r5
            k18 r9 = r9.e
            java.lang.Object r9 = r9.getValue()
            ccb r9 = (defpackage.ccb) r9
            int r1 = defpackage.mvd.s
            n5g r2 = new n5g
            r2.<init>(r1)
            r9.g(r2)
            qcb r1 = new qcb
            int r2 = defpackage.yud.J
            r1.<init>(r2)
            r9.e(r1)
            r9.i()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rea.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fx2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zx2 Y;
    public final /* synthetic */ Uri Z;
    public long o;
    public final /* synthetic */ Long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(zx2 zx2Var, Uri uri, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = zx2Var;
        this.Z = uri;
        this.s0 = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fx2(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (r0 == r12) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            qqg r9 = defpackage.qqg.a
            r10 = 2
            r1 = 1
            zx2 r11 = r13.Y
            g84 r12 = defpackage.g84.a
            if (r0 == 0) goto L24
            if (r0 == r1) goto L1d
            if (r0 != r10) goto L15
            defpackage.g8j.b(r14)
            r0 = r14
            goto L76
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1d:
            long r0 = r13.o
            defpackage.g8j.b(r14)
            r1 = r0
            goto L5e
        L24:
            defpackage.g8j.b(r14)
            hbd r0 = r11.a1
            mcf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            pb2 r0 = (defpackage.pb2) r0
            if (r0 == 0) goto L7d
            long r2 = r0.a
            bwf r0 = r11.E0
            java.lang.Object r0 = r0.getValue()
            ide r0 = (defpackage.ide) r0
            android.net.Uri r4 = r13.Z
            java.lang.String r4 = r4.toString()
            l1f r5 = new l1f
            r5.<init>(r1, r4)
            java.util.List r4 = java.util.Collections.singletonList(r5)
            r13.o = r2
            r13.X = r1
            r1 = r2
            r3 = 0
            r5 = 0
            java.lang.Long r6 = r13.s0
            r7 = 0
            r8 = r13
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r6, r7, r8)
            if (r0 != r12) goto L5e
            goto L75
        L5e:
            k18 r0 = r11.F0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            ew0 r4 = (defpackage.ew0) r4
            r13.X = r10
            v17 r0 = defpackage.ew2.d
            r3 = 1
            r5 = 0
            r6 = 1
            r7 = r13
            java.lang.Object r0 = r0.d(r1, r3, r4, r5, r6, r7)
            if (r0 != r12) goto L76
        L75:
            return r12
        L76:
            ew2 r0 = (defpackage.ew2) r0
            ci5 r1 = r11.d1
            defpackage.xfh.r(r1, r0)
        L7d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx2.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ byte[] Z;
    public int o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ String t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvh(uvh uvhVar, String str, byte[] bArr, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
        this.Y = str;
        this.Z = bArr;
        this.s0 = str2;
        this.t0 = str3;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jvh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jvh(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            qqg r1 = defpackage.qqg.a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            defpackage.g8j.b(r8)
            return r1
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            defpackage.g8j.b(r8)
            uvh r8 = r7.X
            ra3 r8 = r8.J0
            java.lang.String r0 = r7.Y
            r7.o = r2
            java.lang.Object r2 = r8.c
            k18 r2 = (defpackage.k18) r2
            java.lang.Object r2 = r2.getValue()
            ew7 r2 = (defpackage.ew7) r2
            r3 = 0
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L39
            txh r4 = defpackage.vxh.Companion     // Catch: java.lang.IllegalArgumentException -> L39
            zy7 r4 = r4.serializer()     // Catch: java.lang.IllegalArgumentException -> L39
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L39
            goto L48
        L39:
            r0 = move-exception
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "json parse error"
            defpackage.wqi.e(r2, r4, r0)
            r0 = r3
        L48:
            vxh r0 = (defpackage.vxh) r0
            g84 r2 = defpackage.g84.a
            if (r0 != 0) goto L50
        L4e:
            r8 = r1
            goto L70
        L50:
            byte[] r4 = r7.Z
            if (r4 == 0) goto L61
            java.lang.String r5 = r7.s0
            if (r5 == 0) goto L61
            java.lang.String r6 = r7.t0
            if (r6 == 0) goto L61
            hxh r3 = new hxh
            r3.<init>(r5, r6, r4)
        L61:
            java.lang.Object r8 = r8.f
            pv0 r8 = (defpackage.pv0) r8
            sv7 r4 = new sv7
            r4.<init>(r0, r3)
            java.lang.Object r8 = r8.h(r4, r7)
            if (r8 != r2) goto L4e
        L70:
            if (r8 != r2) goto L73
            return r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvh.n(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mkg extends dtf implements sm6 {
    public final /* synthetic */ CharSequence X;
    public final /* synthetic */ xkg Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkg(CharSequence charSequence, xkg xkgVar, Continuation continuation) {
        super(2, continuation);
        this.X = charSequence;
        this.Y = xkgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mkg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mkg(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r6.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L12
            defpackage.g8j.b(r7)
            return r0
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            defpackage.g8j.b(r7)
            return r0
        L1e:
            defpackage.g8j.b(r7)
            java.lang.CharSequence r7 = r6.X
            r2 = 0
            if (r7 == 0) goto L6b
            int r7 = r7.length()
            if (r7 != 0) goto L2d
            goto L6b
        L2d:
            xkg r7 = r6.Y
            ci5 r7 = r7.z0
            mmg r5 = new mmg
            r5.<init>(r4)
            defpackage.xfh.r(r7, r5)
            xkg r7 = r6.Y
            up7 r5 = r7.d
            if (r5 == 0) goto L41
            java.lang.String r2 = r5.d
        L41:
            rp7 r7 = r7.b
            rp7 r5 = defpackage.rp7.a
            if (r7 != r5) goto L5d
            if (r2 == 0) goto L5d
            int r7 = r2.length()
            if (r7 != 0) goto L50
            goto L5d
        L50:
            xkg r7 = r6.Y
            java.lang.CharSequence r3 = r6.X
            r6.o = r4
            java.lang.Object r7 = defpackage.xkg.t(r7, r3, r2, r6)
            if (r7 != r1) goto L6a
            goto L69
        L5d:
            xkg r7 = r6.Y
            java.lang.CharSequence r2 = r6.X
            r6.o = r3
            java.lang.Object r7 = defpackage.xkg.v(r7, r2, r6)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r0
        L6b:
            xkg r7 = r6.Y
            r7.C0 = r2
            xkg r7 = r6.Y
            java.lang.String r7 = r7.X
            java.lang.String r1 = "Can't auth with password because password is empty"
            defpackage.wqi.d(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkg.n(java.lang.Object):java.lang.Object");
    }
}

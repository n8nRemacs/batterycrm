package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rp2 extends dtf implements sm6 {
    public final /* synthetic */ j09 X;
    public final /* synthetic */ yq2 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp2(j09 j09Var, yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.X = j09Var;
        this.Y = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rp2 rp2Var = (rp2) l((w4i) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rp2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rp2 rp2Var = new rp2(this.X, this.Y, continuation);
        rp2Var.o = obj;
        return rp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            yq2 r0 = r5.Y
            ci5 r0 = r0.U0
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.o
            w4i r6 = (defpackage.w4i) r6
            int r6 = r6.ordinal()
            if (r6 == 0) goto L8b
            r1 = 1
            if (r6 == r1) goto L8b
            r1 = 2
            r2 = 4
            r5g r3 = defpackage.s5g.b
            j09 r4 = r5.X
            if (r6 == r1) goto L5d
            r1 = 3
            if (r6 == r1) goto L2b
            if (r6 == r2) goto L8b
            r1 = 5
            if (r6 != r1) goto L25
            goto L2b
        L25:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L2b:
            boolean r6 = r4 instanceof defpackage.b09
            if (r6 == 0) goto L37
            int r6 = defpackage.e3d.oneme_chatmedia_viewer_photo_download_error
            n5g r3 = new n5g
            r3.<init>(r6)
            goto L47
        L37:
            boolean r6 = r4 instanceof defpackage.h09
            if (r6 == 0) goto L43
            int r6 = defpackage.e3d.oneme_chatmedia_viewer_video_download_error
            n5g r3 = new n5g
            r3.<init>(r6)
            goto L47
        L43:
            boolean r6 = r4 instanceof defpackage.tz8
            if (r6 == 0) goto L57
        L47:
            vh5 r6 = new vh5
            int r1 = defpackage.ivd.l
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            r6.<init>(r3, r4, r2)
            defpackage.xfh.r(r0, r6)
            goto L8b
        L57:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L5d:
            boolean r6 = r4 instanceof defpackage.b09
            if (r6 == 0) goto L63
            r3 = 0
            goto L73
        L63:
            boolean r6 = r4 instanceof defpackage.h09
            if (r6 == 0) goto L6f
            int r6 = defpackage.e3d.oneme_chatmedia_viewer_video_download_complete
            n5g r3 = new n5g
            r3.<init>(r6)
            goto L73
        L6f:
            boolean r6 = r4 instanceof defpackage.tz8
            if (r6 == 0) goto L85
        L73:
            if (r3 == 0) goto L8b
            vh5 r6 = new vh5
            int r1 = defpackage.ivd.o
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            r6.<init>(r3, r4, r2)
            defpackage.xfh.r(r0, r6)
            goto L8b
        L85:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L8b:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp2.n(java.lang.Object):java.lang.Object");
    }
}

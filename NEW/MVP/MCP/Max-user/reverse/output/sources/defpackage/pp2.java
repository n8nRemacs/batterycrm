package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pp2 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ yq2 Y;
    public final /* synthetic */ int Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(int i, yq2 yq2Var, int i2, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = yq2Var;
        this.Z = i2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pp2 pp2Var = (pp2) l((w4i) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pp2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pp2 pp2Var = new pp2(this.X, this.Y, this.Z, continuation);
        pp2Var.o = obj;
        return pp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            yq2 r0 = r6.Y
            ci5 r0 = r0.U0
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.o
            w4i r7 = (defpackage.w4i) r7
            int r7 = r7.ordinal()
            if (r7 == 0) goto L88
            r1 = 1
            if (r7 == r1) goto L88
            r2 = 4
            int r3 = r6.X
            r4 = 2
            if (r7 == r4) goto L4a
            r5 = 3
            if (r7 == r5) goto L29
            if (r7 == r2) goto L88
            r5 = 5
            if (r7 != r5) goto L23
            goto L29
        L23:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L29:
            if (r3 == r1) goto L33
            if (r3 == r4) goto L30
            int r7 = defpackage.e3d.oneme_chatmedia_viewer_media_download_error
            goto L35
        L30:
            int r7 = defpackage.e3d.oneme_chatmedia_viewer_video_download_error
            goto L35
        L33:
            int r7 = defpackage.e3d.oneme_chatmedia_viewer_photo_download_error
        L35:
            vh5 r1 = new vh5
            n5g r3 = new n5g
            r3.<init>(r7)
            int r7 = defpackage.ivd.l
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r1.<init>(r3, r4, r2)
            defpackage.xfh.r(r0, r1)
            goto L88
        L4a:
            if (r3 == r1) goto L5e
            if (r3 == r4) goto L56
            int r7 = defpackage.e3d.oneme_chatmedia_viewer_all_media_download_complete
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            goto L5f
        L56:
            int r7 = defpackage.e3d.oneme_chatmedia_viewer_all_video_download_complete
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L88
            int r7 = r1.intValue()
            vh5 r1 = new vh5
            java.lang.Integer r3 = new java.lang.Integer
            int r4 = r6.Z
            r3.<init>(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            p5g r4 = new p5g
            java.util.List r3 = defpackage.ys.D(r3)
            r4.<init>(r7, r3)
            int r7 = defpackage.ivd.o
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            r1.<init>(r4, r3, r2)
            defpackage.xfh.r(r0, r1)
        L88:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp2.n(java.lang.Object):java.lang.Object");
    }
}

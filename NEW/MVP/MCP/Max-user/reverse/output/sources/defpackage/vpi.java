package defpackage;

/* loaded from: classes.dex */
public abstract class vpi implements nda {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d8h a(defpackage.u8h r5) {
        /*
            java.lang.String r0 = r5.b
            f2 r1 = new f2
            r2 = 0
            zg5 r3 = defpackage.gsc.w0
            r1.<init>(r2, r3)
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            r3 = r2
            gsc r3 = (defpackage.gsc) r3
            java.lang.String r3 = r3.a
            r4 = 0
            boolean r3 = defpackage.vmf.s(r3, r0, r4)
            if (r3 == 0) goto La
            goto L22
        L21:
            r2 = 0
        L22:
            gsc r2 = (defpackage.gsc) r2
            if (r2 != 0) goto L28
            gsc r2 = defpackage.gsc.s0
        L28:
            int r1 = r5.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r5 = r5.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Range r5 = android.util.Range.create(r1, r5)
            int r1 = r0.hashCode()
            switch(r1) {
                case 51756: goto L64;
                case 54453: goto L58;
                case 1507671: goto L4c;
                case 1538361: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L6c
        L40:
            java.lang.String r1 = "2160"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L6c
        L49:
            fb0 r0 = defpackage.fb0.g
            goto L71
        L4c:
            java.lang.String r1 = "1080"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
            goto L6c
        L55:
            fb0 r0 = defpackage.fb0.f
            goto L71
        L58:
            java.lang.String r1 = "720"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L61
            goto L6c
        L61:
            fb0 r0 = defpackage.fb0.e
            goto L71
        L64:
            java.lang.String r1 = "480"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
        L6c:
            fb0 r0 = defpackage.fb0.d
            goto L71
        L6f:
            fb0 r0 = defpackage.fb0.d
        L71:
            d8h r1 = new d8h
            r1.<init>(r5, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpi.a(u8h):d8h");
    }

    public static final x9f b(g56 g56Var, v38 v38Var) {
        return svi.e(v38Var, null, null, new u38(v38Var, new s38(g56Var, null), null), 3);
    }
}

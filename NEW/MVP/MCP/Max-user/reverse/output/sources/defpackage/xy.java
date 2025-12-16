package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class xy implements Serializable {
    public final s00 a;
    public final boolean b;
    public final boolean c;

    public xy(s00 s00Var, boolean z, boolean z2) {
        this.a = s00Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0e7d, code lost:
    
        if (r9 != 0) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0e7f, code lost:
    
        r146 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0e82, code lost:
    
        r146 = r9;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:1036:0x1458  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0a39 A[PHI: r140
  0x0a39: PHI (r140v29 int) = (r140v21 int), (r140v22 int), (r140v23 int), (r140v24 int), (r140v25 int), (r140v26 int), (r140v27 int), (r140v30 int) binds: [B:678:0x0a8b, B:674:0x0a7e, B:670:0x0a71, B:666:0x0a66, B:662:0x0a5a, B:658:0x0a4f, B:654:0x0a44, B:651:0x0a37] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0bf9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0c3c A[PHI: r131
  0x0c3c: PHI (r131v15 int) = (r131v7 int), (r131v8 int), (r131v9 int), (r131v10 int), (r131v11 int), (r131v12 int), (r131v13 int), (r131v16 int) binds: [B:764:0x0c95, B:760:0x0c88, B:756:0x0c7b, B:752:0x0c6e, B:748:0x0c60, B:744:0x0c53, B:740:0x0c48, B:737:0x0c3a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:804:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x0e85 A[PHI: r128 r129 r130 r140 r141
  0x0e85: PHI (r128v2 int) = (r128v3 int), (r128v6 int), (r128v7 int) binds: [B:726:0x0c03, B:851:0x0e3d, B:847:0x0e21] A[DONT_GENERATE, DONT_INLINE]
  0x0e85: PHI (r129v91 boolean) = (r129v92 boolean), (r129v94 boolean), (r129v95 boolean) binds: [B:726:0x0c03, B:851:0x0e3d, B:847:0x0e21] A[DONT_GENERATE, DONT_INLINE]
  0x0e85: PHI (r130v4 java.lang.String) = (r130v5 java.lang.String), (r130v7 java.lang.String), (r130v8 java.lang.String) binds: [B:726:0x0c03, B:851:0x0e3d, B:847:0x0e21] A[DONT_GENERATE, DONT_INLINE]
  0x0e85: PHI (r140v2 int) = (r140v3 int), (r140v5 int), (r140v6 int) binds: [B:726:0x0c03, B:851:0x0e3d, B:847:0x0e21] A[DONT_GENERATE, DONT_INLINE]
  0x0e85: PHI (r141v3 java.lang.String) = (r141v4 java.lang.String), (r141v6 java.lang.String), (r141v7 java.lang.String) binds: [B:726:0x0c03, B:851:0x0e3d, B:847:0x0e21] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x1093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xy b(defpackage.tm9 r155) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 7506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy.b(tm9):xy");
    }

    public HashMap a() {
        HashMap map = new HashMap();
        map.put("_type", this.a.a);
        return map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attach{type=");
        sb.append(this.a);
        sb.append(", deleted=");
        sb.append(this.b);
        sb.append(", sensitive=");
        return az1.k(sb, this.c, "}");
    }
}

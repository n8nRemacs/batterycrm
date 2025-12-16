package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C37146p;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37170q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358466g = new com.google.android.play.core.assetpacks.internal.F("ExtractChunkTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f358467a = new byte[8192];

    /* renamed from: b, reason: collision with root package name */
    public final Q f358468b;

    /* renamed from: c, reason: collision with root package name */
    public final C37196z0 f358469c;

    /* renamed from: d, reason: collision with root package name */
    public final C37165o1 f358470d;

    /* renamed from: e, reason: collision with root package name */
    public final C37146p f358471e;

    /* renamed from: f, reason: collision with root package name */
    public final C37146p f358472f;

    public C37170q0(Q q12, C37146p c37146p, C37146p c37146p2, C37196z0 c37196z0, C37165o1 c37165o1) {
        this.f358468b = q12;
        this.f358471e = c37146p;
        this.f358472f = c37146p2;
        this.f358469c = c37196z0;
        this.f358470d = c37165o1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:172|10|(2:12|(12:14|(2:16|(1:(7:19|166|20|(2:21|(2:23|179)(1:178))|28|(1:30)(1:31)|(1:33)(2:35|36))(2:45|46))(2:47|(10:49|(9:74|(1:76)|183|(4:77|(3:81|(1:83)(1:84)|(1:95)(3:86|(1:88)(1:89)|(4:91|(1:93)|185|94)(0)))|96|(1:98)(1:181))|100|(1:102)|103|(1:105)(1:106)|(2:108|(1:110)(2:111|(1:113)(4:114|(4:116|(1:118)|119|(2:122|123))(1:124)|121|125))))|126|127|(2:173|129)|134|170|135|138|(4:140|394|144|145)(1:149))(2:50|51)))(2:52|(4:54|(4:55|(1:57)|58|(1:62)(1:186))|63|(1:65)(1:66))(2:67|68))|34|(0)|126|127|(0)|134|170|135|138|(0)(0))(2:69|70))(1:71)|72|(0)|126|127|(0)|134|170|135|138|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x036d, code lost:
    
        com.google.android.play.core.assetpacks.C37170q0.f358466g.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r26.f358456h), r26.f358454f, r26.f358231b);
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:10:0x0057, B:12:0x005d, B:14:0x0069, B:19:0x0074, B:28:0x009e, B:74:0x01d9, B:76:0x01f2, B:77:0x01f5, B:79:0x01fd, B:81:0x0201, B:86:0x020c, B:91:0x0220, B:93:0x0240, B:94:0x024c, B:89:0x0214, B:95:0x0250, B:96:0x0255, B:98:0x0259, B:100:0x025d, B:102:0x0261, B:103:0x026f, B:108:0x027c, B:110:0x0280, B:111:0x0292, B:113:0x0296, B:114:0x02a5, B:116:0x02a9, B:118:0x02d2, B:119:0x02d5, B:125:0x0303, B:122:0x02e9, B:123:0x02f0, B:124:0x02f1, B:35:0x00b2, B:36:0x00bb, B:44:0x00c9, B:43:0x00c6, B:45:0x00ca, B:46:0x00e4, B:47:0x00e5, B:49:0x011f, B:50:0x012d, B:51:0x0136, B:52:0x0137, B:54:0x0151, B:55:0x015f, B:57:0x0172, B:58:0x0177, B:63:0x0185, B:65:0x018e, B:67:0x01a8, B:68:0x01b1, B:69:0x01b2, B:70:0x01d4, B:39:0x00c0, B:20:0x008c, B:21:0x008f, B:23:0x0095), top: B:172:0x0057, outer: #2, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0250 A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:10:0x0057, B:12:0x005d, B:14:0x0069, B:19:0x0074, B:28:0x009e, B:74:0x01d9, B:76:0x01f2, B:77:0x01f5, B:79:0x01fd, B:81:0x0201, B:86:0x020c, B:91:0x0220, B:93:0x0240, B:94:0x024c, B:89:0x0214, B:95:0x0250, B:96:0x0255, B:98:0x0259, B:100:0x025d, B:102:0x0261, B:103:0x026f, B:108:0x027c, B:110:0x0280, B:111:0x0292, B:113:0x0296, B:114:0x02a5, B:116:0x02a9, B:118:0x02d2, B:119:0x02d5, B:125:0x0303, B:122:0x02e9, B:123:0x02f0, B:124:0x02f1, B:35:0x00b2, B:36:0x00bb, B:44:0x00c9, B:43:0x00c6, B:45:0x00ca, B:46:0x00e4, B:47:0x00e5, B:49:0x011f, B:50:0x012d, B:51:0x0136, B:52:0x0137, B:54:0x0151, B:55:0x015f, B:57:0x0172, B:58:0x0177, B:63:0x0185, B:65:0x018e, B:67:0x01a8, B:68:0x01b1, B:69:0x01b2, B:70:0x01d4, B:39:0x00c0, B:20:0x008c, B:21:0x008f, B:23:0x0095), top: B:172:0x0057, outer: #2, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.play.core.assetpacks.C37167p0 r26) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C37170q0.a(com.google.android.play.core.assetpacks.p0):void");
    }
}

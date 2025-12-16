package defpackage;

import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class s6d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ s6d(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0140 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012c, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:65:0x0149, B:67:0x014f, B:69:0x0155, B:70:0x017e, B:73:0x01a2, B:75:0x01ba, B:76:0x01bf, B:78:0x01cb, B:80:0x01cf, B:82:0x01d3, B:84:0x01d6, B:85:0x01dc, B:86:0x01e5, B:88:0x01e8, B:89:0x01ee, B:91:0x01f9, B:93:0x01fd, B:95:0x0201, B:97:0x0204, B:98:0x020a, B:99:0x0213, B:101:0x0216, B:102:0x021c, B:103:0x0225, B:108:0x0231, B:110:0x0235, B:111:0x023f, B:112:0x0244, B:114:0x0248, B:116:0x0252, B:117:0x0256, B:119:0x025a, B:121:0x0260, B:123:0x026f, B:124:0x0274, B:106:0x022b, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012c, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:65:0x0149, B:67:0x014f, B:69:0x0155, B:70:0x017e, B:73:0x01a2, B:75:0x01ba, B:76:0x01bf, B:78:0x01cb, B:80:0x01cf, B:82:0x01d3, B:84:0x01d6, B:85:0x01dc, B:86:0x01e5, B:88:0x01e8, B:89:0x01ee, B:91:0x01f9, B:93:0x01fd, B:95:0x0201, B:97:0x0204, B:98:0x020a, B:99:0x0213, B:101:0x0216, B:102:0x021c, B:103:0x0225, B:108:0x0231, B:110:0x0235, B:111:0x023f, B:112:0x0244, B:114:0x0248, B:116:0x0252, B:117:0x0256, B:119:0x025a, B:121:0x0260, B:123:0x026f, B:124:0x0274, B:106:0x022b, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012c, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:65:0x0149, B:67:0x014f, B:69:0x0155, B:70:0x017e, B:73:0x01a2, B:75:0x01ba, B:76:0x01bf, B:78:0x01cb, B:80:0x01cf, B:82:0x01d3, B:84:0x01d6, B:85:0x01dc, B:86:0x01e5, B:88:0x01e8, B:89:0x01ee, B:91:0x01f9, B:93:0x01fd, B:95:0x0201, B:97:0x0204, B:98:0x020a, B:99:0x0213, B:101:0x0216, B:102:0x021c, B:103:0x0225, B:108:0x0231, B:110:0x0235, B:111:0x023f, B:112:0x0244, B:114:0x0248, B:116:0x0252, B:117:0x0256, B:119:0x025a, B:121:0x0260, B:123:0x026f, B:124:0x0274, B:106:0x022b, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012c, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:65:0x0149, B:67:0x014f, B:69:0x0155, B:70:0x017e, B:73:0x01a2, B:75:0x01ba, B:76:0x01bf, B:78:0x01cb, B:80:0x01cf, B:82:0x01d3, B:84:0x01d6, B:85:0x01dc, B:86:0x01e5, B:88:0x01e8, B:89:0x01ee, B:91:0x01f9, B:93:0x01fd, B:95:0x0201, B:97:0x0204, B:98:0x020a, B:99:0x0213, B:101:0x0216, B:102:0x021c, B:103:0x0225, B:108:0x0231, B:110:0x0235, B:111:0x023f, B:112:0x0244, B:114:0x0248, B:116:0x0252, B:117:0x0256, B:119:0x025a, B:121:0x0260, B:123:0x026f, B:124:0x0274, B:106:0x022b, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6d.run():void");
    }
}

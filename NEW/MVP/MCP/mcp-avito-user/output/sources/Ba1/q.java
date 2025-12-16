package Ba1;

import java.io.File;

/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1523a = {"goldfish"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1524b = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1525c = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1526d = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f1527e = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f1528f = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        r1 = r1.getInstalledApplications(128).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        if (r1.hasNext() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0193, code lost:
    
        r2 = r1.next().packageName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a1, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.vphone.", false) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ab, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.bignox.", false) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b5, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.nox.mopen.app", false) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01bf, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "me.haima.", false) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c6, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.bluestacks.", false) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cf, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "cn.itools.", false) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d7, code lost:
    
        if (kotlin.text.C43066x.h0(android.os.Build.PRODUCT, "iToolsAVM", false) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e0, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.kop.", false) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e9, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.kaopu.", false) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f2, code lost:
    
        if (kotlin.text.C43066x.h0(r2, "com.microvirt.", false) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01fb, code lost:
    
        if (r2.equals("com.google.android.launcher.layouts.genymotion") == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fe, code lost:
    
        r14 = ((android.app.ActivityManager) r14.getSystemService("activity")).getRunningServices(30).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0214, code lost:
    
        if (r14.hasNext() == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0226, code lost:
    
        if (kotlin.text.C43066x.h0(r14.next().service.getClassName(), "com.bluestacks.", false) == false) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ba1.q.a(android.content.Context):boolean");
    }

    public static boolean b(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }
}

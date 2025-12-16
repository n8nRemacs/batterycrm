package defpackage;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ru.ok.android.commons.app.ApplicationProvider;

/* loaded from: classes.dex */
public abstract class mri {
    public static Application a() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oh8 b(defpackage.pzf r7) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mri.b(pzf):oh8");
    }

    public static int c() throws PackageManager.NameNotFoundException {
        Integer num = ApplicationProvider.b;
        if (num != null) {
            return num.intValue();
        }
        PackageInfo packageInfo = a().getPackageManager().getPackageInfo(a().getPackageName(), 0);
        int i = packageInfo.versionCode;
        ApplicationProvider.b = Integer.valueOf(i);
        if (ApplicationProvider.c == null) {
            ApplicationProvider.c = packageInfo.versionName;
        }
        return i;
    }

    public static String d() throws PackageManager.NameNotFoundException {
        String str = ApplicationProvider.c;
        if (str != null) {
            return str;
        }
        Application applicationA = a();
        PackageInfo packageInfo = applicationA.getPackageManager().getPackageInfo(applicationA.getPackageName(), 0);
        String str2 = packageInfo.versionName;
        ApplicationProvider.c = str2;
        if (ApplicationProvider.b == null) {
            ApplicationProvider.b = Integer.valueOf(packageInfo.versionCode);
        }
        return str2;
    }

    public static final void e(esg esgVar) {
        esgVar.d(587, new rzg(6));
        esgVar.b(1, new qzg(5));
        esgVar.d(588, new rzg(7));
        esgVar.d(589, new rzg(8));
        esgVar.d(590, new b4e(22));
        esgVar.d(591, new b4e(23));
        esgVar.d(592, new b4e(24));
        esgVar.b(2, new qzg(6));
        esgVar.b(5, new qzg(7));
        esgVar.b(5, new qzg(8));
        esgVar.b(5, new qzg(9));
        esgVar.b(5, new qzg(10));
        esgVar.b(5, new qzg(11));
        esgVar.b(5, new qzg(12));
        esgVar.d(593, new qzg(14));
        esgVar.b(5, new qzg(13));
        esgVar.b(5, new qzg(1));
        esgVar.b(5, new qzg(2));
        esgVar.b(5, new qzg(3));
        esgVar.b(2, new qzg(4));
    }
}

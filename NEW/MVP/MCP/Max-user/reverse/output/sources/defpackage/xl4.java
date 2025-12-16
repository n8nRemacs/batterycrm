package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class xl4 extends kk4 {
    @Override // defpackage.kk4
    public final Signature[] x(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z4j {
    public static int a(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strD = kq.d(str);
            if (strD != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = lq.c(context);
                    iC = lq.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = lq.a(appOpsManagerC, strD, iMyUid, lq.b(context));
                    }
                } else {
                    iC = kq.c((AppOpsManager) kq.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static Object b(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(ho7.f(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int c(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iH = t2i.h(obj);
        int i4 = iH & i;
        int iE = e(i4, obj3);
        if (iE != 0) {
            int i5 = ~i;
            int i6 = iH & i5;
            int i7 = -1;
            while (true) {
                i2 = iE - 1;
                i3 = iArr[i2];
                if ((i3 & i5) == i6 && uyi.c(obj, objArr[i2]) && (objArr2 == null || uyi.c(obj2, objArr2[i2]))) {
                    break;
                }
                int i8 = i3 & i;
                if (i8 == 0) {
                    break;
                }
                i7 = i2;
                iE = i8;
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                f(i4, i9, obj3);
                return i2;
            }
            iArr[i7] = c(iArr[i7], i9, i);
            return i2;
        }
        return -1;
    }

    public static int e(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void f(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}

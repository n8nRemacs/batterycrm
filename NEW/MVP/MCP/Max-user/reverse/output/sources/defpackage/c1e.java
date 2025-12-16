package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public final class c1e {
    public static final /* synthetic */ c1e a = new c1e();
    public static final String b = d1e.class.getSimpleName();
    public static final String[] c;

    static {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = (i < 29 || i == 29) ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : i >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        c = strArr;
    }
}

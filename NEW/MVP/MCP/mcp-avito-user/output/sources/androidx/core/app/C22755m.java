package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import j.X;

/* compiled from: AppOpsManagerCompat.java */
/* renamed from: androidx.core.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22755m {

    /* compiled from: AppOpsManagerCompat.java */
    @X
    /* renamed from: androidx.core.app.m$a */
    public static class a {
    }

    /* compiled from: AppOpsManagerCompat.java */
    @X
    /* renamed from: androidx.core.app.m$b */
    public static class b {
        @j.N
        public static String a(@j.N Context context) {
            return context.getOpPackageName();
        }
    }

    public static int a(@j.N Context context, @j.N String str, @j.N String str2, int i12) {
        if (Build.VERSION.SDK_INT < 29) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        int iCheckOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(str, Binder.getCallingUid(), str2);
        if (iCheckOpNoThrow != 0) {
            return iCheckOpNoThrow;
        }
        String strA = b.a(context);
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i12, strA);
    }
}

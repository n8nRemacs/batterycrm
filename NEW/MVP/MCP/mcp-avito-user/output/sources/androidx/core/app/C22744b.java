package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RestrictTo;
import j.X;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22744b extends androidx.core.content.d {

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$a */
    public class a implements Runnable {
        public a() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    public static class C1716b {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$c */
    public static class c {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$d */
    public static class d {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$e */
    public static class e {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$f */
    public static class f {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$g */
    public static class g {
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$h */
    public static class h {
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$i */
    public interface i {
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$j */
    public interface j {
    }

    /* compiled from: ActivityCompat.java */
    @RestrictTo
    /* renamed from: androidx.core.app.b$k */
    public interface k {
        void validateRequestPermissionsRequestCode(int i12);
    }

    /* compiled from: ActivityCompat.java */
    @X
    /* renamed from: androidx.core.app.b$l */
    public static class l extends SharedElementCallback {
        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        @X
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@j.N Activity activity, @j.N String[] strArr, @j.F int i12) {
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < strArr.length; i13++) {
            if (TextUtils.isEmpty(strArr[i13])) {
                throw new IllegalArgumentException(AK.c.s(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i13], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i13));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < strArr.length; i15++) {
                if (!hashSet.contains(Integer.valueOf(i15))) {
                    strArr2[i14] = strArr[i15];
                    i14++;
                }
            }
        }
        if (activity instanceof k) {
            ((k) activity).validateRequestPermissionsRequestCode(i12);
        }
        activity.requestPermissions(strArr, i12);
    }

    public static boolean b(@j.N Activity activity, @j.N String str) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i12 >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (i12 != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}

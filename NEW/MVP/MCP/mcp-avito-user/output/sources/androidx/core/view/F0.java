package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class F0 {

    /* compiled from: WindowCompat.java */
    public static class a {
    }

    /* compiled from: WindowCompat.java */
    @j.X
    public static class b {
    }

    /* compiled from: WindowCompat.java */
    @j.X
    public static class c {
        public static void a(@j.N Window window, boolean z12) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z12 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z12);
        }
    }

    /* compiled from: WindowCompat.java */
    @j.X
    public static class d {
        public static void a(@j.N Window window, boolean z12) {
            window.setDecorFitsSystemWindows(z12);
        }
    }

    public static void a(@j.N Window window, boolean z12) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35) {
            d.a(window, z12);
        } else {
            if (i12 >= 30) {
                c.a(window, z12);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z12 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}

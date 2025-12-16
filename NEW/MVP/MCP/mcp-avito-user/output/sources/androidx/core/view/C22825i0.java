package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: ViewConfigurationCompat.java */
/* renamed from: androidx.core.view.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22825i0 {

    /* compiled from: ViewConfigurationCompat.java */
    @j.X
    /* renamed from: androidx.core.view.i0$a */
    public static class a {
    }

    /* compiled from: ViewConfigurationCompat.java */
    @j.X
    /* renamed from: androidx.core.view.i0$b */
    public static class b {
        public static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    @j.X
    /* renamed from: androidx.core.view.i0$c */
    public static class c {
        public static int a(@j.N ViewConfiguration viewConfiguration, int i12, int i13, int i14) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i12, i13, i14);
        }

        public static int b(@j.N ViewConfiguration viewConfiguration, int i12, int i13, int i14) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i12, i13, i14);
        }
    }

    public static boolean a(@j.N ViewConfiguration viewConfiguration, @j.N Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}

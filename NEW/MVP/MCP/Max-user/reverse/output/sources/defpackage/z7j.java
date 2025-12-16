package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class z7j {
    public static void a(se4 se4Var) {
        if (se4Var != null) {
            try {
                se4Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Object b(TextView textView, String str) {
        try {
            Field declaredField = textView.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(textView);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static final void c(ca3 ca3Var, TabLayout tabLayout, String str, Integer num) {
        try {
            Field declaredField = ca3Var.a().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(tabLayout, num);
        } catch (Throwable unused) {
        }
    }

    public static final void d(Object obj, String str, Drawable drawable) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, drawable);
        } catch (Exception unused) {
        }
    }
}

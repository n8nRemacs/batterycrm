package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class vhh {
    public static final cih a;
    public static final r72 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new dih();
        } else {
            a = new cih();
        }
        b = new r72(Float.class, "translationAlpha", 11);
        new r72(Rect.class, "clipBounds", 12);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a.e(view, i);
    }
}

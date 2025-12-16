package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class whh {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        c = Build.VERSION.SDK_INT >= 27;
    }
}

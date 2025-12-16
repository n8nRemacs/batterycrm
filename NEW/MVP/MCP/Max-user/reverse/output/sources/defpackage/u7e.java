package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u7e {
    public Method a;
    public Method b;
    public Method c;

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}

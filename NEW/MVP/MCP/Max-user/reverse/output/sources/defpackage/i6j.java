package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i6j {
    public static Context a(Context context) {
        int iC;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iC = to0.c(context)) != to0.c(applicationContext)) {
            applicationContext = to0.a(applicationContext, iC);
        }
        if (i >= 30) {
            String strB = n44.b(context);
            if (!Objects.equals(strB, n44.b(applicationContext))) {
                return n44.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }

    public static String b(int i) {
        return wy1.e(i, "ProfileEditItemId(value=", ")");
    }
}

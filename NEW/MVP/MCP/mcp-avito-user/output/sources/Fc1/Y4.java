package Fc1;

import android.annotation.SuppressLint;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Build;
import java.lang.reflect.Field;

/* loaded from: classes9.dex */
public final class Y4 {
    @SuppressLint({"DiscouragedPrivateApi"})
    public static final void a(@Y61.k Cursor cursor) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        CursorWindow cursorWindow;
        if (Build.VERSION.SDK_INT >= 28) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            cursorWindow = O2.c(10485760);
        } else {
            kotlin.jvm.internal.u0 u0Var2 = kotlin.jvm.internal.u0.f406856a;
            cursorWindow = new CursorWindow("");
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            declaredField.set(cursorWindow, 10485760);
        }
        ((AbstractWindowedCursor) cursor).setWindow(cursorWindow);
    }
}

package androidx.transition;

import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtilsBase.java */
/* loaded from: classes10.dex */
class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f54811a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f54812b;

    public void a(@j.N View view, int i12) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f54812b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f54811a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f54812b = true;
        }
        Field field = f54811a;
        if (field != null) {
            try {
                f54811a.setInt(view, i12 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}

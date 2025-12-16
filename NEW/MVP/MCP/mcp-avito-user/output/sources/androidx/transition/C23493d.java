package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.java */
/* renamed from: androidx.transition.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23493d {

    /* renamed from: a, reason: collision with root package name */
    public static Method f54738a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f54739b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f54740c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@j.N Canvas canvas, boolean z12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            if (z12) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i12 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f54740c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f54738a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f54739b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f54740c = true;
        }
        if (z12) {
            try {
                Method method2 = f54738a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12.getCause());
            }
        }
        if (z12 || (method = f54739b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}

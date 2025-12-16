package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: CanvasUtils.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/P;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final P f39294a = new P();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static Method f39295b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public static Method f39296c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f39297d;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@Y61.k Canvas canvas, boolean z12) {
        Method method;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            Q.f39316a.getClass();
            if (z12) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f39297d) {
            try {
                if (i12 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f39295b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f39296c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f39295b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f39296c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f39295b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f39296c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f39297d = true;
        }
        if (z12) {
            try {
                Method method4 = f39295b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z12 || (method = f39296c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}

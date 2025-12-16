package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/x0;", "Landroidx/compose/ui/platform/u0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22542x0 implements InterfaceC22530u0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22542x0 f41637b = new C22542x0();

    @Override // androidx.compose.ui.platform.InterfaceC22530u0
    @Y61.k
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect a(@Y61.k Activity activity) throws Exception {
        Object obj;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]));
            } else {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]));
            }
        } catch (Exception e12) {
            if (!(e12 instanceof NoSuchFieldException ? true : e12 instanceof NoSuchMethodException ? true : e12 instanceof IllegalAccessException ? true : e12 instanceof InvocationTargetException)) {
                throw e12;
            }
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i12 = rect.bottom + dimensionPixelSize;
            if (i12 == point.y) {
                rect.bottom = i12;
            } else {
                int i13 = rect.right + dimensionPixelSize;
                if (i13 == point.x) {
                    rect.right = i13;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (Exception e13) {
                if (!(e13 instanceof ClassNotFoundException ? true : e13 instanceof NoSuchMethodException ? true : e13 instanceof NoSuchFieldException ? true : e13 instanceof IllegalAccessException ? true : e13 instanceof InvocationTargetException ? true : e13 instanceof InstantiationException)) {
                    throw e13;
                }
            }
            DisplayCutout displayCutout = obj instanceof DisplayCutout ? (DisplayCutout) obj : null;
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}

package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.core.view.J0;
import j.X;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import n2.C44168a;
import n2.C44169b;

/* compiled from: WindowMetricsCalculatorCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/s;", "Landroidx/window/layout/p;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final s f55349b = new s();

    static {
        C42745f0.j(1, 2, 4, 8, 16, 32, 64, 128);
    }

    @Y61.k
    public static o a(@Y61.k Activity activity) throws Exception {
        Rect rect;
        J0 j0A;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            n2.d.f414853a.getClass();
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        } else {
            if (i12 >= 29) {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    rect = new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
                } catch (IllegalAccessException unused) {
                    rect = c(activity);
                } catch (NoSuchFieldException unused2) {
                    rect = c(activity);
                } catch (NoSuchMethodException unused3) {
                    rect = c(activity);
                } catch (InvocationTargetException unused4) {
                    rect = c(activity);
                }
            } else if (i12 >= 28) {
                rect = c(activity);
            } else {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                C44168a.f414851a.getClass();
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i13 = rect.bottom + dimensionPixelSize;
                    if (i13 == point.y) {
                        rect.bottom = i13;
                    } else {
                        int i14 = rect.right + dimensionPixelSize;
                        if (i14 == point.x) {
                            rect.right = i14;
                        }
                    }
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30) {
            j0A = new J0.b().a();
        } else {
            if (i15 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            j0A = n2.d.f414853a.a(activity);
        }
        return new o(new androidx.window.core.c(rect), j0A);
    }

    @Y61.k
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @X
    public static Rect c(@Y61.k Activity activity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            C44168a.f414851a.getClass();
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]));
            } else {
                rect.set((Rect) obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]));
            }
        } catch (IllegalAccessException unused) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException unused2) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException unused3) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException unused4) {
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        C44168a.f414851a.getClass();
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
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused5) {
            }
            DisplayCutout displayCutoutL = androidx.media.p.A(obj) ? androidx.media.p.l(obj) : null;
            if (displayCutoutL != null) {
                int i14 = rect.left;
                n2.e.f414854a.getClass();
                if (i14 == displayCutoutL.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutL.getSafeInsetRight()) {
                    rect.right = displayCutoutL.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutL.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutL.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutL.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final o b(@Y61.k Context context) {
        J0 j02 = null;
        Object[] objArr = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            n2.d.f414853a.getClass();
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            return new o(windowManager.getCurrentWindowMetrics().getBounds(), J0.s(null, windowManager.getCurrentWindowMetrics().getWindowInsets()));
        }
        C44169b.f414852a.getClass();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            boolean z12 = baseContext instanceof Activity;
            if (!z12 && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            if (z12) {
                return a((Activity) baseContext);
            }
            if (baseContext instanceof InputMethodService) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                return new o(new Rect(0, 0, point.x, point.y), j02, 2, objArr == true ? 1 : 0);
            }
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}

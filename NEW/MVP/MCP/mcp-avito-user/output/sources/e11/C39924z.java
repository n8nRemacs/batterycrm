package e11;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: e11.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39924z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f394913b = 0;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Context f394914a;

    /* renamed from: e11.z$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final float f394915a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f394916b;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            f394915a = displayMetrics.density;
            f394916b = displayMetrics.densityDpi;
        }
    }

    /* renamed from: e11.z$b */
    public static class b extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f394917a;

        public b(@j.N String str) {
            this.f394917a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        @TargetApi(18)
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.f394917a);
        }
    }

    static {
        new AtomicInteger(1);
    }

    public C39924z(@j.N Context context) {
        this.f394914a = context;
    }

    public static int b(int i12) {
        float[] fArr = new float[3];
        Color.colorToHSV(i12, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    public static int c(int i12, @j.N Context context) {
        return (int) TypedValue.applyDimension(1, i12, context.getResources().getDisplayMetrics());
    }

    public static int d(int... iArr) {
        int iMax = 0;
        for (int i12 : iArr) {
            iMax = Math.max(i12, iMax);
        }
        return iMax;
    }

    public static void e(int i12, int i13, int i14, int i15, @j.N View... viewArr) {
        int i16 = i14 - i12;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                p(view, ((i16 - view.getMeasuredHeight()) / 2) + i12, i13);
                if (view.getMeasuredWidth() > 0) {
                    i13 = view.getMeasuredWidth() + i15 + i13;
                }
            }
        }
    }

    public static void f(int i12, int i13, int i14, @j.P View view) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i12, i14), View.MeasureSpec.makeMeasureSpec(i13, i14));
    }

    public static void g(@j.N View view, int i12, int i13) {
        ColorDrawable colorDrawable = new ColorDrawable(i12);
        ColorDrawable colorDrawable2 = new ColorDrawable(i13);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, colorDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, colorDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{b(i13), b(i12)}), stateListDrawable, null));
    }

    public static void h(@j.P View view, int i12, int i13, int i14, int i15) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = (((i14 - i12) - view.getMeasuredWidth()) / 2) + i12;
        int measuredHeight = (((i15 - i13) - view.getMeasuredHeight()) / 2) + i13;
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    public static void i(@j.N View view, int i12, int i13, int i14, int i15, int i16) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i12, i12});
        float f12 = i16;
        gradientDrawable.setCornerRadius(f12);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i13, i13});
        gradientDrawable2.setCornerRadius(f12);
        if (i14 != 0) {
            gradientDrawable.setStroke(i15, i14);
            gradientDrawable2.setStroke(i15, i14);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{b(i13), b(i12)}), stateListDrawable, null));
    }

    public static boolean j(@j.N Activity activity, @j.N View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    @j.N
    public static Point k(@j.N Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return point;
        }
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay == null) {
                return point;
            }
            defaultDisplay.getSize(point);
            return point;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i12 = insetsIgnoringVisibility.left + insetsIgnoringVisibility.right;
        int i13 = insetsIgnoringVisibility.bottom + insetsIgnoringVisibility.top;
        Rect bounds = currentWindowMetrics.getBounds();
        point.y = bounds.height() - i13;
        point.x = bounds.width() - i12;
        return point;
    }

    public static void l(@j.N View view, int i12, int i13) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i13 - view.getMeasuredWidth(), i12, i13, view.getMeasuredHeight() + i12);
    }

    public static void m(@j.N View view, @j.N String str) {
        view.setAccessibilityDelegate(new b(str));
    }

    public static void n(@j.N Button button, int i12, int i13, int i14) {
        i(button, i12, i13, 0, 0, i14);
    }

    public static int o(int i12) {
        return Math.round(i12 / (a.f394916b / 160.0f));
    }

    public static void p(@j.P View view, int i12, int i13) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i13, i12, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + i12);
    }

    @j.P
    public static String q(@j.N Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        int i12 = 0;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i12 = configuration.orientation;
        }
        if (i12 == 2) {
            return "landscape";
        }
        if (i12 == 1) {
            return "portrait";
        }
        return null;
    }

    public static void r(@j.N View view, int i12, int i13) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i13 - view.getMeasuredWidth(), i12 - view.getMeasuredHeight(), i13, i12);
    }

    public static void s(@j.P View view, int i12, int i13) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i13, i12 - view.getMeasuredHeight(), view.getMeasuredWidth() + i13, i12);
    }

    public final int a(float f12) {
        return (int) TypedValue.applyDimension(1, f12, this.f394914a.getResources().getDisplayMetrics());
    }
}

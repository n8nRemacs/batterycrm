package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public abstract class r69 {
    public static final int a = nvc.mr_dynamic_dialog_icon_light;

    public static ContextThemeWrapper a(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, !z ? fvc.dialogTheme : fvc.alertDialogTheme));
        return g(contextThemeWrapper, avc.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(Context context) {
        return rf3.d(-1, f(context, fvc.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawableA = eri.a(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        if (h(context)) {
            t35.g(drawableA, s34.a(context, a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableA;
    }

    public static int e(Context context) {
        return h(context) ? b(context) == -570425344 ? l5d.Theme_MediaRouter_Light : l5d.Theme_MediaRouter_Light_DarkControlPanel : b(context) == -570425344 ? l5d.Theme_MediaRouter_LightControlPanel : l5d.Theme_MediaRouter;
    }

    public static int f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean h(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(fvc.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void i(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(s34.a(context, h(context) ? nvc.mr_cast_progressbar_progress_and_thumb_light : nvc.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}

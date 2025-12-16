package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes.dex */
public abstract class exi {
    public static float a(int i, String[] strArr) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(int i, int i2, Context context) {
        TypedValue typedValueE = wsi.e(context, i);
        return (typedValueE == null || typedValueE.type != 16) ? i2 : typedValueE.data;
    }

    public static TimeInterpolator d(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!b(strValueOf, "cubic-bezier") && !b(strValueOf, ClientCookie.PATH_ATTR)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!b(strValueOf, "cubic-bezier")) {
            if (b(strValueOf, ClientCookie.PATH_ATTR)) {
                return wob.c(ve3.f(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return wob.b(a(0, strArrSplit), a(1, strArrSplit), a(2, strArrSplit), a(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final zie e(cp1 cp1Var) {
        eje ejeVar = cp1Var.a;
        String str = cp1Var.b;
        boolean z = cp1Var.c;
        return new zie(cp1Var.e, cp1Var.f, ejeVar, cp1Var.g, str, cp1Var.d, z);
    }
}

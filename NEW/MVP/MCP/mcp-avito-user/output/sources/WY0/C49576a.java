package wY0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.p;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.material.resources.b;
import j.InterfaceC42150f;
import j.N;

/* compiled from: MotionUtils.java */
/* renamed from: wY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49576a {
    public static float a(int i12, String[] strArr) throws NumberFormatException {
        float f12 = Float.parseFloat(strArr[i12]);
        if (f12 < 0.0f || f12 > 1.0f) {
            throw new IllegalArgumentException(m.i(f12, "Motion easing control point value must be between 0 and 1; instead got: "));
        }
        return f12;
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(@N Context context, @InterfaceC42150f int i12, int i13) {
        TypedValue typedValueA = b.a(i12, context);
        return (typedValueA == null || typedValueA.type != 16) ? i13 : typedValueA.data;
    }

    @N
    public static TimeInterpolator d(@N Context context, @InterfaceC42150f int i12, @N TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i12, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!b(strValueOf, "cubic-bezier") && !b(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!b(strValueOf, "cubic-bezier")) {
            if (b(strValueOf, "path")) {
                return new PathInterpolator(p.d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(a(0, strArrSplit), a(1, strArrSplit), a(2, strArrSplit), a(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}

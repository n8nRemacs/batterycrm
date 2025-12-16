package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class uga {
    public static final nme a = new nme("CRASH_FREE", 1);

    public static boolean a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static final RippleDrawable b(int i, int i2, int i3, int i4) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i4);
        return new RippleDrawable(ColorStateList.valueOf(i2), g(f(Integer.valueOf(i), null, null, fArr), null, f(Integer.valueOf(i3), null, null, fArr)), f(-65536, null, null, fArr));
    }

    public static final RippleDrawable c(int i, int i2) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        ColorDrawable colorDrawable = i != 0 ? new ColorDrawable(i) : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-65536);
        return new RippleDrawable(colorStateListValueOf, colorDrawable, shapeDrawable);
    }

    public static final GradientDrawable d(Integer num, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final GradientDrawable e(Integer num, Integer num2, Integer num3, int i) {
        float f = i;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = f;
        }
        return f(num, num2, num3, fArr);
    }

    public static final GradientDrawable f(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final StateListDrawable g(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
            stateListDrawable.addState(new int[]{R.attr.state_activated}, gradientDrawable2);
        }
        if (gradientDrawable3 != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}

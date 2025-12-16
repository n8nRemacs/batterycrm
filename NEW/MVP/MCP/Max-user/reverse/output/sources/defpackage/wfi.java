package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Method;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class wfi {
    public static final Object a = new Object();
    public static Method b;
    public static boolean c;

    public static ObjectAnimator a(View view, eig eigVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, i4f i4fVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) eigVar.b.getTag(sxc.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        fig figVar = new fig(view, eigVar.b, translationX, translationY);
        i4fVar.a(figVar);
        objectAnimatorOfPropertyValuesHolder.addListener(figVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static final void b(esg esgVar) {
        esgVar.d(HttpStatus.SC_LOCKED, new zv6(3));
        esgVar.d(579, new zv6(4));
        esgVar.d(567, new qu4(27));
        esgVar.d(564, new zv6(5));
        esgVar.d(580, new bl6(1, new hfd()));
        esgVar.d(581, new zv6(6));
    }
}

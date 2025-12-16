package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.Space;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class dqi {
    public static final void a(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    public static final String c(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return "";
        }
        int iG = vmf.G(str, '/', 0, 6);
        return (iG == -1 || (i = iG + 1) == str.length()) ? str : vmf.c0(str.substring(i, str.length())).toString();
    }

    public static void d(ViewGroup viewGroup, em6 em6Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        uid uidVar = new uid();
        nu8 nu8Var = new nu8(handler, 1, uidVar);
        uidVar.a = new u02(handler, viewGroup, nu8Var, em6Var, 22);
        viewGroup.addOnLayoutChangeListener(nu8Var);
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new xzb(viewGroup, handler, viewGroup, nu8Var));
        } else {
            handler.removeCallbacksAndMessages(null);
            viewGroup.removeOnLayoutChangeListener(nu8Var);
        }
        handler.postDelayed((Runnable) uidVar.a, 300L);
    }

    public static void e(View view, cm6 cm6Var) {
        rva rvaVar = new rva(view, cm6Var);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(rvaVar);
        }
        view.addOnAttachStateChangeListener(rvaVar);
    }

    public static final View f(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static final Integer g(View view) {
        Insets insets;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getSystemWindowInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insets = rootWindowInsets2.getInsets(8)) == null) {
            return null;
        }
        return Integer.valueOf(insets.bottom);
    }

    public static final Integer h(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.bottom);
    }

    public static final ObjectAnimator i(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.addListener(new eg(view, z));
        return objectAnimatorOfFloat;
    }

    public static final View j(k18 k18Var) {
        if (r(k18Var)) {
            return (View) k18Var.getValue();
        }
        return null;
    }

    public static ValueAnimator k(Space space, x54 x54Var, x54 x54Var2, int i) {
        if ((i & 1) != 0) {
            x54Var = null;
        }
        if ((i & 2) != 0) {
            x54Var2 = null;
        }
        o98 o98VarD = ve3.d();
        if (x54Var != null) {
            int i2 = x54Var.b - x54Var.f;
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = ((x54Var.a ? 1 : -1) * i2) + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            o98VarD.add(PropertyValuesHolder.ofInt("top", marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0, i3));
        }
        if (x54Var2 != null) {
            int i4 = x54Var2.b - x54Var2.f;
            ViewGroup.LayoutParams layoutParams3 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i5 = ((x54Var2.a ? 1 : -1) * i4) + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = space.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            o98VarD.add(PropertyValuesHolder.ofInt("bottom", marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0, i5));
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) ve3.a(o98VarD).toArray(new PropertyValuesHolder[0]);
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new dg(space, 0));
        return valueAnimatorOfPropertyValuesHolder;
    }

    public static final int l(k18 k18Var) {
        if (k18Var.e()) {
            return ((View) k18Var.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int m(k18 k18Var) {
        if (k18Var.e()) {
            return ((View) k18Var.getValue()).getMeasuredWidth();
        }
        return 0;
    }

    public static final Integer n(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetTop());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.top);
    }

    public static final ObjectAnimator o(View view, float f) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getTranslationY() + f);
    }

    public static final void p(ViewStub viewStub, View view, cm6 cm6Var) {
        if (q(viewStub)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.height = view.getLayoutParams().height;
        layoutParams.width = view.getLayoutParams().width;
        view.setId(viewStub.getId());
        viewGroup.addView(view, iIndexOfChild, layoutParams);
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    public static final boolean q(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean r(k18 k18Var) {
        return k18Var.e() && ((View) k18Var.getValue()).getVisibility() == 0;
    }

    public static final void s(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }

    public static final String t(String str) {
        return (str == null || str.length() == 0) ? "" : c(str);
    }

    public static final String u(String str) {
        return (str == null || str.length() == 0) ? "" : wy1.h("https://max.ru/joincall/", c(str));
    }
}

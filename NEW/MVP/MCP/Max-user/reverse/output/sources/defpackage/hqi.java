package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public abstract class hqi {
    public static boolean a = true;

    public static final void a(o98 o98Var, View view, boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = z ? -(vw4.d().getDisplayMetrics().density * 50.0f) : 0.0f;
        float f4 = z ? 0.0f : -(vw4.d().getDisplayMetrics().density * 50.0f);
        view.setTranslationY(f3);
        o98Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2));
        o98Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f3, f4));
    }

    public static final ObjectAnimator b(View view, boolean z, float f, float f2, long j) {
        view.setAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        objectAnimatorOfFloat.setStartDelay(z ? j - 50 : 0L);
        objectAnimatorOfFloat.setDuration(50L);
        return objectAnimatorOfFloat;
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
    }

    public static final void d(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
    }

    public static final void e(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbK = wy1.k("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbK.append(i3);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(ho7.g("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final void f(View view, boolean z, long j, em6 em6Var) {
        Object tag = view.getTag(j0b.m);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (em6Var != null) {
                    em6Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
                    return;
                }
                return;
            }
        }
        boolean zA = fni.a(tag, "fade_in");
        boolean zA2 = fni.a(tag, "fade_out");
        if (zA && z) {
            return;
        }
        if (!zA2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f2).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new vg(view, str, f, f2, z, em6Var)).start();
        }
    }

    public static /* synthetic */ void g(View view, boolean z, long j, em6 em6Var, int i) {
        if ((i & 2) != 0) {
            j = 150;
        }
        if ((i & 4) != 0) {
            em6Var = null;
        }
        f(view, z, j, em6Var);
    }

    public static void h(View view, boolean z, ia iaVar, int i) {
        ia iaVar2 = (i & 4) != 0 ? null : iaVar;
        Object tag = view.getTag(j0b.m);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (iaVar2 != null) {
                    iaVar2.invoke(Boolean.valueOf(view.getVisibility() == 0));
                    return;
                }
                return;
            }
        }
        boolean zA = fni.a(tag, "fade_in");
        boolean zA2 = fni.a(tag, "fade_out");
        if (zA && z) {
            return;
        }
        if (!zA2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            float f3 = z ? 0.0f : 1.0f;
            float f4 = z ? 1.0f : 0.0f;
            view.animate().setDuration(150L).alpha(f2).scaleX(f4).scaleY(f4).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new wg(view, str, f3, f, f4, f2, z, iaVar2)).start();
        }
    }

    public static final ObjectAnimator i(View view, float f, float f2, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        view.animate().cancel();
        view.clearAnimation();
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f, f2);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final boolean j(View view) {
        Object tag = view.getTag(j0b.m);
        boolean zA = fni.a(tag, "fade_in");
        boolean zA2 = fni.a(tag, "fade_out");
        if (tag == null) {
            return view.getVisibility() == 0;
        }
        if (zA) {
            return true;
        }
        return !zA2 && view.getVisibility() == 0;
    }

    public static final boolean k(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != 0.0f;
        }
        return false;
    }

    public static AnimatorSet l(ViewGroup viewGroup, boolean z, float f, float f2) {
        if ((viewGroup.getVisibility() == 0) == z) {
            return null;
        }
        float f3 = z ? 0.0f : 1.0f;
        float f4 = z ? 1.0f : 0.0f;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ObjectAnimator objectAnimatorI = i(viewGroup, f, f2, accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet.addListener(new yg(viewGroup, f3, f4, z));
        animatorSet.playTogether(objectAnimatorI, objectAnimatorOfFloat);
        return animatorSet;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            ofh.b(viewGroup, z);
        } else if (a) {
            try {
                ofh.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}

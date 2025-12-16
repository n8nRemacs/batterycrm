package lY0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.o1;
import j.InterfaceC42146b;
import j.N;
import j.P;
import j.g0;
import java.util.ArrayList;

/* compiled from: MotionSpec.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final o1<String, j> f413891a = new o1<>();

    /* renamed from: b, reason: collision with root package name */
    public final o1<String, PropertyValuesHolder[]> f413892b = new o1<>();

    @P
    public static i a(@N TypedArray typedArray, @N Context context, @g0 int i12) {
        int resourceId;
        if (!typedArray.hasValue(i12) || (resourceId = typedArray.getResourceId(i12, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    @P
    public static i b(@InterfaceC42146b int i12, @N Context context) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i12);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i12);
            return null;
        }
    }

    @N
    public static i c(@N ArrayList arrayList) {
        i iVar = new i();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Animator animator = (Animator) arrayList.get(i12);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            iVar.f413892b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C43707b.f413880b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C43707b.f413881c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C43707b.f413882d;
            }
            j jVar = new j();
            jVar.f413896d = 0;
            jVar.f413897e = 1;
            jVar.f413893a = startDelay;
            jVar.f413894b = duration;
            jVar.f413895c = interpolator;
            jVar.f413896d = objectAnimator.getRepeatCount();
            jVar.f413897e = objectAnimator.getRepeatMode();
            iVar.f413891a.put(propertyName, jVar);
        }
        return iVar;
    }

    public final j d(String str) {
        o1<String, j> o1Var = this.f413891a;
        if (o1Var.get(str) != null) {
            return o1Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f413891a.equals(((i) obj).f413891a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f413891a.hashCode();
    }

    @N
    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f413891a + "}\n";
    }
}

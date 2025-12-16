package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class i4f extends qih {
    public static final DecelerateInterpolator T0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator U0 = new AccelerateInterpolator();
    public static final g4f V0 = new g4f();
    public h4f S0;

    @Override // defpackage.qih
    public final ObjectAnimator S(ViewGroup viewGroup, View view, eig eigVar, eig eigVar2) {
        if (eigVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) eigVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return wfi.a(view, eigVar2, iArr[0], iArr[1], this.S0.a(view, viewGroup), this.S0.b(view, viewGroup), translationX, translationY, T0, this);
    }

    @Override // defpackage.qih
    public final ObjectAnimator T(ViewGroup viewGroup, View view, eig eigVar, eig eigVar2) {
        if (eigVar == null) {
            return null;
        }
        int[] iArr = (int[]) eigVar.a.get("android:slide:screenPosition");
        return wfi.a(view, eigVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.S0.a(view, viewGroup), this.S0.b(view, viewGroup), U0, this);
    }

    @Override // defpackage.qih, defpackage.shg
    public final void e(eig eigVar) {
        qih.Q(eigVar);
        int[] iArr = new int[2];
        eigVar.b.getLocationOnScreen(iArr);
        eigVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.shg
    public final void h(eig eigVar) {
        qih.Q(eigVar);
        int[] iArr = new int[2];
        eigVar.b.getLocationOnScreen(iArr);
        eigVar.a.put("android:slide:screenPosition", iArr);
    }
}

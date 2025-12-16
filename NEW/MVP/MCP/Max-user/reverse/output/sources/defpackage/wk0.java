package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                al0 al0Var = (al0) obj;
                Iterator it = al0Var.y0.iterator();
                while (it.hasNext()) {
                    icg icgVar = (icg) it.next();
                    icgVar.X0 = 1.2f;
                    icgVar.V0 = fFloatValue;
                    icgVar.W0 = fFloatValue;
                    icgVar.Y0 = rg.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    icgVar.invalidateSelf();
                }
                WeakHashMap weakHashMap = hfh.a;
                al0Var.postInvalidateOnAnimation();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wq8 wq8Var = ((BottomSheetBehavior) obj).i;
                if (wq8Var != null) {
                    vq8 vq8Var = wq8Var.a;
                    if (vq8Var.i != fFloatValue2) {
                        vq8Var.i = fFloatValue2;
                        wq8Var.o = true;
                        wq8Var.invalidateSelf();
                        break;
                    }
                }
                break;
            case 2:
                ((re3) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                ((ryd) obj).h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                br5 br5Var = (br5) obj;
                br5Var.c.setAlpha(iFloatValue);
                br5Var.d.setAlpha(iFloatValue);
                br5Var.C0.invalidate();
                break;
            case 5:
                ((xs7) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 6:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 7:
                ((TextInputLayout) obj).F1.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v6h v6hVar = (v6h) obj;
                if (v6hVar.L0 != iIntValue) {
                    v6hVar.L0 = iIntValue;
                    v6hVar.requestLayout();
                    break;
                }
                break;
        }
    }
}

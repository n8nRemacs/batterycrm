package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v72 extends shg {
    public static final String[] Q0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final r72 R0 = new r72(PointF.class, "topLeft", 0);
    public static final r72 S0 = new r72(PointF.class, "bottomRight", 1);
    public static final r72 T0 = new r72(PointF.class, "bottomRight", 2);
    public static final r72 U0 = new r72(PointF.class, "topLeft", 3);
    public static final r72 V0 = new r72(PointF.class, "position", 4);

    public static void Q(eig eigVar) {
        View view = eigVar.b;
        HashMap map = eigVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", eigVar.b.getParent());
    }

    @Override // defpackage.shg
    public final void e(eig eigVar) {
        Q(eigVar);
    }

    @Override // defpackage.shg
    public final void h(eig eigVar) {
        Q(eigVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.shg
    public final Animator l(ViewGroup viewGroup, eig eigVar, eig eigVar2) {
        int i;
        v72 v72Var;
        ObjectAnimator objectAnimatorA;
        if (eigVar != null) {
            HashMap map = eigVar.a;
            if (eigVar2 != null) {
                HashMap map2 = eigVar2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = eigVar2.b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        vhh.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            v72Var = this;
                            if (i2 == i3 && i4 == i5) {
                                v72Var.J0.getClass();
                                objectAnimatorA = oqa.a(view, T0, dwf.b(i6, i8, i7, i9));
                            } else {
                                v72Var.J0.getClass();
                                objectAnimatorA = oqa.a(view, U0, dwf.b(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            v72Var = this;
                            v72Var.J0.getClass();
                            objectAnimatorA = oqa.a(view, V0, dwf.b(i2, i4, i3, i5));
                        } else {
                            v72Var = this;
                            u72 u72Var = new u72(view);
                            v72Var.J0.getClass();
                            ObjectAnimator objectAnimatorA2 = oqa.a(u72Var, R0, dwf.b(i2, i4, i3, i5));
                            v72Var.J0.getClass();
                            ObjectAnimator objectAnimatorA3 = oqa.a(u72Var, S0, dwf.b(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet.addListener(new s72(u72Var));
                            objectAnimatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            hqi.m(viewGroup4, true);
                            v72Var.s().a(new t72(viewGroup4));
                        }
                        return objectAnimatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.shg
    public final String[] u() {
        return Q0;
    }
}

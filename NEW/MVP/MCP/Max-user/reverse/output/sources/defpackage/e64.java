package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class e64 implements a64 {
    public AnimatorSet b;
    public f82 c;
    public f82 d;
    public final Object e;
    public final Object f;
    public em6 h;
    public em6 i;
    public y54 j;
    public y54 k;
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean g = true;

    public e64() {
        final int i = 0;
        this.e = ipi.b(3, new cm6(this) { // from class: b64
            public final /* synthetic */ e64 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        final int i2 = 1;
                        final e64 e64Var = this.b;
                        return new View.OnLayoutChangeListener() { // from class: c64
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i2) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        e64 e64Var2 = e64Var;
                                        y54 y54Var = e64Var2.k;
                                        if (measuredHeight != y54Var.a) {
                                            Integer numH = dqi.h(view);
                                            e64Var2.k = y54.a(y54Var, measuredHeight, numH != null ? numH.intValue() : 0, false, 4);
                                            Iterator it = e64Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((z54) it.next()).y(e64Var2.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        e64 e64Var3 = e64Var;
                                        y54 y54Var2 = e64Var3.j;
                                        if (measuredHeight3 != y54Var2.a) {
                                            Integer numN = dqi.n(view);
                                            e64Var3.j = y54.a(y54Var2, measuredHeight2, numN != null ? numN.intValue() : 0, false, 4);
                                            Iterator it2 = e64Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((z54) it2.next()).E(e64Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final int i3 = 0;
                        final e64 e64Var2 = this.b;
                        return new View.OnLayoutChangeListener() { // from class: c64
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i3) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        e64 e64Var22 = e64Var2;
                                        y54 y54Var = e64Var22.k;
                                        if (measuredHeight != y54Var.a) {
                                            Integer numH = dqi.h(view);
                                            e64Var22.k = y54.a(y54Var, measuredHeight, numH != null ? numH.intValue() : 0, false, 4);
                                            Iterator it = e64Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((z54) it.next()).y(e64Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        e64 e64Var3 = e64Var2;
                                        y54 y54Var2 = e64Var3.j;
                                        if (measuredHeight3 != y54Var2.a) {
                                            Integer numN = dqi.n(view);
                                            e64Var3.j = y54.a(y54Var2, measuredHeight2, numN != null ? numN.intValue() : 0, false, 4);
                                            Iterator it2 = e64Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((z54) it2.next()).E(e64Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        final int i2 = 1;
        this.f = ipi.b(3, new cm6(this) { // from class: b64
            public final /* synthetic */ e64 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final int i22 = 1;
                        final e64 e64Var = this.b;
                        return new View.OnLayoutChangeListener() { // from class: c64
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i22) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        e64 e64Var22 = e64Var;
                                        y54 y54Var = e64Var22.k;
                                        if (measuredHeight != y54Var.a) {
                                            Integer numH = dqi.h(view);
                                            e64Var22.k = y54.a(y54Var, measuredHeight, numH != null ? numH.intValue() : 0, false, 4);
                                            Iterator it = e64Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((z54) it.next()).y(e64Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        e64 e64Var3 = e64Var;
                                        y54 y54Var2 = e64Var3.j;
                                        if (measuredHeight3 != y54Var2.a) {
                                            Integer numN = dqi.n(view);
                                            e64Var3.j = y54.a(y54Var2, measuredHeight2, numN != null ? numN.intValue() : 0, false, 4);
                                            Iterator it2 = e64Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((z54) it2.next()).E(e64Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final int i3 = 0;
                        final e64 e64Var2 = this.b;
                        return new View.OnLayoutChangeListener() { // from class: c64
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i3) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        e64 e64Var22 = e64Var2;
                                        y54 y54Var = e64Var22.k;
                                        if (measuredHeight != y54Var.a) {
                                            Integer numH = dqi.h(view);
                                            e64Var22.k = y54.a(y54Var, measuredHeight, numH != null ? numH.intValue() : 0, false, 4);
                                            Iterator it = e64Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((z54) it.next()).y(e64Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        e64 e64Var3 = e64Var2;
                                        y54 y54Var2 = e64Var3.j;
                                        if (measuredHeight3 != y54Var2.a) {
                                            Integer numN = dqi.n(view);
                                            e64Var3.j = y54.a(y54Var2, measuredHeight2, numN != null ? numN.intValue() : 0, false, 4);
                                            Iterator it2 = e64Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((z54) it2.next()).E(e64Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        d73 d73Var = new d73(11);
        this.h = d73Var;
        this.i = new d73(11);
        this.j = new y54();
        this.k = new y54();
        d73Var.invoke(true);
    }

    public static final void a(e64 e64Var, boolean z) {
        e64Var.b = null;
        f82 f82Var = e64Var.c;
        if (f82Var != null) {
            f82Var.setTag(j0b.m, null);
        }
        f82 f82Var2 = e64Var.d;
        if (f82Var2 != null) {
            f82Var2.setTag(j0b.m, null);
        }
        e64Var.h.invoke(Boolean.valueOf(z));
        Iterator it = e64Var.a.iterator();
        while (it.hasNext()) {
            ((z54) it.next()).P();
        }
    }

    public final void b(z54 z54Var) {
        this.a.add(z54Var);
    }

    public final void c(boolean z) {
        f82 f82Var;
        boolean z2 = this.g;
        if (z2 == z && this.b == null) {
            this.h.invoke(Boolean.valueOf(z2));
            return;
        }
        f82 f82Var2 = this.c;
        f82 f82Var3 = this.d;
        if (f82Var2 == null || f82Var3 == null) {
            this.j = y54.a(this.j, 0, 0, z, 3);
            this.k = y54.a(this.k, 0, 0, z, 3);
            this.g = z;
            this.h.invoke(Boolean.valueOf(z));
            return;
        }
        if (z2 == z && hqi.j(f82Var2) == z && hqi.j(f82Var3) == z) {
            return;
        }
        this.j = y54.a(this.j, 0, 0, z, 3);
        y54 y54VarA = y54.a(this.k, 0, 0, z, 3);
        this.k = y54VarA;
        this.g = z;
        f82 f82Var4 = this.c;
        if (f82Var4 == null || (f82Var = this.d) == null) {
            return;
        }
        boolean z3 = this.j.c;
        boolean z4 = y54VarA.c;
        int i = z3 ? 1 : -1;
        int i2 = z4 ? -1 : 1;
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(250L);
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        int iB = this.j.b();
        float f = iB;
        float f2 = f * i;
        x54 x54Var = new x54(z3, iB, i, f2, f82Var4.getTranslationY(), this.j.b);
        int iB2 = this.k.b();
        float f3 = iB2;
        float f4 = f3 * i2;
        x54 x54Var2 = new x54(z4, iB2, i2, f4, f82Var.getTranslationY(), this.k.b);
        Float fValueOf = Float.valueOf(0.0f);
        if (!z3) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        Float fValueOf2 = z3 ? Float.valueOf(1.0f) : null;
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f82Var4, (Property<f82, Float>) property, fFloatValue, fFloatValue2);
        float translationY = (f82Var4.getTranslationY() == 0.0f && z3) ? -f : f82Var4.getTranslationY();
        float f5 = f2 + translationY;
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(f82Var4, (Property<f82, Float>) property2, translationY, f5);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(f82Var, (Property<f82, Float>) property, fFloatValue, fFloatValue2);
        float translationY2 = (f82Var4.getTranslationY() == 0.0f && z4) ? f3 : f82Var.getTranslationY();
        float f6 = f4 + translationY2;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(f82Var, (Property<f82, Float>) property2, translationY2, f6);
        LinkedHashSet linkedHashSet = this.a;
        ArrayList arrayList = new ArrayList(we3.q(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((z54) it.next()).I(x54Var, x54Var2));
        }
        ArrayList arrayListR = we3.r(arrayList);
        o98 o98VarD = ve3.d();
        o98VarD.add(objectAnimatorOfFloat);
        o98VarD.add(objectAnimatorOfFloat2);
        o98VarD.add(objectAnimatorOfFloat3);
        o98VarD.add(objectAnimatorOfFloat4);
        o98VarD.addAll(arrayListR);
        animatorSet2.playTogether(ve3.a(o98VarD));
        animatorSet2.addListener(new d64(f82Var4, this.g, f82Var, this, f5, f6));
        animatorSet2.start();
        this.b = animatorSet2;
    }
}

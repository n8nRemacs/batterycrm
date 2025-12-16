package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class iq8 {
    public final MaterialButton a;
    public xse b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public wq8 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public iq8(MaterialButton materialButton, xse xseVar) {
        this.a = materialButton;
        this.b = xseVar;
    }

    public final ite a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (ite) this.s.getDrawable(2) : (ite) this.s.getDrawable(1);
    }

    public final wq8 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (wq8) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(xse xseVar) {
        this.b = xseVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(xseVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(xseVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(xseVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = hfh.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        wq8 wq8Var = new wq8(this.b);
        MaterialButton materialButton = this.a;
        wq8Var.i(materialButton.getContext());
        t35.h(wq8Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            t35.i(wq8Var, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        wq8Var.a.j = f;
        wq8Var.invalidateSelf();
        wq8Var.m(colorStateList);
        wq8 wq8Var2 = new wq8(this.b);
        wq8Var2.setTint(0);
        float f2 = this.h;
        int iF = this.n ? eti.f(materialButton, dvc.colorSurface) : 0;
        wq8Var2.a.j = f2;
        wq8Var2.invalidateSelf();
        wq8Var2.m(ColorStateList.valueOf(iF));
        wq8 wq8Var3 = new wq8(this.b);
        this.m = wq8Var3;
        t35.g(wq8Var3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(sqd.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{wq8Var2, wq8Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        wq8 wq8VarB = b(false);
        if (wq8VarB != null) {
            wq8VarB.j(this.t);
            wq8VarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        wq8 wq8VarB = b(false);
        wq8 wq8VarB2 = b(true);
        if (wq8VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            wq8VarB.a.j = f;
            wq8VarB.invalidateSelf();
            wq8VarB.m(colorStateList);
            if (wq8VarB2 != null) {
                float f2 = this.h;
                int iF = this.n ? eti.f(this.a, dvc.colorSurface) : 0;
                wq8VarB2.a.j = f2;
                wq8VarB2.invalidateSelf();
                wq8VarB2.m(ColorStateList.valueOf(iF));
            }
        }
    }
}

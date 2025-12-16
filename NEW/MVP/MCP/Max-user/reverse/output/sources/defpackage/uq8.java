package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class uq8 extends po {
    public static final int t0 = m5d.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] u0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList o;
    public boolean s0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.o == null) {
            int iF = eti.f(this, dvc.colorControlActivated);
            int iF2 = eti.f(this, dvc.colorOnSurface);
            int iF3 = eti.f(this, dvc.colorSurface);
            this.o = new ColorStateList(u0, new int[]{eti.j(iF3, 1.0f, iF), eti.j(iF3, 0.54f, iF2), eti.j(iF3, 0.38f, iF2), eti.j(iF3, 0.38f, iF2)});
        }
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s0 && rm3.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.s0 = z;
        if (z) {
            rm3.c(this, getMaterialThemeColorsTintList());
        } else {
            rm3.c(this, null);
        }
    }
}

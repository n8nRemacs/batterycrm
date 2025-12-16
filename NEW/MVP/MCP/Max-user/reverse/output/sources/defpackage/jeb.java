package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class jeb extends SwitchCompat implements u6g {
    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iD = kti.d((((int) ((getThumbPosition() + 0.2f) * r1)) + 20) * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(((int) ((1 - getThumbPosition()) * 6)) * vw4.d().getDisplayMetrics().density);
        int iQ = u45.q(4, vw4.d().getDisplayMetrics().density, getWidth() - iD);
        int i = getThumbDrawable().getBounds().left + iD2;
        int i2 = (i > iQ ? iQ : i) + iD;
        int height = (getHeight() / 2) - (iD / 2);
        int i3 = iD + height;
        Drawable thumbDrawable = getThumbDrawable();
        if (i <= iQ) {
            iQ = i;
        }
        thumbDrawable.setBounds(iQ, height, i2, i3);
        super.onDraw(canvas);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(20 * vw4.d().getDisplayMetrics().density);
        yebVar.getIcon();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(yebVar.getIcon().j);
        ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(yebVar.getIcon().h);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(colorStateListValueOf);
        gradientDrawable.setSize(iD, iD);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(colorStateListValueOf2);
        gradientDrawable2.setSize(iD2, iD2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(colorStateListValueOf3);
        gradientDrawable3.setSize(iD2, iD2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842912}, gradientDrawable2);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, gradientDrawable3);
        stateListDrawable.addState(new int[]{-16842910, R.attr.state_checked}, gradientDrawable);
        setThumbDrawable(stateListDrawable);
        float f = vw4.d().getDisplayMetrics().density * 20.0f;
        int iD3 = kti.d(2 * vw4.d().getDisplayMetrics().density);
        int iD4 = kti.d(52 * vw4.d().getDisplayMetrics().density);
        int iD5 = kti.d(32 * vw4.d().getDisplayMetrics().density);
        ColorStateList colorStateListValueOf4 = ColorStateList.valueOf(0);
        ColorStateList colorStateListValueOf5 = ColorStateList.valueOf(yebVar.b().a.n);
        ColorStateList colorStateListValueOf6 = ColorStateList.valueOf(yebVar.c().a.b.l);
        ColorStateList colorStateListValueOf7 = ColorStateList.valueOf(yebVar.c().a.b.f);
        ColorStateList colorStateListValueOf8 = ColorStateList.valueOf(yebVar.i().b.b);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(f);
        gradientDrawable4.setColor(colorStateListValueOf5);
        gradientDrawable4.setSize(iD4, iD5);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(0);
        gradientDrawable5.setCornerRadius(f);
        gradientDrawable5.setColor(colorStateListValueOf4);
        gradientDrawable5.setStroke(iD3, colorStateListValueOf8);
        gradientDrawable5.setSize(iD4, iD5);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setShape(0);
        gradientDrawable6.setCornerRadius(f);
        gradientDrawable6.setColor(colorStateListValueOf6);
        gradientDrawable6.setSize(iD4, iD5);
        GradientDrawable gradientDrawable7 = new GradientDrawable();
        gradientDrawable7.setShape(0);
        gradientDrawable7.setCornerRadius(f);
        gradientDrawable7.setColor(colorStateListValueOf7);
        gradientDrawable7.setSize(iD4, iD5);
        GradientDrawable gradientDrawable8 = new GradientDrawable();
        gradientDrawable8.setShape(0);
        gradientDrawable8.setCornerRadius(f);
        gradientDrawable8.setColor(colorStateListValueOf4);
        gradientDrawable8.setStroke(iD3, colorStateListValueOf8);
        gradientDrawable8.setSize(iD4, iD5);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable7, gradientDrawable8});
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_enabled, R.attr.state_checked}, gradientDrawable4);
        stateListDrawable2.addState(new int[]{R.attr.state_enabled, -16842912}, gradientDrawable5);
        stateListDrawable2.addState(new int[]{-16842910, -16842912}, layerDrawable);
        stateListDrawable2.addState(new int[]{-16842910, R.attr.state_checked}, gradientDrawable6);
        setTrackDrawable(stateListDrawable2);
        drawableStateChanged();
    }
}

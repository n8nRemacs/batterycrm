package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class rq8 extends AppCompatCheckBox {
    public static final int L0 = m5d.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] M0 = {dvc.state_indeterminate};
    public static final int[] N0;
    public static final int[][] O0;
    public static final int P0;
    public boolean A0;
    public ColorStateList B0;
    public ColorStateList C0;
    public PorterDuff.Mode D0;
    public int E0;
    public int[] F0;
    public boolean G0;
    public CharSequence H0;
    public CompoundButton.OnCheckedChangeListener I0;
    public final vf J0;
    public final eg5 K0;
    public final LinkedHashSet o;
    public final LinkedHashSet s0;
    public ColorStateList t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public CharSequence x0;
    public Drawable y0;
    public Drawable z0;

    static {
        int i = dvc.state_error;
        N0 = new int[]{i};
        O0 = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        P0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rq8(Context context, AttributeSet attributeSet) {
        int i = dvc.checkboxStyle;
        int i2 = L0;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        this.o = new LinkedHashSet();
        this.s0 = new LinkedHashSet();
        this.J0 = vf.a(getContext(), lxc.mtrl_checkbox_button_checked_unchecked);
        this.K0 = new eg5(this, 1);
        Context context2 = getContext();
        this.y0 = sm3.a(this);
        this.B0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = z5d.MaterialCheckBox;
        d7g.a(context2, attributeSet, i, i2);
        d7g.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        jdc jdcVar = new jdc(context2, typedArrayObtainStyledAttributes);
        this.z0 = jdcVar.t(z5d.MaterialCheckBox_buttonIcon);
        if (this.y0 != null && wsi.f(dvc.isMaterial3Theme, context2, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == P0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.y0 = eri.a(context2, lxc.mtrl_checkbox_button);
                this.A0 = true;
                if (this.z0 == null) {
                    this.z0 = eri.a(context2, lxc.mtrl_checkbox_button_icon);
                }
            }
        }
        this.C0 = gti.b(context2, jdcVar, z5d.MaterialCheckBox_buttonIconTint);
        this.D0 = yqi.f(typedArrayObtainStyledAttributes.getInt(z5d.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.u0 = typedArrayObtainStyledAttributes.getBoolean(z5d.MaterialCheckBox_useMaterialThemeColors, false);
        this.v0 = typedArrayObtainStyledAttributes.getBoolean(z5d.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.w0 = typedArrayObtainStyledAttributes.getBoolean(z5d.MaterialCheckBox_errorShown, false);
        this.x0 = typedArrayObtainStyledAttributes.getText(z5d.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(z5d.MaterialCheckBox_checkedState, 0));
        }
        jdcVar.B();
        b();
    }

    private String getButtonStateDescription() {
        int i = this.E0;
        return i == 1 ? getResources().getString(s2d.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(s2d.mtrl_checkbox_state_description_unchecked) : getResources().getString(s2d.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.t0 == null) {
            int iF = eti.f(this, dvc.colorControlActivated);
            int iF2 = eti.f(this, dvc.colorError);
            int iF3 = eti.f(this, dvc.colorSurface);
            int iF4 = eti.f(this, dvc.colorOnSurface);
            this.t0 = new ColorStateList(O0, new int[]{eti.j(iF3, 1.0f, iF2), eti.j(iF3, 1.0f, iF), eti.j(iF3, 0.54f, iF4), eti.j(iF3, 0.38f, iF4), eti.j(iF3, 0.38f, iF4)});
        }
        return this.t0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.B0;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s6 s6Var;
        Drawable drawableMutate = this.y0;
        ColorStateList colorStateList3 = this.B0;
        PorterDuff.Mode modeB = rm3.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                t35.i(drawableMutate, modeB);
            }
        }
        this.y0 = drawableMutate;
        Drawable drawableMutate2 = this.z0;
        ColorStateList colorStateList4 = this.C0;
        PorterDuff.Mode mode = this.D0;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                t35.i(drawableMutate2, mode);
            }
        }
        this.z0 = drawableMutate2;
        if (this.A0) {
            vf vfVar = this.J0;
            if (vfVar != null) {
                tf tfVar = vfVar.b;
                Drawable drawable = vfVar.a;
                eg5 eg5Var = this.K0;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (eg5Var.a == null) {
                        eg5Var.a = new ke(eg5Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(eg5Var.a);
                }
                ArrayList arrayList = vfVar.o;
                if (arrayList != null && eg5Var != null) {
                    arrayList.remove(eg5Var);
                    if (vfVar.o.size() == 0 && (s6Var = vfVar.d) != null) {
                        tfVar.b.removeListener(s6Var);
                        vfVar.d = null;
                    }
                }
                Drawable drawable2 = vfVar.a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (eg5Var.a == null) {
                        eg5Var.a = new ke(eg5Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(eg5Var.a);
                } else if (eg5Var != null) {
                    if (vfVar.o == null) {
                        vfVar.o = new ArrayList();
                    }
                    if (!vfVar.o.contains(eg5Var)) {
                        vfVar.o.add(eg5Var);
                        if (vfVar.d == null) {
                            vfVar.d = new s6(1, vfVar);
                        }
                        tfVar.b.addListener(vfVar.d);
                    }
                }
            }
            Drawable drawable3 = this.y0;
            if ((drawable3 instanceof AnimatedStateListDrawable) && vfVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(uxc.checked, uxc.unchecked, vfVar, false);
                ((AnimatedStateListDrawable) this.y0).addTransition(uxc.indeterminate, uxc.unchecked, vfVar, false);
            }
        }
        Drawable drawable4 = this.y0;
        if (drawable4 != null && (colorStateList2 = this.B0) != null) {
            t35.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.z0;
        if (drawable5 != null && (colorStateList = this.C0) != null) {
            t35.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.y0;
        Drawable drawable7 = this.z0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.y0;
    }

    public Drawable getButtonIconDrawable() {
        return this.z0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.C0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.D0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.B0;
    }

    public int getCheckedState() {
        return this.E0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.x0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.E0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u0 && this.B0 == null && this.C0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M0);
        }
        if (this.w0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.F0 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.v0 || !TextUtils.isEmpty(getText()) || (drawableA = sm3.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (yqi.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            t35.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.w0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.x0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qq8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qq8 qq8Var = (qq8) parcelable;
        super.onRestoreInstanceState(qq8Var.getSuperState());
        setCheckedState(qq8Var.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        qq8 qq8Var = new qq8(super.onSaveInstanceState());
        qq8Var.a = getCheckedState();
        return qq8Var;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(eri.a(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.z0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(eri.a(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.C0 == colorStateList) {
            return;
        }
        this.C0 = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.D0 == mode) {
            return;
        }
        this.D0 = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.B0 == colorStateList) {
            return;
        }
        this.B0 = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.v0 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.E0 != i) {
            this.E0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.H0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.G0) {
                return;
            }
            this.G0 = true;
            LinkedHashSet linkedHashSet = this.s0;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw ctd.h(it);
                }
            }
            if (this.E0 != 2 && (onCheckedChangeListener = this.I0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.G0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.x0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.w0 == z) {
            return;
        }
        this.w0 = z;
        refreshDrawableState();
        Iterator it = this.o.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.I0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.H0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.u0 = z;
        if (z) {
            rm3.c(this, getMaterialThemeColorsTintList());
        } else {
            rm3.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.y0 = drawable;
        this.A0 = false;
        b();
    }
}

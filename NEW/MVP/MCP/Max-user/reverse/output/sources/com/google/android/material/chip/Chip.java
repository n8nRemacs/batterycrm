package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import defpackage.a4g;
import defpackage.d7g;
import defpackage.d83;
import defpackage.dvc;
import defpackage.e83;
import defpackage.er8;
import defpackage.eri;
import defpackage.f83;
import defpackage.g83;
import defpackage.gti;
import defpackage.h6i;
import defpackage.h83;
import defpackage.hfh;
import defpackage.i83;
import defpackage.ite;
import defpackage.iti;
import defpackage.l5;
import defpackage.m5d;
import defpackage.n83;
import defpackage.s2a;
import defpackage.s3g;
import defpackage.sq8;
import defpackage.sqd;
import defpackage.tm0;
import defpackage.tq8;
import defpackage.u35;
import defpackage.uxc;
import defpackage.veh;
import defpackage.w3g;
import defpackage.xse;
import defpackage.y3g;
import defpackage.yqi;
import defpackage.z5d;
import defpackage.z7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements h83, ite, tq8 {
    public static final int K0 = m5d.Widget_MaterialComponents_Chip_Action;
    public static final Rect L0 = new Rect();
    public static final int[] M0 = {R.attr.state_selected};
    public static final int[] N0 = {R.attr.state_checkable};
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public CharSequence E0;
    public final g83 F0;
    public boolean G0;
    public final Rect H0;
    public final RectF I0;
    public final e83 J0;
    public i83 o;
    public InsetDrawable s0;
    public RippleDrawable t0;
    public View.OnClickListener u0;
    public CompoundButton.OnCheckedChangeListener v0;
    public sq8 w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i = dvc.chipStyle;
        int i2 = K0;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        this.H0 = new Rect();
        this.I0 = new RectF();
        this.J0 = new e83(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        i83 i83Var = new i83(context2, attributeSet, i);
        TypedArray typedArrayD = d7g.d(i83Var.p1, attributeSet, z5d.Chip, i, i2, new int[0]);
        i83Var.P1 = typedArrayD.hasValue(z5d.Chip_shapeAppearance);
        int i3 = z5d.Chip_chipSurfaceColor;
        Context context3 = i83Var.p1;
        ColorStateList colorStateListC = gti.c(context3, typedArrayD, i3);
        if (i83Var.I0 != colorStateListC) {
            i83Var.I0 = colorStateListC;
            i83Var.onStateChange(i83Var.getState());
        }
        ColorStateList colorStateListC2 = gti.c(context3, typedArrayD, z5d.Chip_chipBackgroundColor);
        if (i83Var.J0 != colorStateListC2) {
            i83Var.J0 = colorStateListC2;
            i83Var.onStateChange(i83Var.getState());
        }
        float dimension = typedArrayD.getDimension(z5d.Chip_chipMinHeight, 0.0f);
        if (i83Var.K0 != dimension) {
            i83Var.K0 = dimension;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        if (typedArrayD.hasValue(z5d.Chip_chipCornerRadius)) {
            i83Var.D(typedArrayD.getDimension(z5d.Chip_chipCornerRadius, 0.0f));
        }
        i83Var.I(gti.c(context3, typedArrayD, z5d.Chip_chipStrokeColor));
        i83Var.J(typedArrayD.getDimension(z5d.Chip_chipStrokeWidth, 0.0f));
        i83Var.S(gti.c(context3, typedArrayD, z5d.Chip_rippleColor));
        String text = typedArrayD.getText(z5d.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(i83Var.P0, text);
        a4g a4gVar = i83Var.v1;
        if (!zEquals) {
            i83Var.P0 = text;
            a4gVar.e = true;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        int i4 = z5d.Chip_android_textAppearance;
        s3g s3gVar = (!typedArrayD.hasValue(i4) || (resourceId3 = typedArrayD.getResourceId(i4, 0)) == 0) ? null : new s3g(context3, resourceId3);
        s3gVar.k = typedArrayD.getDimension(z5d.Chip_android_textSize, s3gVar.k);
        a4gVar.c(s3gVar, context3);
        int i5 = typedArrayD.getInt(z5d.Chip_android_ellipsize, 0);
        if (i5 == 1) {
            i83Var.M1 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            i83Var.M1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            i83Var.M1 = TextUtils.TruncateAt.END;
        }
        i83Var.H(typedArrayD.getBoolean(z5d.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            i83Var.H(typedArrayD.getBoolean(z5d.Chip_chipIconEnabled, false));
        }
        i83Var.E(gti.e(context3, typedArrayD, z5d.Chip_chipIcon));
        if (typedArrayD.hasValue(z5d.Chip_chipIconTint)) {
            i83Var.G(gti.c(context3, typedArrayD, z5d.Chip_chipIconTint));
        }
        i83Var.F(typedArrayD.getDimension(z5d.Chip_chipIconSize, -1.0f));
        i83Var.P(typedArrayD.getBoolean(z5d.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            i83Var.P(typedArrayD.getBoolean(z5d.Chip_closeIconEnabled, false));
        }
        i83Var.K(gti.e(context3, typedArrayD, z5d.Chip_closeIcon));
        i83Var.O(gti.c(context3, typedArrayD, z5d.Chip_closeIconTint));
        i83Var.M(typedArrayD.getDimension(z5d.Chip_closeIconSize, 0.0f));
        i83Var.z(typedArrayD.getBoolean(z5d.Chip_android_checkable, false));
        i83Var.C(typedArrayD.getBoolean(z5d.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            i83Var.C(typedArrayD.getBoolean(z5d.Chip_checkedIconEnabled, false));
        }
        i83Var.A(gti.e(context3, typedArrayD, z5d.Chip_checkedIcon));
        if (typedArrayD.hasValue(z5d.Chip_checkedIconTint)) {
            i83Var.B(gti.c(context3, typedArrayD, z5d.Chip_checkedIconTint));
        }
        int i6 = z5d.Chip_showMotionSpec;
        i83Var.f1 = (!typedArrayD.hasValue(i6) || (resourceId2 = typedArrayD.getResourceId(i6, 0)) == 0) ? null : s2a.a(context3, resourceId2);
        int i7 = z5d.Chip_hideMotionSpec;
        i83Var.g1 = (!typedArrayD.hasValue(i7) || (resourceId = typedArrayD.getResourceId(i7, 0)) == 0) ? null : s2a.a(context3, resourceId);
        float dimension2 = typedArrayD.getDimension(z5d.Chip_chipStartPadding, 0.0f);
        if (i83Var.h1 != dimension2) {
            i83Var.h1 = dimension2;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        i83Var.R(typedArrayD.getDimension(z5d.Chip_iconStartPadding, 0.0f));
        i83Var.Q(typedArrayD.getDimension(z5d.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(z5d.Chip_textStartPadding, 0.0f);
        if (i83Var.k1 != dimension3) {
            i83Var.k1 = dimension3;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        float dimension4 = typedArrayD.getDimension(z5d.Chip_textEndPadding, 0.0f);
        if (i83Var.l1 != dimension4) {
            i83Var.l1 = dimension4;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        i83Var.N(typedArrayD.getDimension(z5d.Chip_closeIconStartPadding, 0.0f));
        i83Var.L(typedArrayD.getDimension(z5d.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(z5d.Chip_chipEndPadding, 0.0f);
        if (i83Var.o1 != dimension5) {
            i83Var.o1 = dimension5;
            i83Var.invalidateSelf();
            i83Var.x();
        }
        i83Var.O1 = typedArrayD.getDimensionPixelSize(z5d.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = z5d.Chip;
        d7g.a(context2, attributeSet, i, i2);
        d7g.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.B0 = typedArrayObtainStyledAttributes.getBoolean(z5d.Chip_ensureMinTouchTargetSize, false);
        this.D0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(z5d.Chip_chipMinTouchTargetSize, (float) Math.ceil(yqi.b(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(i83Var);
        i83Var.j(veh.i(this));
        int[] iArr2 = z5d.Chip;
        d7g.a(context2, attributeSet, i, i2);
        d7g.b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(z5d.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.F0 = new g83(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new f83(this, 0));
        }
        setChecked(this.x0);
        setText(i83Var.P0);
        setEllipsize(i83Var.M1);
        i();
        if (!this.o.N1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.B0) {
            setMinHeight(this.D0);
        }
        this.C0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new d83(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.I0;
        rectF.setEmpty();
        if (e() && this.u0 != null) {
            i83 i83Var = this.o;
            Rect bounds = i83Var.getBounds();
            rectF.setEmpty();
            if (i83Var.V()) {
                float f = i83Var.o1 + i83Var.n1 + i83Var.Z0 + i83Var.m1 + i83Var.l1;
                if (u35.a(i83Var) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.H0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private s3g getTextAppearance() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.v1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.y0 != z) {
            this.y0 = z;
            refreshDrawableState();
        }
    }

    public final void d(int i) {
        this.D0 = i;
        if (!this.B0) {
            InsetDrawable insetDrawable = this.s0;
            if (insetDrawable == null) {
                int[] iArr = sqd.a;
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.s0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = sqd.a;
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.o.K0));
        int iMax2 = Math.max(0, i - this.o.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.s0;
            if (insetDrawable2 == null) {
                int[] iArr3 = sqd.a;
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.s0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = sqd.a;
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.s0 != null) {
            Rect rect = new Rect();
            this.s0.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = sqd.a;
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.s0 = new InsetDrawable((Drawable) this.o, i2, i3, i2, i3);
        int[] iArr6 = sqd.a;
        g();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.G0 ? super.dispatchHoverEvent(motionEvent) : this.F0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.G0
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            g83 r0 = r9.F0
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L84
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6e
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L84
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L84
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L84
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L84
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L84
            int r1 = r0.l
            if (r1 == r2) goto L6c
            r4 = 16
            r0.s(r1, r4, r6)
        L6c:
            r4 = r3
            goto L84
        L6e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7a
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L84
        L7a:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L84
            boolean r4 = r0.q(r3, r6)
        L84:
            if (r4 == 0) goto L8b
            int r0 = r0.l
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        i83 i83Var = this.o;
        boolean zY = false;
        if (i83Var != null && i83.w(i83Var.W0)) {
            i83 i83Var2 = this.o;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.A0) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.z0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.y0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.A0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.z0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.y0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(i83Var2.J1, iArr)) {
                i83Var2.J1 = iArr;
                if (i83Var2.V()) {
                    zY = i83Var2.y(i83Var2.getState(), iArr);
                }
            }
        }
        if (zY) {
            invalidate();
        }
    }

    public final boolean e() {
        i83 i83Var = this.o;
        if (i83Var == null) {
            return false;
        }
        Object obj = i83Var.W0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof h6i) {
            obj = null;
        }
        return obj != null;
    }

    public final void f() {
        i83 i83Var;
        if (!e() || (i83Var = this.o) == null || !i83Var.V0 || this.u0 == null) {
            hfh.n(this, null);
            this.G0 = false;
        } else {
            hfh.n(this, this.F0);
            this.G0 = true;
        }
    }

    public final void g() {
        this.t0 = new RippleDrawable(sqd.b(this.o.O0), getBackgroundDrawable(), null);
        this.o.getClass();
        RippleDrawable rippleDrawable = this.t0;
        WeakHashMap weakHashMap = hfh.a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.E0)) {
            return this.E0;
        }
        i83 i83Var = this.o;
        if (i83Var == null || !i83Var.b1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof n83) && ((n83) parent).u0.a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.s0;
        return insetDrawable == null ? this.o : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.d1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.e1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.J0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return Math.max(0.0f, i83Var.u());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.o;
    }

    public float getChipEndPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.o1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        i83 i83Var = this.o;
        if (i83Var == null || (drawable = i83Var.R0) == 0) {
            return null;
        }
        if (!(drawable instanceof h6i)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.T0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.S0;
        }
        return null;
    }

    public float getChipMinHeight() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.K0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.h1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.M0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.N0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        i83 i83Var = this.o;
        if (i83Var == null || (drawable = i83Var.W0) == 0) {
            return null;
        }
        if (!(drawable instanceof h6i)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.a1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.n1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.Z0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.m1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.Y0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.M1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.G0) {
            g83 g83Var = this.F0;
            if (g83Var.l == 1 || g83Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public s2a getHideMotionSpec() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.g1;
        }
        return null;
    }

    public float getIconEndPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.j1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.i1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.O0;
        }
        return null;
    }

    public xse getShapeAppearanceModel() {
        return this.o.a.a;
    }

    public s2a getShowMotionSpec() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.f1;
        }
        return null;
    }

    public float getTextEndPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.l1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        i83 i83Var = this.o;
        if (i83Var != null) {
            return i83Var.k1;
        }
        return 0.0f;
    }

    public final void h() {
        i83 i83Var;
        if (TextUtils.isEmpty(getText()) || (i83Var = this.o) == null) {
            return;
        }
        int iT = (int) (i83Var.t() + i83Var.o1 + i83Var.l1);
        i83 i83Var2 = this.o;
        int iS = (int) (i83Var2.s() + i83Var2.h1 + i83Var2.k1);
        if (this.s0 != null) {
            Rect rect = new Rect();
            this.s0.getPadding(rect);
            iS += rect.left;
            iT += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = hfh.a;
        setPaddingRelative(iS, paddingTop, iT, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        i83 i83Var = this.o;
        if (i83Var != null) {
            paint.drawableState = i83Var.getState();
        }
        s3g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.J0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        iti.c(this, this.o);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M0);
        }
        i83 i83Var = this.o;
        if (i83Var != null && i83Var.b1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.G0) {
            g83 g83Var = this.F0;
            int i2 = g83Var.l;
            if (i2 != Integer.MIN_VALUE) {
                g83Var.j(i2);
            }
            if (z) {
                g83Var.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        i83 i83Var = this.o;
        accessibilityNodeInfo.setCheckable(i83Var != null && i83Var.b1);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof n83) {
            n83 n83Var = (n83) getParent();
            if (n83Var.c) {
                i = 0;
                for (int i2 = 0; i2 < n83Var.getChildCount(); i2++) {
                    View childAt = n83Var.getChildAt(i2);
                    if ((childAt instanceof Chip) && n83Var.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(uxc.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) l5.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.C0 != i) {
            this.C0 = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.y0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.y0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.u0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.G0
            if (r0 == 0) goto L43
            g83 r0 = r5.F0
            r0.x(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.E0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.t0) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.t0) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.z(z);
        }
    }

    public void setCheckableResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.z(i83Var.p1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        i83 i83Var = this.o;
        if (i83Var == null) {
            this.x0 = z;
        } else if (i83Var.b1) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.A(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.A(eri.a(i83Var.p1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.B(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.B(z7.c(i83Var.p1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.C(i83Var.p1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.J0 == colorStateList) {
            return;
        }
        i83Var.J0 = colorStateList;
        i83Var.onStateChange(i83Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListC;
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.J0 == (colorStateListC = z7.c(i83Var.p1, i))) {
            return;
        }
        i83Var.J0 = colorStateListC;
        i83Var.onStateChange(i83Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.D(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.D(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(i83 i83Var) {
        i83 i83Var2 = this.o;
        if (i83Var2 != i83Var) {
            if (i83Var2 != null) {
                i83Var2.L1 = new WeakReference(null);
            }
            this.o = i83Var;
            i83Var.N1 = false;
            i83Var.L1 = new WeakReference(this);
            d(this.D0);
        }
    }

    public void setChipEndPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.o1 == f) {
            return;
        }
        i83Var.o1 = f;
        i83Var.invalidateSelf();
        i83Var.x();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        i83 i83Var = this.o;
        if (i83Var != null) {
            float dimension = i83Var.p1.getResources().getDimension(i);
            if (i83Var.o1 != dimension) {
                i83Var.o1 = dimension;
                i83Var.invalidateSelf();
                i83Var.x();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.E(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.E(eri.a(i83Var.p1, i));
        }
    }

    public void setChipIconSize(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.F(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.F(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.G(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.G(z7.c(i83Var.p1, i));
        }
    }

    public void setChipIconVisible(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.H(i83Var.p1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.K0 == f) {
            return;
        }
        i83Var.K0 = f;
        i83Var.invalidateSelf();
        i83Var.x();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        i83 i83Var = this.o;
        if (i83Var != null) {
            float dimension = i83Var.p1.getResources().getDimension(i);
            if (i83Var.K0 != dimension) {
                i83Var.K0 = dimension;
                i83Var.invalidateSelf();
                i83Var.x();
            }
        }
    }

    public void setChipStartPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.h1 == f) {
            return;
        }
        i83Var.h1 = f;
        i83Var.invalidateSelf();
        i83Var.x();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        i83 i83Var = this.o;
        if (i83Var != null) {
            float dimension = i83Var.p1.getResources().getDimension(i);
            if (i83Var.h1 != dimension) {
                i83Var.h1 = dimension;
                i83Var.invalidateSelf();
                i83Var.x();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.I(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.I(z7.c(i83Var.p1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.J(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.J(i83Var.p1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.K(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.a1 == charSequence) {
            return;
        }
        tm0 tm0VarC = tm0.c();
        tm0VarC.getClass();
        w3g w3gVar = y3g.a;
        i83Var.a1 = tm0VarC.d(charSequence);
        i83Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.L(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.L(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.K(eri.a(i83Var.p1, i));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.M(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.M(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.N(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.N(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.O(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.O(z7.c(i83Var.p1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.o == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.M1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.B0 = z;
        d(this.D0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(s2a s2aVar) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.g1 = s2aVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.g1 = s2a.a(i83Var.p1, i);
        }
    }

    public void setIconEndPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.Q(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.Q(i83Var.p1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.R(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.R(i83Var.p1.getResources().getDimension(i));
        }
    }

    @Override // defpackage.tq8
    public void setInternalOnCheckedChangeListener(sq8 sq8Var) {
        this.w0 = sq8Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.o == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.O1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.u0 = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.S(colorStateList);
        }
        this.o.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.S(z7.c(i83Var.p1, i));
            this.o.getClass();
            g();
        }
    }

    @Override // defpackage.ite
    public void setShapeAppearanceModel(xse xseVar) {
        this.o.setShapeAppearanceModel(xseVar);
    }

    public void setShowMotionSpec(s2a s2aVar) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.f1 = s2aVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.f1 = s2a.a(i83Var.p1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        i83 i83Var = this.o;
        if (i83Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(i83Var.N1 ? null : charSequence, bufferType);
        i83 i83Var2 = this.o;
        if (i83Var2 == null || TextUtils.equals(i83Var2.P0, charSequence)) {
            return;
        }
        i83Var2.P0 = charSequence;
        i83Var2.v1.e = true;
        i83Var2.invalidateSelf();
        i83Var2.x();
    }

    public void setTextAppearance(s3g s3gVar) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.v1.c(s3gVar, i83Var.p1);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.l1 == f) {
            return;
        }
        i83Var.l1 = f;
        i83Var.invalidateSelf();
        i83Var.x();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        i83 i83Var = this.o;
        if (i83Var != null) {
            float dimension = i83Var.p1.getResources().getDimension(i);
            if (i83Var.l1 != dimension) {
                i83Var.l1 = dimension;
                i83Var.invalidateSelf();
                i83Var.x();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        i83 i83Var = this.o;
        if (i83Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            a4g a4gVar = i83Var.v1;
            s3g s3gVar = a4gVar.g;
            if (s3gVar != null) {
                s3gVar.k = fApplyDimension;
                a4gVar.a.setTextSize(fApplyDimension);
                i83Var.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        i83 i83Var = this.o;
        if (i83Var == null || i83Var.k1 == f) {
            return;
        }
        i83Var.k1 = f;
        i83Var.invalidateSelf();
        i83Var.x();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        i83 i83Var = this.o;
        if (i83Var != null) {
            float dimension = i83Var.p1.getResources().getDimension(i);
            if (i83Var.k1 != dimension) {
                i83Var.k1 = dimension;
                i83Var.invalidateSelf();
                i83Var.x();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.P(z);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.C(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        i83 i83Var = this.o;
        if (i83Var != null) {
            i83Var.H(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i83 i83Var = this.o;
        if (i83Var != null) {
            Context context2 = i83Var.p1;
            i83Var.v1.c(new s3g(context2, i), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        i83 i83Var = this.o;
        if (i83Var != null) {
            Context context = i83Var.p1;
            i83Var.v1.c(new s3g(context, i), context);
        }
        i();
    }
}

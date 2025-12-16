package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.d45;
import defpackage.eri;
import defpackage.fvc;
import defpackage.gzc;
import defpackage.haj;
import defpackage.hfh;
import defpackage.i5d;
import defpackage.ic5;
import defpackage.j7g;
import defpackage.jdc;
import defpackage.lp;
import defpackage.mo;
import defpackage.o6d;
import defpackage.r72;
import defpackage.reh;
import defpackage.t35;
import defpackage.ta5;
import defpackage.ua5;
import defpackage.whh;
import defpackage.xc;
import defpackage.z7;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements ua5 {
    public static final r72 e1 = new r72(Float.class, "thumbPos", 10);
    public static final int[] f1 = {R.attr.state_checked};
    public boolean A0;
    public CharSequence B0;
    public CharSequence C0;
    public CharSequence D0;
    public CharSequence E0;
    public boolean F0;
    public int G0;
    public final int H0;
    public float I0;
    public float J0;
    public final VelocityTracker K0;
    public final int L0;
    public float M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public boolean U0;
    public final TextPaint V0;
    public final ColorStateList W0;
    public StaticLayout X0;
    public StaticLayout Y0;
    public final xc Z0;
    public Drawable a;
    public ObjectAnimator a1;
    public ColorStateList b;
    public mo b1;
    public PorterDuff.Mode c;
    public ic5 c1;
    public boolean d;
    public final Rect d1;
    public boolean o;
    public Drawable s0;
    public ColorStateList t0;
    public PorterDuff.Mode u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int i = fvc.switchStyle;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.o = false;
        this.t0 = null;
        this.u0 = null;
        this.v0 = false;
        this.w0 = false;
        this.K0 = VelocityTracker.obtain();
        this.U0 = true;
        this.d1 = new Rect();
        j7g.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.V0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        jdc jdcVarX = jdc.x(context, attributeSet, o6d.SwitchCompat, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        hfh.m(this, context, o6d.SwitchCompat, attributeSet, typedArray, i, 0);
        Drawable drawableT = jdcVarX.t(o6d.SwitchCompat_android_thumb);
        this.a = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(this);
        }
        Drawable drawableT2 = jdcVarX.t(o6d.SwitchCompat_track);
        this.s0 = drawableT2;
        if (drawableT2 != null) {
            drawableT2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(o6d.SwitchCompat_android_textOn));
        setTextOffInternal(typedArray.getText(o6d.SwitchCompat_android_textOff));
        this.F0 = typedArray.getBoolean(o6d.SwitchCompat_showText, true);
        this.x0 = typedArray.getDimensionPixelSize(o6d.SwitchCompat_thumbTextPadding, 0);
        this.y0 = typedArray.getDimensionPixelSize(o6d.SwitchCompat_switchMinWidth, 0);
        this.z0 = typedArray.getDimensionPixelSize(o6d.SwitchCompat_switchPadding, 0);
        this.A0 = typedArray.getBoolean(o6d.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListS = jdcVarX.s(o6d.SwitchCompat_thumbTint);
        if (colorStateListS != null) {
            this.b = colorStateListS;
            this.d = true;
        }
        PorterDuff.Mode modeC = d45.c(typedArray.getInt(o6d.SwitchCompat_thumbTintMode, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.o = true;
        }
        if (this.d || this.o) {
            b();
        }
        ColorStateList colorStateListS2 = jdcVarX.s(o6d.SwitchCompat_trackTint);
        if (colorStateListS2 != null) {
            this.t0 = colorStateListS2;
            this.v0 = true;
        }
        PorterDuff.Mode modeC2 = d45.c(typedArray.getInt(o6d.SwitchCompat_trackTintMode, -1), null);
        if (this.u0 != modeC2) {
            this.u0 = modeC2;
            this.w0 = true;
        }
        if (this.v0 || this.w0) {
            c();
        }
        int resourceId2 = typedArray.getResourceId(o6d.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, o6d.TextAppearance);
            int i2 = o6d.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0 || (colorStateList = z7.c(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i2) : colorStateList;
            if (colorStateList != null) {
                this.W0 = colorStateList;
            } else {
                this.W0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(o6d.TextAppearance_android_typeface, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(o6d.TextAppearance_android_textStyle, -1);
            Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i4 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i5 = i4 & (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0));
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(o6d.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                xc xcVar = new xc();
                xcVar.a = context2.getResources().getConfiguration().locale;
                this.Z0 = xcVar;
            } else {
                this.Z0 = null;
            }
            setTextOnInternal(this.B0);
            setTextOffInternal(this.D0);
            typedArrayObtainStyledAttributes.recycle();
        }
        new lp(this).f(attributeSet, i);
        jdcVarX.B();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.H0 = viewConfiguration.getScaledTouchSlop();
        this.L0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private mo getEmojiTextViewHelper() {
        if (this.b1 == null) {
            this.b1 = new mo(this);
        }
        return this.b1;
    }

    private boolean getTargetCheckedState() {
        return this.M0 > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = whh.a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.M0 : this.M0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.s0;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.d1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? d45.b(drawable2) : d45.c;
        return ((((this.N0 - this.P0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.D0 = charSequence;
        TransformationMethod transformationMethodI = ((haj) getEmojiTextViewHelper().b.b).i(this.Z0);
        if (transformationMethodI != null) {
            charSequence = transformationMethodI.getTransformation(charSequence, this);
        }
        this.E0 = charSequence;
        this.Y0 = null;
        if (this.F0) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.B0 = charSequence;
        TransformationMethod transformationMethodI = ((haj) getEmojiTextViewHelper().b.b).i(this.Z0);
        if (transformationMethodI != null) {
            charSequence = transformationMethodI.getTransformation(charSequence, this);
        }
        this.C0 = charSequence;
        this.X0 = null;
        if (this.F0) {
            e();
        }
    }

    @Override // defpackage.ua5
    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void b() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    t35.h(drawableMutate, this.b);
                }
                if (this.o) {
                    t35.i(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.s0;
        if (drawable != null) {
            if (this.v0 || this.w0) {
                Drawable drawableMutate = drawable.mutate();
                this.s0 = drawableMutate;
                if (this.v0) {
                    t35.h(drawableMutate, this.t0);
                }
                if (this.w0) {
                    t35.i(this.s0, this.u0);
                }
                if (this.s0.isStateful()) {
                    this.s0.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        setTextOnInternal(this.B0);
        setTextOffInternal(this.D0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.Q0;
        int i4 = this.R0;
        int i5 = this.S0;
        int i6 = this.T0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? d45.b(drawable) : d45.c;
        Drawable drawable2 = this.s0;
        Rect rect = this.d1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.s0.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.s0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.P0 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                t35.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            t35.e(drawable, f, f2);
        }
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            t35.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.s0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        if (this.c1 == null && this.b1.b() && ta5.m != null) {
            ta5 ta5VarA = ta5.a();
            int iB = ta5VarA.b();
            if (iB == 3 || iB == 0) {
                ic5 ic5Var = new ic5(this);
                this.c1 = ic5Var;
                ta5VarA.h(ic5Var);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = whh.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.N0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.z0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = whh.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.N0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.z0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.a.e(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.F0;
    }

    public boolean getSplitTrack() {
        return this.A0;
    }

    public int getSwitchMinWidth() {
        return this.y0;
    }

    public int getSwitchPadding() {
        return this.z0;
    }

    public CharSequence getTextOff() {
        return this.D0;
    }

    public CharSequence getTextOn() {
        return this.B0;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.M0;
    }

    public int getThumbTextPadding() {
        return this.x0;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.s0;
    }

    public ColorStateList getTrackTintList() {
        return this.t0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.u0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.a1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.a1.end();
        this.a1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.s0;
        Rect rect = this.d1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.R0;
        int i2 = this.T0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.A0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = d45.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.X0 : this.Y0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.V0;
            ColorStateList colorStateList = this.W0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.B0 : this.D0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Drawable drawable = this.s0;
            Rect rect = this.d1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = d45.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = whh.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.N0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.N0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.O0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.O0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.O0;
        }
        this.Q0 = paddingLeft;
        this.R0 = paddingTop;
        this.T0 = height;
        this.S0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.F0) {
            StaticLayout staticLayout = this.X0;
            TextPaint textPaint = this.V0;
            if (staticLayout == null) {
                CharSequence charSequence = this.C0;
                this.X0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Y0 == null) {
                CharSequence charSequence2 = this.E0;
                this.Y0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.d1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.P0 = Math.max(this.F0 ? (this.x0 * 2) + Math.max(this.X0.getWidth(), this.Y0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.s0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = d45.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.U0 ? Math.max(this.y0, (this.P0 * 2) + iMax + iMax2) : this.y0;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.N0 = iMax3;
        this.O0 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.B0 : this.D0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.B0;
                if (string == null) {
                    string = getResources().getString(i5d.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = hfh.a;
                new reh(gzc.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.D0;
            if (string2 == null) {
                string2 = getResources().getString(i5d.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = hfh.a;
            new reh(gzc.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.a1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, e1, zIsChecked ? 1.0f : 0.0f);
        this.a1 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.a1.setAutoCancel(true);
        this.a1.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a.f(callback, this));
    }

    @Override // defpackage.ua5
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.B0);
        setTextOffInternal(this.D0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.U0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.F0 != z) {
            this.F0 = z;
            requestLayout();
            if (z) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.y0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.z0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.V0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.D0;
        if (string == null) {
            string = getResources().getString(i5d.abc_capital_off);
        }
        WeakHashMap weakHashMap = hfh.a;
        new reh(gzc.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.B0;
        if (string == null) {
            string = getResources().getString(i5d.abc_capital_on);
        }
        WeakHashMap weakHashMap = hfh.a;
        new reh(gzc.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.M0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(eri.a(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.x0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.o = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.s0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.s0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(eri.a(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.v0 = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.u0 = mode;
        this.w0 = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.s0;
    }
}

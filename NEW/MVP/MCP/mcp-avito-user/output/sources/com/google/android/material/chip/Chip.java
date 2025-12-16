package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.j;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.android.material.R;
import com.google.android.material.chip.b;
import com.google.android.material.internal.D;
import com.google.android.material.internal.G;
import com.google.android.material.internal.InterfaceC37076q;
import com.google.android.material.internal.O;
import com.google.android.material.resources.g;
import com.google.android.material.shape.m;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import j.InterfaceC42146b;
import j.InterfaceC42152h;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.X;
import j.e0;
import j.f0;
import j.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import lY0.i;
import m.C43852a;

/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements b.a, v, InterfaceC37076q<Chip> {

    /* renamed from: f, reason: collision with root package name */
    @P
    public com.google.android.material.chip.b f356220f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public InsetDrawable f356221g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public RippleDrawable f356222h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public View.OnClickListener f356223i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public CompoundButton.OnCheckedChangeListener f356224j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public InterfaceC37076q.a<Chip> f356225k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f356226l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356227m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356229o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f356230p;

    /* renamed from: q, reason: collision with root package name */
    public int f356231q;

    /* renamed from: r, reason: collision with root package name */
    @r
    public int f356232r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public CharSequence f356233s;

    /* renamed from: t, reason: collision with root package name */
    @N
    public final b f356234t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f356235u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f356236v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f356237w;

    /* renamed from: x, reason: collision with root package name */
    public final g f356238x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f356218y = R.style.Widget_MaterialComponents_Chip_Action;

    /* renamed from: z, reason: collision with root package name */
    public static final Rect f356219z = new Rect();

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f356216A = {android.R.attr.state_selected};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f356217B = {android.R.attr.state_checkable};

    public class b extends androidx.customview.widget.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        public final int n(float f12, float f13) {
            int i12 = Chip.f356218y;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f12, f13)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        public final void o(@N ArrayList arrayList) {
            com.google.android.material.chip.b bVar;
            arrayList.add(0);
            int i12 = Chip.f356218y;
            Chip chip = Chip.this;
            if (!chip.e() || (bVar = chip.f356220f) == null || !bVar.f356261L || chip.f356223i == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // androidx.customview.widget.a
        public final boolean s(int i12, int i13, Bundle bundle) {
            boolean z12 = false;
            if (i13 == 16) {
                Chip chip = Chip.this;
                if (i12 == 0) {
                    return chip.performClick();
                }
                if (i12 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f356223i;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z12 = true;
                    }
                    if (chip.f356235u) {
                        chip.f356234t.x(1, 1);
                    }
                }
            }
            return z12;
        }

        @Override // androidx.customview.widget.a
        public final void t(@N f fVar) {
            Chip chip = Chip.this;
            fVar.f44999a.setCheckable(chip.g());
            fVar.l(chip.isClickable());
            fVar.k(chip.getAccessibilityClassName());
            fVar.v(chip.getText());
        }

        @Override // androidx.customview.widget.a
        public final void u(int i12, @N f fVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            if (i12 != 1) {
                fVar.o("");
                accessibilityNodeInfo.setBoundsInParent(Chip.f356219z);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                fVar.o(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                fVar.o(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            fVar.b(f.a.f45004g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // androidx.customview.widget.a
        public final void v(int i12, boolean z12) {
            if (i12 == 1) {
                Chip chip = Chip.this;
                chip.f356229o = z12;
                chip.refreshDrawableState();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i12 = R.attr.chipStyle;
        int i13 = f356218y;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f356236v = new Rect();
        this.f356237w = new RectF();
        this.f356238x = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND);
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
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        com.google.android.material.chip.b bVar = new com.google.android.material.chip.b(context2, attributeSet, i12);
        TypedArray typedArrayD = G.d(bVar.f356281f0, attributeSet, R.styleable.Chip, i12, i13, new int[0]);
        bVar.f356255F0 = typedArrayD.hasValue(R.styleable.Chip_shapeAppearance);
        int i14 = R.styleable.Chip_chipSurfaceColor;
        Context context3 = bVar.f356281f0;
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayD, context3, i14);
        if (bVar.f356300y != colorStateListB) {
            bVar.f356300y = colorStateListB;
            bVar.onStateChange(bVar.getState());
        }
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_chipBackgroundColor);
        if (bVar.f356302z != colorStateListB2) {
            bVar.f356302z = colorStateListB2;
            bVar.onStateChange(bVar.getState());
        }
        float dimension = typedArrayD.getDimension(R.styleable.Chip_chipMinHeight, 0.0f);
        if (bVar.f356244A != dimension) {
            bVar.f356244A = dimension;
            bVar.invalidateSelf();
            bVar.G();
        }
        if (typedArrayD.hasValue(R.styleable.Chip_chipCornerRadius)) {
            bVar.M(typedArrayD.getDimension(R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        bVar.R(com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_chipStrokeColor));
        bVar.S(typedArrayD.getDimension(R.styleable.Chip_chipStrokeWidth, 0.0f));
        bVar.b0(com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_rippleColor));
        String text = typedArrayD.getText(R.styleable.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(bVar.f356254F, text);
        D d12 = bVar.f356287l0;
        if (!zEquals) {
            bVar.f356254F = text;
            d12.f356724d = true;
            bVar.invalidateSelf();
            bVar.G();
        }
        int i15 = R.styleable.Chip_android_textAppearance;
        com.google.android.material.resources.d dVar = (!typedArrayD.hasValue(i15) || (resourceId = typedArrayD.getResourceId(i15, 0)) == 0) ? null : new com.google.android.material.resources.d(context3, resourceId);
        dVar.f356997k = typedArrayD.getDimension(R.styleable.Chip_android_textSize, dVar.f356997k);
        d12.b(dVar, context3);
        int i16 = typedArrayD.getInt(R.styleable.Chip_android_ellipsize, 0);
        if (i16 == 1) {
            bVar.f356249C0 = TextUtils.TruncateAt.START;
        } else if (i16 == 2) {
            bVar.f356249C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i16 == 3) {
            bVar.f356249C0 = TextUtils.TruncateAt.END;
        }
        bVar.Q(typedArrayD.getBoolean(R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            bVar.Q(typedArrayD.getBoolean(R.styleable.Chip_chipIconEnabled, false));
        }
        bVar.N(com.google.android.material.resources.c.d(typedArrayD, context3, R.styleable.Chip_chipIcon));
        if (typedArrayD.hasValue(R.styleable.Chip_chipIconTint)) {
            bVar.P(com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_chipIconTint));
        }
        bVar.O(typedArrayD.getDimension(R.styleable.Chip_chipIconSize, -1.0f));
        bVar.Y(typedArrayD.getBoolean(R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            bVar.Y(typedArrayD.getBoolean(R.styleable.Chip_closeIconEnabled, false));
        }
        bVar.T(com.google.android.material.resources.c.d(typedArrayD, context3, R.styleable.Chip_closeIcon));
        bVar.X(com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_closeIconTint));
        bVar.V(typedArrayD.getDimension(R.styleable.Chip_closeIconSize, 0.0f));
        bVar.I(typedArrayD.getBoolean(R.styleable.Chip_android_checkable, false));
        bVar.L(typedArrayD.getBoolean(R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            bVar.L(typedArrayD.getBoolean(R.styleable.Chip_checkedIconEnabled, false));
        }
        bVar.J(com.google.android.material.resources.c.d(typedArrayD, context3, R.styleable.Chip_checkedIcon));
        if (typedArrayD.hasValue(R.styleable.Chip_checkedIconTint)) {
            bVar.K(com.google.android.material.resources.c.b(typedArrayD, context3, R.styleable.Chip_checkedIconTint));
        }
        bVar.f356271V = i.a(typedArrayD, context3, R.styleable.Chip_showMotionSpec);
        bVar.f356272W = i.a(typedArrayD, context3, R.styleable.Chip_hideMotionSpec);
        float dimension2 = typedArrayD.getDimension(R.styleable.Chip_chipStartPadding, 0.0f);
        if (bVar.f356273X != dimension2) {
            bVar.f356273X = dimension2;
            bVar.invalidateSelf();
            bVar.G();
        }
        bVar.a0(typedArrayD.getDimension(R.styleable.Chip_iconStartPadding, 0.0f));
        bVar.Z(typedArrayD.getDimension(R.styleable.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(R.styleable.Chip_textStartPadding, 0.0f);
        if (bVar.f356276a0 != dimension3) {
            bVar.f356276a0 = dimension3;
            bVar.invalidateSelf();
            bVar.G();
        }
        float dimension4 = typedArrayD.getDimension(R.styleable.Chip_textEndPadding, 0.0f);
        if (bVar.f356277b0 != dimension4) {
            bVar.f356277b0 = dimension4;
            bVar.invalidateSelf();
            bVar.G();
        }
        bVar.W(typedArrayD.getDimension(R.styleable.Chip_closeIconStartPadding, 0.0f));
        bVar.U(typedArrayD.getDimension(R.styleable.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(R.styleable.Chip_chipEndPadding, 0.0f);
        if (bVar.f356280e0 != dimension5) {
            bVar.f356280e0 = dimension5;
            bVar.invalidateSelf();
            bVar.G();
        }
        bVar.f356253E0 = typedArrayD.getDimensionPixelSize(R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = R.styleable.Chip;
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr, i12, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        this.f356230p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f356232r = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(O.b(48, getContext()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(bVar);
        bVar.m(C22823h0.l(this));
        int[] iArr2 = R.styleable.Chip;
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr2, i12, i13, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i12, i13);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.f356234t = new b(this);
        i();
        if (!zHasValue) {
            setOutlineProvider(new com.google.android.material.chip.a(this));
        }
        setChecked(this.f356226l);
        setText(bVar.f356254F);
        setEllipsize(bVar.f356249C0);
        l();
        if (!this.f356220f.f356251D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        k();
        if (this.f356230p) {
            setMinHeight(this.f356232r);
        }
        this.f356231q = getLayoutDirection();
        super.setOnCheckedChangeListener(new h(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f356237w;
        rectF.setEmpty();
        if (e() && this.f356223i != null) {
            com.google.android.material.chip.b bVar = this.f356220f;
            Rect bounds = bVar.getBounds();
            rectF.setEmpty();
            if (bVar.e0()) {
                float f12 = bVar.f356280e0 + bVar.f356279d0 + bVar.f356265P + bVar.f356278c0 + bVar.f356277b0;
                if (bVar.getLayoutDirection() == 0) {
                    float f13 = bounds.right;
                    rectF.right = f13;
                    rectF.left = f13 - f12;
                } else {
                    float f14 = bounds.left;
                    rectF.left = f14;
                    rectF.right = f14 + f12;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i12 = (int) closeIconTouchBounds.left;
        int i13 = (int) closeIconTouchBounds.top;
        int i14 = (int) closeIconTouchBounds.right;
        int i15 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f356236v;
        rect.set(i12, i13, i14, i15);
        return rect;
    }

    @P
    private com.google.android.material.resources.d getTextAppearance() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356287l0.f356726f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z12) {
        if (this.f356228n != z12) {
            this.f356228n = z12;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z12) {
        if (this.f356227m != z12) {
            this.f356227m = z12;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.b.a
    public final void a() {
        d(this.f356232r);
        requestLayout();
        invalidateOutline();
    }

    public final void d(@r int i12) {
        this.f356232r = i12;
        if (!this.f356230p) {
            InsetDrawable insetDrawable = this.f356221g;
            if (insetDrawable == null) {
                j();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f356221g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    j();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i12 - ((int) this.f356220f.f356244A));
        int iMax2 = Math.max(0, i12 - this.f356220f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f356221g;
            if (insetDrawable2 == null) {
                j();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f356221g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    j();
                    return;
                }
                return;
            }
        }
        int i13 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i14 = iMax > 0 ? iMax / 2 : 0;
        if (this.f356221g != null) {
            Rect rect = new Rect();
            this.f356221g.getPadding(rect);
            if (rect.top == i14 && rect.bottom == i14 && rect.left == i13 && rect.right == i13) {
                j();
                return;
            }
        }
        if (getMinHeight() != i12) {
            setMinHeight(i12);
        }
        if (getMinWidth() != i12) {
            setMinWidth(i12);
        }
        this.f356221g = new InsetDrawable((Drawable) this.f356220f, i13, i14, i13, i14);
        j();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        return !this.f356235u ? super.dispatchHoverEvent(motionEvent) : this.f356234t.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
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
            boolean r0 = r9.f356235u
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.f356234t
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r1 == r2) goto L85
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6f
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
            goto L85
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L85
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
            int r1 = r1 + r2
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r2
            goto L49
        L55:
            r4 = r7
            goto L85
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L85
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L85
            int r1 = r0.f45367l
            if (r1 == r3) goto L6d
            r4 = 16
            boolean r1 = r0.s(r1, r4, r6)
        L6d:
            r4 = r2
            goto L85
        L6f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L85
        L7b:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L85
            boolean r4 = r0.q(r2, r6)
        L85:
            if (r4 == 0) goto L8c
            int r0 = r0.f45367l
            if (r0 == r3) goto L8c
            return r2
        L8c:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i12;
        super.drawableStateChanged();
        com.google.android.material.chip.b bVar = this.f356220f;
        boolean zH2 = false;
        if (bVar != null && com.google.android.material.chip.b.F(bVar.f356262M)) {
            com.google.android.material.chip.b bVar2 = this.f356220f;
            ?? IsEnabled = isEnabled();
            int i13 = IsEnabled;
            if (this.f356229o) {
                i13 = IsEnabled + 1;
            }
            int i14 = i13;
            if (this.f356228n) {
                i14 = i13 + 1;
            }
            int i15 = i14;
            if (this.f356227m) {
                i15 = i14 + 1;
            }
            int i16 = i15;
            if (isChecked()) {
                i16 = i15 + 1;
            }
            int[] iArr = new int[i16];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (this.f356229o) {
                iArr[i12] = 16842908;
                i12++;
            }
            if (this.f356228n) {
                iArr[i12] = 16843623;
                i12++;
            }
            if (this.f356227m) {
                iArr[i12] = 16842919;
                i12++;
            }
            if (isChecked()) {
                iArr[i12] = 16842913;
            }
            if (!Arrays.equals(bVar2.f356303z0, iArr)) {
                bVar2.f356303z0 = iArr;
                if (bVar2.e0()) {
                    zH2 = bVar2.H(bVar2.getState(), iArr);
                }
            }
        }
        if (zH2) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            Object objB = bVar.f356262M;
            if (objB == null) {
                objB = null;
            } else if (objB instanceof j) {
                objB = ((j) objB).b();
            }
            if (objB != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        com.google.android.material.chip.b bVar = this.f356220f;
        return bVar != null && bVar.f356267R;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @N
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f356233s)) {
            return this.f356233s;
        }
        if (!g()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof d)) {
            return "android.widget.Button";
        }
        ((d) parent).getClass();
        throw null;
    }

    @P
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f356221g;
        return insetDrawable == null ? this.f356220f : insetDrawable;
    }

    @P
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356269T;
        }
        return null;
    }

    @P
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356270U;
        }
        return null;
    }

    @P
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356302z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return Math.max(0.0f, bVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f356220f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356280e0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || (drawable = bVar.f356257H) == 0) {
            return null;
        }
        boolean z12 = drawable instanceof j;
        Drawable drawableB = drawable;
        if (z12) {
            drawableB = ((j) drawable).b();
        }
        return drawableB;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356259J;
        }
        return 0.0f;
    }

    @P
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356258I;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356244A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356273X;
        }
        return 0.0f;
    }

    @P
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356248C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356250D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || (drawable = bVar.f356262M) == 0) {
            return null;
        }
        boolean z12 = drawable instanceof j;
        Drawable drawableB = drawable;
        if (z12) {
            drawableB = ((j) drawable).b();
        }
        return drawableB;
    }

    @P
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356266Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356279d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356265P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356278c0;
        }
        return 0.0f;
    }

    @P
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356264O;
        }
        return null;
    }

    @Override // android.widget.TextView
    @P
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356249C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@N Rect rect) {
        if (this.f356235u) {
            b bVar = this.f356234t;
            if (bVar.f45367l == 1 || bVar.f45366k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @P
    public i getHideMotionSpec() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356272W;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356275Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356274Y;
        }
        return 0.0f;
    }

    @P
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356252E;
        }
        return null;
    }

    @Override // com.google.android.material.shape.v
    @N
    public q getShapeAppearanceModel() {
        return this.f356220f.f357034b.f357057a;
    }

    @P
    public i getShowMotionSpec() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356271V;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356277b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            return bVar.f356276a0;
        }
        return 0.0f;
    }

    public final void i() {
        com.google.android.material.chip.b bVar;
        if (!e() || (bVar = this.f356220f) == null || !bVar.f356261L || this.f356223i == null) {
            C22823h0.C(this, null);
            this.f356235u = false;
        } else {
            C22823h0.C(this, this.f356234t);
            this.f356235u = true;
        }
    }

    public final void j() {
        this.f356222h = new RippleDrawable(com.google.android.material.ripple.b.c(this.f356220f.f356252E), getBackgroundDrawable(), null);
        this.f356220f.getClass();
        RippleDrawable rippleDrawable = this.f356222h;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setBackground(rippleDrawable);
        k();
    }

    public final void k() {
        com.google.android.material.chip.b bVar;
        if (TextUtils.isEmpty(getText()) || (bVar = this.f356220f) == null) {
            return;
        }
        int iC2 = (int) (bVar.C() + bVar.f356280e0 + bVar.f356277b0);
        com.google.android.material.chip.b bVar2 = this.f356220f;
        int iB2 = (int) (bVar2.B() + bVar2.f356273X + bVar2.f356276a0);
        if (this.f356221g != null) {
            Rect rect = new Rect();
            this.f356221g.getPadding(rect);
            iB2 += rect.left;
            iC2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setPaddingRelative(iB2, paddingTop, iC2, paddingBottom);
    }

    public final void l() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        com.google.android.material.resources.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f356238x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.c(this, this.f356220f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356216A);
        }
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f356217B);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z12, int i12, Rect rect) {
        super.onFocusChanged(z12, i12, rect);
        if (this.f356235u) {
            b bVar = this.f356234t;
            int i13 = bVar.f45367l;
            if (i13 != Integer.MIN_VALUE) {
                bVar.j(i13);
            }
            if (z12) {
                bVar.q(i12, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@N MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        int i12;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof d) {
            d dVar = (d) getParent();
            f fVar = new f(accessibilityNodeInfo);
            if (dVar.f356831d) {
                i12 = 0;
                for (int i13 = 0; i13 < dVar.getChildCount(); i13++) {
                    View childAt = dVar.getChildAt(i13);
                    if ((childAt instanceof Chip) && dVar.getChildAt(i13).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                i12 = -1;
            } else {
                i12 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            fVar.n(f.g.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i12, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
    @P
    public final PointerIcon onResolvePointerIcon(@N MotionEvent motionEvent, int i12) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i12) {
        super.onRtlPropertiesChanged(i12);
        if (this.f356231q != i12) {
            this.f356231q = i12;
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@j.N android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f356227m
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f356227m
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f356223i
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f356235u
            if (r0 == 0) goto L43
            com.google.android.material.chip.Chip$b r0 = r5.f356234t
            r0.x(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@P CharSequence charSequence) {
        this.f356233s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f356222h) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f356222h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.I(z12);
        }
    }

    public void setCheckableResource(@InterfaceC42152h int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.I(bVar.f356281f0.getResources().getBoolean(i12));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null) {
            this.f356226l = z12;
        } else if (bVar.f356267R) {
            super.setChecked(z12);
        }
    }

    public void setCheckedIcon(@P Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.J(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z12) {
        setCheckedIconVisible(z12);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@InterfaceC42152h int i12) {
        setCheckedIconVisible(i12);
    }

    public void setCheckedIconResource(@InterfaceC42165v int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.J(C43852a.a(bVar.f356281f0, i12));
        }
    }

    public void setCheckedIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@InterfaceC42158n int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.K(androidx.core.content.d.getColorStateList(bVar.f356281f0, i12));
        }
    }

    public void setCheckedIconVisible(@InterfaceC42152h int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.L(bVar.f356281f0.getResources().getBoolean(i12));
        }
    }

    public void setChipBackgroundColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356302z == colorStateList) {
            return;
        }
        bVar.f356302z = colorStateList;
        bVar.onStateChange(bVar.getState());
    }

    public void setChipBackgroundColorResource(@InterfaceC42158n int i12) {
        ColorStateList colorStateList;
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356302z == (colorStateList = androidx.core.content.d.getColorStateList(bVar.f356281f0, i12))) {
            return;
        }
        bVar.f356302z = colorStateList;
        bVar.onStateChange(bVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.M(f12);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.M(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setChipDrawable(@N com.google.android.material.chip.b bVar) {
        com.google.android.material.chip.b bVar2 = this.f356220f;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.f356247B0 = new WeakReference<>(null);
            }
            this.f356220f = bVar;
            bVar.f356251D0 = false;
            bVar.f356247B0 = new WeakReference<>(this);
            d(this.f356232r);
        }
    }

    public void setChipEndPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356280e0 == f12) {
            return;
        }
        bVar.f356280e0 = f12;
        bVar.invalidateSelf();
        bVar.G();
    }

    public void setChipEndPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float dimension = bVar.f356281f0.getResources().getDimension(i12);
            if (bVar.f356280e0 != dimension) {
                bVar.f356280e0 = dimension;
                bVar.invalidateSelf();
                bVar.G();
            }
        }
    }

    public void setChipIcon(@P Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.N(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z12) {
        setChipIconVisible(z12);
    }

    @Deprecated
    public void setChipIconEnabledResource(@InterfaceC42152h int i12) {
        setChipIconVisible(i12);
    }

    public void setChipIconResource(@InterfaceC42165v int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.N(C43852a.a(bVar.f356281f0, i12));
        }
    }

    public void setChipIconSize(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.O(f12);
        }
    }

    public void setChipIconSizeResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.O(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setChipIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.P(colorStateList);
        }
    }

    public void setChipIconTintResource(@InterfaceC42158n int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.P(androidx.core.content.d.getColorStateList(bVar.f356281f0, i12));
        }
    }

    public void setChipIconVisible(@InterfaceC42152h int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.Q(bVar.f356281f0.getResources().getBoolean(i12));
        }
    }

    public void setChipMinHeight(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356244A == f12) {
            return;
        }
        bVar.f356244A = f12;
        bVar.invalidateSelf();
        bVar.G();
    }

    public void setChipMinHeightResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float dimension = bVar.f356281f0.getResources().getDimension(i12);
            if (bVar.f356244A != dimension) {
                bVar.f356244A = dimension;
                bVar.invalidateSelf();
                bVar.G();
            }
        }
    }

    public void setChipStartPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356273X == f12) {
            return;
        }
        bVar.f356273X = f12;
        bVar.invalidateSelf();
        bVar.G();
    }

    public void setChipStartPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float dimension = bVar.f356281f0.getResources().getDimension(i12);
            if (bVar.f356273X != dimension) {
                bVar.f356273X = dimension;
                bVar.invalidateSelf();
                bVar.G();
            }
        }
    }

    public void setChipStrokeColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@InterfaceC42158n int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.R(androidx.core.content.d.getColorStateList(bVar.f356281f0, i12));
        }
    }

    public void setChipStrokeWidth(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.S(f12);
        }
    }

    public void setChipStrokeWidthResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.S(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    @Deprecated
    public void setChipText(@P CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@e0 int i12) {
        setText(getResources().getString(i12));
    }

    public void setCloseIcon(@P Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.T(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(@P CharSequence charSequence) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356266Q == charSequence) {
            return;
        }
        androidx.core.text.a aVarC = androidx.core.text.a.c();
        bVar.f356266Q = aVarC.d(charSequence, aVarC.f44864c);
        bVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z12) {
        setCloseIconVisible(z12);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@InterfaceC42152h int i12) {
        setCloseIconVisible(i12);
    }

    public void setCloseIconEndPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.U(f12);
        }
    }

    public void setCloseIconEndPaddingResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.U(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setCloseIconResource(@InterfaceC42165v int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.T(C43852a.a(bVar.f356281f0, i12));
        }
        i();
    }

    public void setCloseIconSize(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.V(f12);
        }
    }

    public void setCloseIconSizeResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.V(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setCloseIconStartPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.W(f12);
        }
    }

    public void setCloseIconStartPaddingResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.W(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setCloseIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(@InterfaceC42158n int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.X(androidx.core.content.d.getColorStateList(bVar.f356281f0, i12));
        }
    }

    public void setCloseIconVisible(@InterfaceC42152h int i12) {
        setCloseIconVisible(getResources().getBoolean(i12));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @X
    public final void setCompoundDrawablesRelative(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i12, int i13, int i14, int i15) {
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i14 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i12, i13, i14, i15);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i12, int i13, int i14, int i15) {
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i14 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i12, i13, i14, i15);
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.m(f12);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f356220f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356249C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z12) {
        this.f356230p = z12;
        d(this.f356232r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i12) {
        if (i12 != 8388627) {
            return;
        }
        super.setGravity(i12);
    }

    public void setHideMotionSpec(@P i iVar) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356272W = iVar;
        }
    }

    public void setHideMotionSpecResource(@InterfaceC42146b int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356272W = i.b(i12, bVar.f356281f0);
        }
    }

    public void setIconEndPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.Z(f12);
        }
    }

    public void setIconEndPaddingResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.Z(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    public void setIconStartPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.a0(f12);
        }
    }

    public void setIconStartPaddingResource(@InterfaceC42161q int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.a0(bVar.f356281f0.getResources().getDimension(i12));
        }
    }

    @RestrictTo
    public void setInternalOnCheckedChangeListener(@P InterfaceC37076q.a<Chip> aVar) {
        this.f356225k = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i12) {
        if (this.f356220f == null) {
            return;
        }
        super.setLayoutDirection(i12);
    }

    @Override // android.widget.TextView
    public void setLines(int i12) {
        if (i12 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i12);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i12) {
        if (i12 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i12);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@U int i12) {
        super.setMaxWidth(i12);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356253E0 = i12;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i12) {
        if (i12 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i12);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@P CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f356224j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f356223i = onClickListener;
        i();
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.b0(colorStateList);
        }
        this.f356220f.getClass();
        j();
    }

    public void setRippleColorResource(@InterfaceC42158n int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.b0(androidx.core.content.d.getColorStateList(bVar.f356281f0, i12));
            this.f356220f.getClass();
            j();
        }
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N q qVar) {
        this.f356220f.setShapeAppearanceModel(qVar);
    }

    public void setShowMotionSpec(@P i iVar) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356271V = iVar;
        }
    }

    public void setShowMotionSpecResource(@InterfaceC42146b int i12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356271V = i.b(i12, bVar.f356281f0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z12) {
        if (!z12) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z12);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.f356251D0 ? null : charSequence, bufferType);
        com.google.android.material.chip.b bVar2 = this.f356220f;
        if (bVar2 == null || TextUtils.equals(bVar2.f356254F, charSequence)) {
            return;
        }
        bVar2.f356254F = charSequence;
        bVar2.f356287l0.f356724d = true;
        bVar2.invalidateSelf();
        bVar2.G();
    }

    public void setTextAppearance(@P com.google.android.material.resources.d dVar) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.f356287l0.b(dVar, bVar.f356281f0);
        }
        l();
    }

    public void setTextAppearanceResource(@f0 int i12) {
        setTextAppearance(getContext(), i12);
    }

    public void setTextEndPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356277b0 == f12) {
            return;
        }
        bVar.f356277b0 = f12;
        bVar.invalidateSelf();
        bVar.G();
    }

    public void setTextEndPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float dimension = bVar.f356281f0.getResources().getDimension(i12);
            if (bVar.f356277b0 != dimension) {
                bVar.f356277b0 = dimension;
                bVar.invalidateSelf();
                bVar.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i12, float f12) {
        super.setTextSize(i12, f12);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i12, f12, getResources().getDisplayMetrics());
            D d12 = bVar.f356287l0;
            com.google.android.material.resources.d dVar = d12.f356726f;
            if (dVar != null) {
                dVar.f356997k = fApplyDimension;
                d12.f356721a.setTextSize(fApplyDimension);
                bVar.a();
            }
        }
        l();
    }

    public void setTextStartPadding(float f12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar == null || bVar.f356276a0 == f12) {
            return;
        }
        bVar.f356276a0 = f12;
        bVar.invalidateSelf();
        bVar.G();
    }

    public void setTextStartPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            float dimension = bVar.f356281f0.getResources().getDimension(i12);
            if (bVar.f356276a0 != dimension) {
                bVar.f356276a0 = dimension;
                bVar.invalidateSelf();
                bVar.G();
            }
        }
    }

    public void setCloseIconVisible(boolean z12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.Y(z12);
        }
        i();
    }

    public void setCheckedIconVisible(boolean z12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.L(z12);
        }
    }

    public void setChipIconVisible(boolean z12) {
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            bVar.Q(z12);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
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
    public final void setCompoundDrawablesWithIntrinsicBounds(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
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
    public final void setTextAppearance(Context context, int i12) {
        super.setTextAppearance(context, i12);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            Context context2 = bVar.f356281f0;
            bVar.f356287l0.b(new com.google.android.material.resources.d(context2, i12), context2);
        }
        l();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i12) {
        super.setTextAppearance(i12);
        com.google.android.material.chip.b bVar = this.f356220f;
        if (bVar != null) {
            Context context = bVar.f356281f0;
            bVar.f356287l0.b(new com.google.android.material.resources.d(context, i12), context);
        }
        l();
    }

    public class a extends g {
        public a() {
        }

        @Override // com.google.android.material.resources.g
        public final void b(@N Typeface typeface, boolean z12) {
            Chip chip = Chip.this;
            com.google.android.material.chip.b bVar = chip.f356220f;
            chip.setText(bVar.f356251D0 ? bVar.f356254F : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // com.google.android.material.resources.g
        public final void a(int i12) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i12) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i12) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
    }
}

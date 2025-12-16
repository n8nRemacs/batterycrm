package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.D0;
import androidx.appcompat.widget.V;
import androidx.core.graphics.C22767g;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.google.android.gms.common.internal.P0;
import com.google.android.material.R;
import com.google.android.material.internal.C37062c;
import com.google.android.material.internal.C37064e;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import com.google.android.material.textfield.i;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.F;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.e0;
import j.f0;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import lY0.C43707b;
import m.C43852a;
import wY0.C49576a;

/* loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{android.R.attr.state_pressed}, new int[0]};
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;

    @P
    private com.google.android.material.shape.k boxBackground;
    private boolean boxBackgroundApplied;

    @InterfaceC42156l
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @InterfaceC42156l
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @P
    private com.google.android.material.shape.k boxUnderlineDefault;

    @P
    private com.google.android.material.shape.k boxUnderlineFocused;
    final C37062c collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @P
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @P
    private ColorStateList counterTextColor;

    @P
    private TextView counterView;

    @InterfaceC42156l
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;

    @InterfaceC42156l
    private int defaultStrokeColor;

    @InterfaceC42156l
    private int disabledColor;

    @InterfaceC42156l
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<i> editTextAttachedListeners;

    @P
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;

    @N
    private final p endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;

    @InterfaceC42156l
    private int focusedFilledBackgroundColor;

    @InterfaceC42156l
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @InterfaceC42156l
    private int hoveredFilledBackgroundColor;

    @InterfaceC42156l
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final s indicatorViewController;

    @N
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;

    @N
    private h lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private com.google.android.material.shape.k outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;

    @P
    private C23503n placeholderFadeIn;

    @P
    private C23503n placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;

    @P
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;

    @N
    private com.google.android.material.shape.q shapeAppearanceModel;

    @P
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;

    @N
    private final x startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @P
        public CharSequence f357434d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f357435e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @P
            public final Object createFromParcel(@N Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f357434d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f357435e = parcel.readInt() == 1;
        }

        @N
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f357434d) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            TextUtils.writeToParcel(this.f357434d, parcel, i12);
            parcel.writeInt(this.f357435e ? 1 : 0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.endLayout.f357490h;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C22808a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f357440d;

        public e(@N TextInputLayout textInputLayout) {
            this.f357440d = textInputLayout;
        }

        @Override // androidx.core.view.C22808a
        public final void d(@N View view, @N androidx.core.view.accessibility.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f357440d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zIsHintExpanded = textInputLayout.isHintExpanded();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z12 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            x xVar = textInputLayout.startLayout;
            AppCompatTextView appCompatTextView = xVar.f357560c;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(xVar.f357562e);
            }
            if (!zIsEmpty) {
                fVar.v(text);
            } else if (!TextUtils.isEmpty(string)) {
                fVar.v(string);
                if (!zIsHintExpanded && placeholderText != null) {
                    fVar.v(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                fVar.v(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setHintText(string);
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z12) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.indicatorViewController.f357544y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.endLayout.b().n(fVar);
        }

        @Override // androidx.core.view.C22808a
        public final void e(@N View view, @N AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f357440d.endLayout.b().o(accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface g {
    }

    public interface h {
        int c(@P Editable editable);
    }

    public interface i {
        void a(@N TextInputLayout textInputLayout);
    }

    public interface j {
        void a();
    }

    public TextInputLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText = this.editText;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.google.android.material.resources.c.e(getContext())) {
            EditText editText2 = this.editText;
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        com.google.android.material.shape.k kVar = this.boxBackground;
        if (kVar == null) {
            return;
        }
        com.google.android.material.shape.q qVar = kVar.f357034b.f357057a;
        com.google.android.material.shape.q qVar2 = this.shapeAppearanceModel;
        if (qVar != qVar2) {
            kVar.setShapeAppearanceModel(qVar2);
        }
        if (canDrawOutlineStroke()) {
            com.google.android.material.shape.k kVar2 = this.boxBackground;
            float f12 = this.boxStrokeWidthPx;
            int i12 = this.boxStrokeColor;
            kVar2.v(f12);
            kVar2.u(ColorStateList.valueOf(i12));
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.n(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.n(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.n(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(@N RectF rectF) {
        float f12 = rectF.left;
        int i12 = this.boxLabelCutoutPaddingPx;
        rectF.left = f12 - i12;
        rectF.right += i12;
    }

    private void assignBoxBackgroundByMode() {
        int i12 = this.boxBackgroundMode;
        if (i12 == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i12 == 1) {
            this.boxBackground = new com.google.android.material.shape.k(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new com.google.android.material.shape.k();
            this.boxUnderlineFocused = new com.google.android.material.shape.k();
        } else {
            if (i12 != 2) {
                throw new IllegalArgumentException(AK.c.i(this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.hintEnabled || (this.boxBackground instanceof com.google.android.material.textfield.i)) {
                this.boxBackground = new com.google.android.material.shape.k(this.shapeAppearanceModel);
            } else {
                com.google.android.material.shape.q qVar = this.shapeAppearanceModel;
                int i13 = com.google.android.material.textfield.i.f357460z;
                if (qVar == null) {
                    qVar = new com.google.android.material.shape.q();
                }
                this.boxBackground = new i.d(new i.b(qVar, new RectF(), null), null);
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        int i12 = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i12;
        }
        return C22767g.g(this.boxBackgroundColor, com.google.android.material.color.k.b(getContext(), R.attr.colorSurface, 0));
    }

    @N
    private Rect calculateCollapsedTextBounds(@N Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean zF2 = O.f(this);
        rect2.bottom = rect.bottom;
        int i12 = this.boxBackgroundMode;
        if (i12 == 1) {
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zF2);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, zF2);
            return rect2;
        }
        if (i12 != 2) {
            rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zF2);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, zF2);
            return rect2;
        }
        rect2.left = this.editText.getPaddingLeft() + rect.left;
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(@N Rect rect, @N Rect rect2, float f12) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f12) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(@N Rect rect, float f12) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f12 / 2.0f));
        }
        return this.editText.getCompoundPaddingTop() + rect.top;
    }

    @N
    private Rect calculateExpandedTextBounds(@N Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        C37062c c37062c = this.collapsingTextHelper;
        TextPaint textPaint = c37062c.f356775U;
        textPaint.setTextSize(c37062c.f356803l);
        textPaint.setTypeface(c37062c.f356824z);
        textPaint.setLetterSpacing(c37062c.f356794g0);
        float f12 = -textPaint.ascent();
        rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
        rect2.top = calculateExpandedLabelTop(rect, f12);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, f12);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float fE2;
        if (!this.hintEnabled) {
            return 0;
        }
        int i12 = this.boxBackgroundMode;
        if (i12 == 0) {
            fE2 = this.collapsingTextHelper.e();
        } else {
            if (i12 != 2) {
                return 0;
            }
            fE2 = this.collapsingTextHelper.e() / 2.0f;
        }
        return (int) fE2;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((com.google.android.material.textfield.i) this.boxBackground).z(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void collapseHint(boolean z12) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z12 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.p(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        x xVar = this.startLayout;
        xVar.f357568k = false;
        xVar.d();
        p pVar = this.endLayout;
        pVar.f357501s = false;
        pVar.m();
    }

    private C23503n createPlaceholderFadeTransition() {
        C23503n c23503n = new C23503n();
        c23503n.f54667d = C49576a.c(getContext(), R.attr.motionDurationShort2, 87);
        c23503n.f54668e = C49576a.d(getContext(), R.attr.motionEasingLinearInterpolator, C43707b.f413879a);
        return c23503n;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof com.google.android.material.textfield.i);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<i> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        com.google.android.material.shape.k kVar;
        if (this.boxUnderlineFocused == null || (kVar = this.boxUnderlineDefault) == null) {
            return;
        }
        kVar.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float f12 = this.collapsingTextHelper.f356783b;
            int iCenterX = bounds2.centerX();
            bounds.left = C43707b.c(f12, iCenterX, bounds2.left);
            bounds.right = C43707b.c(f12, iCenterX, bounds2.right);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(@N Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.d(canvas);
        }
    }

    private void expandHint(boolean z12) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z12 && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.p(0.0f);
        }
        if (cutoutEnabled() && !((com.google.android.material.textfield.i) this.boxBackground).f357461y.f357462s.isEmpty()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        x xVar = this.startLayout;
        xVar.f357568k = true;
        xVar.d();
        p pVar = this.endLayout;
        pVar.f357501s = true;
        pVar.m();
    }

    private com.google.android.material.shape.k getDropDownMaterialShapeDrawable(boolean z12) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f12 = z12 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.editText;
        float popupElevation = editText instanceof u ? ((u) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        q.b bVar = new q.b();
        bVar.m(f12);
        bVar.p(f12);
        bVar.g(dimensionPixelOffset);
        bVar.j(dimensionPixelOffset);
        com.google.android.material.shape.q qVarA = bVar.a();
        Context context = getContext();
        Paint paint = com.google.android.material.shape.k.f357033x;
        int iC2 = com.google.android.material.color.k.c(context, R.attr.colorSurface, com.google.android.material.shape.k.class.getSimpleName());
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        kVar.j(context);
        kVar.n(ColorStateList.valueOf(iC2));
        kVar.m(popupElevation);
        kVar.setShapeAppearanceModel(qVarA);
        k.c cVar = kVar.f357034b;
        if (cVar.f357063g == null) {
            cVar.f357063g = new Rect();
        }
        kVar.f357034b.f357063g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        kVar.invalidateSelf();
        return kVar;
    }

    @P
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || o.a(editText)) {
            return this.boxBackground;
        }
        int iD2 = com.google.android.material.color.k.d(this.editText, R.attr.colorControlHighlight);
        int i12 = this.boxBackgroundMode;
        if (i12 == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, iD2, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i12 == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, iD2, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(com.google.android.material.shape.k kVar, int i12, int i13, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{com.google.android.material.color.k.f(0.1f, i13, i12), i12}), kVar, kVar);
    }

    private int getLabelLeftBoundAlightWithPrefix(int i12, boolean z12) {
        int compoundPaddingLeft = this.editText.getCompoundPaddingLeft() + i12;
        return (getPrefixText() == null || z12) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i12, boolean z12) {
        int compoundPaddingRight = i12 - this.editText.getCompoundPaddingRight();
        return (getPrefixText() == null || !z12) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, com.google.android.material.shape.k kVar, int i12, int[][] iArr) {
        int iC2 = com.google.android.material.color.k.c(context, R.attr.colorSurface, "TextInputLayout");
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(kVar.f357034b.f357057a);
        int iF2 = com.google.android.material.color.k.f(0.1f, i12, iC2);
        kVar2.n(new ColorStateList(iArr, new int[]{iF2, 0}));
        kVar2.setTint(iC2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF2, iC2});
        com.google.android.material.shape.k kVar3 = new com.google.android.material.shape.k(kVar.f357034b.f357057a);
        kVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        Q.a(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void openCutout() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.openCutout():void");
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(@N ViewGroup viewGroup, boolean z12) {
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            childAt.setEnabled(z12);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z12);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.boxBackgroundMode;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z12 = editText instanceof TextInputEditText;
        }
        this.editText = editText;
        int i12 = this.minEms;
        if (i12 != -1) {
            setMinEms(i12);
        } else {
            setMinWidth(this.minWidth);
        }
        int i13 = this.maxEms;
        if (i13 != -1) {
            setMaxEms(i13);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new e(this));
        C37062c c37062c = this.collapsingTextHelper;
        Typeface typeface = this.editText.getTypeface();
        boolean zM2 = c37062c.m(typeface);
        boolean zO2 = c37062c.o(typeface);
        if (zM2 || zO2) {
            c37062c.i(false);
        }
        C37062c c37062c2 = this.collapsingTextHelper;
        float textSize = this.editText.getTextSize();
        if (c37062c2.f356803l != textSize) {
            c37062c2.f356803l = textSize;
            c37062c2.i(false);
        }
        C37062c c37062c3 = this.collapsingTextHelper;
        float letterSpacing = this.editText.getLetterSpacing();
        if (c37062c3.f356794g0 != letterSpacing) {
            c37062c3.f356794g0 = letterSpacing;
            c37062c3.i(false);
        }
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.l((gravity & (-113)) | 48);
        C37062c c37062c4 = this.collapsingTextHelper;
        if (c37062c4.f356799j != gravity) {
            c37062c4.f356799j = gravity;
            c37062c4.i(false);
        }
        this.editText.addTextChangedListener(new a());
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.b();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        C37062c c37062c = this.collapsingTextHelper;
        if (charSequence == null || !TextUtils.equals(c37062c.f356761G, charSequence)) {
            c37062c.f356761G = charSequence;
            c37062c.f356762H = null;
            Bitmap bitmap = c37062c.f356765K;
            if (bitmap != null) {
                bitmap.recycle();
                c37062c.f356765K = null;
            }
            c37062c.i(false);
        }
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z12) {
        if (this.placeholderEnabled == z12) {
            return;
        }
        if (z12) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z12;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.d() || ((this.endLayout.f357492j != 0 && isEndIconVisible()) || this.endLayout.f357499q != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        Q.a(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.resources.c.e(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(@N Rect rect) {
        com.google.android.material.shape.k kVar = this.boxUnderlineDefault;
        if (kVar != null) {
            int i12 = rect.bottom;
            kVar.setBounds(rect.left, i12 - this.boxStrokeWidthDefaultPx, rect.right, i12);
        }
        com.google.android.material.shape.k kVar2 = this.boxUnderlineFocused;
        if (kVar2 != null) {
            int i13 = rect.bottom;
            kVar2.setBounds(rect.left, i13 - this.boxStrokeWidthFocusedPx, rect.right, i13);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(@N Context context, @N TextView textView, int i12, int i13, boolean z12) {
        textView.setContentDescription(context.getString(z12 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    @TargetApi(AvailableCode.HMS_IS_SPOOF)
    private void updateCursorColor(boolean z12) {
        Context context = getContext();
        TypedValue typedValueA = com.google.android.material.resources.b.a(R.attr.colorControlActivated, context);
        ColorStateList colorStateListValueOf = null;
        if (typedValueA != null) {
            int i12 = typedValueA.resourceId;
            if (i12 != 0) {
                colorStateListValueOf = androidx.core.content.d.getColorStateList(context, i12);
            } else {
                int i13 = typedValueA.data;
                if (i13 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i13);
                }
            }
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null || colorStateListValueOf == null) {
            return;
        }
        Drawable textCursorDrawable = this.editText.getTextCursorDrawable();
        if (z12) {
            ColorStateList colorStateListValueOf2 = this.strokeErrorColor;
            if (colorStateListValueOf2 == null) {
                colorStateListValueOf2 = ColorStateList.valueOf(this.boxStrokeColor);
            }
            colorStateListValueOf = colorStateListValueOf2;
        }
        textCursorDrawable.setTintList(colorStateListValueOf);
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z12, boolean z13) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z12) {
            this.boxStrokeColor = colorForState2;
        } else if (z13) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(@N i iVar) {
        this.editTextAttachedListeners.add(iVar);
        if (this.editText != null) {
            iVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@N View view, int i12, @N ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i12, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    @k0
    public void animateToExpansionFraction(float f12) {
        if (this.collapsingTextHelper.f356783b == f12) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(C49576a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C43707b.f413880b));
            this.animator.setDuration(C49576a.c(getContext(), R.attr.motionDurationMedium4, 167));
            this.animator.addUpdateListener(new d());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.f356783b, f12);
        this.animator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
    public void dispatchProvideAutofillStructure(@N ViewStructure viewStructure, int i12) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i12);
            return;
        }
        if (this.originalHint != null) {
            boolean z12 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i12);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z12;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i12);
        onProvideAutofillVirtualStructure(viewStructure, i12);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i13 = 0; i13 < this.inputFrame.getChildCount(); i13++) {
            View childAt = this.inputFrame.getChildAt(i13);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i13);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i12);
            if (childAt == this.editText) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@N SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.inDrawableStateChanged
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.inDrawableStateChanged = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            com.google.android.material.internal.c r2 = r4.collapsingTextHelper
            r3 = 0
            if (r2 == 0) goto L2f
            r2.f356772R = r1
            android.content.res.ColorStateList r1 = r2.f356809o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r2.f356807n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r2.i(r3)
            r1 = r0
            goto L30
        L2f:
            r1 = r3
        L30:
            android.widget.EditText r2 = r4.editText
            if (r2 == 0) goto L47
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r2 = androidx.core.view.C22823h0.f45055a
            boolean r2 = r4.isLaidOut()
            if (r2 == 0) goto L43
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L43
            goto L44
        L43:
            r0 = r3
        L44:
            r4.updateLabelState(r0)
        L47:
            r4.updateEditTextBackground()
            r4.updateTextInputBoxState()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.inDrawableStateChanged = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + calculateLabelMarginTop();
    }

    @N
    public com.google.android.material.shape.k getBoxBackground() {
        int i12 = this.boxBackgroundMode;
        if (i12 == 1 || i12 == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return O.f(this) ? this.shapeAppearanceModel.f357088h.a(this.tmpRectF) : this.shapeAppearanceModel.f357087g.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        return O.f(this) ? this.shapeAppearanceModel.f357087g.a(this.tmpRectF) : this.shapeAppearanceModel.f357088h.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        return O.f(this) ? this.shapeAppearanceModel.f357085e.a(this.tmpRectF) : this.shapeAppearanceModel.f357086f.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return O.f(this) ? this.shapeAppearanceModel.f357086f.a(this.tmpRectF) : this.shapeAppearanceModel.f357085e.a(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    @P
    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @P
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @P
    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    @P
    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    @P
    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @P
    public EditText getEditText() {
        return this.editText;
    }

    @P
    public CharSequence getEndIconContentDescription() {
        return this.endLayout.f357490h.getContentDescription();
    }

    @P
    public Drawable getEndIconDrawable() {
        return this.endLayout.f357490h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.f357496n;
    }

    public int getEndIconMode() {
        return this.endLayout.f357492j;
    }

    @N
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.f357497o;
    }

    @N
    public CheckableImageButton getEndIconView() {
        return this.endLayout.f357490h;
    }

    @P
    public CharSequence getError() {
        s sVar = this.indicatorViewController;
        if (sVar.f357536q) {
            return sVar.f357535p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.f357539t;
    }

    @P
    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.f357538s;
    }

    @InterfaceC42156l
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.indicatorViewController.f357537r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @P
    public Drawable getErrorIconDrawable() {
        return this.endLayout.f357486d.getDrawable();
    }

    @P
    public CharSequence getHelperText() {
        s sVar = this.indicatorViewController;
        if (sVar.f357543x) {
            return sVar.f357542w;
        }
        return null;
    }

    @InterfaceC42156l
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.indicatorViewController.f357544y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @P
    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    @k0
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.e();
    }

    @k0
    public final int getHintCurrentCollapsedTextColor() {
        C37062c c37062c = this.collapsingTextHelper;
        return c37062c.f(c37062c.f356809o);
    }

    @P
    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @N
    public h getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    @U
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    @U
    public int getMinWidth() {
        return this.minWidth;
    }

    @P
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.f357490h.getContentDescription();
    }

    @P
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.f357490h.getDrawable();
    }

    @P
    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    @f0
    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    @P
    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    @P
    public CharSequence getPrefixText() {
        return this.startLayout.f357561d;
    }

    @P
    public ColorStateList getPrefixTextColor() {
        return this.startLayout.f357560c.getTextColors();
    }

    @N
    public TextView getPrefixTextView() {
        return this.startLayout.f357560c;
    }

    @N
    public com.google.android.material.shape.q getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @P
    public CharSequence getStartIconContentDescription() {
        return this.startLayout.f357562e.getContentDescription();
    }

    @P
    public Drawable getStartIconDrawable() {
        return this.startLayout.f357562e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.f357565h;
    }

    @N
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.f357566i;
    }

    @P
    public CharSequence getSuffixText() {
        return this.endLayout.f357499q;
    }

    @P
    public ColorStateList getSuffixTextColor() {
        return this.endLayout.f357500r.getTextColors();
    }

    @N
    public TextView getSuffixTextView() {
        return this.endLayout.f357500r;
    }

    @P
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isEndIconVisible() {
        return this.endLayout.c();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.f357536q;
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.f357543x;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @RestrictTo
    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.h(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            C37064e.a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                C37062c c37062c = this.collapsingTextHelper;
                float textSize = this.editText.getTextSize();
                if (c37062c.f356803l != textSize) {
                    c37062c.f356803l = textSize;
                    c37062c.i(false);
                }
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.l((gravity & (-113)) | 48);
                C37062c c37062c2 = this.collapsingTextHelper;
                if (c37062c2.f356799j != gravity) {
                    c37062c2.f356799j = gravity;
                    c37062c2.i(false);
                }
                C37062c c37062c3 = this.collapsingTextHelper;
                Rect rectCalculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                c37062c3.getClass();
                int i16 = rectCalculateCollapsedTextBounds.left;
                int i17 = rectCalculateCollapsedTextBounds.top;
                int i18 = rectCalculateCollapsedTextBounds.right;
                int i19 = rectCalculateCollapsedTextBounds.bottom;
                Rect rect2 = c37062c3.f356795h;
                if (rect2.left != i16 || rect2.top != i17 || rect2.right != i18 || rect2.bottom != i19) {
                    rect2.set(i16, i17, i18, i19);
                    c37062c3.f356773S = true;
                }
                C37062c c37062c4 = this.collapsingTextHelper;
                Rect rectCalculateExpandedTextBounds = calculateExpandedTextBounds(rect);
                c37062c4.getClass();
                int i22 = rectCalculateExpandedTextBounds.left;
                int i23 = rectCalculateExpandedTextBounds.top;
                int i24 = rectCalculateExpandedTextBounds.right;
                int i25 = rectCalculateExpandedTextBounds.bottom;
                Rect rect3 = c37062c4.f356793g;
                if (rect3.left != i22 || rect3.top != i23 || rect3.right != i24 || rect3.bottom != i25) {
                    rect3.set(i22, i23, i24, i25);
                    c37062c4.f356773S = true;
                }
                this.collapsingTextHelper.i(false);
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.l();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setError(savedState.f357434d);
        if (savedState.f357435e) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i12) {
        super.onRtlPropertiesChanged(i12);
        boolean z12 = i12 == 1;
        if (z12 != this.areCornerRadiiRtl) {
            float fA2 = this.shapeAppearanceModel.f357085e.a(this.tmpRectF);
            float fA3 = this.shapeAppearanceModel.f357086f.a(this.tmpRectF);
            float fA4 = this.shapeAppearanceModel.f357088h.a(this.tmpRectF);
            float fA5 = this.shapeAppearanceModel.f357087g.a(this.tmpRectF);
            com.google.android.material.shape.q qVar = this.shapeAppearanceModel;
            com.google.android.material.shape.f fVar = qVar.f357081a;
            com.google.android.material.shape.f fVar2 = qVar.f357082b;
            com.google.android.material.shape.f fVar3 = qVar.f357084d;
            com.google.android.material.shape.f fVar4 = qVar.f357083c;
            q.b bVar = new q.b();
            bVar.l(fVar2);
            bVar.o(fVar);
            bVar.f(fVar4);
            bVar.i(fVar3);
            bVar.m(fA3);
            bVar.p(fA2);
            bVar.g(fA5);
            bVar.j(fA4);
            com.google.android.material.shape.q qVarA = bVar.a();
            this.areCornerRadiiRtl = z12;
            setShapeAppearanceModel(qVarA);
        }
    }

    @Override // android.view.View
    @P
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.f357434d = getError();
        }
        p pVar = this.endLayout;
        savedState.f357435e = pVar.f357492j != 0 && pVar.f357490h.f356716b;
        return savedState;
    }

    public void refreshStartIconDrawableState() {
        x xVar = this.startLayout;
        r.c(xVar.f357559b, xVar.f357562e, xVar.f357563f);
    }

    public void setBoxBackgroundColor(@InterfaceC42156l int i12) {
        if (this.boxBackgroundColor != i12) {
            this.boxBackgroundColor = i12;
            this.defaultFilledBackgroundColor = i12;
            this.focusedFilledBackgroundColor = i12;
            this.hoveredFilledBackgroundColor = i12;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(@InterfaceC42158n int i12) {
        setBoxBackgroundColor(androidx.core.content.d.getColor(getContext(), i12));
    }

    public void setBoxBackgroundColorStateList(@N ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i12) {
        if (i12 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i12;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i12) {
        this.boxCollapsedPaddingTopPx = i12;
    }

    public void setBoxCornerFamily(int i12) {
        q.b bVarF = this.shapeAppearanceModel.f();
        com.google.android.material.shape.e eVar = this.shapeAppearanceModel.f357085e;
        bVarF.l(com.google.android.material.shape.m.a(i12));
        bVarF.f357097e = eVar;
        com.google.android.material.shape.e eVar2 = this.shapeAppearanceModel.f357086f;
        bVarF.o(com.google.android.material.shape.m.a(i12));
        bVarF.f357098f = eVar2;
        com.google.android.material.shape.e eVar3 = this.shapeAppearanceModel.f357088h;
        bVarF.f(com.google.android.material.shape.m.a(i12));
        bVarF.f357100h = eVar3;
        com.google.android.material.shape.e eVar4 = this.shapeAppearanceModel.f357087g;
        bVarF.i(com.google.android.material.shape.m.a(i12));
        bVarF.f357099g = eVar4;
        this.shapeAppearanceModel = bVarF.a();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f12, float f13, float f14, float f15) {
        boolean zF2 = O.f(this);
        this.areCornerRadiiRtl = zF2;
        float f16 = zF2 ? f13 : f12;
        if (!zF2) {
            f12 = f13;
        }
        float f17 = zF2 ? f15 : f14;
        if (!zF2) {
            f14 = f15;
        }
        com.google.android.material.shape.k kVar = this.boxBackground;
        if (kVar != null && kVar.h() == f16) {
            com.google.android.material.shape.k kVar2 = this.boxBackground;
            if (kVar2.f357034b.f357057a.f357086f.a(kVar2.g()) == f12) {
                com.google.android.material.shape.k kVar3 = this.boxBackground;
                if (kVar3.f357034b.f357057a.f357088h.a(kVar3.g()) == f17) {
                    com.google.android.material.shape.k kVar4 = this.boxBackground;
                    if (kVar4.f357034b.f357057a.f357087g.a(kVar4.g()) == f14) {
                        return;
                    }
                }
            }
        }
        q.b bVarF = this.shapeAppearanceModel.f();
        bVarF.m(f16);
        bVarF.p(f12);
        bVarF.g(f17);
        bVarF.j(f14);
        this.shapeAppearanceModel = bVarF.a();
        applyBoxAttributes();
    }

    public void setBoxStrokeColor(@InterfaceC42156l int i12) {
        if (this.focusedStrokeColor != i12) {
            this.focusedStrokeColor = i12;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(@N ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(@P ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i12) {
        this.boxStrokeWidthDefaultPx = i12;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i12) {
        this.boxStrokeWidthFocusedPx = i12;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(@InterfaceC42161q int i12) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i12));
    }

    public void setBoxStrokeWidthResource(@InterfaceC42161q int i12) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i12));
    }

    public void setCounterEnabled(boolean z12) {
        if (this.counterEnabled != z12) {
            if (z12) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.a(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.g(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z12;
        }
    }

    public void setCounterMaxLength(int i12) {
        if (this.counterMaxLength != i12) {
            if (i12 > 0) {
                this.counterMaxLength = i12;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i12) {
        if (this.counterOverflowTextAppearance != i12) {
            this.counterOverflowTextAppearance = i12;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(@P ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i12) {
        if (this.counterTextAppearance != i12) {
            this.counterTextAppearance = i12;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(@P ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(@P ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        recursiveSetEnabled(this, z12);
        super.setEnabled(z12);
    }

    public void setEndIconActivated(boolean z12) {
        this.endLayout.f357490h.setActivated(z12);
    }

    public void setEndIconCheckable(boolean z12) {
        this.endLayout.f357490h.setCheckable(z12);
    }

    public void setEndIconContentDescription(@e0 int i12) {
        p pVar = this.endLayout;
        CharSequence text = i12 != 0 ? pVar.getResources().getText(i12) : null;
        CheckableImageButton checkableImageButton = pVar.f357490h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@InterfaceC42165v int i12) {
        p pVar = this.endLayout;
        Drawable drawableA = i12 != 0 ? C43852a.a(pVar.getContext(), i12) : null;
        CheckableImageButton checkableImageButton = pVar.f357490h;
        checkableImageButton.setImageDrawable(drawableA);
        if (drawableA != null) {
            ColorStateList colorStateList = pVar.f357494l;
            PorterDuff.Mode mode = pVar.f357495m;
            TextInputLayout textInputLayout = pVar.f357484b;
            r.a(textInputLayout, checkableImageButton, colorStateList, mode);
            r.c(textInputLayout, checkableImageButton, pVar.f357494l);
        }
    }

    public void setEndIconMinSize(@F int i12) {
        p pVar = this.endLayout;
        if (i12 < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i12 != pVar.f357496n) {
            pVar.f357496n = i12;
            CheckableImageButton checkableImageButton = pVar.f357490h;
            checkableImageButton.setMinimumWidth(i12);
            checkableImageButton.setMinimumHeight(i12);
            CheckableImageButton checkableImageButton2 = pVar.f357486d;
            checkableImageButton2.setMinimumWidth(i12);
            checkableImageButton2.setMinimumHeight(i12);
        }
    }

    public void setEndIconMode(int i12) {
        this.endLayout.f(i12);
    }

    public void setEndIconOnClickListener(@P View.OnClickListener onClickListener) {
        p pVar = this.endLayout;
        View.OnLongClickListener onLongClickListener = pVar.f357498p;
        CheckableImageButton checkableImageButton = pVar.f357490h;
        checkableImageButton.setOnClickListener(onClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        p pVar = this.endLayout;
        pVar.f357498p = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f357490h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@N ImageView.ScaleType scaleType) {
        p pVar = this.endLayout;
        pVar.f357497o = scaleType;
        pVar.f357490h.setScaleType(scaleType);
        pVar.f357486d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@P ColorStateList colorStateList) {
        p pVar = this.endLayout;
        if (pVar.f357494l != colorStateList) {
            pVar.f357494l = colorStateList;
            r.a(pVar.f357484b, pVar.f357490h, colorStateList, pVar.f357495m);
        }
    }

    public void setEndIconTintMode(@P PorterDuff.Mode mode) {
        p pVar = this.endLayout;
        if (pVar.f357495m != mode) {
            pVar.f357495m = mode;
            r.a(pVar.f357484b, pVar.f357490h, pVar.f357494l, mode);
        }
    }

    public void setEndIconVisible(boolean z12) {
        this.endLayout.g(z12);
    }

    public void setError(@P CharSequence charSequence) {
        if (!this.indicatorViewController.f357536q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.f();
            return;
        }
        s sVar = this.indicatorViewController;
        sVar.c();
        sVar.f357535p = charSequence;
        sVar.f357537r.setText(charSequence);
        int i12 = sVar.f357533n;
        if (i12 != 1) {
            sVar.f357534o = 1;
        }
        sVar.i(i12, sVar.f357534o, sVar.h(sVar.f357537r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i12) {
        s sVar = this.indicatorViewController;
        sVar.f357539t = i12;
        AppCompatTextView appCompatTextView = sVar.f357537r;
        if (appCompatTextView != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            appCompatTextView.setAccessibilityLiveRegion(i12);
        }
    }

    public void setErrorContentDescription(@P CharSequence charSequence) {
        s sVar = this.indicatorViewController;
        sVar.f357538s = charSequence;
        AppCompatTextView appCompatTextView = sVar.f357537r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z12) {
        s sVar = this.indicatorViewController;
        if (sVar.f357536q == z12) {
            return;
        }
        sVar.c();
        TextInputLayout textInputLayout = sVar.f357527h;
        if (z12) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f357526g);
            sVar.f357537r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            sVar.f357537r.setTextAlignment(5);
            Typeface typeface = sVar.f357519B;
            if (typeface != null) {
                sVar.f357537r.setTypeface(typeface);
            }
            int i12 = sVar.f357540u;
            sVar.f357540u = i12;
            AppCompatTextView appCompatTextView2 = sVar.f357537r;
            if (appCompatTextView2 != null) {
                textInputLayout.setTextAppearanceCompatWithErrorFallback(appCompatTextView2, i12);
            }
            ColorStateList colorStateList = sVar.f357541v;
            sVar.f357541v = colorStateList;
            AppCompatTextView appCompatTextView3 = sVar.f357537r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f357538s;
            sVar.f357538s = charSequence;
            AppCompatTextView appCompatTextView4 = sVar.f357537r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i13 = sVar.f357539t;
            sVar.f357539t = i13;
            AppCompatTextView appCompatTextView5 = sVar.f357537r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                appCompatTextView5.setAccessibilityLiveRegion(i13);
            }
            sVar.f357537r.setVisibility(4);
            sVar.a(sVar.f357537r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f357537r, 0);
            sVar.f357537r = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        sVar.f357536q = z12;
    }

    public void setErrorIconDrawable(@InterfaceC42165v int i12) {
        p pVar = this.endLayout;
        pVar.h(i12 != 0 ? C43852a.a(pVar.getContext(), i12) : null);
        r.c(pVar.f357484b, pVar.f357486d, pVar.f357487e);
    }

    public void setErrorIconOnClickListener(@P View.OnClickListener onClickListener) {
        p pVar = this.endLayout;
        CheckableImageButton checkableImageButton = pVar.f357486d;
        View.OnLongClickListener onLongClickListener = pVar.f357489g;
        checkableImageButton.setOnClickListener(onClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        p pVar = this.endLayout;
        pVar.f357489g = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f357486d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@P ColorStateList colorStateList) {
        p pVar = this.endLayout;
        if (pVar.f357487e != colorStateList) {
            pVar.f357487e = colorStateList;
            r.a(pVar.f357484b, pVar.f357486d, colorStateList, pVar.f357488f);
        }
    }

    public void setErrorIconTintMode(@P PorterDuff.Mode mode) {
        p pVar = this.endLayout;
        if (pVar.f357488f != mode) {
            pVar.f357488f = mode;
            r.a(pVar.f357484b, pVar.f357486d, pVar.f357487e, mode);
        }
    }

    public void setErrorTextAppearance(@f0 int i12) {
        s sVar = this.indicatorViewController;
        sVar.f357540u = i12;
        AppCompatTextView appCompatTextView = sVar.f357537r;
        if (appCompatTextView != null) {
            sVar.f357527h.setTextAppearanceCompatWithErrorFallback(appCompatTextView, i12);
        }
    }

    public void setErrorTextColor(@P ColorStateList colorStateList) {
        s sVar = this.indicatorViewController;
        sVar.f357541v = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f357537r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z12) {
        if (this.expandedHintEnabled != z12) {
            this.expandedHintEnabled = z12;
            updateLabelState(false);
        }
    }

    public void setHelperText(@P CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        s sVar = this.indicatorViewController;
        sVar.c();
        sVar.f357542w = charSequence;
        sVar.f357544y.setText(charSequence);
        int i12 = sVar.f357533n;
        if (i12 != 2) {
            sVar.f357534o = 2;
        }
        sVar.i(i12, sVar.f357534o, sVar.h(sVar.f357544y, charSequence));
    }

    public void setHelperTextColor(@P ColorStateList colorStateList) {
        s sVar = this.indicatorViewController;
        sVar.f357518A = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f357544y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z12) {
        s sVar = this.indicatorViewController;
        if (sVar.f357543x == z12) {
            return;
        }
        sVar.c();
        if (z12) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f357526g);
            sVar.f357544y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            sVar.f357544y.setTextAlignment(5);
            Typeface typeface = sVar.f357519B;
            if (typeface != null) {
                sVar.f357544y.setTypeface(typeface);
            }
            sVar.f357544y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = sVar.f357544y;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i12 = sVar.f357545z;
            sVar.f357545z = i12;
            AppCompatTextView appCompatTextView3 = sVar.f357544y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i12);
            }
            ColorStateList colorStateList = sVar.f357518A;
            sVar.f357518A = colorStateList;
            AppCompatTextView appCompatTextView4 = sVar.f357544y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            sVar.a(sVar.f357544y, 1);
            sVar.f357544y.setAccessibilityDelegate(new t(sVar));
        } else {
            sVar.c();
            int i13 = sVar.f357533n;
            if (i13 == 2) {
                sVar.f357534o = 0;
            }
            sVar.i(i13, sVar.f357534o, sVar.h(sVar.f357544y, ""));
            sVar.g(sVar.f357544y, 1);
            sVar.f357544y = null;
            TextInputLayout textInputLayout = sVar.f357527h;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        sVar.f357543x = z12;
    }

    public void setHelperTextTextAppearance(@f0 int i12) {
        s sVar = this.indicatorViewController;
        sVar.f357545z = i12;
        AppCompatTextView appCompatTextView = sVar.f357544y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i12);
        }
    }

    public void setHint(@P CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z12) {
        this.hintAnimationEnabled = z12;
    }

    public void setHintEnabled(boolean z12) {
        if (z12 != this.hintEnabled) {
            this.hintEnabled = z12;
            if (z12) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(@f0 int i12) {
        this.collapsingTextHelper.k(i12);
        this.focusedTextColor = this.collapsingTextHelper.f356809o;
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(@P ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                C37062c c37062c = this.collapsingTextHelper;
                if (c37062c.f356809o != colorStateList) {
                    c37062c.f356809o = colorStateList;
                    c37062c.i(false);
                }
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(@N h hVar) {
        this.lengthCounter = hVar;
    }

    public void setMaxEms(int i12) {
        this.maxEms = i12;
        EditText editText = this.editText;
        if (editText == null || i12 == -1) {
            return;
        }
        editText.setMaxEms(i12);
    }

    public void setMaxWidth(@U int i12) {
        this.maxWidth = i12;
        EditText editText = this.editText;
        if (editText == null || i12 == -1) {
            return;
        }
        editText.setMaxWidth(i12);
    }

    public void setMaxWidthResource(@InterfaceC42161q int i12) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i12));
    }

    public void setMinEms(int i12) {
        this.minEms = i12;
        EditText editText = this.editText;
        if (editText == null || i12 == -1) {
            return;
        }
        editText.setMinEms(i12);
    }

    public void setMinWidth(@U int i12) {
        this.minWidth = i12;
        EditText editText = this.editText;
        if (editText == null || i12 == -1) {
            return;
        }
        editText.setMinWidth(i12);
    }

    public void setMinWidthResource(@InterfaceC42161q int i12) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i12));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@e0 int i12) {
        p pVar = this.endLayout;
        pVar.f357490h.setContentDescription(i12 != 0 ? pVar.getResources().getText(i12) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@InterfaceC42165v int i12) {
        p pVar = this.endLayout;
        pVar.f357490h.setImageDrawable(i12 != 0 ? C43852a.a(pVar.getContext(), i12) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z12) {
        p pVar = this.endLayout;
        if (z12 && pVar.f357492j != 1) {
            pVar.f(1);
        } else if (z12) {
            pVar.getClass();
        } else {
            pVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@P ColorStateList colorStateList) {
        p pVar = this.endLayout;
        pVar.f357494l = colorStateList;
        r.a(pVar.f357484b, pVar.f357490h, colorStateList, pVar.f357495m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@P PorterDuff.Mode mode) {
        p pVar = this.endLayout;
        pVar.f357495m = mode;
        r.a(pVar.f357484b, pVar.f357490h, pVar.f357494l, mode);
    }

    public void setPlaceholderText(@P CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            TextView textView = this.placeholderTextView;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            textView.setImportantForAccessibility(2);
            C23503n c23503nCreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = c23503nCreatePlaceholderFadeTransition;
            c23503nCreatePlaceholderFadeTransition.f54666c = 67L;
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(@f0 int i12) {
        this.placeholderTextAppearance = i12;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i12);
        }
    }

    public void setPlaceholderTextColor(@P ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@P CharSequence charSequence) {
        x xVar = this.startLayout;
        xVar.getClass();
        xVar.f357561d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xVar.f357560c.setText(charSequence);
        xVar.d();
    }

    public void setPrefixTextAppearance(@f0 int i12) {
        this.startLayout.f357560c.setTextAppearance(i12);
    }

    public void setPrefixTextColor(@N ColorStateList colorStateList) {
        this.startLayout.f357560c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@N com.google.android.material.shape.q qVar) {
        com.google.android.material.shape.k kVar = this.boxBackground;
        if (kVar == null || kVar.f357034b.f357057a == qVar) {
            return;
        }
        this.shapeAppearanceModel = qVar;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z12) {
        this.startLayout.f357562e.setCheckable(z12);
    }

    public void setStartIconContentDescription(@e0 int i12) {
        setStartIconContentDescription(i12 != 0 ? getResources().getText(i12) : null);
    }

    public void setStartIconDrawable(@InterfaceC42165v int i12) {
        setStartIconDrawable(i12 != 0 ? C43852a.a(getContext(), i12) : null);
    }

    public void setStartIconMinSize(@F int i12) {
        x xVar = this.startLayout;
        if (i12 < 0) {
            xVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i12 != xVar.f357565h) {
            xVar.f357565h = i12;
            CheckableImageButton checkableImageButton = xVar.f357562e;
            checkableImageButton.setMinimumWidth(i12);
            checkableImageButton.setMinimumHeight(i12);
        }
    }

    public void setStartIconOnClickListener(@P View.OnClickListener onClickListener) {
        x xVar = this.startLayout;
        View.OnLongClickListener onLongClickListener = xVar.f357567j;
        CheckableImageButton checkableImageButton = xVar.f357562e;
        checkableImageButton.setOnClickListener(onClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        x xVar = this.startLayout;
        xVar.f357567j = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f357562e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@N ImageView.ScaleType scaleType) {
        x xVar = this.startLayout;
        xVar.f357566i = scaleType;
        xVar.f357562e.setScaleType(scaleType);
    }

    public void setStartIconTintList(@P ColorStateList colorStateList) {
        x xVar = this.startLayout;
        if (xVar.f357563f != colorStateList) {
            xVar.f357563f = colorStateList;
            r.a(xVar.f357559b, xVar.f357562e, colorStateList, xVar.f357564g);
        }
    }

    public void setStartIconTintMode(@P PorterDuff.Mode mode) {
        x xVar = this.startLayout;
        if (xVar.f357564g != mode) {
            xVar.f357564g = mode;
            r.a(xVar.f357559b, xVar.f357562e, xVar.f357563f, mode);
        }
    }

    public void setStartIconVisible(boolean z12) {
        this.startLayout.b(z12);
    }

    public void setSuffixText(@P CharSequence charSequence) {
        p pVar = this.endLayout;
        pVar.getClass();
        pVar.f357499q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f357500r.setText(charSequence);
        pVar.m();
    }

    public void setSuffixTextAppearance(@f0 int i12) {
        this.endLayout.f357500r.setTextAppearance(i12);
    }

    public void setSuffixTextColor(@N ColorStateList colorStateList) {
        this.endLayout.f357500r.setTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(@N TextView textView, @f0 int i12) {
        try {
            textView.setTextAppearance(i12);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(androidx.core.content.d.getColor(getContext(), R.color.design_error));
    }

    public void setTextInputAccessibilityDelegate(@P e eVar) {
        EditText editText = this.editText;
        if (editText != null) {
            C22823h0.C(editText, eVar);
        }
    }

    public void setTypeface(@P Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            C37062c c37062c = this.collapsingTextHelper;
            boolean zM2 = c37062c.m(typeface);
            boolean zO2 = c37062c.o(typeface);
            if (zM2 || zO2) {
                c37062c.i(false);
            }
            s sVar = this.indicatorViewController;
            if (typeface != sVar.f357519B) {
                sVar.f357519B = typeface;
                AppCompatTextView appCompatTextView = sVar.f357537r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sVar.f357544y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        s sVar = this.indicatorViewController;
        return (sVar.f357534o != 1 || sVar.f357537r == null || TextUtils.isEmpty(sVar.f357535p)) ? false : true;
    }

    public boolean updateDummyDrawables() {
        boolean z12;
        if (this.editText == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z13 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                this.editText.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z12 = true;
            }
            z12 = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = this.editText.getCompoundDrawablesRelative();
                this.editText.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.startDummyDrawable = null;
                z12 = true;
            }
            z12 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.f357500r.getMeasuredWidth() - this.editText.getPaddingRight();
            p pVar = this.endLayout;
            if (pVar.d()) {
                checkableImageButton = pVar.f357486d;
            } else if (pVar.f357492j != 0 && pVar.c()) {
                checkableImageButton = pVar.f357490h;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.editText.getCompoundDrawablesRelative();
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z13 = z12;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z12;
            }
            Drawable[] compoundDrawablesRelative4 = this.editText.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z13 = z12;
            }
            this.endDummyDrawable = null;
        }
        return z13;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = V.f22424a;
        Drawable drawableMutate = background.mutate();
        if (shouldShowError()) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            drawableMutate.setColorFilter(androidx.appcompat.widget.r.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            EditText editText2 = this.editText;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            editText2.setBackground(editTextBoxBackground);
            this.boxBackgroundApplied = true;
        }
    }

    public void updateLabelState(boolean z12) {
        updateLabelState(z12, false);
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z12 = false;
        boolean z13 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z14 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (shouldShowError() || (this.counterView != null && this.counterOverflowed)) {
            z12 = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z13, z14);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z13) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z14) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z13, z14);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor(z12);
        }
        p pVar = this.endLayout;
        pVar.k();
        CheckableImageButton checkableImageButton = pVar.f357486d;
        ColorStateList colorStateList = pVar.f357487e;
        TextInputLayout textInputLayout = pVar.f357484b;
        r.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f357494l;
        CheckableImageButton checkableImageButton2 = pVar.f357490h;
        r.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof n) {
            if (!textInputLayout.shouldShowError() || checkableImageButton2.getDrawable() == null) {
                r.a(textInputLayout, checkableImageButton2, pVar.f357494l, pVar.f357495m);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i12 = this.boxStrokeWidthPx;
            if (z13 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i12) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z14 && !z13) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z13) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@N Context context, @P AttributeSet attributeSet, int i12) {
        int i13 = DEF_STYLE_RES;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new s(this);
        this.lengthCounter = new P0(20);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        C37062c c37062c = new C37062c(this);
        this.collapsingTextHelper = c37062c;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = C43707b.f413879a;
        c37062c.f356777W = linearInterpolator;
        c37062c.i(false);
        c37062c.f356776V = linearInterpolator;
        c37062c.i(false);
        c37062c.l(8388659);
        int[] iArr = R.styleable.TextInputLayout;
        int[] iArr2 = {R.styleable.TextInputLayout_counterTextAppearance, R.styleable.TextInputLayout_counterOverflowTextAppearance, R.styleable.TextInputLayout_errorTextAppearance, R.styleable.TextInputLayout_helperTextTextAppearance, R.styleable.TextInputLayout_hintTextAppearance};
        G.a(context2, attributeSet, i12, i13);
        G.b(context2, attributeSet, iArr, i12, i13, iArr2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        D0 d02 = new D0(typedArrayObtainStyledAttributes, context2);
        x xVar = new x(this, d02);
        this.startLayout = xVar;
        this.hintEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(typedArrayObtainStyledAttributes.getText(R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_expandedHintEnabled, true);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_minEms)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(R.styleable.TextInputLayout_android_minEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_android_minWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(R.styleable.TextInputLayout_android_maxEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.shapeAppearanceModel = com.google.android.material.shape.q.c(context2, attributeSet, i12, i13).a();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        q.b bVarF = this.shapeAppearanceModel.f();
        if (dimension >= 0.0f) {
            bVarF.m(dimension);
        }
        if (dimension2 >= 0.0f) {
            bVarF.p(dimension2);
        }
        if (dimension3 >= 0.0f) {
            bVarF.j(dimension3);
        }
        if (dimension4 >= 0.0f) {
            bVarF.g(dimension4);
        }
        this.shapeAppearanceModel = bVarF.a();
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, d02, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateListA.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateListA.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateList = androidx.core.content.d.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListA2 = d02.a(R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateListA2;
            this.defaultHintTextColor = colorStateListA2;
        }
        ColorStateList colorStateListA3 = com.google.android.material.resources.c.a(context2, d02, R.styleable.TextInputLayout_boxStrokeColor);
        this.focusedStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.defaultStrokeColor = androidx.core.content.d.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = androidx.core.content.d.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = androidx.core.content.d.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListA3 != null) {
            setBoxStrokeColorStateList(colorStateListA3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.c.a(context2, d02, R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.TextInputLayout_errorContentDescription);
        int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(R.styleable.TextInputLayout_helperText);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(R.styleable.TextInputLayout_placeholderText);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i14);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(d02.a(R.styleable.TextInputLayout_errorTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(d02.a(R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(d02.a(R.styleable.TextInputLayout_hintTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(d02.a(R.styleable.TextInputLayout_counterTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(d02.a(R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(d02.a(R.styleable.TextInputLayout_placeholderTextColor));
        }
        p pVar = new p(this, d02);
        this.endLayout = pVar;
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_android_enabled, true);
        d02.f();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setImportantForAccessibility(2);
        C22823h0.I(this, 1);
        frameLayout.addView(xVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z15);
        setHelperTextEnabled(z13);
        setErrorEnabled(z12);
        setCounterEnabled(z14);
        setHelperText(text2);
    }

    private void updateLabelState(boolean z12, boolean z13) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z14 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z15 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            this.collapsingTextHelper.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor));
        } else if (shouldShowError()) {
            C37062c c37062c = this.collapsingTextHelper;
            AppCompatTextView appCompatTextView = this.indicatorViewController.f357537r;
            c37062c.j(appCompatTextView != null ? appCompatTextView.getTextColors() : null);
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.j(textView.getTextColors());
        } else if (z15 && (colorStateList = this.focusedTextColor) != null) {
            C37062c c37062c2 = this.collapsingTextHelper;
            if (c37062c2.f356809o != colorStateList) {
                c37062c2.f356809o = colorStateList;
                c37062c2.i(false);
            }
        }
        if (z14 || !this.expandedHintEnabled || (isEnabled() && z15)) {
            if (z13 || this.hintExpanded) {
                collapseHint(z12);
                return;
            }
            return;
        }
        if (z13 || !this.hintExpanded) {
            expandHint(z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(@P Editable editable) {
        if (this.lengthCounter.c(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setStartIconContentDescription(@P CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.startLayout.f357562e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@P Drawable drawable) {
        this.startLayout.a(drawable);
    }

    public void updateCounter(@P Editable editable) {
        int iC2 = this.lengthCounter.c(editable);
        boolean z12 = this.counterOverflowed;
        int i12 = this.counterMaxLength;
        String string = null;
        if (i12 == -1) {
            this.counterView.setText(String.valueOf(iC2));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = iC2 > i12;
            updateCounterContentDescription(getContext(), this.counterView, iC2, this.counterMaxLength, this.counterOverflowed);
            if (z12 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            androidx.core.text.a aVarC = androidx.core.text.a.c();
            TextView textView = this.counterView;
            String string2 = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(iC2), Integer.valueOf(this.counterMaxLength));
            if (string2 == null) {
                aVarC.getClass();
            } else {
                string = aVarC.d(string2, aVarC.f44864c).toString();
            }
            textView.setText(string);
        }
        if (this.editText == null || z12 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(@e0 int i12) {
        setHint(i12 != 0 ? getResources().getText(i12) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@P CharSequence charSequence) {
        this.endLayout.f357490h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@P Drawable drawable) {
        this.endLayout.f357490h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@P Drawable drawable) {
        this.endLayout.h(drawable);
    }

    public void setEndIconContentDescription(@P CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.endLayout.f357490h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@P Drawable drawable) {
        p pVar = this.endLayout;
        CheckableImageButton checkableImageButton = pVar.f357490h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f357494l;
            PorterDuff.Mode mode = pVar.f357495m;
            TextInputLayout textInputLayout = pVar.f357484b;
            r.a(textInputLayout, checkableImageButton, colorStateList, mode);
            r.c(textInputLayout, checkableImageButton, pVar.f357494l);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@N Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            if (textInputLayout.counterEnabled) {
                textInputLayout.updateCounter(editable);
            }
            if (textInputLayout.placeholderEnabled) {
                textInputLayout.updatePlaceholderText(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}

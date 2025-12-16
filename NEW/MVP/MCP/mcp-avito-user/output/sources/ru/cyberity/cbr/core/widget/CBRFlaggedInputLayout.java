package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;

/* compiled from: CBRFlaggedInputLayout.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "Lru/cyberity/cbr/core/widget/CBRTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/EditText;", "editText", "Lkotlin/G0;", "updateEditTextPadding", "(Landroid/widget/EditText;)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/widget/FrameLayout;", "flagTouchInterceptor", "Landroid/widget/FrameLayout;", "getFlagTouchInterceptor", "()Landroid/widget/FrameLayout;", "Lru/cyberity/cbr/core/widget/CBRFlagView;", "flagView", "Lru/cyberity/cbr/core/widget/CBRFlagView;", "getFlagView", "()Lru/cyberity/cbr/core/widget/CBRFlagView;", "flagMarginStart", "I", "flagMarginEnd", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRFlaggedInputLayout extends CBRTextInputLayout {
    private final int flagMarginEnd;
    private final int flagMarginStart;

    @k
    private final FrameLayout flagTouchInterceptor;

    @k
    private final CBRFlagView flagView;

    @j
    public CBRFlaggedInputLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-2$lambda-1, reason: not valid java name */
    public static final void m295addView$lambda2$lambda1(CBRFlaggedInputLayout cBRFlaggedInputLayout, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        EditText editText = cBRFlaggedInputLayout.getEditText();
        if (editText != null) {
            cBRFlaggedInputLayout.updateEditTextPadding(editText);
        }
    }

    private final void updateEditTextPadding(EditText editText) {
        ViewGroup.LayoutParams layoutParams = this.flagView.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = this.flagView.getLayoutParams();
        int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
        int iAbs = Math.abs(this.flagView.getRight() - this.flagView.getLeft());
        editText.setPaddingRelative(this.flagView.getDrawable() != null ? marginStart + this.flagMarginEnd + iAbs : this.flagMarginStart, editText.getPaddingTop(), this.flagView.getDrawable() != null ? marginEnd + this.flagMarginStart + iAbs : editText.getPaddingEnd(), editText.getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@l View child, @l ViewGroup.LayoutParams params) {
        super.addView(child, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            ViewParent parent = editText != null ? editText.getParent() : null;
            FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            if (frameLayout != null) {
                this.flagTouchInterceptor.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                frameLayout.addView(this.flagTouchInterceptor);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388627;
                this.flagTouchInterceptor.addView(this.flagView, layoutParams);
                CBRFlagView cBRFlagView = this.flagView;
                cBRFlagView.setPadding(this.flagMarginStart, cBRFlagView.getPaddingTop(), cBRFlagView.getPaddingRight(), cBRFlagView.getPaddingBottom());
                this.flagView.addOnLayoutChangeListener(new com.avito.android.util.bottom_gap.a(this, 6));
            }
        }
    }

    @k
    public final FrameLayout getFlagTouchInterceptor() {
        return this.flagTouchInterceptor;
    }

    @k
    public final CBRFlagView getFlagView() {
        return this.flagView;
    }

    public /* synthetic */ CBRFlaggedInputLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_FlaggedInputLayoutStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRFlaggedInputLayout : i13);
    }

    @j
    public CBRFlaggedInputLayout(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.flagTouchInterceptor = new FrameLayout(context);
        this.flagView = new CBRFlagView(context, null, 0, 0, 14, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRFlaggedInputLayout, i12, i13);
        this.flagMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRFlaggedInputLayout_cbr_flagMarginStart, 0);
        this.flagMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRFlaggedInputLayout_cbr_flagMarginEnd, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}

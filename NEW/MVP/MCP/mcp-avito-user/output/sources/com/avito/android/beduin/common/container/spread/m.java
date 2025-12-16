package com.avito.android.beduin.common.container.spread;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SpreadLayoutPart.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/m;", "Landroid/widget/FrameLayout;", "", "b", "Z", "getReversed", "()Z", "reversed", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "value", "c", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getVerticalAlignment", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "setVerticalAlignment", "(Lcom/avito/android/beduin/common/alignment/VerticalAlignment;)V", "verticalAlignment", "", "d", "I", "getItemSpacingPx", "()I", "setItemSpacingPx", "(I)V", "itemSpacingPx", "", "Landroid/view/View;", "getChildren", "()Ljava/lang/Iterable;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean reversed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public VerticalAlignment verticalAlignment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int itemSpacingPx;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Context context, AttributeSet attributeSet, int i12, boolean z12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        z12 = (i13 & 8) != 0 ? false : z12;
        super(context, attributeSet, i12);
        this.reversed = z12;
        this.verticalAlignment = VerticalAlignment.TOP;
        setForeground(C35835l0.h(R.attr.selectableItemBackground, context));
    }

    private final Iterable<View> getChildren() {
        return this.reversed ? C42745f0.q0(new q6(this)) : new q6(this);
    }

    public final int getItemSpacingPx() {
        return this.itemSpacingPx;
    }

    public final boolean getReversed() {
        return this.reversed;
    }

    @Y61.k
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingLeft = getPaddingLeft();
        Iterator<View> it = new q6(this).iterator();
        while (true) {
            p6 p6Var = (p6) it;
            if (!p6Var.hasNext()) {
                return;
            }
            View view = (View) p6Var.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i16 = 0;
            int i17 = paddingLeft + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            int measuredWidth = view.getMeasuredWidth() + i17;
            view.layout(i17, h.b(view, this, this.verticalAlignment, i13, i15), measuredWidth, h.a(view, this, this.verticalAlignment, i13, i15));
            int i18 = measuredWidth - i17 != 0 ? this.itemSpacingPx : 0;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                i16 = marginLayoutParams2.rightMargin;
            }
            paddingLeft = i18 + measuredWidth + i16;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        Iterator<View> it = getChildren().iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                p pVar = new p(i14);
                p6 p6Var = (p6) new q6(this).iterator();
                if (p6Var.hasNext()) {
                    View view = (View) p6Var.next();
                    int measuredHeight = view.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i16 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    Integer numValueOf = Integer.valueOf(i16 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
                    while (p6Var.hasNext()) {
                        View view2 = (View) p6Var.next();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        int i17 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        Integer numValueOf2 = Integer.valueOf(i17 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                }
                setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + pVar.f103215a, i12), getPaddingBottom() + getPaddingTop() + (num != null ? num.intValue() : 0));
                return;
            }
            View next = it.next();
            int i18 = i15 + 1;
            if (i15 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view3 = next;
            int size = View.MeasureSpec.getMode(i12) == 0 ? Integer.MAX_VALUE : (View.MeasureSpec.getSize(i12) - getPaddingStart()) - getPaddingEnd();
            if (i14 < size) {
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                if (layoutParams5.width == -1) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i13, 0, layoutParams5.height));
                } else {
                    measureChildWithMargins(view3, i12, i14, i13, 0);
                }
            } else {
                view3.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            }
            int measuredWidth = view3.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            int i19 = measuredWidth + (marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            i14 = i14 + i19 + (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0) + (i15 != getChildCount() + (-1) ? this.itemSpacingPx : 0);
            i15 = i18;
        }
    }

    public final void setItemSpacingPx(int i12) {
        if (i12 != this.itemSpacingPx) {
            this.itemSpacingPx = i12;
            requestLayout();
        }
    }

    public final void setVerticalAlignment(@Y61.k VerticalAlignment verticalAlignment) {
        if (verticalAlignment != this.verticalAlignment) {
            this.verticalAlignment = verticalAlignment;
            requestLayout();
        }
    }
}

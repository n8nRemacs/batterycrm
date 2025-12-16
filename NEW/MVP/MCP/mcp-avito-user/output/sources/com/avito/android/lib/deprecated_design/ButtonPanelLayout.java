package com.avito.android.lib.deprecated_design;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import hw.InterfaceC41179d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonPanelLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/deprecated_design/ButtonPanelLayout;", "Landroid/widget/FrameLayout;", "", "b", "I", "getOrientation$annotations", "()V", "orientation", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class ButtonPanelLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int orientation;

    /* renamed from: c, reason: collision with root package name */
    public int f177752c;

    /* renamed from: d, reason: collision with root package name */
    public final int f177753d;

    /* renamed from: e, reason: collision with root package name */
    public final int f177754e;

    /* compiled from: ButtonPanelLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/ButtonPanelLayout$a;", "", "<init>", "()V", "", "ORIENTATION_HORIZONTAL", "I", "ORIENTATION_VERTICAL", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ButtonPanelLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/ButtonPanelLayout$b;", "", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface b {
    }

    static {
        new a(null);
    }

    @j
    public ButtonPanelLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i16 = measuredWidth - paddingLeft;
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - paddingTop;
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            View childAt = getChildAt(i17);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(measuredHeight, BeduinInputModel.MIN_TEXT_VERSION));
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            if (this.orientation == 0) {
                int i18 = measuredWidth - measuredWidth2;
                childAt.layout(i18, paddingTop, i18 + measuredWidth2, measuredHeight2 + paddingTop);
                measuredWidth -= measuredWidth2 + this.f177754e;
            } else {
                int paddingRight = ((measuredWidth - measuredWidth2) - getPaddingRight()) - getPaddingLeft();
                childAt.layout(paddingRight, paddingTop, measuredWidth2 + paddingRight, paddingTop + measuredHeight2);
                paddingTop = measuredHeight2 + this.f177753d + paddingTop;
            }
            if (i17 == childCount) {
                return;
            } else {
                i17++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int measuredHeight2;
        int iCombineMeasuredStates;
        int childCount = getChildCount();
        int childCount2 = getChildCount() - 1;
        if (childCount2 >= 0) {
            int i14 = 0;
            measuredWidth = 0;
            measuredWidth2 = 0;
            measuredHeight = 0;
            measuredHeight2 = 0;
            iCombineMeasuredStates = 0;
            while (true) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i12, i13);
                    measuredWidth += childAt.getMeasuredWidth();
                    if (childAt.getMeasuredWidth() > measuredWidth2) {
                        measuredWidth2 = childAt.getMeasuredWidth();
                    }
                    measuredHeight += childAt.getMeasuredHeight();
                    if (childAt.getMeasuredHeight() > measuredHeight2) {
                        measuredHeight2 = childAt.getMeasuredHeight();
                    }
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                }
                if (i14 == childCount2) {
                    break;
                } else {
                    i14++;
                }
            }
        } else {
            measuredWidth = 0;
            measuredWidth2 = 0;
            measuredHeight = 0;
            measuredHeight2 = 0;
            iCombineMeasuredStates = 0;
        }
        int i15 = childCount - 1;
        this.f177752c = (this.f177754e * i15) + measuredWidth;
        int iMax = Math.max(measuredHeight, getSuggestedMinimumHeight());
        int iMax2 = Math.max(measuredWidth, getSuggestedMinimumWidth());
        int i16 = this.f177752c > (View.MeasureSpec.getSize(i12) - getPaddingLeft()) - getPaddingRight() ? 1 : 0;
        this.orientation = i16;
        if (i16 == 0) {
            setMeasuredDimension(View.resolveSizeAndState(iMax2, i12, iCombineMeasuredStates), getPaddingBottom() + getPaddingTop() + View.resolveSizeAndState(measuredHeight2, i13, iCombineMeasuredStates << 16));
        } else {
            if (i16 != 1) {
                return;
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + View.resolveSizeAndState(measuredWidth2, i12, iCombineMeasuredStates), (this.f177753d * i15) + getPaddingBottom() + getPaddingTop() + View.resolveSizeAndState(iMax, i13, iCombineMeasuredStates << 16));
        }
    }

    public ButtonPanelLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f177753d = (int) getResources().getDimension(R.dimen.button_panel_vertical_margin);
        this.f177754e = (int) getResources().getDimension(R.dimen.button_panel_horizontal_margin);
    }

    private static /* synthetic */ void getOrientation$annotations() {
    }
}

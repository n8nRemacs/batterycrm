package com.avito.android.beduin.common.component.status_line;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.avito.android.R;
import com.avito.android.beduin.common.component.status_line.BeduinStatusLineModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinStatusLineLayout.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/b;", "Landroid/view/ViewGroup;", "", "value", "b", "I", "getProgressHorizontalMargin", "()I", "setProgressHorizontalMargin", "(I)V", "progressHorizontalMargin", "c", "getLineShift", "setLineShift", "lineShift", "d", "getPassedLineColor", "setPassedLineColor", "passedLineColor", "e", "getNoPassedLineColor", "setNoPassedLineColor", "noPassedLineColor", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "f", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "getTransitLineMode", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;", "setTransitLineMode", "(Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineMode;)V", "transitLineMode", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "g", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "getLineAlignment", "()Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;", "setLineAlignment", "(Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel$LineAlignment$VerticalAlignment;)V", "lineAlignment", "getMinProgressWidth", "minProgressWidth", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int progressHorizontalMargin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int lineShift;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int passedLineColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int noPassedLineColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public BeduinStatusLineModel.LineMode transitLineMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public BeduinStatusLineModel.LineAlignment.VerticalAlignment lineAlignment;

    /* renamed from: h, reason: collision with root package name */
    @k
    public List<? extends View> f102691h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public Object f102692i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public List<? extends ProgressBar> f102693j;

    /* renamed from: k, reason: collision with root package name */
    public final int f102694k;

    /* compiled from: BeduinStatusLineLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.status_line.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3077b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102696a;

        static {
            int[] iArr = new int[BeduinStatusLineModel.LineAlignment.VerticalAlignment.values().length];
            try {
                iArr[BeduinStatusLineModel.LineAlignment.VerticalAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinStatusLineModel.LineAlignment.VerticalAlignment.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinStatusLineModel.LineAlignment.VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102696a = iArr;
        }
    }

    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.passedLineColor = C35835l0.d(R.attr.black, context);
        this.noPassedLineColor = C35835l0.d(R.attr.beige400, context);
        this.transitLineMode = BeduinStatusLineModel.LineMode.NO_PASSED_NEXT_LINE;
        this.lineAlignment = BeduinStatusLineModel.LineAlignment.VerticalAlignment.CENTER;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f102691h = c42784z0;
        this.f102692i = c42784z0;
        this.f102693j = c42784z0;
        this.f102694k = y6.b(2);
    }

    public static int a(List list) {
        Iterator it = list.iterator();
        Integer num = null;
        if (it.hasNext()) {
            View view = (View) it.next();
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i12 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            Integer numValueOf = Integer.valueOf(i12 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0));
            while (it.hasNext()) {
                View view2 = (View) it.next();
                int measuredHeight2 = view2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i13 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                Integer numValueOf2 = Integer.valueOf(i13 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getMinProgressWidth() {
        return (this.progressHorizontalMargin * 2) + y6.b(5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(@l ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2, null, 4, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @k
    public final BeduinStatusLineModel.LineAlignment.VerticalAlignment getLineAlignment() {
        return this.lineAlignment;
    }

    public final int getLineShift() {
        return this.lineShift;
    }

    public final int getNoPassedLineColor() {
        return this.noPassedLineColor;
    }

    public final int getPassedLineColor() {
        return this.passedLineColor;
    }

    public final int getProgressHorizontalMargin() {
        return this.progressHorizontalMargin;
    }

    @k
    public final BeduinStatusLineModel.LineMode getTransitLineMode() {
        return this.transitLineMode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int measuredHeight;
        int paddingTop;
        int paddingLeft = getPaddingLeft();
        int i17 = 0;
        for (View view : this.f102691h) {
            int i18 = i17 + 1;
            if (i17 != 0) {
                BeduinStatusLineModel.LineAlignment.VerticalAlignment verticalAlignment = this.lineAlignment;
                ProgressBar progressBar = this.f102693j.get(i17 - 1);
                ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i19 = paddingLeft + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                int i22 = C3077b.f102696a[verticalAlignment.ordinal()];
                if (i22 != 1) {
                    if (i22 == 2) {
                        ViewGroup.LayoutParams layoutParams2 = progressBar.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        measuredHeight = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                        if (measuredHeight < 0) {
                            measuredHeight = 0;
                        }
                        paddingTop = getPaddingTop();
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        int i23 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                        if (i23 > 0) {
                            i23 = 0;
                        }
                        measuredHeight = ((i23 + i15) - i13) - progressBar.getMeasuredHeight();
                        paddingTop = getPaddingTop();
                    }
                    i16 = paddingTop + measuredHeight;
                } else {
                    ViewGroup.LayoutParams layoutParams4 = progressBar.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    int paddingTop2 = getPaddingTop() + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams5 = progressBar.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    i16 = (((i15 - (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0)) - i13) / 2) + paddingTop2;
                }
                progressBar.layout(i19, i16, progressBar.getMeasuredWidth() + i19, progressBar.getMeasuredHeight() + i16);
                int measuredWidth = progressBar.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams6 = progressBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                paddingLeft = i19 + measuredWidth + (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0);
            }
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            int i24 = paddingLeft + (marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
            int paddingTop3 = getPaddingTop() + (marginLayoutParams8 != null ? marginLayoutParams8.topMargin : 0);
            int measuredWidth2 = view.getMeasuredWidth() + i24;
            ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
            view.layout(i24, paddingTop3, measuredWidth2, view.getMeasuredHeight() + getPaddingTop() + (marginLayoutParams9 != null ? marginLayoutParams9.topMargin : 0));
            int measuredWidth3 = view.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            paddingLeft = i24 + measuredWidth3 + (marginLayoutParams10 != null ? marginLayoutParams10.rightMargin : 0);
            i17 = i18;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = (View.MeasureSpec.getSize(i12) - getPaddingLeft()) - getPaddingRight();
        Iterator<T> it = this.f102691h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, view.getPaddingRight() + view.getPaddingLeft(), view.getLayoutParams().width);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            a aVar = layoutParams instanceof a ? (a) layoutParams : null;
            Integer num = aVar != null ? aVar.f102695a : null;
            if (num != null) {
                int size2 = View.MeasureSpec.getSize(childMeasureSpec);
                int iIntValue = num.intValue();
                if (size2 > iIntValue) {
                    size2 = iIntValue;
                }
                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(childMeasureSpec));
            }
            view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i13, view.getPaddingBottom() + view.getPaddingTop(), view.getLayoutParams().height));
        }
        Iterator<? extends View> it2 = this.f102691h.iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int i16 = i14 + 1;
            View next = it2.next();
            int minProgressWidth = i14 == 0 ? 0 : getMinProgressWidth();
            int measuredWidth = next.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams2 = next.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = next.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i15 += i17 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) + minProgressWidth;
            if (i15 > size) {
                this.f102691h = this.f102691h.subList(0, i14);
                this.f102693j = this.f102693j.subList(0, i14 - 1);
                int i18 = (i14 * 2) - 1;
                removeViewsInLayout(i18, getChildCount() - i18);
                break;
            }
            i14 = i16;
        }
        if (!this.f102693j.isEmpty()) {
            int i19 = 0;
            for (View view2 : this.f102691h) {
                int measuredWidth2 = view2.getMeasuredWidth() + i19;
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i22 = measuredWidth2 + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                i19 = (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0) + i22;
            }
            int size3 = (size - i19) / this.f102693j.size();
            for (ProgressBar progressBar : this.f102693j) {
                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, progressBar.getPaddingBottom() + progressBar.getPaddingTop(), progressBar.getLayoutParams().height);
                ViewGroup.LayoutParams layoutParams6 = progressBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i23 = size3 - (marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams7 = progressBar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                progressBar.measure(View.MeasureSpec.makeMeasureSpec(i23 - (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0), 1073741824), childMeasureSpec2);
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size, getPaddingBottom() + getPaddingTop() + Math.max(a(this.f102691h), a(this.f102693j)));
    }

    public final void setLineAlignment(@k BeduinStatusLineModel.LineAlignment.VerticalAlignment verticalAlignment) {
        this.lineAlignment = verticalAlignment;
    }

    public final void setLineShift(int i12) {
        this.lineShift = i12;
    }

    public final void setNoPassedLineColor(int i12) {
        this.noPassedLineColor = i12;
    }

    public final void setPassedLineColor(int i12) {
        this.passedLineColor = i12;
    }

    public final void setProgressHorizontalMargin(int i12) {
        if (i12 < 0) {
            i12 = 0;
        }
        this.progressHorizontalMargin = i12;
    }

    public final void setTransitLineMode(@k BeduinStatusLineModel.LineMode lineMode) {
        this.transitLineMode = lineMode;
    }

    /* compiled from: BeduinStatusLineLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/b$a;", "Landroid/view/ViewGroup$MarginLayoutParams;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f102695a;

        public a(int i12, int i13, @l Integer num) {
            super(i12, i13);
            this.f102695a = num;
        }

        public /* synthetic */ a(int i12, int i13, Integer num, int i14, C42822w c42822w) {
            this(i12, i13, (i14 & 4) != 0 ? null : num);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }
}

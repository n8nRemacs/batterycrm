package com.avito.beduin.v2.component.box.android_view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BoxLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/f;", "Landroid/view/ViewGroup;", "a", "b", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class f extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList<View> f335554b;

    /* compiled from: BoxLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/f$a;", "", "<init>", "()V", "", "DEFAULT_CHILD_GRAVITY", "I", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BoxLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/f$b;", "Landroid/view/ViewGroup$MarginLayoutParams;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f335555a;

        /* compiled from: BoxLayout.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/f$b$a;", "", "<init>", "()V", "", "UNSPECIFIED_GRAVITY", "I", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public b(int i12, int i13) {
            super(i12, i13);
            this.f335555a = -1;
        }
    }

    static {
        new a(null);
    }

    @j
    public f(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@l AttributeSet attributeSet) {
        b bVar = new b(getContext(), attributeSet);
        bVar.f335555a = -1;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingLeft;
        int paddingTop;
        int childCount = getChildCount();
        int paddingLeft2 = getPaddingLeft();
        int paddingRight = (i14 - i12) - getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = (i15 - i13) - getPaddingBottom();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i17 = bVar.f335555a;
                if (i17 == -1) {
                    i17 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i17, getLayoutDirection());
                int i18 = i17 & 112;
                int i19 = absoluteGravity & 7;
                if (i19 == 1) {
                    int i22 = ((paddingRight - paddingLeft2) - measuredWidth) / 2;
                    int i23 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    if (i23 > i22) {
                        paddingLeft = paddingLeft2 + i23;
                    } else {
                        int i24 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        paddingLeft = i24 > i22 ? (paddingRight - i24) - measuredWidth : i22 + getPaddingLeft();
                    }
                } else if (i19 == 3 || i19 != 5) {
                    int i25 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    paddingLeft = i25 + paddingLeft2;
                } else {
                    paddingLeft = (paddingRight - measuredWidth) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                }
                if (i18 == 16) {
                    int i26 = ((paddingBottom - paddingTop2) - measuredHeight) / 2;
                    int i27 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    if (i27 > i26) {
                        paddingTop = paddingTop2 + i27;
                    } else {
                        int i28 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                        paddingTop = i28 > i26 ? (paddingBottom - i28) - measuredHeight : getPaddingTop() + i26;
                    }
                } else if (i18 == 48 || i18 != 80) {
                    int i29 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    paddingTop = i29 + paddingTop2;
                } else {
                    paddingTop = (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                }
                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) {
        int childCount = getChildCount();
        boolean z12 = (View.MeasureSpec.getMode(i12) == 1073741824 && View.MeasureSpec.getMode(i13) == 1073741824) ? false : true;
        ArrayList<View> arrayList = this.f335554b;
        arrayList.clear();
        int iCombineMeasuredStates = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                b bVar = (b) childAt.getLayoutParams();
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                if (z12 && (((ViewGroup.MarginLayoutParams) bVar).width == -1 || ((ViewGroup.MarginLayoutParams) bVar).height == -1)) {
                    arrayList.add(childAt);
                }
            }
        }
        int i15 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax2, getSuggestedMinimumWidth()), i12, i15), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i13, i15 << 16));
        int size = arrayList.size();
        if (size > 1) {
            for (int i16 = 0; i16 < size; i16++) {
                View view = arrayList.get(i16);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824) : ViewGroup.getChildMeasureSpec(i12, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), marginLayoutParams.height == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824) : ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
            }
        }
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @j
    public f(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f335554b = new ArrayList<>(1);
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@l ViewGroup.LayoutParams layoutParams) {
        b bVar = new b(layoutParams);
        bVar.f335555a = -1;
        return bVar;
    }
}

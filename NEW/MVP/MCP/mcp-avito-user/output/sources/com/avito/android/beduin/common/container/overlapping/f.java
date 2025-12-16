package com.avito.android.beduin.common.container.overlapping;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.container.overlapping.BeduinOverlappingContainerModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinOverlappingLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/overlapping/f;", "Landroid/view/ViewGroup;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public int f103166b;

    /* renamed from: c, reason: collision with root package name */
    public int f103167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public BeduinOverlappingContainerModel.Alignment f103168d;

    /* compiled from: BeduinOverlappingLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103169a;

        static {
            int[] iArr = new int[BeduinOverlappingContainerModel.Alignment.values().length];
            try {
                iArr[BeduinOverlappingContainerModel.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinOverlappingContainerModel.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinOverlappingContainerModel.Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103169a = iArr;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingStart;
        if (this.f103167c >= getWidth()) {
            paddingStart = 0;
        } else {
            int i16 = a.f103169a[this.f103168d.ordinal()];
            if (i16 == 1) {
                paddingStart = getPaddingStart();
            } else if (i16 == 2) {
                paddingStart = getWidth() - this.f103167c;
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                paddingStart = (getWidth() - this.f103167c) / 2;
            }
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int height = (getHeight() / 2) - (childAt.getMeasuredHeight() / 2);
                int measuredHeight = childAt.getMeasuredHeight() + height;
                int i18 = (this.f103166b * i17) + paddingStart;
                childAt.layout(i18, height, childAt.getMeasuredWidth() + i18, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i12, i13);
                iMax = Math.max(iMax, (this.f103166b * i14) + childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int paddingEnd = getPaddingEnd() + getPaddingStart() + iMax;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax2;
        int iMax3 = Math.max(paddingEnd, getSuggestedMinimumWidth());
        int iMax4 = Math.max(paddingBottom, getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumWidth());
            iMax4 = Math.max(iMax4, foreground.getMinimumHeight());
        }
        this.f103167c = iMax3;
        setMeasuredDimension(View.resolveSizeAndState(iMax3, i12, iCombineMeasuredStates), View.resolveSizeAndState(iMax4, i13, iCombineMeasuredStates << 16));
    }
}

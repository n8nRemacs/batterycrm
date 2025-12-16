package com.avito.android.user_adverts_views_util;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.user_adverts_views_util.a;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IconsView.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts_views_util/IconsView;", "Landroid/view/ViewGroup;", "", "", "Lcom/avito/android/image_loader/k;", "icons", "Lkotlin/G0;", "setIcons", "(Ljava/util/Map;)V", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconsView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final int f316741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316742c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f316743d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public Map<String, ? extends com.avito.android.image_loader.k> f316744e;

    @j
    public IconsView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        return !this.f316743d ? super.getChildDrawingOrder(i12, i13) : (i12 - 1) - i13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingStart = getPaddingStart();
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            View childAt = getChildAt(i16);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int height = (((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2) - (measuredHeight / 2);
            if ((i16 > 0 ? -this.f316742c : 0) + paddingStart + measuredWidth <= getWidth() - getPaddingEnd()) {
                int i17 = (i16 > 0 ? -this.f316742c : 0) + paddingStart;
                int i18 = measuredWidth + i17;
                childAt.layout(i17, height, i18, measuredHeight + height);
                paddingStart = i18;
            } else {
                childAt.setVisibility(8);
            }
            if (i16 == childCount) {
                return;
            } else {
                i16++;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredWidth;
        int iMax;
        super.onMeasure(i12, i13);
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            int i14 = 0;
            measuredWidth = 0;
            iMax = 0;
            while (true) {
                View childAt = getChildAt(i14);
                measureChild(childAt, i12, i13);
                measuredWidth += (i14 > 0 ? -this.f316742c : 0) + childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                View.combineMeasuredStates(0, childAt.getMeasuredState());
                if (i14 == childCount) {
                    break;
                } else {
                    i14++;
                }
            }
        } else {
            measuredWidth = 0;
            iMax = 0;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingEnd() + getPaddingStart() + measuredWidth, getSuggestedMinimumWidth()), i12, 0), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax, getSuggestedMinimumHeight()), i13, 0));
    }

    public final void setIcons(@k Map<String, ? extends com.avito.android.image_loader.k> icons) {
        if (!L.f(this.f316744e, icons)) {
            removeAllViews();
            for (Map.Entry<String, ? extends com.avito.android.image_loader.k> entry : icons.entrySet()) {
                String key = entry.getKey();
                com.avito.android.image_loader.k value = entry.getValue();
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
                int i12 = this.f316741b;
                simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.d(value);
                aVarA.c();
                simpleDraweeView.setTag(key);
                addView(simpleDraweeView);
            }
        }
        this.f316744e = icons;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconsView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_Avito_IconsView : i13;
        super(context, attributeSet, i12);
        this.f316744e = P0.c();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.h.f316745a, i12, i13);
        this.f316741b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, this.f316741b);
        this.f316742c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, this.f316742c);
        this.f316743d = typedArrayObtainStyledAttributes.getBoolean(1, this.f316743d);
        typedArrayObtainStyledAttributes.recycle();
        setChildrenDrawingOrderEnabled(this.f316743d);
    }
}

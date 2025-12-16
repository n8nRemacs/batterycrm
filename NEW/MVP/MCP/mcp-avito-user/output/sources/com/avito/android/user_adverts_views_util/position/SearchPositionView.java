package com.avito.android.user_adverts_views_util.position;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts_views_util/position/SearchPositionView;", "Landroid/view/ViewGroup;", "Lcom/avito/android/user_adverts_views_util/position/a;", "animator", "Lkotlin/G0;", "setAnimator", "(Lcom/avito/android/user_adverts_views_util/position/a;)V", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchPositionView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f316748b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f316749c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BlinkOvalView f316750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316751e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316752f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public a f316753g;

    @j
    public SearchPositionView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(boolean z12) {
        if (z12) {
            this.f316753g.b(this);
        } else {
            this.f316753g.a(this);
        }
    }

    public final void b(float f12) {
        this.f316750d.setTranslationX((this.f316748b.getMeasuredWidth() + r0.getMeasuredWidth()) * f12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingStart = getPaddingStart();
        int paddingEnd = (i14 - i12) - getPaddingEnd();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i15 - i13) - getPaddingBottom();
        ViewGroup viewGroup = this.f316748b;
        if (viewGroup.getVisibility() == 0) {
            int measuredWidth = (((paddingEnd - paddingStart) - viewGroup.getMeasuredWidth()) / 2) + paddingStart;
            int measuredHeight = (((paddingBottom - paddingTop) - viewGroup.getMeasuredHeight()) / 2) + paddingTop;
            viewGroup.layout(measuredWidth, measuredHeight, viewGroup.getMeasuredWidth() + measuredWidth, viewGroup.getMeasuredHeight() + measuredHeight);
        }
        BlinkOvalView blinkOvalView = this.f316750d;
        if (blinkOvalView.getVisibility() == 0) {
            int left = viewGroup.getLeft() - blinkOvalView.getMeasuredWidth();
            int measuredHeight2 = (((paddingBottom - paddingTop) - blinkOvalView.getMeasuredHeight()) / 2) + paddingTop;
            blinkOvalView.layout(left, measuredHeight2, blinkOvalView.getMeasuredWidth() + left, blinkOvalView.getMeasuredHeight() + measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iCombineMeasuredStates;
        int measuredHeight;
        ViewGroup viewGroup = this.f316748b;
        int i14 = 0;
        if (viewGroup.getVisibility() == 0) {
            measureChild(viewGroup, i12, i13);
            int measuredWidth = viewGroup.getMeasuredWidth();
            measuredHeight = viewGroup.getMeasuredHeight();
            i14 = measuredWidth;
            iCombineMeasuredStates = View.combineMeasuredStates(0, viewGroup.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
            measuredHeight = 0;
        }
        int paddingEnd = getPaddingEnd() + getPaddingStart() + i14;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        int iMax = Math.max(paddingEnd, getSuggestedMinimumWidth());
        int iMax2 = Math.max(paddingBottom, getSuggestedMinimumHeight());
        BlinkOvalView blinkOvalView = this.f316750d;
        if (blinkOvalView.getVisibility() == 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(iMax2, viewGroup.getMeasuredHeight() + this.f316751e), 1073741824);
            measureChild(blinkOvalView, iMakeMeasureSpec, iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax, i12, iCombineMeasuredStates), View.resolveSizeAndState(iMax2, i13, iCombineMeasuredStates << 16));
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z12) {
        super.onVisibilityAggregated(z12);
        a(z12 && this.f316752f);
    }

    public final void setAnimator(@k a animator) {
        this.f316753g.a(this);
        this.f316753g = animator;
        a(this.f316752f);
    }

    public SearchPositionView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f316751e = y6.b(6);
        this.f316753g = h.b();
        LayoutInflater.from(getContext()).inflate(R.layout.user_adverts_views_util_search_position_view, (ViewGroup) this, true);
        this.f316748b = (ViewGroup) findViewById(R.id.search_position_text_group);
        this.f316749c = (TextView) findViewById(R.id.search_position_text);
        this.f316750d = (BlinkOvalView) findViewById(R.id.search_position_blink_image);
        setFocusable(true);
        setClickable(true);
    }
}

package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionToolbar.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/toolbar/SearchPositionToolbar;", "Landroid/view/ViewGroup;", "LLV/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/toolbar/b;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/toolbar/b;)V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionToolbar extends ViewGroup implements LV.b<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f221298b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f221299c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f221300d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f221301e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f221302f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f221303g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public b f221304h;

    @j
    public SearchPositionToolbar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void a(TextView textView, View view, b.InterfaceC6692b interfaceC6692b) {
        if (interfaceC6692b instanceof b.InterfaceC6692b.a) {
            view.setVisibility(8);
            I5.a(textView, ((b.InterfaceC6692b.a) interfaceC6692b).f221311a.k0(textView.getContext()), false);
        } else if (interfaceC6692b instanceof b.InterfaceC6692b.C6693b) {
            view.setVisibility(8);
            textView.setVisibility(8);
        } else if (interfaceC6692b instanceof b.InterfaceC6692b.c) {
            view.setVisibility(0);
            textView.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@k AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingStart = getPaddingStart();
        int right = (getRight() - getLeft()) - getPaddingEnd();
        int paddingTop = getPaddingTop();
        int bottom = ((getBottom() - getTop()) - getPaddingBottom()) - paddingTop;
        ImageView imageView = this.f221303g;
        int measuredHeight = ((bottom - imageView.getMeasuredHeight()) / 2) + paddingTop;
        imageView.layout(paddingStart, measuredHeight, imageView.getMeasuredWidth() + paddingStart, imageView.getMeasuredHeight() + measuredHeight);
        ViewGroup viewGroup = this.f221302f;
        int measuredHeight2 = ((bottom - viewGroup.getMeasuredHeight()) / 2) + paddingTop;
        int measuredWidth = (((right - paddingStart) - viewGroup.getMeasuredWidth()) / 2) + paddingStart;
        viewGroup.layout(measuredWidth, measuredHeight2, viewGroup.getMeasuredWidth() + measuredWidth, viewGroup.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        measureChildWithMargins(this.f221303g, i12, 0, i13, 0);
        ImageView imageView = this.f221303g;
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int measuredState = imageView.getMeasuredState();
        measureChildWithMargins(this.f221302f, i12, measuredWidth * 2, i13, 0);
        ViewGroup viewGroup = this.f221302f;
        int measuredWidth2 = viewGroup.getMeasuredWidth() + measuredWidth;
        int iMax = Math.max(viewGroup.getMeasuredHeight(), measuredHeight);
        int iCombineMeasuredStates = View.combineMeasuredStates(measuredState, viewGroup.getMeasuredState());
        int paddingEnd = getPaddingEnd() + getPaddingStart() + measuredWidth2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingEnd, getSuggestedMinimumWidth()), i12, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i13, iCombineMeasuredStates << 16));
    }

    public SearchPositionToolbar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View.inflate(getContext(), R.layout.position_in_search_stats_toolbar, this);
        this.f221298b = findViewById(R.id.toolbar_title_shimmer);
        this.f221299c = findViewById(R.id.toolbar_subtitle_shimmer);
        this.f221300d = (TextView) findViewById(R.id.toolbar_title);
        this.f221301e = (TextView) findViewById(R.id.toolbar_subtitle);
        this.f221302f = (ViewGroup) findViewById(R.id.toolbar_title_group);
        ImageView imageView = (ImageView) findViewById(R.id.toolbar_icon);
        this.f221303g = imageView;
        imageView.setOnClickListener(new a(this, 0));
        setState(new b(null, null, null, 7, null));
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@k ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b r6) {
        /*
            r5 = this;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b r0 = r5.f221304h
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b$b r2 = r6.f221307a
            r3 = 0
            if (r1 != 0) goto L18
            if (r0 == 0) goto L11
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b$b r0 = r0.f221307a
            goto L12
        L11:
            r0 = r3
        L12:
            boolean r0 = kotlin.jvm.internal.L.f(r2, r0)
            if (r0 != 0) goto L1f
        L18:
            android.widget.TextView r0 = r5.f221300d
            android.view.View r4 = r5.f221298b
            a(r0, r4, r2)
        L1f:
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b$b r0 = r6.f221308b
            if (r1 != 0) goto L2f
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b r1 = r5.f221304h
            if (r1 == 0) goto L29
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b$b r3 = r1.f221308b
        L29:
            boolean r1 = kotlin.jvm.internal.L.f(r0, r3)
            if (r1 != 0) goto L36
        L2f:
            android.widget.TextView r1 = r5.f221301e
            android.view.View r2 = r5.f221299c
            a(r1, r2, r0)
        L36:
            r5.f221304h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.SearchPositionToolbar.setState(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.b):void");
    }
}

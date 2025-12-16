package com.avito.android.beduin_content.utils;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NoTouchRecyclerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_content/utils/NoTouchEventRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NoTouchEventRecyclerView extends RecyclerView {
    @j
    public NoTouchEventRecyclerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(@l MotionEvent motionEvent) {
        return false;
    }

    public NoTouchEventRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}

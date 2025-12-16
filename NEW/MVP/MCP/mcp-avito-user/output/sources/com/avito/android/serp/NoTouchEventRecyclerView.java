package com.avito.android.serp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NoTouchEventRecyclerView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/NoTouchEventRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoTouchEventRecyclerView extends RecyclerView {
    @X41.j
    public NoTouchEventRecyclerView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        return false;
    }

    public NoTouchEventRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}

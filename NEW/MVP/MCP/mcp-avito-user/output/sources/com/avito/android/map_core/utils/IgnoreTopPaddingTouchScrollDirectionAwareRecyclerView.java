package com.avito.android.map_core.utils;

import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.avito.android.ui.widget.ScrollDirectionAwareRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/map_core/utils/IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;", "Lcom/avito/android/ui/widget/ScrollDirectionAwareRecyclerView;", "", "J0", "Z", "isIgnoreTopPaddingTouchEnabled", "()Z", "setIgnoreTopPaddingTouchEnabled", "(Z)V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView extends ScrollDirectionAwareRecyclerView {

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    public boolean isIgnoreTopPaddingTouchEnabled;

    @X41.j
    public IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView(@Y61.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() <= getPaddingTop() && this.isIgnoreTopPaddingTouchEnabled) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setIgnoreTopPaddingTouchEnabled(boolean z12) {
        this.isIgnoreTopPaddingTouchEnabled = z12;
    }

    public IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.isIgnoreTopPaddingTouchEnabled = true;
    }
}

package com.avito.android.lib.design.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;

/* compiled from: SafeFlexboxLayoutManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/design/chips/SafeFlexboxLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SafeFlexboxLayoutManager extends FlexboxLayoutManager {
    public SafeFlexboxLayoutManager(@Y61.k Context context, @Y61.k AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.k ViewGroup.LayoutParams layoutParams) {
        FlexboxLayoutManager.LayoutParams layoutParams2 = new FlexboxLayoutManager.LayoutParams(layoutParams);
        layoutParams2.f348468f = 0.0f;
        layoutParams2.f348469g = 1.0f;
        layoutParams2.f348470h = -1;
        layoutParams2.f348471i = -1.0f;
        layoutParams2.f348474l = 16777215;
        layoutParams2.f348475m = 16777215;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
        return layoutParams2;
    }
}

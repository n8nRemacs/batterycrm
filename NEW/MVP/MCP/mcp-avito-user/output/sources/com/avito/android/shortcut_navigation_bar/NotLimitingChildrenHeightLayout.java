package com.avito.android.shortcut_navigation_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotLimitingChildrenHeightLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/NotLimitingChildrenHeightLayout;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotLimitingChildrenHeightLayout extends ScrollView {
    public /* synthetic */ NotLimitingChildrenHeightLayout(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @X41.j
    public NotLimitingChildrenHeightLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnabled(false);
    }
}

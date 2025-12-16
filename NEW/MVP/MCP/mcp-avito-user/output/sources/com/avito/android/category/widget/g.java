package com.avito.android.category.widget;

import android.view.View;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWidgetItemSnapHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/widget/g;", "Landroidx/recyclerview/widget/J;", "<init>", "()V", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends J {
    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    @Y61.l
    public final View f(@Y61.k RecyclerView.m mVar) {
        LinearLayoutManager linearLayoutManager = mVar instanceof LinearLayoutManager ? (LinearLayoutManager) mVar : null;
        if (linearLayoutManager == null) {
            return super.f(mVar);
        }
        if (linearLayoutManager.H1() == 0 || linearLayoutManager.L1() == linearLayoutManager.o0() - 1) {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            return super.f(mVar);
        }
        return null;
    }
}

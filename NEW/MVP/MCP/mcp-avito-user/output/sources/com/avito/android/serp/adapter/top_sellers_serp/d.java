package com.avito.android.serp.adapter.top_sellers_serp;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TopSellersSerpWidgetItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f272469b = y6.b(-4);

    /* renamed from: c, reason: collision with root package name */
    public final int f272470c = y6.b(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f272471d = y6.b(12);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof i) {
            int i12 = this.f272469b;
            rect.left = i12;
            rect.top = this.f272470c;
            rect.right = i12;
            rect.bottom = this.f272471d;
        }
    }
}

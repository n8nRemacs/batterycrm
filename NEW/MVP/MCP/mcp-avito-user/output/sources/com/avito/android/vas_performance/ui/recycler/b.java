package com.avito.android.vas_performance.ui.recycler;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CompetitiveVasPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/recycler/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f321898b = y6.b(24);

    /* renamed from: c, reason: collision with root package name */
    public final int f321899c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f321900d = y6.b(10);

    /* renamed from: e, reason: collision with root package name */
    public final int f321901e = y6.b(16);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof com.avito.android.vas_performance.ui.items.competitive_vas.i;
        int i12 = this.f321898b;
        int i13 = this.f321901e;
        int i14 = this.f321900d;
        rect.left = z12 ? i14 : cW2 instanceof com.avito.android.vas_performance.ui.items.competitive_vas_info_action.h ? i13 : i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof com.avito.android.vas_performance.ui.items.competitive_vas.i) {
            i12 = i14;
        } else if (cW3 instanceof com.avito.android.vas_performance.ui.items.competitive_vas_info_action.h) {
            i12 = i13;
        }
        rect.right = i12;
        RecyclerView.C cW4 = recyclerView.W(view);
        boolean z13 = cW4 instanceof com.avito.android.vas_performance.ui.items.header.d;
        int i15 = this.f321899c;
        if (!z13 && !(cW4 instanceof com.avito.android.vas_performance.ui.items.competitive_vas_tabs.i) && !(cW4 instanceof com.avito.android.vas_performance.ui.items.competitive_vas.i)) {
            i15 = 0;
        }
        rect.bottom = i15;
    }
}

package com.avito.android.vas_performance.screens.common_item;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.g;
import com.avito.android.vas_performance.ui.items.stickers_changes.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StickersPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/common_item/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f320385b = y6.b(14);

    /* renamed from: c, reason: collision with root package name */
    public final int f320386c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f320387d = y6.b(20);

    /* renamed from: e, reason: collision with root package name */
    public final int f320388e = y6.b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f320389f = y6.b(16);

    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof g ? true : cW2 instanceof f;
        int i13 = this.f320389f;
        rect.left = z12 ? 0 : i13;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof g ? true : cW3 instanceof f) {
            i13 = 0;
        }
        rect.right = i13;
        RecyclerView.C cW4 = recyclerView.W(view);
        if (cW4 instanceof com.avito.android.vas_performance.screens.common_item.header.f) {
            i12 = this.f320385b;
        } else if (cW4 instanceof com.avito.android.vas_performance.screens.common_item.attributed_text.g) {
            i12 = this.f320386c;
        } else {
            i12 = cW4 instanceof g ? true : cW4 instanceof f ? this.f320387d : this.f320388e;
        }
        rect.bottom = i12;
    }
}

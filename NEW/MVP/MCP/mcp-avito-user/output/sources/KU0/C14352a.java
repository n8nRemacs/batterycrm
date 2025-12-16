package Ku0;

import Y61.k;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.service_orders.list.blueprints.banner_item.h;
import kotlin.Metadata;

/* compiled from: ServiceOrdersListItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKu0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ku0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14352a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f9680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9681c;

    public C14352a(@k Context context) {
        this.f9680b = context.getResources().getDimensionPixelSize(R.dimen.banner_bottom_margin_embedding);
        this.f9681c = context.getResources().getDimensionPixelSize(R.dimen.banner_top_margin_embedding_single_fragment);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof h) {
            rect.top = this.f9681c;
            rect.bottom = this.f9680b;
        }
    }
}

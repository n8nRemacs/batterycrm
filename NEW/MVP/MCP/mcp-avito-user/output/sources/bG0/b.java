package bG0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.trx_promo_impl.item.banner.i;
import com.avito.android.trx_promo_impl.item.commission.j;
import com.avito.android.trx_promo_impl.item.header.h;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TrxPromoItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbG0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f57012b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f57013c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f57014d = y6.b(24);

    /* renamed from: e, reason: collision with root package name */
    public final int f57015e = y6.b(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f57016f = y6.b(24);

    /* renamed from: g, reason: collision with root package name */
    public final int f57017g = y6.b(24);

    /* renamed from: h, reason: collision with root package name */
    public final int f57018h = y6.b(16);

    /* renamed from: i, reason: collision with root package name */
    public final int f57019i = y6.b(10);

    /* renamed from: j, reason: collision with root package name */
    public final int f57020j = y6.b(180);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = recyclerView.W(view) instanceof i ? this.f57019i : this.f57018h;
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof h ? this.f57012b : cW2 instanceof i ? this.f57013c : cW2 instanceof j ? this.f57014d : cW2 instanceof com.avito.android.trx_promo_impl.item.extra_info.h ? this.f57015e : cW2 instanceof com.avito.android.trx_promo_impl.item.date.k ? this.f57016f : cW2 instanceof com.avito.android.trx_promo_impl.item.discount_v2.j ? this.f57017g : 0;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? this.f57020j : 0;
        rect.left = i12;
        rect.right = i12;
    }
}

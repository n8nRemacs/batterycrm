package FH0;

import Y61.k;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.user_advert.di.InterfaceC35538q;
import com.avito.android.user_advert.di.InterfaceC35539s;
import com.avito.android.user_advert.di.InterfaceC35540t;
import com.avito.android.user_advert.di.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertMultiItemBlockDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFH0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f4655b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4656c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4659f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4660g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4661h;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@k com.avito.konveyor.a aVar, @InterfaceC35538q @k Context context, @k @r TV0.b<?, ?> bVar, @InterfaceC35540t @k TV0.b<?, ?> bVar2, @InterfaceC35539s @k TV0.b<?, ?> bVar3) {
        this.f4655b = aVar.Y(bVar.getClass());
        this.f4656c = aVar.Y(bVar2.getClass());
        this.f4657d = aVar.Y(bVar3.getClass());
        this.f4658e = aVar.Y(com.avito.android.user_advert.advert.items.title.b.class);
        this.f4659f = context.getResources().getDimensionPixelOffset(R.dimen.my_advert_multi_item_block_offset);
        this.f4660g = context.getResources().getDimensionPixelOffset(R.dimen.my_advert_multi_item_params_offset);
        this.f4661h = context.getResources().getDimensionPixelOffset(R.dimen.my_advert_title_item_margin_top);
    }

    public final boolean c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i12 < 0 || i12 >= itemCount) {
            return false;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(i12)) : null;
        return numValueOf != null && numValueOf.intValue() == this.f4657d;
    }

    public final boolean e(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (i12 < 0 || i12 >= itemCount) {
            return false;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(i12)) : null;
        return (numValueOf != null && numValueOf.intValue() == this.f4655b) || (numValueOf != null && numValueOf.intValue() == this.f4656c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int itemViewType = cW2.getItemViewType();
        if (itemViewType != this.f4655b && itemViewType != this.f4656c) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        int i12 = bindingAdapterPosition - 1;
        boolean zC2 = c(i12, recyclerView);
        int i13 = this.f4659f;
        int i14 = (zC2 || e(i12, recyclerView)) ? 0 : i13;
        int i15 = bindingAdapterPosition + 1;
        if (e(i15, recyclerView)) {
            i13 = this.f4660g;
        } else {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
            if (i15 >= 0 && i15 < itemCount && (adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(i15) == this.f4658e) {
                i13 -= this.f4661h;
            } else if (c(i15, recyclerView)) {
                i13 = 0;
            }
        }
        rect.set(0, i14, 0, i13);
    }
}

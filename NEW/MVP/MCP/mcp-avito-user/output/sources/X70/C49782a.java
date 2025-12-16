package x70;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneReverificationItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx70/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49782a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f442243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f442245d;

    @Inject
    public C49782a(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f442243b = resources.getDimensionPixelOffset(R.dimen.phone_reverification_first_last_item_margin);
        this.f442244c = resources.getDimensionPixelOffset(R.dimen.phone_reverification_item_between_margin);
        this.f442245d = aVar.Y(com.avito.android.phone_reverification_info.items.text_point.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        int i13 = this.f442243b;
        if (bindingAdapterPosition == 0) {
            i12 = i13;
        } else {
            int itemViewType = cW2.getItemViewType();
            i12 = this.f442244c;
            int i14 = this.f442245d;
            if (itemViewType == i14) {
                int bindingAdapterPosition2 = cW2.getBindingAdapterPosition();
                Integer numValueOf = null;
                if (bindingAdapterPosition2 > 0 && bindingAdapterPosition2 < zVar.b() && (adapter = recyclerView.getAdapter()) != null) {
                    numValueOf = Integer.valueOf(adapter.getItemViewType(bindingAdapterPosition2 - 1));
                }
                if (numValueOf != null && numValueOf.intValue() == i14) {
                    i12 = 0;
                }
            }
        }
        if (cW2.getBindingAdapterPosition() != zVar.b() - 1) {
            i13 = 0;
        }
        rect.set(0, i12, 0, i13);
    }
}

package NE0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileItemsDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNE0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f11340b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11344f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11345g = y6.b(16);

    /* renamed from: h, reason: collision with root package name */
    public final int f11346h = y6.b(28);

    @Inject
    public a(@k com.avito.konveyor.a aVar) {
        this.f11340b = aVar.Y(com.avito.android.travel_guest_profile.items.empty_state_banner.b.class);
        this.f11341c = aVar.Y(com.avito.android.travel_guest_profile.items.extended_plan.b.class);
        this.f11342d = aVar.Y(com.avito.android.travel_guest_profile.items.profile_header.b.class);
        this.f11343e = aVar.Y(com.avito.android.travel_guest_profile.items.statistics_item.b.class);
        this.f11344f = aVar.Y(com.avito.android.rating_ui.sort.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        int itemViewType = -1;
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null && iIntValue >= 0 && iIntValue < adapter.getItemCount()) {
                itemViewType = adapter.getItemViewType(iIntValue);
            }
            int iB2 = (itemViewType == this.f11343e || itemViewType == this.f11342d) ? this.f11345g : (itemViewType == this.f11340b || itemViewType == this.f11341c) ? y6.b(10) : y6.b(0);
            int iB3 = (iIntValue == 0 || itemViewType == this.f11344f) ? y6.b(0) : this.f11346h;
            rect.set(iB2, iB3, iB2, y6.b(0));
        }
    }
}

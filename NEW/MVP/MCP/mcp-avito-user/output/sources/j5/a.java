package J5;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.hotel.hotel_offer.a;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.button.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsHotelOffersScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.hotel.hotel_offer.b f8749b;

    @Inject
    public a(@I5.k @k com.avito.android.advert.item.hotel.hotel_offer.b bVar) {
        this.f8749b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        boolean z12;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 <= iM1) {
            while (true) {
                RecyclerView.C cP2 = recyclerView.P(iK1);
                if (cP2 != null && (cP2 instanceof f)) {
                    View view = cP2.itemView;
                    int iMin = Math.min(view.getRight(), recyclerView.getRight()) - Math.max(view.getLeft(), recyclerView.getLeft());
                    int width = view.getWidth();
                    if (width > 0 && iMin / width >= 0.5f) {
                        z12 = true;
                        break;
                    }
                }
                if (iK1 == iM1) {
                    break;
                } else {
                    iK1++;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        this.f8749b.a(new a.b(!z12));
    }
}

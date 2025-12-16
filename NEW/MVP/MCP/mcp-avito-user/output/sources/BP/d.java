package Bp;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerItemGallery.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBp/d;", "LBp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements InterfaceC13173a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RecyclerView f1718a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public j f1719b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f1720c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public SV.a f1721d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public b f1722e;

    public d(@k RecyclerView recyclerView, @k Context context) {
        this.f1718a = recyclerView;
        com.avito.android.comfortable_deal.deal.item.seller.gallery.di.a.a().a(context).a(this);
        j jVar = this.f1719b;
        (jVar == null ? null : jVar).setHasStableIds(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        if (recyclerView.getOnFlingListener() == null) {
            SV.a aVar = this.f1721d;
            (aVar == null ? null : aVar).b(recyclerView);
        }
        j jVar2 = this.f1719b;
        recyclerView.setAdapter(jVar2 == null ? null : jVar2);
        b bVar = this.f1722e;
        recyclerView.l(bVar != null ? bVar : null, -1);
    }
}

package com.avito.android.serp.adapter.rich_snippets.travel;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertTravelPriceVersion;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.C34801y;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34800x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertRichTravelPriceV22ItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/travel/k;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/x;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements TV0.b<InterfaceC34800x, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34782e f271453a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f271454b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f271455c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f271456d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<C34801y> f271457e = new g.a<>(R.layout.advert_item_rich_travel_price_v22, new a());

    /* compiled from: AdvertRichTravelPriceV22ItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, C34801y> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C34801y invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            int i12 = view2.getResources().getConfiguration().orientation;
            m.f271463a.getClass();
            float f12 = i12 == 2 ? 0.6666667f : 1.3333334f;
            float f13 = i12 == 2 ? 1.0370371f : 1.7142857f;
            n nVar = n.f271464a;
            k kVar = k.this;
            p pVar = kVar.f271455c;
            nVar.getClass();
            return new C34801y(view2, new com.avito.android.cyclic_gallery_widget.image_carousel.m(0.32f, 1.3333334f, f12, f13), kVar.f271454b, i12 == 2 ? pVar.b() : pVar.a(), AsyncViewportTracker.ViewContext.f430431u, kVar.f271456d, null, 64, null);
        }
    }

    @Inject
    public k(@Y61.k InterfaceC34782e interfaceC34782e, @Y61.k RecyclerView.t tVar, @Y61.k p pVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f271453a = interfaceC34782e;
        this.f271454b = tVar;
        this.f271455c = pVar;
        this.f271456d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f271453a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34801y> b() {
        return this.f271457e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268582b && advertItem.f268378F.isRich() && advertItem.f268409U0) {
                if (advertItem.f268415X0 == AdvertTravelPriceVersion.NewPrice2Discount2) {
                    return true;
                }
            }
        }
        return false;
    }
}

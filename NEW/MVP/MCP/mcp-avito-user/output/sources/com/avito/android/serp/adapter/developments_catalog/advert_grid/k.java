package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DevelopmentItemGridPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/k;", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f269829b;

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f269829b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        DevelopmentItem developmentItem = (DevelopmentItem) aVar;
        List<Image> list = developmentItem.f270903l;
        mVar.x(com.avito.android.image_loader.b.b(list != null ? (Image) C42745f0.G(list) : null));
        mVar.b(developmentItem.f270895d);
        mVar.N2(developmentItem.f270897f);
        mVar.tS(developmentItem.f270898g);
        List<String> list2 = developmentItem.f270907p;
        mVar.fD(list2 != null ? (String) C42745f0.K(0, list2) : null, list2 != null ? (String) C42745f0.K(1, list2) : null);
        List<GeoReference> list3 = developmentItem.f270906o;
        mVar.B40(list3 != null ? (GeoReference) C42745f0.E(list3) : null);
        mVar.c(new j(this, developmentItem));
    }
}

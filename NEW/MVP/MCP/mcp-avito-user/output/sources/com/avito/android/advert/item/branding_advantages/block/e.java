package com.avito.android.advert.item.branding_advantages.block;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.branding_advantages.block.BrandingAdvantagesBlockItem;
import com.avito.android.advert.item.branding_advantages.block_element.BrandingAdvantagesBlockElementItem;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BrandingAdvantagesBlockItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/e;", "LTV0/d;", "Lcom/avito/android/advert/item/branding_advantages/block/h;", "Lcom/avito/android/advert/item/branding_advantages/block/BrandingAdvantagesBlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<h, BrandingAdvantagesBlockItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f74186b;

    @Inject
    public e(@k com.avito.android.advert_core.analytics.a aVar) {
        this.f74186b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        BrandingAdvantagesBlockItem brandingAdvantagesBlockItem = (BrandingAdvantagesBlockItem) aVar;
        hVar.f74193d.setText(brandingAdvantagesBlockItem.f74168b);
        com.avito.android.advert_core.analytics.a aVar2 = this.f74186b;
        c cVar = new c(0, aVar2, com.avito.android.advert_core.analytics.a.class, "trackBrandingAdvantagesExpandExist", "trackBrandingAdvantagesExpandExist()V", 0);
        d dVar = new d(0, aVar2, com.avito.android.advert_core.analytics.a.class, "trackBrandingAdvantagesExpanded", "trackBrandingAdvantagesExpanded()V", 0);
        BrandingAdvantagesBlockItem.Description description = brandingAdvantagesBlockItem.f74169c;
        String str = description != null ? description.f74176b : null;
        ExpandablePanelLayout expandablePanelLayout = hVar.f74197h;
        if (str == null || C43066x.K(str)) {
            D6.w(expandablePanelLayout);
        } else {
            D6.H(expandablePanelLayout);
            expandablePanelLayout.setCollapsedLineCount(description != null ? Integer.valueOf(description.f74177c) : null);
            expandablePanelLayout.setOnExpandListener(new g(hVar, dVar, cVar));
            ExpandablePanelLayout.b(expandablePanelLayout, description != null ? description.f74176b : null);
        }
        ArrayList arrayList = hVar.f74194e;
        arrayList.clear();
        List<BrandingAdvantagesBlockElementItem> list = brandingAdvantagesBlockItem.f74170d;
        if (list != null) {
            arrayList.addAll(list);
        }
        hVar.f74191b.c(hVar.f74195f);
        hVar.f74192c.notifyDataSetChanged();
    }
}

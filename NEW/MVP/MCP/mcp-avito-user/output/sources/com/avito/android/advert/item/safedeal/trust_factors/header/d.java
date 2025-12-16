package com.avito.android.advert.item.safedeal.trust_factors.header;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrustFactorsHeaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/header/d;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/header/f;", "Lcom/avito/android/advert/item/safedeal/trust_factors/header/TrustFactorsHeaderItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, TrustFactorsHeaderItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79164b;

    @Inject
    public d(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79164b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar;
        f fVar = (f) eVar;
        TrustFactorsHeaderItem trustFactorsHeaderItem = (TrustFactorsHeaderItem) aVar;
        SafeDeal.Component.Header header = trustFactorsHeaderItem.f79152c.f84264b;
        AttributedText title = header.getTitle();
        com.avito.android.advert.item.safedeal.trust_factors.d dVar = this.f79164b;
        title.setOnDeepLinkClickListener(new c(dVar));
        AttributedText title2 = header.getTitle();
        com.avito.android.util.text.a aVar2 = fVar.f79166b;
        TextView textView = fVar.f79168d;
        j.c(textView, title2, aVar2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        DeepLink titleDeeplink = header.getTitleDeeplink();
        textView.setOnClickListener(titleDeeplink != null ? new g(5, this, titleDeeplink) : null);
        int i13 = header.getInfoDeeplink() != null ? 0 : 8;
        ImageView imageView = fVar.f79170f;
        imageView.setVisibility(i13);
        DeepLink infoDeeplink = header.getInfoDeeplink();
        imageView.setOnClickListener(infoDeeplink != null ? new g(5, this, infoDeeplink) : null);
        int i14 = header.getTitleDeeplink() != null ? 0 : 8;
        ImageView imageView2 = fVar.f79169e;
        imageView2.setVisibility(i14);
        DeepLink titleDeeplink2 = header.getTitleDeeplink();
        imageView2.setOnClickListener(titleDeeplink2 != null ? new g(5, this, titleDeeplink2) : null);
        SafeDeal.TooltipData tooltipData = trustFactorsHeaderItem.f79154e;
        if (tooltipData == null || (iVar = fVar.f79167c) == null) {
            return;
        }
        iVar.b(trustFactorsHeaderItem.f79151b, tooltipData, dVar);
    }
}

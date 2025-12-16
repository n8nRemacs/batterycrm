package com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item;

import Rh.C15041a;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.text.j;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrustFactorsExpandableListItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/expandable_list_item/c;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/expandable_list_item/e;", "Lcom/avito/android/advert/item/safedeal/trust_factors/expandable_list_item/TrustFactorsExpandableListItemItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, TrustFactorsExpandableListItemItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79139b;

    @Inject
    public c(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79139b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar;
        e eVar2 = (e) eVar;
        TrustFactorsExpandableListItemItem trustFactorsExpandableListItemItem = (TrustFactorsExpandableListItemItem) aVar;
        SafeDeal.Component.ExpandableListItem expandableListItem = trustFactorsExpandableListItemItem.f79128c.f84262b;
        expandableListItem.getDescription().setOnDeepLinkClickListener(new C15041a(this, 5));
        AttributedText title = expandableListItem.getTitle();
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = eVar2.f79144e;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.a aVar2 = eVar2.f79141b;
        j.c(textView, title, aVar2);
        AttributedText description = expandableListItem.getDescription();
        MovementMethod linkMovementMethod2 = LinkMovementMethod.getInstance();
        TextView textView2 = eVar2.f79145f;
        textView2.setMovementMethod(linkMovementMethod2);
        j.c(textView2, description, aVar2);
        boolean z12 = expandableListItem.f254348b;
        textView2.setVisibility(z12 ? 0 : 8);
        j.c(eVar2.f79146g, new AttributedText("{{icon}}", Collections.singletonList(new TextIconAttribute("icon", z12 ? "expandLess" : "expandMore", null, Collections.singletonList(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK)), 4, null)), 1), aVar2);
        eVar2.f79143d.setOnClickListener(new g(4, this, trustFactorsExpandableListItemItem));
        SafeDeal.TooltipData tooltipData = trustFactorsExpandableListItemItem.f79130e;
        if (tooltipData == null || (iVar = eVar2.f79142c) == null) {
            return;
        }
        iVar.b(trustFactorsExpandableListItemItem.f79127b, tooltipData, this.f79139b);
    }
}

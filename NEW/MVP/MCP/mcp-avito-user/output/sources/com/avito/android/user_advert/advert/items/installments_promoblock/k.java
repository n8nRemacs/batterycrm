package com.avito.android.user_advert.advert.items.installments_promoblock;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsPromoBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/j;", "Lcom/avito/android/lib/util/groupable_item/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j, com.avito.android.lib.util.groupable_item.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f309529b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.c f309530c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f309531d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Context f309532e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextView f309533f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ListItemSwitcher f309534g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e f309535h;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.serp.adapter.vertical_main.c cVar) {
        super(view);
        this.f309529b = aVar;
        this.f309530c = cVar;
        Banner banner = (Banner) view;
        this.f309531d = banner;
        this.f309532e = banner.getThemedContext();
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void Bu(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e eVar;
        if (lVar != null) {
            com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e eVar2 = new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(this, lVar);
            ListItemSwitcher listItemSwitcher = this.f309534g;
            if (listItemSwitcher != null) {
                listItemSwitcher.e(eVar2);
            }
            this.f309535h = eVar2;
            return;
        }
        ListItemSwitcher listItemSwitcher2 = this.f309534g;
        if (listItemSwitcher2 != null && (eVar = this.f309535h) != null) {
            listItemSwitcher2.j(eVar);
        }
        this.f309535h = null;
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void Ka(@Y61.l String str) {
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher != null) {
            listItemSwitcher.setTitle(str);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void Kc(@Y61.l PromoStyle promoStyle) {
        if (promoStyle == null) {
            promoStyle = PromoStyle.VIOLET;
        }
        int iA2 = this.f309530c.a(promoStyle);
        Banner banner = this.f309531d;
        banner.i(R.layout.my_advert_installments_promo_block_content, iA2);
        D6.f(this.f309531d, 0, 0, 0, y6.b(16), 7);
        View viewFindViewById = banner.findViewById(R.id.subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309533f = (TextView) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById2;
        this.f309534g = listItemSwitcher;
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void PO(@Y61.l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar) {
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher != null) {
            com.avito.android.user_advert.advert.items.safe_deal_services.e.a(listItemSwitcher, aVar);
        }
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f309531d.Tz(z12, z13);
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void UM(boolean z12) {
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher != null) {
            listItemSwitcher.setLoading(z12);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void e(@Y61.l AttributedText attributedText) {
        this.f309531d.setTitle(this.f309529b.c(this.f309532e, attributedText));
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void eL(@Y61.l AttributedText attributedText, @Y61.k w wVar) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(wVar);
        }
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher != null) {
            listItemSwitcher.setLink(this.f309529b.c(this.f309532e, attributedText));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e eVar;
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher != null && (eVar = this.f309535h) != null) {
            listItemSwitcher.j(eVar);
        }
        this.f309535h = null;
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void k(@Y61.l AttributedText attributedText) {
        TextView textView = this.f309533f;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, this.f309529b);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.j
    public final void rx(boolean z12) {
        ListItemSwitcher listItemSwitcher = this.f309534g;
        if (listItemSwitcher == null) {
            return;
        }
        listItemSwitcher.setChecked(z12);
    }
}

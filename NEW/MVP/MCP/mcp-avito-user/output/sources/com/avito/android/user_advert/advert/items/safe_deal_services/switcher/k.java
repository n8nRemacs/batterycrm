package com.avito.android.user_advert.advert.items.safe_deal_services.switcher;

import Y61.l;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafeDealServiceSwitcherItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f310075d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f310076b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f310077c;

    public k(@Y61.k View view) {
        super(view);
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view;
        this.f310076b = listItemSwitcher;
        this.f310077c = view.findViewById(R.id.design_right_container);
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void Dy(boolean z12) {
        this.f310076b.setLoading(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void KH(boolean z12) {
        View view = this.f310077c;
        if (z12) {
            D6.H(view);
        } else {
            D6.g(view);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void L20(@l Y41.l<? super Boolean, G0> lVar) {
        this.f310076b.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(lVar, this));
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void Ub(@l SpannableString spannableString) {
        this.f310076b.setLink(spannableString);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void hb(boolean z12) {
        this.f310076b.setChecked(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void iL(@Y61.k String str) {
        this.f310076b.setTitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310076b.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.j
    public final void zg(@l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar) {
        com.avito.android.user_advert.advert.items.safe_deal_services.e.a(this.f310076b, aVar);
    }
}

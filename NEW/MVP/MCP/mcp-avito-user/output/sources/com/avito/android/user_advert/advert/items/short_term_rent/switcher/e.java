package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortTermRentHiddenSwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/e;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310256b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        OH0.b bVar = (OH0.b) aVar;
        gVar.setTitle(bVar.f12157c);
        AttributedText attributedText = bVar.f12158d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(12, this, bVar));
        }
        gVar.k(attributedText);
        gVar.U2(new d(bVar));
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.c
    public final void c0() {
        this.f310256b = null;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.c
    public final void j1(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310256b = myAdvertDetailsActivity;
    }
}

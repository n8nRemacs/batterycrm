package com.avito.android.user_advert.advert.items.service_subscription_banner;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m90.C43932b;

/* compiled from: SubscriptionBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_subscription_banner/f;", "Lcom/avito/android/user_advert/advert/items/service_subscription_banner/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f310205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f310206c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310207d;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a) {
        this.f310205b = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        if (!this.f310206c) {
            this.f310205b.c(new C43932b("Карточка селлера", "landing"));
            this.f310206c = true;
        }
        AttributedText attributedText = cVar.f310198c;
        if (attributedText != null) {
            hVar.e(attributedText);
        }
        AttributedText attributedText2 = cVar.f310199d;
        if (attributedText2 != null) {
            hVar.k(attributedText2);
        }
        UniversalColor universalColor = cVar.f310200e;
        if (universalColor != null) {
            hVar.v(universalColor);
        }
        hVar.i(cVar.f310201f);
        hVar.TA(new e(this, cVar));
    }

    @Override // com.avito.android.user_advert.advert.items.service_subscription_banner.d
    public final void a6(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310207d = myAdvertDetailsActivity;
    }
}

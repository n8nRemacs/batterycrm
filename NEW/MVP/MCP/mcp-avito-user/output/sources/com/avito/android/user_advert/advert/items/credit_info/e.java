package com.avito.android.user_advert.advert.items.credit_info;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditInfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/credit_info/e;", "Lcom/avito/android/user_advert/advert/items/credit_info/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309347b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.b(aVar2.f309338c);
        gVar.nb(aVar2.f309340e);
        AttributedText attributedText = aVar2.f309339d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 9));
        } else {
            attributedText = null;
        }
        gVar.R(attributedText);
    }

    @Override // com.avito.android.user_advert.advert.items.credit_info.d
    public final void c0() {
        this.f309347b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.b(aVar2.f309338c);
        gVar.nb(aVar2.f309340e);
        AttributedText attributedText = aVar2.f309339d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 9));
        } else {
            attributedText = null;
        }
        gVar.R(attributedText);
    }

    @Override // com.avito.android.user_advert.advert.items.credit_info.d
    public final void n1(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309347b = myAdvertDetailsActivity;
    }
}

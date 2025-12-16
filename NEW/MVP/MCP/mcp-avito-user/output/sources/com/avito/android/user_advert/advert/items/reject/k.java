package com.avito.android.user_advert.advert.items.reject;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RejectReasonItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reject/k;", "Lcom/avito/android/user_advert/advert/items/reject/h;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310007b;

    @Inject
    public k() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLink;
        m mVar = (m) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f309987j;
        if (str != null) {
            d dVar = mVar instanceof d ? (d) mVar : null;
            if (dVar != null) {
                dVar.g5(str);
            }
        }
        mVar.al(aVar2.f309981d);
        mVar.F1(aVar2.f309980c);
        mVar.n(aVar2.f309982e);
        AttributedText attributedText = aVar2.f309983f;
        mVar.ZR(attributedText);
        Action action = aVar2.f309984g;
        mVar.lD(action);
        mVar.u6(aVar2.f309986i);
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            mVar.kc(new i(this, aVar2, deepLink));
        }
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(10, this, aVar2));
        }
        mVar.U2(new j(mVar, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.reject.h
    public final void Z4(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310007b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.reject.h
    public final void c0() {
        this.f310007b = null;
    }
}

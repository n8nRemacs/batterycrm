package com.avito.android.trx_promo_impl.item.banner;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/banner/g;", "Lcom/avito/android/trx_promo_impl/item/banner/d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f304210b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super DeepLink, G0> lVar) {
        this.f304210b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.j0(aVar2.f304199b);
        iVar.setTitle(aVar2.f304200c);
        AttributedText attributedText = aVar2.f304201d;
        iVar.g(attributedText);
        l<DeepLink, G0> lVar = this.f304210b;
        iVar.Q2(new e(1, lVar, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), aVar2.f304202e);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new f(lVar));
    }
}

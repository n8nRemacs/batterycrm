package com.avito.android.serp.adapter.action_promo_banner;

import Y41.l;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionPromoBannerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f268616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionPromoBannerItem f268617m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ActionPromoBannerItem actionPromoBannerItem) {
        super(1);
        this.f268616l = hVar;
        this.f268617m = actionPromoBannerItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        h hVar = this.f268616l;
        hVar.f268622f.K5(deepLink);
        String str = this.f268617m.f268597b;
        String strA = hVar.f268618b.a();
        if (strA == null) {
            strA = "";
        }
        hVar.f268619c.c(new BannerEvent.b(str, "serp", "button_click", "", strA));
        return G0.f406611a;
    }
}

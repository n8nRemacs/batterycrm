package com.avito.android.advert.item.autoteka.teaser_v3;

import com.adjust.sdk.Constants;
import com.avito.android.advert.item.W0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAutotekaTeaserV3Presenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f73130l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f73130l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        W0 w02 = this.f73130l.f73132b;
        if (w02 != null) {
            w02.a(deepLink2);
        }
        return G0.f406611a;
    }
}

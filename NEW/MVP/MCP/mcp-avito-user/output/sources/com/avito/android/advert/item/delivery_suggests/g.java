package com.avito.android.advert.item.delivery_suggests;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsDeliverySuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "itemId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.p<DeepLink, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f75110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsDeliverySuggestsItem f75111m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f75112n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem, j jVar) {
        super(2);
        this.f75110l = hVar;
        this.f75111m = advertDetailsDeliverySuggestsItem;
        this.f75112n = jVar;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, String str) {
        DeepLink deepLink2 = deepLink;
        String str2 = str;
        h hVar = this.f75110l;
        hVar.getClass();
        if (str2 != null) {
            AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem = this.f75111m;
            advertDetailsDeliverySuggestsItem.f75098h = str2;
            hVar.f75114c.b(str2);
            String str3 = advertDetailsDeliverySuggestsItem.f75098h;
            f fVar = new f(hVar);
            j jVar = this.f75112n;
            jVar.Lh(advertDetailsDeliverySuggestsItem.f75094d, str3, true, fVar, new g(hVar, advertDetailsDeliverySuggestsItem, jVar));
        }
        if (deepLink2 != null) {
            hVar.f75113b.c(deepLink2, null);
        }
        return G0.f406611a;
    }
}

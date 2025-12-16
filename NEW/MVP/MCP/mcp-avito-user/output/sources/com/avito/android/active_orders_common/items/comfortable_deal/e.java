package com.avito.android.active_orders_common.items.comfortable_deal;

import Y41.l;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealOrderItem f68336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f68337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ComfortableDealOrderItem comfortableDealOrderItem, f fVar) {
        super(0);
        this.f68336l = comfortableDealOrderItem;
        this.f68337m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str;
        BannerPayload bannerPayloadE3;
        String str2;
        BannerPayload bannerPayloadE32;
        String str3;
        ComfortableDealOrderItem comfortableDealOrderItem = this.f68336l;
        ArrayList arrayListE0 = C42745f0.e0(comfortableDealOrderItem.getF68325g());
        BannerPayload bannerPayloadE33 = comfortableDealOrderItem.getF68329k();
        if (bannerPayloadE33 != null && (str = bannerPayloadE33.f68319d) != null && (bannerPayloadE3 = comfortableDealOrderItem.getF68329k()) != null && (str2 = bannerPayloadE3.f68317b) != null && (bannerPayloadE32 = comfortableDealOrderItem.getF68329k()) != null && (str3 = bannerPayloadE32.f68318c) != null) {
            arrayListE0.add(new CloseInternalBannerRotationDeepLink(str, str2, str3));
        }
        RunMultipleLink runMultipleLink = new RunMultipleLink(arrayListE0);
        l<? super DeepLink, G0> lVar = this.f68337m.f68338b;
        if (lVar != null) {
            lVar.invoke(runMultipleLink);
        }
        return G0.f406611a;
    }
}

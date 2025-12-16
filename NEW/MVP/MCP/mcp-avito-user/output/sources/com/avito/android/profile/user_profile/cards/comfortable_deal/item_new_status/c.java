package com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status;

import Ua0.InterfaceC15503a;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.Banner;
import com.avito.android.remote.model.user_profile.items.BannerPayload;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealWithStatusCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.ComfortableDealWithStatusCardItem f224895l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f224896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardItem.ComfortableDealWithStatusCardItem comfortableDealWithStatusCardItem, d dVar) {
        super(0);
        this.f224895l = comfortableDealWithStatusCardItem;
        this.f224896m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String id2;
        BannerPayload bannerPayload;
        String position;
        BannerPayload bannerPayload2;
        String page;
        CardItem.ComfortableDealWithStatusCardItem comfortableDealWithStatusCardItem = this.f224895l;
        ArrayList arrayListE0 = C42745f0.e0(comfortableDealWithStatusCardItem.f224386e);
        Banner banner = comfortableDealWithStatusCardItem.f224387f;
        BannerPayload bannerPayload3 = banner.getBannerPayload();
        if (bannerPayload3 != null && (id2 = bannerPayload3.getId()) != null && (bannerPayload = banner.getBannerPayload()) != null && (position = bannerPayload.getPosition()) != null && (bannerPayload2 = banner.getBannerPayload()) != null && (page = bannerPayload2.getPage()) != null) {
            arrayListE0.add(new CloseInternalBannerRotationDeepLink(id2, position, page));
        }
        RunMultipleLink runMultipleLink = new RunMultipleLink(arrayListE0);
        this.f224896m.f224897b.invoke(new InterfaceC15503a.j(runMultipleLink));
        return G0.f406611a;
    }
}

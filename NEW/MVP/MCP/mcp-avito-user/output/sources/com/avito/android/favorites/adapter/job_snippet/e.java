package com.avito.android.favorites.adapter.job_snippet;

import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.AdvertAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.l<AdvertAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f156612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FavoriteAdvertItem f156613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, FavoriteAdvertItem favoriteAdvertItem) {
        super(1);
        this.f156612l = iVar;
        this.f156613m = favoriteAdvertItem;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertAction advertAction) {
        AdvertAction advertAction2 = advertAction;
        i iVar = this.f156612l;
        boolean z12 = advertAction2 instanceof AdvertAction.Messenger;
        FavoriteAdvertItem favoriteAdvertItem = this.f156613m;
        if (z12) {
            iVar.k(advertAction2, favoriteAdvertItem);
        } else if (advertAction2 instanceof AdvertAction.Phone) {
            DeepLink deepLinkA = iVar.f156622d.a(favoriteAdvertItem, false, favoriteAdvertItem.f156401M, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : ScreenIdField.f90252d);
            PhoneRequestLink phoneRequestLink = deepLinkA instanceof PhoneRequestLink ? (PhoneRequestLink) deepLinkA : null;
            if (phoneRequestLink != null) {
                b.a.a(iVar.f156625g, phoneRequestLink, null, PhoneRequestDeepLinkAnalyticsData.a.a(PhoneRequestDeepLinkAnalyticsData.f92253b, new PhoneRequestDeepLinkAnalyticsData.Favorites(phoneRequestLink.f92281b, phoneRequestLink.f92282c, "s")), 2);
            }
        } else if (advertAction2 instanceof AdvertAction.SecondaryAction) {
            iVar.k(advertAction2, favoriteAdvertItem);
        } else {
            iVar.k(advertAction2, favoriteAdvertItem);
        }
        return G0.f406611a;
    }
}

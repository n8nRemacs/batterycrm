package com.avito.android.advert.item;

import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class I0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f71638c;

    public I0(C28136i0 c28136i0, AdvertDetails advertDetails) {
        this.f71637b = c28136i0;
        this.f71638c = advertDetails;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertDetails advertDetails;
        C28136i0 c28136i0;
        AdvertSeller advertSellerCopy;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C28136i0 c28136i02 = this.f71637b;
        c28136i02.getClass();
        AdvertDetails advertDetails2 = this.f71638c;
        AdvertSeller seller = advertDetails2.getSeller();
        if (seller != null) {
            advertDetails = advertDetails2;
            c28136i0 = c28136i02;
            advertSellerCopy = seller.copy((4192255 & 1) != 0 ? seller.title : null, (4192255 & 2) != 0 ? seller.name : null, (4192255 & 4) != 0 ? seller.postfix : null, (4192255 & 8) != 0 ? seller.manager : null, (4192255 & 16) != 0 ? seller.connection : null, (4192255 & 32) != 0 ? seller.image : null, (4192255 & 64) != 0 ? seller.link : null, (4192255 & 128) != 0 ? seller.entryPointShowEvent : null, (4192255 & 256) != 0 ? seller.sellerType : null, (4192255 & 512) != 0 ? seller.summary : null, (4192255 & 1024) != 0 ? seller.rating : null, (4192255 & 2048) != 0 ? seller.online : zBooleanValue, (4192255 & 4096) != 0 ? seller.replySpeed : null, (4192255 & 8192) != 0 ? seller.userHashId : null, (4192255 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? seller.userKey : null, (4192255 & 32768) != 0 ? seller.isVerified : null, (4192255 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? seller.subscriptionInfo : null, (4192255 & 131072) != 0 ? seller.ratingAction : null, (4192255 & 262144) != 0 ? seller.badgeBar : null, (4192255 & 524288) != 0 ? seller.avatar : null, (4192255 & 1048576) != 0 ? seller.advantages : null, (4192255 & 2097152) != 0 ? seller.companyName : null);
        } else {
            advertDetails = advertDetails2;
            c28136i0 = c28136i02;
            advertSellerCopy = null;
        }
        advertDetails.setSeller(advertSellerCopy);
        c28136i0.f76351i.R1(zBooleanValue);
    }
}

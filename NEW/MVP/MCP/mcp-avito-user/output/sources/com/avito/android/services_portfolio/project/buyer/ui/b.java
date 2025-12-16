package com.avito.android.services_portfolio.project.buyer.ui;

import android.content.Intent;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.VehicleType;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.SellerOnlineStatus;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;

/* compiled from: PortfolioProjectBuyerFragment.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "position", "Lcom/avito/android/remote/model/AdvertAction$Phone;", "phone", "Lcom/avito/android/remote/model/AdvertAction$Messenger;", "message", "Lkotlin/G0;", "invoke", "(Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/AdvertAction$Phone;Lcom/avito/android/remote/model/AdvertAction$Messenger;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.r<List<? extends Image>, Integer, AdvertAction.Phone, AdvertAction.Messenger, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PortfolioProjectBuyerFragment f280082l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PortfolioProjectBuyerFragment portfolioProjectBuyerFragment) {
        super(4);
        this.f280082l = portfolioProjectBuyerFragment;
    }

    @Override // Y41.r
    public final G0 invoke(List<? extends Image> list, Integer num, AdvertAction.Phone phone, AdvertAction.Messenger messenger) {
        AdvertActions advertActions;
        String str;
        List<? extends Image> list2 = list;
        Integer num2 = num;
        AdvertAction.Phone phone2 = phone;
        AdvertAction.Messenger messenger2 = messenger;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        PortfolioProjectBuyerFragment.a aVar = PortfolioProjectBuyerFragment.f280064u0;
        PortfolioProjectBuyerFragment portfolioProjectBuyerFragment = this.f280082l;
        if (phone2 == null && messenger2 == null) {
            advertActions = null;
        } else {
            ArrayList arrayList = new ArrayList();
            if (phone2 != null) {
                arrayList.add(phone2);
            }
            if (messenger2 != null) {
                arrayList.add(messenger2);
            }
            advertActions = new AdvertActions(C42745f0.M0(arrayList), null, null, null, null, 30, null);
        }
        InterfaceC42726C interfaceC42726C = portfolioProjectBuyerFragment.f280070s0;
        ContactBarData contactBarData = (advertActions == null || (str = ((PortfolioProjectArguments.BuyerArgs) interfaceC42726C.getValue()).f279991b) == null) ? null : new ContactBarData("", new SellerOnlineStatus(false, null), null, UserIconType.PRIVATE, str, "", "", null, null, null, ((PortfolioProjectArguments.BuyerArgs) interfaceC42726C.getValue()).f279996g, null, AdvertisementCategoryAlias.NO_VALUE, false, null, null, null, null, null, AdvertisementVerticalAlias.NO_VALUE, null, VehicleType.NO_VALUE, "portfolio_gallery", false, null, null, P0.c(), null, false, false, false, false, C42784z0.f406748b, null, false, false, false, null, null, false, 0, 240, null);
        PhotoGalleryIntentFactory photoGalleryIntentFactory = portfolioProjectBuyerFragment.f280068q0;
        Intent intentA = (photoGalleryIntentFactory != null ? photoGalleryIntentFactory : null).a(null, null, null, null, null, null, null, list2, iIntValue, ((PortfolioProjectArguments.BuyerArgs) interfaceC42726C.getValue()).f279991b, (16773151 & 1024) != 0 ? null : null, (16773151 & 2048) != 0 ? null : null, (16773151 & 4096) != 0 ? null : advertActions, (16773151 & 8192) != 0 ? null : contactBarData, (16773151 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (32768 & 16773151) != 0 ? null : null, null, null, (262144 & 16773151) != 0 ? null : null, null, false, (16773151 & 2097152) != 0 ? null : null, null, null);
        intentA.setFlags(603979776);
        portfolioProjectBuyerFragment.startActivity(intentA);
        return G0.f406611a;
    }
}

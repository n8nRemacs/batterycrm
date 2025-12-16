package com.avito.android.advert.favorites;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorite.h;
import com.avito.android.favorites.V;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFavoriteInteractorImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/favorites/e;", "Lcom/avito/android/advert/favorites/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f71168a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final V f71169b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f71170c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AdvertDetailsMultiItemState f71171d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AdvertDetailsFastOpenParams f71172e;

    @Inject
    public e(@k h hVar, @k V v12, @k InterfaceC35745a5 interfaceC35745a5, @l AdvertDetailsMultiItemState advertDetailsMultiItemState, @k AdvertDetailsFastOpenParams advertDetailsFastOpenParams) {
        this.f71168a = hVar;
        this.f71169b = v12;
        this.f71170c = interfaceC35745a5;
        this.f71171d = advertDetailsMultiItemState;
        this.f71172e = advertDetailsFastOpenParams;
    }

    @Override // com.avito.android.advert.favorites.a
    @k
    public final W b(@k String str, boolean z12) {
        return this.f71168a.b(str, z12).z(this.f71170c.a());
    }

    @Override // com.avito.android.advert.favorites.a
    @k
    public final B0 c() {
        return this.f71169b.a().q0(1L).N(c.f71166b).d0(d.f71167b);
    }

    @Override // com.avito.android.advert.favorites.a
    @k
    public final C41960j0 d(@k String str) {
        return new C41960j0(this.f71168a.c().b(new b(str)));
    }

    @Override // com.avito.android.advert.favorites.a
    @k
    public final W e(@k AdvertDetailsStyle advertDetailsStyle, @k AdvertDetails advertDetails, @l String str, boolean z12) {
        Boolean bool;
        String str2;
        ContactBarData contactBarDataC = V9.a.c(advertDetails, null, false, false, false, false, false, 255);
        J8.a aVar = J8.a.f8792a;
        AdvertDetailsMultiItemState advertDetailsMultiItemState = this.f71171d;
        String str3 = advertDetailsMultiItemState != null ? advertDetailsMultiItemState.f85868b : null;
        aVar.getClass();
        if (advertDetails.getMultiItemParams() == null) {
            bool = null;
        } else {
            Boolean bool2 = (str3 == null || str3.equals(advertDetails.getId())) ? Boolean.FALSE : Boolean.TRUE;
            bool = bool2;
        }
        String id2 = advertDetails.getId();
        AbstractC30567a.f fVar = new AbstractC30567a.f(str, z12);
        boolean isFavorite = advertDetails.getIsFavorite();
        AdvertisementVerticalAlias verticalAlias = contactBarDataC != null ? contactBarDataC.getVerticalAlias() : null;
        Double customerValue = contactBarDataC != null ? contactBarDataC.getCustomerValue() : null;
        com.avito.android.advert.advert_details_style.b bVarA = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle);
        if (advertDetails.getMultiItemParams() == null) {
            str2 = "0";
        } else {
            str2 = (advertDetailsMultiItemState != null ? advertDetailsMultiItemState.f85868b : null) == null ? "1" : "2";
        }
        return this.f71168a.g(id2, fVar, isFavorite, verticalAlias, customerValue, (2016 & 32) != 0 ? null : bVarA.f68637f, (2016 & 64) != 0 ? null : bool, (2016 & 128) != 0 ? null : str2, (2016 & 256) != 0 ? null : advertDetailsMultiItemState != null ? advertDetailsMultiItemState.f85870d : null, (2016 & 512) != 0 ? null : this.f71172e.f71334k.f71345c, (2016 & 1024) != 0).z(this.f71170c.a());
    }
}

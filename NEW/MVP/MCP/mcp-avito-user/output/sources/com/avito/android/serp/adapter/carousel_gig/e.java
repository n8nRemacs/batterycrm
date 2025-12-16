package com.avito.android.serp.adapter.carousel_gig;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.GigShiftInfo;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CarouselGigShiftPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_gig/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/carousel_gig/h;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<h, AdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f269096b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f269096b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        GigShiftInfo gigShiftInfo = advertItem.f268437g0;
        if (gigShiftInfo == null) {
            hVar.Sk();
            return;
        }
        hVar.pj();
        hVar.setTitle(advertItem.f268428d);
        List<GigShiftInfo.GigShift> shifts = gigShiftInfo.getShifts();
        hVar.vx(shifts != null ? (GigShiftInfo.GigShift) C42745f0.G(shifts) : null);
        hVar.Cy((shifts == null || shifts.size() < 2) ? null : shifts.get(1));
        hVar.jv(gigShiftInfo.getShiftsDescription());
        GigShiftInfo.Seller seller = gigShiftInfo.getSeller();
        hVar.NN(seller != null ? seller.getLogo() : null);
        GigShiftInfo.Seller seller2 = gigShiftInfo.getSeller();
        hVar.m1(seller2 != null ? seller2.getName() : null);
        GigShiftInfo.Seller seller3 = gigShiftInfo.getSeller();
        hVar.Fm(seller3 != null ? seller3.getLocation() : null);
        GigShiftInfo.Action action = gigShiftInfo.getAction();
        hVar.r1(action != null ? action.getTitle() : null, new c(gigShiftInfo, this));
        GigShiftInfo.Action action2 = gigShiftInfo.getAction();
        hVar.Pf((action2 != null ? action2.getUri() : null) != null ? new d(gigShiftInfo, this) : null);
    }
}

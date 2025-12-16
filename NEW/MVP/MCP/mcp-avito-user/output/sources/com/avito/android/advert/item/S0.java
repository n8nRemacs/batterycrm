package com.avito.android.advert.item;

import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.remote.model.AdvertShortTermRent;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "advertDetailsWithMeta", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<AdvertDetailsWithMeta, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71795l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C28136i0 c28136i0) {
        super(1);
        this.f71795l = c28136i0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(AdvertDetailsWithMeta advertDetailsWithMeta) {
        AdvertShortTermRent shortTermRent = advertDetailsWithMeta.f82645b.getShortTermRent();
        if (shortTermRent != null) {
            ShortTermRentStrButtons shortTermRentStrButtons = new ShortTermRentStrButtons(shortTermRent.getActions(), shortTermRent.getInsights());
            I1 i12 = this.f71795l.f76350h1;
            if (i12 != null) {
                i12.f71714i.W4(shortTermRentStrButtons);
            }
        }
        return kotlin.G0.f406611a;
    }
}

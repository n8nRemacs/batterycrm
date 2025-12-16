package com.avito.android.advert.item.marketplace_sales_banner_out_of_bound;

import Y41.l;
import androidx.camera.camera2.internal.G;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MarketplaceSalesBannerOutOfBoundsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MarketplaceSalesBannerOutOfBoundsItem f77579l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f77580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MarketplaceSalesBannerOutOfBoundsItem marketplaceSalesBannerOutOfBoundsItem, g gVar) {
        super(1);
        this.f77579l = marketplaceSalesBannerOutOfBoundsItem;
        this.f77580m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) throws Throwable {
        int iIntValue = num.intValue();
        V2 v22 = V2.f318762a;
        StringBuilder sbJ = G.j(iIntValue, "No configuration found for bannerWidth = ", ". Available configurations: ");
        sbJ.append(this.f77579l.f77571i);
        v22.m(new IllegalStateException(sbJ.toString()), !this.f77580m.f77582c.l());
        return G0.f406611a;
    }
}

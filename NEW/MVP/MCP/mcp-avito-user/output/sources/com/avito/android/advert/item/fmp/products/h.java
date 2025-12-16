package com.avito.android.advert.item.fmp.products;

import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpProductsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/Tile;", "tile", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/item/fmp/products/Tile;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.l<Tile, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f75615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar) {
        super(1);
        this.f75615l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Tile tile) {
        ArrayList<AnalyticsEvent> arrayList = tile.f75591k;
        if (arrayList != null) {
            for (AnalyticsEvent analyticsEvent : arrayList) {
                d dVar = this.f75615l;
                dVar.f75601g.c(j.a(analyticsEvent));
            }
        }
        return G0.f406611a;
    }
}

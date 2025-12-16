package com.avito.android.advert.item.fmp.products;

import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpProductsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpProductsItem f75612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f75613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem, d dVar) {
        super(0);
        this.f75612l = advertDetailsFmpProductsItem;
        this.f75613m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ArrayList<AnalyticsEvent> arrayList;
        MortgageTile mortgageTile = this.f75612l.f75558c;
        if (mortgageTile != null && (arrayList = mortgageTile.f75581n) != null) {
            for (AnalyticsEvent analyticsEvent : arrayList) {
                this.f75613m.f75601g.c(j.a(analyticsEvent));
            }
        }
        return G0.f406611a;
    }
}

package com.avito.android.advert.item.fmp.products;

import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpProductsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpProductsItem f75610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f75611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem, d dVar) {
        super(0);
        this.f75610l = advertDetailsFmpProductsItem;
        this.f75611m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Z0 z02;
        ArrayList arrayList;
        MortgageTile mortgageTile = this.f75610l.f75558c;
        d dVar = this.f75611m;
        if (mortgageTile != null && (arrayList = mortgageTile.f75580m) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f75601g.c(j.a((AnalyticsEvent) it.next()));
            }
        }
        DeepLink deepLinkC = dVar.f75597c.c(dVar.f75596b);
        if (deepLinkC != null && (z02 = dVar.f75604j) != null) {
            z02.g(null, deepLinkC, null);
        }
        return G0.f406611a;
    }
}

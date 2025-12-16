package com.avito.android.serp.adapter.top_sellers_serp;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.a1;
import com.avito.android.remote.model.swipe_sellers.TopSellerSerp;
import com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list.TopSellerSerpItem;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TopSellersSerpWidgetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/top_sellers_serp/i;", "Lcom/avito/android/serp/adapter/top_sellers_serp/TopSellersSerpWidgetItem;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<i, TopSellersSerpWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f272472b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f272473c;

    /* compiled from: TopSellersSerpWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/e$a;", "", "<init>", "()V", "", "TOP_SELLER_SERP_NAME", "Ljava/lang/String;", "WIDGET_NAME", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar) {
        this.f272472b = interfaceC28373a;
        this.f272473c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        TopSellersSerpWidgetItem topSellersSerpWidgetItem = (TopSellersSerpWidgetItem) aVar;
        iVar.f272481e.setText(topSellersSerpWidgetItem.f272452c);
        List<TopSellerSerp> list = topSellersSerpWidgetItem.f272453d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (TopSellerSerp topSellerSerp : list) {
            arrayList.add(new TopSellerSerpItem("topSellerSerp" + topSellerSerp.getShopId(), topSellerSerp.getShopId(), topSellerSerp.getLogo(), topSellerSerp.getTitle(), topSellerSerp));
        }
        ArrayList arrayList2 = iVar.f272482f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        iVar.f272478b.f338510e = iVar.f272483g;
        iVar.f272479c.notifyDataSetChanged();
        iVar.f272485i = (m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(iVar.f272484h, iVar.f272480d, null, null, null, 30).x(new g(iVar), h.f272477b);
        this.f272472b.c(new a1(this.f272473c.a()));
    }
}

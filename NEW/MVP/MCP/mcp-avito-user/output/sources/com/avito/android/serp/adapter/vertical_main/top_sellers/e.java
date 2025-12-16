package com.avito.android.serp.adapter.vertical_main.top_sellers;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.vertical_main.TopSeller;
import com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.TopSellerItem;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TopSellersWidgetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/i;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/TopSellersWidgetItem;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<i, TopSellersWidgetItem> {

    /* compiled from: TopSellersWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/e$a;", "", "<init>", "()V", "", "TOP_SELLER_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        TopSellersWidgetItem topSellersWidgetItem = (TopSellersWidgetItem) aVar;
        iVar.f273257e.setText(topSellersWidgetItem.f273227c);
        List<TopSeller> list = topSellersWidgetItem.f273228d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (TopSeller topSeller : list) {
            arrayList.add(new TopSellerItem("topSeller" + topSeller.getSellerId(), topSeller.getSellerId(), topSeller.getLogo(), topSeller.getTitle(), i12, topSeller, topSellersWidgetItem.f273229e, topSellersWidgetItem.f273230f));
        }
        ArrayList arrayList2 = iVar.f273258f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        iVar.f273254b.f338510e = iVar.f273259g;
        iVar.f273255c.notifyDataSetChanged();
        iVar.f273261i = (m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(iVar.f273260h, iVar.f273256d, null, null, null, 30).x(new g(iVar), h.f273253b);
    }
}

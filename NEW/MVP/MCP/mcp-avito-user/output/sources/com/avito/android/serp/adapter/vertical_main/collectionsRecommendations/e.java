package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.remote.model.vertical_main.CollectionsRecommendationWidget;
import com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.CollectionsRecommendationItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CollectionsRecommendationWidgetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/g;", "Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/CollectionsRecommendationWidgetItem;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<g, CollectionsRecommendationWidgetItem> {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CollectionsRecommendationWidgetItem collectionsRecommendationWidgetItem = (CollectionsRecommendationWidgetItem) aVar;
        gVar.f272714d.setText(collectionsRecommendationWidgetItem.f272688c);
        List<CollectionsRecommendationWidget.CollectionItem> list = collectionsRecommendationWidgetItem.f272690e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (CollectionsRecommendationWidget.CollectionItem collectionItem : list) {
            arrayList.add(new CollectionsRecommendationItem("collectionsRecommendationsWidget" + collectionItem.getTitle(), i12, collectionItem.getTitle(), collectionItem.getDeepLink(), collectionItem.getImage(), collectionsRecommendationWidgetItem.f272691f));
        }
        ArrayList arrayList2 = gVar.f272716f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        gVar.f272712b.f338510e = gVar.f272717g;
        gVar.f272713c.notifyDataSetChanged();
        CollectionsRecommendationWidget.BadgeInfo badgeInfo = collectionsRecommendationWidgetItem.f272689d;
        int i13 = badgeInfo != null ? 0 : 8;
        Badge badge = gVar.f272715e;
        badge.setVisibility(i13);
        String text = badgeInfo != null ? badgeInfo.getText() : null;
        if (text == null) {
            text = "";
        }
        badge.setTitleText(text);
        g.a aVar2 = com.avito.android.lib.design.badge.g.f178395r;
        Context context = badge.getContext();
        String style = badgeInfo != null ? badgeInfo.getStyle() : null;
        String str = style != null ? style : "";
        aVar2.getClass();
        badge.setStyle(g.a.b(com.avito.android.lib.util.f.a(context, str), context));
    }
}

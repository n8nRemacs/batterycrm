package com.avito.android.serp.adapter.model_card;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.model_card_entry.ModelCardEntryWidgetEntity;
import com.avito.android.serp.adapter.model_card.item.ModelCardWidgetItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ModelCardWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/d;", "Lcom/avito/android/serp/adapter/model_card/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.serp.adapter.model_card.c
    @Y61.k
    public final ModelCardWidget a(@Y61.k ModelCardEntryWidgetEntity modelCardEntryWidgetEntity) {
        String title = modelCardEntryWidgetEntity.getTitle();
        String str = title == null ? "" : title;
        String subtitle = modelCardEntryWidgetEntity.getSubtitle();
        ModelCardEntryWidgetEntity.Action action = modelCardEntryWidgetEntity.getAction();
        ArrayList arrayList = null;
        DeepLink deepLink = action != null ? action.getDeepLink() : null;
        List<ModelCardEntryWidgetEntity.Item> items = modelCardEntryWidgetEntity.getItems();
        if (items != null) {
            List<ModelCardEntryWidgetEntity.Item> list = items;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (ModelCardEntryWidgetEntity.Item item : list) {
                String title2 = item.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                String subtitle2 = item.getSubtitle();
                if (subtitle2 == null) {
                    subtitle2 = "";
                }
                ModelCardEntryWidgetEntity.Action action2 = item.getAction();
                arrayList2.add(new ModelCardWidgetItem(action2 != null ? action2.getDeepLink() : null, item.getImage(), title2, subtitle2));
            }
            arrayList = arrayList2;
        }
        return new ModelCardWidget(null, str, subtitle, deepLink, arrayList == null ? C42784z0.f406748b : arrayList, modelCardEntryWidgetEntity.getAnalytics(), modelCardEntryWidgetEntity.getSettings(), 1, null);
    }
}

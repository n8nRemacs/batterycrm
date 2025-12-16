package com.avito.android.serp.adapter.mini_menu;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.services_menu_widget.ServicesMenuWidget;
import com.avito.android.remote.model.services_menu_widget.ServicesMenuWidgetItem;
import com.avito.android.serp.adapter.mini_menu.item.Badge;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesMenuWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/s;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {
    @Inject
    public s() {
    }

    @Y61.k
    public static MiniMenuBlockItem a(@Y61.k ServicesMenuWidget servicesMenuWidget) {
        List<ServicesMenuWidgetItem> items = servicesMenuWidget.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ServicesMenuWidgetItem servicesMenuWidgetItem = (ServicesMenuWidgetItem) obj;
            arrayList.add(new MiniMenuItem(AK.c.g(i12, "ServicesMenuItem_"), servicesMenuWidgetItem.getTitle(), servicesMenuWidgetItem.getAction().getUri(), new Badge.ImageBadge(servicesMenuWidgetItem.getImage()), null, false, 32, null));
            i12 = i13;
        }
        return new MiniMenuBlockItem("ServicesMenu", arrayList, y6.b(2), y6.b(12), y6.b(6), servicesMenuWidget.getAnalytics(), servicesMenuWidget.getSettings());
    }
}

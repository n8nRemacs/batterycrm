package com.avito.android.serp.adapter.images_and_links_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details.model.images_with_links.ImageWithLinkElement;
import com.avito.android.serp.adapter.images_and_links_item.item.ImageWithLinkItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesWithLinksItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/e;", "Lcom/avito/android/serp/adapter/images_and_links_item/d;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.d
    @Y61.k
    public final ArrayList a(@Y61.k List list, boolean z12) {
        ArrayList arrayList = new ArrayList();
        List<ImageWithLinkElement> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (ImageWithLinkElement imageWithLinkElement : list2) {
            String str = null;
            arrayList.add(new ImageWithLinkItem(str, imageWithLinkElement.getImage(), imageWithLinkElement.getDeepLink(), imageWithLinkElement.getTitle(), z12, 1, null));
            arrayList2.add(G0.f406611a);
        }
        return arrayList;
    }
}

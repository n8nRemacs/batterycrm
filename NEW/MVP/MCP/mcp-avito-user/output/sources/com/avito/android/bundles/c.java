package com.avito.android.bundles;

import Dk.g;
import Dk.h;
import Y61.k;
import com.avito.android.bundles.vas_union.item.header.VasBundlesHeaderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VasBundlesConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bundles/c;", "Lcom/avito/android/bundles/b;", "<init>", "()V", "a", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* compiled from: VasBundlesConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/bundles/c$a;", "", "<init>", "()V", "", "ID_BANNER", "Ljava/lang/String;", "ID_EMPTY_ACTION", "ID_TITLE", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public c() {
    }

    @Override // com.avito.android.bundles.b
    @k
    public final f a(@k h hVar) {
        Action emptyAction;
        String title;
        String subtitle;
        ArrayList arrayList = new ArrayList();
        Dk.c topBanner = hVar.getTopBanner();
        if (topBanner != null && (((title = topBanner.getTitle()) != null && title.length() != 0) || ((subtitle = topBanner.getSubtitle()) != null && subtitle.length() != 0))) {
            arrayList.add(new com.avito.android.bundles.ui.recycler.item.banner.a(topBanner.getTitle(), topBanner.getSubtitle()));
        }
        arrayList.add(new VasBundlesHeaderItem("vas_bundle_id_title", hVar.getTitle(), hVar.getDescription()));
        List<g> listC = hVar.c();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
        for (g gVar : listC) {
            String id2 = gVar.getId();
            UniversalImage image = gVar.getImage();
            Dk.e discount = gVar.getDiscount();
            String title2 = gVar.getTitle();
            List<Dk.d> listB = gVar.b();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, i12));
            for (Dk.d dVar : listB) {
                arrayList3.add(new com.avito.android.bundles.ui.recycler.item.benefit.h(dVar.getText(), dVar.getIcon(), dVar.getText(), dVar.getBadge(), dVar.getDeepLink()));
            }
            AttributedText price = gVar.getPrice();
            AttributedText oldPrice = gVar.getOldPrice();
            AttributedText priceHint = gVar.getPriceHint();
            String title3 = gVar.getAction().getTitle();
            DeepLink deepLink = gVar.getAction().getDeepLink();
            Boolean isActionButtonHidden = gVar.getIsActionButtonHidden();
            arrayList2.add(new com.avito.android.bundles.ui.recycler.item.bundle.c(id2, image, discount, title2, arrayList3, price, oldPrice, priceHint, title3, deepLink, isActionButtonHidden != null ? isActionButtonHidden.booleanValue() : false));
            i12 = 10;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add((TV0.a) it.next());
        }
        if (L.f(hVar.getIsEmptyActionFloating(), Boolean.TRUE)) {
            emptyAction = hVar.getEmptyAction();
        } else {
            Action emptyAction2 = hVar.getEmptyAction();
            com.avito.android.bundles.ui.recycler.item.skip_button.a aVar = emptyAction2 != null ? new com.avito.android.bundles.ui.recycler.item.skip_button.a(emptyAction2) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
            emptyAction = null;
        }
        return new f(arrayList, emptyAction);
    }
}

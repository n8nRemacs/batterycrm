package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.Icons;
import com.avito.android.remote.fmp.Margin;
import com.avito.android.remote.fmp.Padding;
import com.avito.android.remote.fmp.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.IconBackground;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsFmpProductsItemFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class J1 {
    public static final ArrayList a(List list) {
        List<FmpAnalyticsEvent> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (FmpAnalyticsEvent fmpAnalyticsEvent : list2) {
            arrayList.add(new AnalyticsEvent(fmpAnalyticsEvent.getId(), fmpAnalyticsEvent.getParams(), fmpAnalyticsEvent.getVersion(), fmpAnalyticsEvent.getHasSensitiveData()));
        }
        return arrayList;
    }

    public static final Icons b(com.avito.android.remote.model.fmp.util.Icons icons) {
        if (icons == null) {
            return null;
        }
        String textImage = icons.getTextImage();
        UniversalImage universalImage = icons.getUniversalImage();
        List<UniversalImage> overlaidImagesUrls = icons.getOverlaidImagesUrls();
        IconBackground background = icons.getBackground();
        return new Icons(textImage, universalImage, overlaidImagesUrls, background != null ? new com.avito.android.remote.fmp.IconBackground(background.getColor(), background.getCornerRadius()) : null, e(icons.getSize()));
    }

    public static final Margin c(com.avito.android.remote.model.fmp.util.Margin margin) {
        if (margin == null) {
            return null;
        }
        Integer top = margin.getTop();
        Integer numValueOf = Integer.valueOf(top != null ? top.intValue() : 0);
        Integer bottom = margin.getBottom();
        Integer numValueOf2 = Integer.valueOf(bottom != null ? bottom.intValue() : 0);
        Integer left = margin.getLeft();
        Integer numValueOf3 = Integer.valueOf(left != null ? left.intValue() : 0);
        Integer right = margin.getRight();
        return new Margin(numValueOf, numValueOf2, numValueOf3, Integer.valueOf(right != null ? right.intValue() : 0));
    }

    public static final Padding d(com.avito.android.remote.model.fmp.util.Padding padding) {
        if (padding == null) {
            return null;
        }
        Integer top = padding.getTop();
        Integer numValueOf = Integer.valueOf(top != null ? top.intValue() : 0);
        Integer bottom = padding.getBottom();
        Integer numValueOf2 = Integer.valueOf(bottom != null ? bottom.intValue() : 0);
        Integer left = padding.getLeft();
        Integer numValueOf3 = Integer.valueOf(left != null ? left.intValue() : 0);
        Integer right = padding.getRight();
        return new Padding(numValueOf, numValueOf2, numValueOf3, Integer.valueOf(right != null ? right.intValue() : 0));
    }

    public static final Size e(com.avito.android.remote.model.fmp.util.Size size) {
        if (size != null) {
            return new Size(size.getWidth(), size.getHeight());
        }
        return null;
    }
}

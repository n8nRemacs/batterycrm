package com.avito.android.advert.item.fair_price.converter;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FairPriceConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fair_price/converter/b;", "Lcom/avito/android/advert/item/fair_price/converter/a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // com.avito.android.advert.item.fair_price.converter.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel a(@Y61.k com.avito.android.remote.model.AdvertDetailsFairPrice r9, @Y61.l java.lang.String r10) {
        /*
            r8 = this;
            com.avito.android.remote.model.AdvertDetailsFairPrice$Explanation r0 = r9.getExplanation()
            r1 = 0
            if (r0 == 0) goto La4
            com.avito.android.remote.model.AdvertDetailsFairPrice$Icon r0 = r9.getIcon()
            if (r0 == 0) goto La4
            java.lang.String r0 = r9.getLinkText()
            if (r0 == 0) goto La4
            if (r10 != 0) goto L17
            goto La4
        L17:
            com.avito.android.remote.model.AdvertDetailsFairPrice$Icon r0 = r9.getIcon()
            com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Icon r2 = new com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Icon
            java.lang.String r3 = r0.getColor()
            if (r3 == 0) goto L32
            java.lang.String r3 = r0.getColor()
            java.lang.Integer r3 = com.avito.android.lib.util.e.a(r3)
            if (r3 == 0) goto L32
            int r3 = r3.intValue()
            goto L35
        L32:
            r3 = 2130971367(0x7f040ae7, float:1.755147E38)
        L35:
            java.lang.String r4 = r0.getName()
            if (r4 == 0) goto L4a
            java.lang.String r0 = r0.getName()
            java.lang.Integer r0 = com.avito.android.lib.util.q.a(r0)
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            goto L4d
        L4a:
            r0 = 2130972016(0x7f040d70, float:1.7552787E38)
        L4d:
            r2.<init>(r3, r0)
            com.avito.android.remote.model.AdvertDetailsFairPrice$Explanation r0 = r9.getExplanation()
            java.util.List r3 = r0.getTexts()
            if (r3 != 0) goto L5c
        L5a:
            r0 = r1
            goto L98
        L5c:
            java.lang.String r4 = r0.getTitle()
            if (r4 != 0) goto L63
            goto L5a
        L63:
            com.avito.android.remote.model.AdvertDetailsFairPrice$Explanation$ActionButton r0 = r0.getButton()
            if (r0 != 0) goto L6a
            goto L5a
        L6a:
            com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Explanation$ActionButton r5 = new com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Explanation$ActionButton
            java.lang.String r6 = r0.getStyle()
            if (r6 == 0) goto L7b
            java.lang.String r6 = r0.getStyle()
            int r6 = com.avito.android.lib.util.f.d(r6)
            goto L7e
        L7b:
            r6 = 2130969517(0x7f0403ad, float:1.7547718E38)
        L7e:
            java.lang.String r7 = r0.getText()
            if (r7 != 0) goto L86
        L84:
            r5 = r1
            goto L90
        L86:
            com.avito.android.deep_linking.links.DeepLink r0 = r0.getButtonUri()
            if (r0 != 0) goto L8d
            goto L84
        L8d:
            r5.<init>(r6, r0, r7)
        L90:
            if (r5 != 0) goto L93
            goto L5a
        L93:
            com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Explanation r0 = new com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel$Explanation
            r0.<init>(r5, r3, r4)
        L98:
            if (r0 != 0) goto L9b
            return r1
        L9b:
            com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel r1 = new com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel
            java.lang.String r9 = r9.getLinkText()
            r1.<init>(r10, r9, r2, r0)
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.fair_price.converter.b.a(com.avito.android.remote.model.AdvertDetailsFairPrice, java.lang.String):com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel");
    }
}

package com.avito.android.auto_reseller_contacts.deepLink;

import We.w;
import android.net.Uri;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35837l2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: RequestMessageLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-reseller-contacts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n {
    public static final Image a(Map<String, String> map) {
        Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(C35837l2.b((String) entry.getKey()), Uri.parse((String) entry.getValue()));
        }
        return new Image(C35755b0.b(linkedHashMap));
    }

    public static final ReEarlyAccessData.Package b(We.v vVar) {
        String title;
        w analyticsInfo = vVar.getAnalyticsInfo();
        ReEarlyAccessData.Package.AnalyticsData analyticsData = analyticsInfo != null ? new ReEarlyAccessData.Package.AnalyticsData(analyticsInfo.getSelect(), analyticsInfo.getPurchase()) : null;
        String title2 = vVar.getTitle();
        String price = vVar.getPrice();
        int contactsCount = (int) vVar.getContactsCount();
        String pricePerContact = vVar.getPricePerContact();
        String oldPrice = vVar.getOldPrice();
        String discountAmount = vVar.getDiscountAmount();
        Long id2 = vVar.getId();
        if (id2 == null || (title = id2.toString()) == null) {
            title = vVar.getTitle();
        }
        return new ReEarlyAccessData.Package(title2, price, contactsCount, pricePerContact, oldPrice, discountAmount, title, vVar.getDescription(), vVar.getButtonLabel(), analyticsData);
    }
}

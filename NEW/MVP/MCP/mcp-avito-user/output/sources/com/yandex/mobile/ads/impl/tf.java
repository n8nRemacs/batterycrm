package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class tf {
    public static void a(@j.N w90 w90Var, @j.N BiddingSettings biddingSettings) {
        List<AdUnitIdBiddingSettings> listC = biddingSettings.c();
        HashSet hashSet = new HashSet(listC.size());
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : listC) {
            String strC = adUnitIdBiddingSettings.c();
            String strE = adUnitIdBiddingSettings.e();
            hashSet.add(strC);
            w90Var.putString("BiddingSettingsAdUnitIdsInfo_" + strC, strE);
        }
        for (String str : w90Var.a(Collections.emptySet())) {
            if (!hashSet.contains(str)) {
                w90Var.remove("BiddingSettingsAdUnitIdsInfo_" + str);
            }
        }
        w90Var.a(hashSet);
    }

    public static void b(@j.N w90 w90Var) {
        Iterator it = w90Var.a(Collections.emptySet()).iterator();
        while (it.hasNext()) {
            w90Var.remove("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
        }
        w90Var.remove("BiddingSettingsAdUnitIdsSet");
    }

    @j.P
    public static BiddingSettings a(@j.N w90 w90Var) {
        Set setA = w90Var.a(Collections.emptySet());
        if (!setA.isEmpty()) {
            sf sfVar = new sf();
            ArrayList arrayList = new ArrayList(setA.size());
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String strB = w90Var.b("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
                if (strB != null && !strB.isEmpty()) {
                    try {
                        AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = sfVar.a(new JSONObject(strB));
                        if (adUnitIdBiddingSettingsA != null) {
                            arrayList.add(adUnitIdBiddingSettingsA);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new BiddingSettings(arrayList);
            }
        }
        return null;
    }
}

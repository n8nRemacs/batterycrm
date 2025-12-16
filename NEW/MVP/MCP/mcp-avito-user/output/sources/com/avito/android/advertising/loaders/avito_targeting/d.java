package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AvitoBannerConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {
    public static final ArrayList a(String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(e((String) it.next(), str));
        }
        return arrayList;
    }

    @Y61.l
    public static final Float b(@Y61.k AvitoNetworkBannerRaw.Outclick outclick, @Y61.k String str) {
        Map<String, Object> content = outclick.getContent();
        Object obj = content != null ? content.get(str) : null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return C43066x.x0((String) obj);
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        return null;
    }

    @Y61.l
    public static final String c(@Y61.k AvitoNetworkBannerRaw.Outclick outclick, @Y61.k String str) {
        Map<String, Object> content = outclick.getContent();
        Object obj = content != null ? content.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    @Y61.k
    public static final AvitoNetworkBanner.AnalyticsParams d(@Y61.k AvitoNetworkBannerRaw.Outclick.Props props) {
        String strValueOf = String.valueOf(props.getCreativeId());
        String strValueOf2 = String.valueOf(props.getCampaignId());
        Integer templateId = props.getTemplateId();
        return new AvitoNetworkBanner.AnalyticsParams(strValueOf, strValueOf2, templateId != null ? templateId.toString() : null, props.getImpressionId(), props.getClickId(), props.isClickIn(), props.getFullviewId());
    }

    public static final String e(String str, String str2) {
        return C43066x.a0(C43066x.a0(str, "{idfa}", str2, false), "%7Bidfa%7D", str2, false);
    }
}

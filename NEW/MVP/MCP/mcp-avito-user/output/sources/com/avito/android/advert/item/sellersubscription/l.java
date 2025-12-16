package com.avito.android.advert.item.sellersubscription;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.remote.Q;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.util.A4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import qb.InterfaceC47368a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79754f;

    public /* synthetic */ l(Object obj, Object obj2, String str, boolean z12, int i12) {
        this.f79750b = i12;
        this.f79753e = obj;
        this.f79754f = obj2;
        this.f79751c = str;
        this.f79752d = z12;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f79750b) {
            case 0:
                n nVar = (n) this.f79753e;
                Q q12 = nVar.f79756a.get();
                SubscriptionSource subscriptionSource = (SubscriptionSource) this.f79754f;
                return q12.d(subscriptionSource != null ? subscriptionSource.f90042b : nVar.f79761f, this.f79751c, this.f79752d);
            default:
                InterfaceC47368a interfaceC47368a = ((com.avito.android.advertising.loaders.avito_targeting.i) this.f79753e).f88035a.get();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AvitoNetworkBannerItem avitoNetworkBannerItem = (AvitoNetworkBannerItem) this.f79754f;
                String creativeId = avitoNetworkBannerItem.getCreativeId();
                if (creativeId != null) {
                    linkedHashMap.put("creativeId", creativeId);
                }
                String bannerCode = avitoNetworkBannerItem.getBannerCode();
                if (bannerCode != null) {
                    linkedHashMap.put("bannerCode", bannerCode);
                }
                String alid = avitoNetworkBannerItem.getAlid();
                if (alid != null) {
                    linkedHashMap.put("alid", alid);
                }
                String str = this.f79751c;
                if (str != null) {
                    linkedHashMap.put("idfa", str);
                }
                if (this.f79752d) {
                    linkedHashMap.put("withTemplate", Boolean.FALSE);
                }
                Map<String, Object> params = avitoNetworkBannerItem.getParams();
                if (params != null) {
                    for (Map.Entry<String, Object> entry : params.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof List) {
                            Iterable iterable = (Iterable) value;
                            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList.add(String.valueOf(it.next()));
                            }
                            A4.f318516a.getClass();
                            linkedHashMap.putAll(A4.f(key, arrayList));
                        } else {
                            linkedHashMap.put(key, value);
                        }
                    }
                }
                return interfaceC47368a.b(linkedHashMap);
        }
    }
}

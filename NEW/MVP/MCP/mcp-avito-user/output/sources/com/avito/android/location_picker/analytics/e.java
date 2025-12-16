package com.avito.android.location_picker.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LocationPickerScreenCloseEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/analytics/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<String> f182215b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f182216c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f182217d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<String> f182218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f182219f;

    public e(@k String str, int i12, @l String str2, @l String str3, @l List<String> list, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l Long l12) {
        this.f182215b = list;
        this.f182216c = list2;
        this.f182217d = list3;
        this.f182218e = list4;
        HashMap mapE = P0.e(new Q("from_page", "radius_small"), new Q("geo_session", str), new Q("from_block", Integer.valueOf(i12)));
        if (str2 != null) {
            mapE.put("cid", str2);
        }
        if (str3 != null) {
            mapE.put("lid", str3);
        }
        if (l12 != null) {
            mapE.put("srd", Long.valueOf(l12.longValue()));
        }
        if (list4 != null) {
            mapE.put("geo", list4);
        }
        if (list != null && !list.isEmpty()) {
            mapE.put("did", list);
        }
        if (list3 != null && !list3.isEmpty()) {
            mapE.put("roads", list3);
        }
        if (list2 != null && !list2.isEmpty()) {
            mapE.put(MetroParameter.TYPE, list2);
        }
        G0 g02 = G0.f406611a;
        this.f182219f = new ParametrizedClickStreamEvent(3378, 7, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f182219f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f182219f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f182219f.f90248c;
    }

    public /* synthetic */ e(String str, int i12, String str2, String str3, List list, List list2, List list3, List list4, Long l12, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : list, (i13 & 32) != 0 ? null : list2, (i13 & 64) != 0 ? null : list3, (i13 & 128) != 0 ? null : list4, (i13 & 256) != 0 ? null : l12);
    }
}

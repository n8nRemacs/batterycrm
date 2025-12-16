package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.O2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShowShortcutsEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/b1;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b1 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90024b;

    public b1() {
        throw null;
    }

    public b1(String str, List list, List list2, List list3, String str2, String str3, String str4, Long l12, Long l13, String str5, String str6, String str7, int i12, C42822w c42822w) {
        List list4 = (i12 & 2) != 0 ? C42784z0.f406748b : list;
        List list5 = (i12 & 4) != 0 ? C42784z0.f406748b : list2;
        List list6 = (i12 & 8) != 0 ? null : list3;
        String str8 = (i12 & 16) != 0 ? null : str2;
        String str9 = (i12 & 32) != 0 ? null : str3;
        String str10 = (i12 & 64) != 0 ? null : str4;
        Long l14 = (i12 & 128) != 0 ? null : l12;
        Long l15 = (i12 & 256) != 0 ? null : l13;
        String str11 = (i12 & 512) != 0 ? null : str5;
        String str12 = (i12 & 1024) != 0 ? null : str6;
        String str13 = (i12 & 2048) == 0 ? str7 : null;
        LinkedHashMap linkedHashMapW = AK.c.w("fromPage", str);
        if (!O2.a(list6)) {
            linkedHashMapW.put("shortcut_description", C42745f0.O(list4, ", ", null, null, null, 62) + " | " + C42745f0.O(list5, ", ", null, null, null, 62));
        } else if (list6 != null) {
        }
        if (str8 != null) {
        }
        if (str9 != null) {
        }
        if (str10 != null) {
        }
        if (l14 != null) {
        }
        if (l15 != null) {
        }
        if (str11 != null) {
        }
        if (str12 != null) {
        }
        if (str13 != null) {
            linkedHashMapW.put("from_block", str13);
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f90024b = new ParametrizedClickStreamEvent(9025, 4, linkedHashMapW, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f90024b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90024b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f90024b.f90248c;
    }
}

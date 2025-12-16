package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.util.C35755b0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: ClickShortcutTreeEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/z;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28452z implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90151b;

    public C28452z() {
        throw null;
    }

    public C28452z(String str, List list, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, String str6, Long l12, Long l13, String str7, String str8, String str9, int i12, C42822w c42822w) {
        Object string;
        String str10 = (i12 & 1) != 0 ? null : str;
        List list2 = (i12 & 2) != 0 ? null : list;
        Integer num4 = (i12 & 32) != 0 ? null : num;
        Integer num5 = (i12 & 64) != 0 ? null : num2;
        Integer num6 = (i12 & 128) != 0 ? null : num3;
        String str11 = (i12 & 256) != 0 ? null : str5;
        String str12 = (i12 & 512) != 0 ? null : str6;
        Long l14 = (i12 & 1024) != 0 ? null : l12;
        Long l15 = (i12 & 2048) != 0 ? null : l13;
        String str13 = (i12 & 4096) != 0 ? null : str7;
        String str14 = (i12 & 8192) == 0 ? str8 : null;
        String str15 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "0" : str9;
        kotlin.Q q12 = new kotlin.Q("serpdisplay_type", str10);
        kotlin.Q q13 = new kotlin.Q("search_area", list2);
        kotlin.Q q14 = new kotlin.Q("shortcut_description", str2);
        Integer num7 = num6;
        kotlin.Q q15 = new kotlin.Q("cid", str3);
        kotlin.Q q16 = new kotlin.Q("from_page", str4);
        if (num4 == null || num5 == null) {
            string = num7;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num4);
            sb2.append(num5);
            string = sb2.toString();
        }
        this.f90151b = new ParametrizedClickStreamEvent(2664, 13, C35755b0.c(kotlin.collections.P0.g(q12, q13, q14, q15, q16, new kotlin.Q("position", string), new kotlin.Q("q", str11), new kotlin.Q("pmin", l14), new kotlin.Q("pmax", l15), new kotlin.Q("mcid", str12), new kotlin.Q(NotificationOpenAtTab.TAB, str13), new kotlin.Q("isDelivery", str14), new kotlin.Q("fromBlock", str15))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90151b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90151b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90151b.f90248c;
    }
}

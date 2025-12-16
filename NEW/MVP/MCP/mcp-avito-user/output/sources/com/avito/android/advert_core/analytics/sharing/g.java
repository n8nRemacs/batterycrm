package com.avito.android.advert_core.analytics.sharing;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http.StatusLine;

/* compiled from: ItemSharingEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/analytics/sharing/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f82865e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f82866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82867c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f82868d;

    /* compiled from: ItemSharingEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/analytics/sharing/g$a;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, int i12, String str6, String str7, Boolean bool, C42822w c42822w) {
        this(str, str2, str3, str4, str5, i12, str6, str7, bool);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF82866b() {
        return this.f82866b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f82868d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF82867c() {
        return this.f82867c;
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, int i12, String str6, String str7, Boolean bool, int i13, C42822w c42822w) {
        this(str, str2, str3, str4, str5, i12, str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : bool);
    }

    public g(String str, String str2, String str3, String str4, String str5, int i12, String str6, String str7, Boolean bool) {
        this.f82866b = StatusLine.HTTP_PERM_REDIRECT;
        this.f82867c = 12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f82868d = linkedHashMap;
        linkedHashMap.put("iid", str);
        linkedHashMap.put("oid", str5);
        linkedHashMap.put("snid", Integer.valueOf(i12));
        linkedHashMap.put("pagetype", str6);
        if (str4 != null) {
            linkedHashMap.put("lid", str4);
        }
        if (str2 != null) {
            linkedHashMap.put("cid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("mcid", str3);
        }
        if (bool != null) {
            linkedHashMap.put("is_auth", bool);
        }
        if (str7 != null) {
            linkedHashMap.put("x", str7);
        }
    }

    public g(String str, String str2, C42822w c42822w) {
        this.f82866b = StatusLine.HTTP_PERM_REDIRECT;
        this.f82867c = 12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f82868d = linkedHashMap;
        linkedHashMap.put("RealtyDevelopment_id", str);
        linkedHashMap.put("cid", 24);
        linkedHashMap.put("mcid", 4918);
        linkedHashMap.put("pagetype", "share button");
        if (str2 != null) {
            linkedHashMap.put("lid", str2);
        }
    }
}

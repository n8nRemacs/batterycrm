package com.avito.android.advertising.analytics.events;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.analytics.clickstream.C28376a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BannerEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/analytics/events/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Type", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BannerInfo f87763b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BannerPageSource f87764c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f87765d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f87766e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Type f87767f;

    /* renamed from: g, reason: collision with root package name */
    public final long f87768g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87769h;

    /* renamed from: i, reason: collision with root package name */
    public final int f87770i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C28376a f87771j = new C28376a();

    /* renamed from: k, reason: collision with root package name */
    public final int f87772k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/analytics/events/BannerEvent$Type;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f87773b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f87774c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f87775d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f87776e;

        static {
            Type type = new Type("DEFAULT", 0);
            f87773b = type;
            Type type2 = new Type("CREDIT", 1);
            f87774c = type2;
            Type[] typeArr = {type, type2};
            f87775d = typeArr;
            f87776e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f87775d.clone();
        }
    }

    public BannerEvent(@k BannerInfo bannerInfo, @k BannerPageSource bannerPageSource, @l String str, @l Integer num, @k Type type, long j12, int i12, int i13) {
        this.f87763b = bannerInfo;
        this.f87764c = bannerPageSource;
        this.f87765d = str;
        this.f87766e = num;
        this.f87767f = type;
        this.f87768g = j12;
        this.f87769h = i12;
        this.f87770i = i13;
        this.f87772k = bannerInfo.f87886q + 1;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF87769h() {
        return this.f87769h;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k(linkedHashMap, "pagetype", this.f87764c.f87786b);
        k(linkedHashMap, "from_block", Integer.valueOf(this.f87767f.ordinal()));
        k(linkedHashMap, "user_key", this.f87765d);
        Integer num = this.f87766e;
        k(linkedHashMap, "item_position", num != null ? Integer.valueOf(num.intValue() + 1) : null);
        BannerInfo bannerInfo = this.f87763b;
        long j12 = bannerInfo.f87885p;
        if (j12 != 0) {
            k(linkedHashMap, "page_cdtm", this.f87771j.a(this.f87768g - j12, TimeUnit.MILLISECONDS));
        }
        linkedHashMap.putAll(bannerInfo.g());
        i(linkedHashMap);
        return linkedHashMap;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF87770i() {
        return this.f87770i;
    }

    public final void j(@k LinkedHashMap linkedHashMap, @k LinkedHashMap linkedHashMap2) {
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            k(linkedHashMap, (String) entry.getKey(), entry.getValue());
        }
    }

    public final void k(@k LinkedHashMap linkedHashMap, @k String str, @l Object obj) {
        if (obj != null) {
            linkedHashMap.put(str, obj);
        }
    }

    public void i(@k LinkedHashMap linkedHashMap) {
    }
}

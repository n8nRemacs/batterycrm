package com.avito.android.bxcontent.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BxContentShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/BxContentShowEventType;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BxContentShowEventType {

    /* renamed from: c, reason: collision with root package name */
    public static final BxContentShowEventType f109450c;

    /* renamed from: d, reason: collision with root package name */
    public static final BxContentShowEventType f109451d;

    /* renamed from: e, reason: collision with root package name */
    public static final BxContentShowEventType f109452e;

    /* renamed from: f, reason: collision with root package name */
    public static final BxContentShowEventType f109453f;

    /* renamed from: g, reason: collision with root package name */
    public static final BxContentShowEventType f109454g;

    /* renamed from: h, reason: collision with root package name */
    public static final BxContentShowEventType f109455h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ BxContentShowEventType[] f109456i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f109457j;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f109458b;

    static {
        BxContentShowEventType bxContentShowEventType = new BxContentShowEventType("MAIN", 0, "main");
        f109450c = bxContentShowEventType;
        BxContentShowEventType bxContentShowEventType2 = new BxContentShowEventType("VERTICAL_MAIN", 1, "vertical_main");
        f109451d = bxContentShowEventType2;
        BxContentShowEventType bxContentShowEventType3 = new BxContentShowEventType("CROSS_VERTICAL_MAIN", 2, "cross_vertical");
        f109452e = bxContentShowEventType3;
        BxContentShowEventType bxContentShowEventType4 = new BxContentShowEventType("PUSH", 3, "landing");
        f109453f = bxContentShowEventType4;
        BxContentShowEventType bxContentShowEventType5 = new BxContentShowEventType("SERP", 4, "serp");
        f109454g = bxContentShowEventType5;
        BxContentShowEventType bxContentShowEventType6 = new BxContentShowEventType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        f109455h = bxContentShowEventType6;
        BxContentShowEventType[] bxContentShowEventTypeArr = {bxContentShowEventType, bxContentShowEventType2, bxContentShowEventType3, bxContentShowEventType4, bxContentShowEventType5, bxContentShowEventType6};
        f109456i = bxContentShowEventTypeArr;
        f109457j = kotlin.enums.c.a(bxContentShowEventTypeArr);
    }

    public BxContentShowEventType(String str, int i12, String str2) {
        this.f109458b = str2;
    }

    public static BxContentShowEventType valueOf(String str) {
        return (BxContentShowEventType) Enum.valueOf(BxContentShowEventType.class, str);
    }

    public static BxContentShowEventType[] values() {
        return (BxContentShowEventType[]) f109456i.clone();
    }
}

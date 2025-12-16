package com.avito.android.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkTypeProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/NetworkType;", "", "_common_network-type_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NetworkType {

    /* renamed from: d, reason: collision with root package name */
    public static final NetworkType f89666d;

    /* renamed from: e, reason: collision with root package name */
    public static final NetworkType f89667e;

    /* renamed from: f, reason: collision with root package name */
    public static final NetworkType f89668f;

    /* renamed from: g, reason: collision with root package name */
    public static final NetworkType f89669g;

    /* renamed from: h, reason: collision with root package name */
    public static final NetworkType f89670h;

    /* renamed from: i, reason: collision with root package name */
    public static final NetworkType f89671i;

    /* renamed from: j, reason: collision with root package name */
    public static final NetworkType f89672j;

    /* renamed from: k, reason: collision with root package name */
    public static final NetworkType f89673k;

    /* renamed from: l, reason: collision with root package name */
    public static final NetworkType f89674l;

    /* renamed from: m, reason: collision with root package name */
    public static final NetworkType f89675m;

    /* renamed from: n, reason: collision with root package name */
    public static final NetworkType f89676n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f89677o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89678p;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f89679b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89680c;

    static {
        NetworkType networkType = new NetworkType(0, "CLASS_NONE", "NONE", false);
        f89666d = networkType;
        NetworkType networkType2 = new NetworkType(1, "CLASS_GPRS", "GPRS", true);
        f89667e = networkType2;
        NetworkType networkType3 = new NetworkType(2, "CLASS_2G", "2G", true);
        f89668f = networkType3;
        NetworkType networkType4 = new NetworkType(3, "CLASS_2G_PLUS", "2G_plus", true);
        f89669g = networkType4;
        NetworkType networkType5 = new NetworkType(4, "CLASS_3G", "3G", true);
        f89670h = networkType5;
        NetworkType networkType6 = new NetworkType(5, "CLASS_3G_PLUS", "3G_plus", true);
        f89671i = networkType6;
        NetworkType networkType7 = new NetworkType(6, "CLASS_4G", "4G", true);
        f89672j = networkType7;
        NetworkType networkType8 = new NetworkType(7, "CLASS_5G", "5G", true);
        f89673k = networkType8;
        NetworkType networkType9 = new NetworkType(8, "CLASS_WIFI", "Wi-Fi", false);
        f89674l = networkType9;
        NetworkType networkType10 = new NetworkType(9, "CLASS_CELLULAR_UNKNOWN", "CELLULAR_UNKNOWN", true);
        f89675m = networkType10;
        NetworkType networkType11 = new NetworkType(10, "CLASS_UNKNOWN", GrsBaseInfo.CountryCodeSource.UNKNOWN, false);
        f89676n = networkType11;
        NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7, networkType8, networkType9, networkType10, networkType11};
        f89677o = networkTypeArr;
        f89678p = kotlin.enums.c.a(networkTypeArr);
    }

    public NetworkType(int i12, String str, String str2, boolean z12) {
        this.f89679b = str2;
        this.f89680c = z12;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f89677o.clone();
    }
}

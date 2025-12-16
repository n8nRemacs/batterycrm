package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlertBannerInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/BannerType;", "", "(Ljava/lang/String;I)V", "ALERT_TYPE_HAS_PROBLEM", "ALERT_TYPE_NO_SALES", "ALERT_TYPE_HIGH_TRAFFIC", "ALERT_TYPE_HOUSEHOLDS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BannerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BannerType[] $VALUES;

    @c("hasProblem")
    public static final BannerType ALERT_TYPE_HAS_PROBLEM = new BannerType("ALERT_TYPE_HAS_PROBLEM", 0);

    @c("salesNotLaunched")
    public static final BannerType ALERT_TYPE_NO_SALES = new BannerType("ALERT_TYPE_NO_SALES", 1);

    @c("highTraffic")
    public static final BannerType ALERT_TYPE_HIGH_TRAFFIC = new BannerType("ALERT_TYPE_HIGH_TRAFFIC", 2);

    @c("households")
    public static final BannerType ALERT_TYPE_HOUSEHOLDS = new BannerType("ALERT_TYPE_HOUSEHOLDS", 3);

    private static final /* synthetic */ BannerType[] $values() {
        return new BannerType[]{ALERT_TYPE_HAS_PROBLEM, ALERT_TYPE_NO_SALES, ALERT_TYPE_HIGH_TRAFFIC, ALERT_TYPE_HOUSEHOLDS};
    }

    static {
        BannerType[] bannerTypeArr$values = $values();
        $VALUES = bannerTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(bannerTypeArr$values);
    }

    private BannerType(String str, int i12) {
    }

    @k
    public static a<BannerType> getEntries() {
        return $ENTRIES;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) $VALUES.clone();
    }
}

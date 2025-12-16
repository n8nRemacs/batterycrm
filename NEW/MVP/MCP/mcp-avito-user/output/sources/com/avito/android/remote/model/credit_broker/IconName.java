package com.avito.android.remote.model.credit_broker;

import Y61.k;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditBrokerProduct.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/IconName;", "", "(Ljava/lang/String;I)V", "SBER_AUTO", "CETELEM_AUTO", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IconName {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconName[] $VALUES;

    @c("sberAuto")
    public static final IconName SBER_AUTO = new IconName("SBER_AUTO", 0);

    @c("cetelemAuto")
    public static final IconName CETELEM_AUTO = new IconName("CETELEM_AUTO", 1);

    @com.avito.android.gson.c
    public static final IconName UNKNOWN = new IconName(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);

    private static final /* synthetic */ IconName[] $values() {
        return new IconName[]{SBER_AUTO, CETELEM_AUTO, UNKNOWN};
    }

    static {
        IconName[] iconNameArr$values = $values();
        $VALUES = iconNameArr$values;
        $ENTRIES = kotlin.enums.c.a(iconNameArr$values);
    }

    private IconName(String str, int i12) {
    }

    @k
    public static a<IconName> getEntries() {
        return $ENTRIES;
    }

    public static IconName valueOf(String str) {
        return (IconName) Enum.valueOf(IconName.class, str);
    }

    public static IconName[] values() {
        return (IconName[]) $VALUES.clone();
    }
}

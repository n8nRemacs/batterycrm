package com.avito.android.remote.model;

import Y61.k;
import aW.InterfaceC19823a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertisementVerticalAlias.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "", "(Ljava/lang/String;I)V", "REALTY", "AUTO", "GENERAL", "JOB", "SERVICES", "NO_VALUE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertisementVerticalAlias {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertisementVerticalAlias[] $VALUES;

    @c("RE")
    public static final AdvertisementVerticalAlias REALTY = new AdvertisementVerticalAlias("REALTY", 0);

    @c("AUTO")
    public static final AdvertisementVerticalAlias AUTO = new AdvertisementVerticalAlias("AUTO", 1);

    @c("GENERAL")
    public static final AdvertisementVerticalAlias GENERAL = new AdvertisementVerticalAlias("GENERAL", 2);

    @c("JOB")
    public static final AdvertisementVerticalAlias JOB = new AdvertisementVerticalAlias("JOB", 3);

    @c("SERVICES")
    public static final AdvertisementVerticalAlias SERVICES = new AdvertisementVerticalAlias("SERVICES", 4);

    @InterfaceC19823a
    public static final AdvertisementVerticalAlias NO_VALUE = new AdvertisementVerticalAlias("NO_VALUE", 5);

    private static final /* synthetic */ AdvertisementVerticalAlias[] $values() {
        return new AdvertisementVerticalAlias[]{REALTY, AUTO, GENERAL, JOB, SERVICES, NO_VALUE};
    }

    static {
        AdvertisementVerticalAlias[] advertisementVerticalAliasArr$values = $values();
        $VALUES = advertisementVerticalAliasArr$values;
        $ENTRIES = kotlin.enums.c.a(advertisementVerticalAliasArr$values);
    }

    private AdvertisementVerticalAlias(String str, int i12) {
    }

    @k
    public static a<AdvertisementVerticalAlias> getEntries() {
        return $ENTRIES;
    }

    public static AdvertisementVerticalAlias valueOf(String str) {
        return (AdvertisementVerticalAlias) Enum.valueOf(AdvertisementVerticalAlias.class, str);
    }

    public static AdvertisementVerticalAlias[] values() {
        return (AdvertisementVerticalAlias[]) $VALUES.clone();
    }
}

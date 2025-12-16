package com.avito.android.remote.model;

import Y61.k;
import aW.InterfaceC19823a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertisementCategoryAlias.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "", "(Ljava/lang/String;I)V", "SERVICE_TRANSPORT", "SERVICE_CONSTRUCTION", "SERVICE_GARDEN", "SERVICE_BEAUTY", "SERVICE_REPAIR", "SERVICE_COURSES", "SERVICE_INSTALLATION", "SERVICE_CLEANING", "SERVICE_EVENTS", "SERVICE_PHOTOGRAPHY", "NO_VALUE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertisementCategoryAlias {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertisementCategoryAlias[] $VALUES;

    @c("transport")
    public static final AdvertisementCategoryAlias SERVICE_TRANSPORT = new AdvertisementCategoryAlias("SERVICE_TRANSPORT", 0);

    @c("construction")
    public static final AdvertisementCategoryAlias SERVICE_CONSTRUCTION = new AdvertisementCategoryAlias("SERVICE_CONSTRUCTION", 1);

    @c("garden")
    public static final AdvertisementCategoryAlias SERVICE_GARDEN = new AdvertisementCategoryAlias("SERVICE_GARDEN", 2);

    @c("beauty")
    public static final AdvertisementCategoryAlias SERVICE_BEAUTY = new AdvertisementCategoryAlias("SERVICE_BEAUTY", 3);

    @c("repair")
    public static final AdvertisementCategoryAlias SERVICE_REPAIR = new AdvertisementCategoryAlias("SERVICE_REPAIR", 4);

    @c("courses")
    public static final AdvertisementCategoryAlias SERVICE_COURSES = new AdvertisementCategoryAlias("SERVICE_COURSES", 5);

    @c("installation")
    public static final AdvertisementCategoryAlias SERVICE_INSTALLATION = new AdvertisementCategoryAlias("SERVICE_INSTALLATION", 6);

    @c("cleaning")
    public static final AdvertisementCategoryAlias SERVICE_CLEANING = new AdvertisementCategoryAlias("SERVICE_CLEANING", 7);

    @c("events")
    public static final AdvertisementCategoryAlias SERVICE_EVENTS = new AdvertisementCategoryAlias("SERVICE_EVENTS", 8);

    @c("photography")
    public static final AdvertisementCategoryAlias SERVICE_PHOTOGRAPHY = new AdvertisementCategoryAlias("SERVICE_PHOTOGRAPHY", 9);

    @InterfaceC19823a
    public static final AdvertisementCategoryAlias NO_VALUE = new AdvertisementCategoryAlias("NO_VALUE", 10);

    private static final /* synthetic */ AdvertisementCategoryAlias[] $values() {
        return new AdvertisementCategoryAlias[]{SERVICE_TRANSPORT, SERVICE_CONSTRUCTION, SERVICE_GARDEN, SERVICE_BEAUTY, SERVICE_REPAIR, SERVICE_COURSES, SERVICE_INSTALLATION, SERVICE_CLEANING, SERVICE_EVENTS, SERVICE_PHOTOGRAPHY, NO_VALUE};
    }

    static {
        AdvertisementCategoryAlias[] advertisementCategoryAliasArr$values = $values();
        $VALUES = advertisementCategoryAliasArr$values;
        $ENTRIES = kotlin.enums.c.a(advertisementCategoryAliasArr$values);
    }

    private AdvertisementCategoryAlias(String str, int i12) {
    }

    @k
    public static a<AdvertisementCategoryAlias> getEntries() {
        return $ENTRIES;
    }

    public static AdvertisementCategoryAlias valueOf(String str) {
        return (AdvertisementCategoryAlias) Enum.valueOf(AdvertisementCategoryAlias.class, str);
    }

    public static AdvertisementCategoryAlias[] values() {
        return (AdvertisementCategoryAlias[]) $VALUES.clone();
    }
}

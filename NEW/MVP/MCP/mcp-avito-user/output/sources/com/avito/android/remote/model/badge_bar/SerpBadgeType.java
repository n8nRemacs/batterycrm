package com.avito.android.remote.model.badge_bar;

import Y61.k;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpBadgeType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;", "", "(Ljava/lang/String;I)V", "VERIFIED_EMPLOYER", "GREEN", "VIOLET", "BLUE", "GRAY", "RED", "BLACK", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpBadgeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SerpBadgeType[] $VALUES;

    @c("verifiedEmployer")
    public static final SerpBadgeType VERIFIED_EMPLOYER = new SerpBadgeType("VERIFIED_EMPLOYER", 0);

    @c("green")
    public static final SerpBadgeType GREEN = new SerpBadgeType("GREEN", 1);

    @c("violet")
    public static final SerpBadgeType VIOLET = new SerpBadgeType("VIOLET", 2);

    @c("blue")
    public static final SerpBadgeType BLUE = new SerpBadgeType("BLUE", 3);

    @c("gray")
    public static final SerpBadgeType GRAY = new SerpBadgeType("GRAY", 4);

    @c("red")
    public static final SerpBadgeType RED = new SerpBadgeType("RED", 5);

    @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
    public static final SerpBadgeType BLACK = new SerpBadgeType("BLACK", 6);

    private static final /* synthetic */ SerpBadgeType[] $values() {
        return new SerpBadgeType[]{VERIFIED_EMPLOYER, GREEN, VIOLET, BLUE, GRAY, RED, BLACK};
    }

    static {
        SerpBadgeType[] serpBadgeTypeArr$values = $values();
        $VALUES = serpBadgeTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(serpBadgeTypeArr$values);
    }

    private SerpBadgeType(String str, int i12) {
    }

    @k
    public static a<SerpBadgeType> getEntries() {
        return $ENTRIES;
    }

    public static SerpBadgeType valueOf(String str) {
        return (SerpBadgeType) Enum.valueOf(SerpBadgeType.class, str);
    }

    public static SerpBadgeType[] values() {
        return (SerpBadgeType[]) $VALUES.clone();
    }
}

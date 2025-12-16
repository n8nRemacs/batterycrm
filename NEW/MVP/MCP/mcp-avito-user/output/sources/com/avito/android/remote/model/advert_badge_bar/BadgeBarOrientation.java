package com.avito.android.remote.model.advert_badge_bar;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgeBarOrientation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/BadgeBarOrientation;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BadgeBarOrientation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BadgeBarOrientation[] $VALUES;

    @c("horizontal")
    public static final BadgeBarOrientation HORIZONTAL = new BadgeBarOrientation("HORIZONTAL", 0);

    @c("vertical")
    public static final BadgeBarOrientation VERTICAL = new BadgeBarOrientation("VERTICAL", 1);

    private static final /* synthetic */ BadgeBarOrientation[] $values() {
        return new BadgeBarOrientation[]{HORIZONTAL, VERTICAL};
    }

    static {
        BadgeBarOrientation[] badgeBarOrientationArr$values = $values();
        $VALUES = badgeBarOrientationArr$values;
        $ENTRIES = kotlin.enums.c.a(badgeBarOrientationArr$values);
    }

    private BadgeBarOrientation(String str, int i12) {
    }

    @k
    public static a<BadgeBarOrientation> getEntries() {
        return $ENTRIES;
    }

    public static BadgeBarOrientation valueOf(String str) {
        return (BadgeBarOrientation) Enum.valueOf(BadgeBarOrientation.class, str);
    }

    public static BadgeBarOrientation[] values() {
        return (BadgeBarOrientation[]) $VALUES.clone();
    }
}

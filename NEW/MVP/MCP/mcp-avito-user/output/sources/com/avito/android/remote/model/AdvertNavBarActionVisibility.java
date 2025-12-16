package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertNavBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;", "", "(Ljava/lang/String;I)V", "ALWAYS", "IF_ROOM", "NEVER", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertNavBarActionVisibility {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertNavBarActionVisibility[] $VALUES;

    @c("always")
    public static final AdvertNavBarActionVisibility ALWAYS = new AdvertNavBarActionVisibility("ALWAYS", 0);

    @c("ifRoom")
    public static final AdvertNavBarActionVisibility IF_ROOM = new AdvertNavBarActionVisibility("IF_ROOM", 1);

    @c("never")
    public static final AdvertNavBarActionVisibility NEVER = new AdvertNavBarActionVisibility("NEVER", 2);

    private static final /* synthetic */ AdvertNavBarActionVisibility[] $values() {
        return new AdvertNavBarActionVisibility[]{ALWAYS, IF_ROOM, NEVER};
    }

    static {
        AdvertNavBarActionVisibility[] advertNavBarActionVisibilityArr$values = $values();
        $VALUES = advertNavBarActionVisibilityArr$values;
        $ENTRIES = kotlin.enums.c.a(advertNavBarActionVisibilityArr$values);
    }

    private AdvertNavBarActionVisibility(String str, int i12) {
    }

    @k
    public static a<AdvertNavBarActionVisibility> getEntries() {
        return $ENTRIES;
    }

    public static AdvertNavBarActionVisibility valueOf(String str) {
        return (AdvertNavBarActionVisibility) Enum.valueOf(AdvertNavBarActionVisibility.class, str);
    }

    public static AdvertNavBarActionVisibility[] values() {
        return (AdvertNavBarActionVisibility[]) $VALUES.clone();
    }
}

package com.avito.android.suggest_locations;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestLocationsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/OpenEventFromBlock;", "", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenEventFromBlock {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OpenEventFromBlock[] f292117b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f292118c;

    static {
        OpenEventFromBlock[] openEventFromBlockArr = {new OpenEventFromBlock("FILTERS", 0), new OpenEventFromBlock("FIRST_SESSION", 1), new OpenEventFromBlock("SETTINGS", 2), new OpenEventFromBlock("HOME", 3), new OpenEventFromBlock("VERTICAL_MAIN", 4), new OpenEventFromBlock("INLINE_FILTERS", 5), new OpenEventFromBlock("EXTENDED_PROFILE", 6), new OpenEventFromBlock("INLINE_FILTERS_SUGGEST_LOCATION", 7), new OpenEventFromBlock("BIG_FILTERS_SUGGEST_LOCATION", 8), new OpenEventFromBlock("NONE", 9)};
        f292117b = openEventFromBlockArr;
        f292118c = kotlin.enums.c.a(openEventFromBlockArr);
    }

    public static OpenEventFromBlock valueOf(String str) {
        return (OpenEventFromBlock) Enum.valueOf(OpenEventFromBlock.class, str);
    }

    public static OpenEventFromBlock[] values() {
        return (OpenEventFromBlock[]) f292117b.clone();
    }
}

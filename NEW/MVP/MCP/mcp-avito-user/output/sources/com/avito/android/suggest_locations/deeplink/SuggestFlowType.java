package com.avito.android.suggest_locations.deeplink;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestLocationsAddressLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestFlowType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "NOMAP", "HISTORICAL", "REGION", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestFlowType {

    @com.google.gson.annotations.c("default")
    public static final SuggestFlowType DEFAULT;

    @com.google.gson.annotations.c("historical")
    public static final SuggestFlowType HISTORICAL;

    @com.google.gson.annotations.c("noMap")
    public static final SuggestFlowType NOMAP;

    @com.google.gson.annotations.c("region")
    public static final SuggestFlowType REGION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SuggestFlowType[] f292271b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f292272c;

    static {
        SuggestFlowType suggestFlowType = new SuggestFlowType("DEFAULT", 0);
        DEFAULT = suggestFlowType;
        SuggestFlowType suggestFlowType2 = new SuggestFlowType("NOMAP", 1);
        NOMAP = suggestFlowType2;
        SuggestFlowType suggestFlowType3 = new SuggestFlowType("HISTORICAL", 2);
        HISTORICAL = suggestFlowType3;
        SuggestFlowType suggestFlowType4 = new SuggestFlowType("REGION", 3);
        REGION = suggestFlowType4;
        SuggestFlowType[] suggestFlowTypeArr = {suggestFlowType, suggestFlowType2, suggestFlowType3, suggestFlowType4};
        f292271b = suggestFlowTypeArr;
        f292272c = kotlin.enums.c.a(suggestFlowTypeArr);
    }

    private SuggestFlowType(String str, int i12) {
    }

    public static SuggestFlowType valueOf(String str) {
        return (SuggestFlowType) Enum.valueOf(SuggestFlowType.class, str);
    }

    public static SuggestFlowType[] values() {
        return (SuggestFlowType[]) f292271b.clone();
    }
}

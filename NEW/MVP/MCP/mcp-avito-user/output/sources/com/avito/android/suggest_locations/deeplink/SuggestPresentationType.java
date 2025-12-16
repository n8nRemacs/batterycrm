package com.avito.android.suggest_locations.deeplink;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestLocationsAddressLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestPresentationType;", "", "(Ljava/lang/String;I)V", "BOTTOMSHEET", "MODAL", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestPresentationType {

    @com.google.gson.annotations.c("bottomSheet")
    public static final SuggestPresentationType BOTTOMSHEET;

    @com.google.gson.annotations.c("modal")
    public static final SuggestPresentationType MODAL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SuggestPresentationType[] f292278b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f292279c;

    static {
        SuggestPresentationType suggestPresentationType = new SuggestPresentationType("BOTTOMSHEET", 0);
        BOTTOMSHEET = suggestPresentationType;
        SuggestPresentationType suggestPresentationType2 = new SuggestPresentationType("MODAL", 1);
        MODAL = suggestPresentationType2;
        SuggestPresentationType[] suggestPresentationTypeArr = {suggestPresentationType, suggestPresentationType2};
        f292278b = suggestPresentationTypeArr;
        f292279c = kotlin.enums.c.a(suggestPresentationTypeArr);
    }

    private SuggestPresentationType(String str, int i12) {
    }

    public static SuggestPresentationType valueOf(String str) {
        return (SuggestPresentationType) Enum.valueOf(SuggestPresentationType.class, str);
    }

    public static SuggestPresentationType[] values() {
        return (SuggestPresentationType[]) f292278b.clone();
    }
}
